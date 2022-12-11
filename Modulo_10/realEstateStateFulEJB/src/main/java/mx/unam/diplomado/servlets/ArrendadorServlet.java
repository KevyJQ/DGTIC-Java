package mx.unam.diplomado.servlets;

import java.io.IOException;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.unam.diplomado.dao.ArrendadorDao;
import mx.unam.diplomado.ejb.StatefulEJB;

@WebServlet("/arrendador")
public class ArrendadorServlet extends HttpServlet {

	private ArrendadorDao arrendadorDao;

	// es necesario usar @Inject para garantizar una instancia statefaul por cliente
	@Inject
	private StatefulEJB service;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("mivariable", service.saludar("Kevy"));
		getServletContext().getRequestDispatcher("/arrendador.jsp").forward(req, resp);
		System.out.println("Hola soy prueba");

	}

}