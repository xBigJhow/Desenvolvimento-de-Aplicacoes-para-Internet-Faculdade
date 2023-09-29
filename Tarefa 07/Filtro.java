package pacote;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet Filter implementation class Filtro
 */
@WebFilter(urlPatterns = {"/servlets/*"}) // Filtrar todas as requisições
public class Filtro implements Filter {
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        // Aqui está verificando se tem uma sessão existente
        HttpSession session = httpRequest.getSession(false);
        
        // Verifique se o usuário está autenticado (você pode usar um atributo na sessão para isso)
        boolean isAuthenticated = session != null && session.getAttribute("username") != null;
        
        if (isAuthenticated) {
            // Se autenticado, ele entra no logado.jsp
            chain.doFilter(request, response);
        } else {
            // Se o usuario nao logar corretamente ele volta pra pagina de login
            httpResponse.sendRedirect("login.jsp");
        }
    }
}
