package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.PessoaDao;
import model.Pessoa; 

/**
 * Servlet implementation class PessoaServlet
 */
@WebServlet("/register")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private PessoaDao pessoaDao = new PessoaDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pessoaregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String usuario = request.getParameter("usuario");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String telefone = request.getParameter("telefone");
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setUsuario(usuario);
		pessoa.setEmail(email);
		pessoa.setSenha(senha);
		pessoa.setTelefone(telefone);
		
		
		try {
			pessoaDao.registerPessoa(pessoa);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/pessoadetalhe.jsp");
		dispatcher.forward(request, response);
	}

}
