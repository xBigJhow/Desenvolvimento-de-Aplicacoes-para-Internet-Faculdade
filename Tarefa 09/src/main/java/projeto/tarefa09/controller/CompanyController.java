package projeto.tarefa09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import projeto.tarefa09.model.Company;
import projeto.tarefa09.repository.CompanyRepository;


@Controller
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/cadastroCompany")
	public String inicio() {
		return "cadastro/cadastroCompany";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/salvarCompany")
	public String salvar(Company company) {
		companyRepository.save(company);
		return "cadastro/cadastroCompany";
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/listaCompany")
	public ModelAndView companys() {
		ModelAndView andView = new ModelAndView("cadastro/listaCompany");
		Iterable<Company> companysIt = companyRepository.findAll();
		andView.addObject("companys", companysIt);
		
		return andView;
	}

}