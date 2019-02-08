package fr.akharroub.patternmvc.animal.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.akharroub.patternmvc.animal.bean.Animal;
import fr.akharroub.patternmvc.animal.business.impl.AnimalBusiness;

/**
 * Servlet implementation class AnimalServlet
 */
@WebServlet(name = "animal", urlPatterns = { "/animal" })
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AnimalBusiness animalBusiness = new AnimalBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<Animal> animal = animalBusiness.getAnimal();
		
		request.setAttribute("Animal", animal);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/animal/animal.jsp")
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
