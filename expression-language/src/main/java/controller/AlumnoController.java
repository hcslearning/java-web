package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Alumno;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AlumnoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AlumnoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Alumno alumno1 = new Alumno("Juan Alvarez", LocalDate.of(1990, 12, 10));
		Alumno alumno2 = new Alumno("Ramón Cortez", LocalDate.of(1988, 1, 22));
		Alumno alumno3 = new Alumno("Juan Alvarez", LocalDate.of(1975, 3, 4));
		List<Alumno> alumnos = Arrays.asList(alumno1, alumno2, alumno3);
		
		request.setAttribute("alumnos", alumnos);
		
		request
			.getRequestDispatcher("/WEB-INF/jsp/view/alumnos.jsp")
			.forward(request, response);
		
	}

}
