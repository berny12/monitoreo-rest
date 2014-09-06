package com.synergyj.curso.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnvioMonitoreo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3235759666879442489L;

	public EnvioMonitoreo(){
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String tiempo =req.getParameter("tiempo");
		int tiempoInt = Integer.valueOf(tiempo);
		req.setAttribute("tiempo", tiempoInt);
		req.getRequestDispatcher("/WEB-INF/jsp/monitoreo.jsp").forward(req, resp);
		
	}
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		
		
	}
}
