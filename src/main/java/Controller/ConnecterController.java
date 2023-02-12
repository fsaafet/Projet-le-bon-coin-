package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Service.UtilisateurService;


@WebServlet("/ConnecterController")
public class ConnecterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurService service;

    public ConnecterController() {
    	
        super();
        service = new UtilisateurService();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("SeConnecter.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          try {
			
			String email= request.getParameter("email");
			
			UtilisateurService.getbyEmail(email);
             
			request.getRequestDispatcher("Show").forward(request, response);
 
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		doGet(request, response);
	}		
		
	}


}
