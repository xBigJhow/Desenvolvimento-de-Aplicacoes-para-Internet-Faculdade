package pacote;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class VerificaLogin
 */
@WebServlet("/VerificaLogin")
public class VerificaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public VerificaLogin() {
        // TODO Auto-generated constructor stub
    	
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//Aqui estou setando um usuario e senha só para "faz de conta" de um banco de dados
		String username_test = "admin";
		String password_test = "123456";
		// Aqui estou pegando as variaveis que vieram do login.jsp metodo post
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //caso o usuario e senha que passei no login jsp esteja correto" vou para a pagina logado, 
        // caso contrario devolvo pra pagina login com uma mensagem escrita que usuario e senha estao incorretos
        
        if (username.equals(username_test) && password.equals(password_test))  {
            // Crio uma sessao para usuario
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            
            // Se estiver certo vai para a página logado.jsp
            response.sendRedirect("logado.jsp");
        } else {
            // Se não, vai voltar para Login.jsp e mostrar uma mensagem de erro !
        	request.setAttribute("erroMensagem", "Usuário ou Senha incorretos!");
        	request.getRequestDispatcher("login.jsp").forward(request, response);
            response.sendRedirect("login.jsp");
        }
        
	}

}