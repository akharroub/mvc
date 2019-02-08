package fr.akharroub.patternmvc.contreller;

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
 * Servlet implementation class AnimalInfo
 */
@WebServlet(name = "animal_info", urlPatterns = { "/animal_info" })
public class AnimalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AnimalBusiness animalBusiness = new AnimalBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iString = request.getParameter("i");
		int i = Integer.parseInt(iString);
		
		ArrayList<Animal> Animal = animalBusiness.getAnimal();
		
		
		 Animal animal = Animal.get(i);
		 request.setAttribute("Animal", animal);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/animal/animal-info.jsp")
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
