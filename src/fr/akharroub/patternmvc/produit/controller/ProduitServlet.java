package fr.akharroub.patternmvc.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.patternmvc.produit.bean.Produit;
import fr.akharroub.patternmvc.produit.business.impl.ProduitBusiness;



/**
 * Servlet implementation class Produit
 */
@WebServlet(name = "produit", urlPatterns = { "/produit" })
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produitBusiness = new ProduitBusiness();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ArrayList<Produit> Produit = produitBusiness.getProduit();
		
		request.setAttribute("Produit", Produit);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produit/produit.jsp")
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
