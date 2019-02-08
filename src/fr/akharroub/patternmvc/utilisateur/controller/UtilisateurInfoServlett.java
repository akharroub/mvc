package fr.akharroub.patternmvc.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.patternmvc.utilisateur.bean.Utilisateur;
import fr.akharroub.patternmvc.utilisateur.business.impl.UtilisateurBusiness;

/**
 * Servlet implementation class UtilisateurInfoServlett
 */
@WebServlet(name = "utilisateur-info", urlPatterns = { "/utilisateur-info" })
public class UtilisateurInfoServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UtilisateurBusiness utilusaterbusiness = new UtilisateurBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurInfoServlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String iString = request.getParameter("i");
		int i = Integer.parseInt(iString);
		
		ArrayList<Utilisateur> Utilisateur = utilusaterbusiness.getUtilisateur();
		
		Utilisateur utilisateur = Utilisateur.get(i);
		request.setAttribute("Utilisateur", utilisateur);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur/utilisateur-info.jsp")
		.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
