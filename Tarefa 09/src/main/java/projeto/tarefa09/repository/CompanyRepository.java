package projeto.tarefa09.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import projeto.tarefa09.model.Company;

@Repository
@Transactional
public interface CompanyRepository extends CrudRepository<Company, Long> {
	

}
