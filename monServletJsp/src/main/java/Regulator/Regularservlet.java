package Regulator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Regularservlet")
public class Regularservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Regularservlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscire.jsp").forward(request,response);
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String pseudo = request.getParameter("pseudo");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passconfirm = request.getParameter("passconfirm");
		
		HttpSession session = request.getSession();
		/*session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		session.setAttribute("pseudo", pseudo);
		session.setAttribute("password", password);
		session.setAttribute("passconfirm",passconfirm);
		*/
		
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("pseudo", pseudo);
		
		String erreur;
		if (
			!"".equals(nom) && !"".equals(prenom)
			&&	!"".equals(pseudo) && !"".equals(email)
			&&	!"".equals(password) && !"".equals(passconfirm)) {
			
			if (password.equals(passconfirm)) {
				
				List<archive>afficher=(List)session.getAttribute("good");
				if (afficher == null) {
				afficher = new ArrayList<archive>();
				}
				archive xx = new archive(nom, prenom, pseudo, email, password, passconfirm);
				
				afficher.add(xx);
				
				session.setAttribute("good", afficher);
				
				this.getServletContext().getRequestDispatcher("/WEB-INF/Acceuil.jsp").forward(request,response);
			}else {
				erreur = "Mot de passe non identique";
				request.setAttribute("erreur_mdp", erreur);
				this.getServletContext().getRequestDispatcher("/WEB-INF/Inscire.jsp").forward(request,response);
				}
			}
			else {
				erreur="Les champs sont non identique";
				request.setAttribute("erreur_mdp", erreur);
				this.getServletContext().getRequestDispatcher("/WEB-INF/Inscire.jsp").forward(request,response);
			}
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Inscire.jsp").forward(request,response);
	}
		
		
		
		
	

}
