package mx.unam.diplomado.servlets;


import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mx.unam.diplomado.ejb.StatefulEJB;

import java.io.IOException;

@WebServlet("/index")
public class EjemploServlet extends HttpServlet {

	//es necesario usar @Inject para garantizar una instancia statefaul por cliente
    @Inject
    private StatefulEJB service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("resultado", service.saludar("Jorge"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
