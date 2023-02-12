package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Entity.Utilisateurs;

import Service.UtilisateurService;


@WebServlet("/UtilisateurController")
public class InscrireController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UtilisateurService service;
    public InscrireController() {
    	super();
		service = new UtilisateurService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("InscrireShowView.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String username = request.getParameter("Username");
			String email= request.getParameter("email");
			String password= request.getParameter("password");
			int age = Integer.parseInt( request.getParameter("age"));
			String Urlphoto= request.getParameter("url_photo ");
			Utilisateurs u = new Utilisateurs( username, email, password,age, Urlphoto);
			service.create(u);

			request.getRequestDispatcher("SeConnecter.jsp").forward(request, response);
 
		} catch (Exception e) {
			e.printStackTrace();
		doGet(request, response);
	}
	}
	
}
