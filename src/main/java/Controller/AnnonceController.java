package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Annonces;
import Service.AnnonceService;

@WebServlet("/AnnonceController")
public class AnnonceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AnnonceService services;
    public AnnonceController() {
        super();
        services = new AnnonceService ();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("AnnonceShowView.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
	        int user_id  = Integer.parseInt(request.getParameter("user_id"));
	        String Titre= request.getParameter("nom");
	        System.out.println(Titre);
	        String description = request.getParameter("description");
	        System.out.println(description);
	        int prix = Integer.parseInt( request.getParameter("prix"));
			String  url_photo= request.getParameter("url_photo");
			String Categorie= request.getParameter("Categorie");
			String SousCategorie= request.getParameter("SousCategorie");
			Annonces a = new Annonces(user_id, Titre, description, prix,url_photo,Categorie,SousCategorie);
	        System.out.println(a);
			services.create(a);
			
			request.getRequestDispatcher("/Show").forward(request, response);
 
		} catch (Exception e) {
			 		e.printStackTrace();
		doGet(request, response);
	}

}
}
