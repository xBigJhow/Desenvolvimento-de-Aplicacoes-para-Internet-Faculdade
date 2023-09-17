package projeto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Autenticador
 */
@WebServlet("/Autenticador")
public class Autenticador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Autenticador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
        String test_user = request.getParameter("user");
        String test_password = request.getParameter("password");
		
        Pessoa pessoa = new Pessoa();

        //Estou analisando ver se usuario e senha passados estao corretos:
        if (test_user.equals(pessoa.getUser()) && test_password.equals(pessoa.getPassword())) {
             // Autenticação bem-sucedida
             HttpSession session = request.getSession();
             session.setAttribute("pessoaLogada", pessoa); // Armazena a pessoa na sessão
 
             // Redireciona para a mesma página JSP
             response.sendRedirect(request.getContextPath() + "/tarefa.jsp");
        } else {
            // Aqui mostra somente um HTML informando o erro.
            out.println("Usuário e/ou senha incorretos.");
        }
        
	}
}
