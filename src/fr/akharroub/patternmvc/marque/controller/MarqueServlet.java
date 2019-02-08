package fr.akharroub.patternmvc.marque.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.patternmvc.marque.bean.Marque;
import fr.akharroub.patternmvc.marque.business.impl.MarqueBusiness;

/**
 * Servlet implementation class MarqueServlet
 */
@WebServlet(name = "marque", urlPatterns = { "/marque" })
public class MarqueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	MarqueBusiness marqueBusiness = new MarqueBusiness();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarqueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		ArrayList<Marque> marque = marqueBusiness.getMarque();
		request.setAttribute("Marque", marque);
				
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/marque/marque.jsp")
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
