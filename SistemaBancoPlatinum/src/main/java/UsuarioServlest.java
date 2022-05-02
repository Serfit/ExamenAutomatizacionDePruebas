

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;

import com.examen.dao.ConsultasDao;

/**
 * Servlet implementation class UsuarioServlest
 */
@WebServlet("/usuario")
public class UsuarioServlest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioServlest() {
        super();
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
		HttpSession sesion = request.getSession();
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		ConsultasDao co = new ConsultasDao();
		if(co.autenticacion(usuario, password)){
		    sesion.setAttribute("usuario", usuario);
		    sesion.setAttribute("password", password);
		    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Menu.jsp");
		    dispatcher.forward(request, response);
		}else{
		    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Error.jsp");
		    dispatcher.forward(request, response);
		}
	}
	

}
