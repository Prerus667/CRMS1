package com.ul.project.support.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ul.project.factories.ResetFactory;


public class ResetServlet extends HttpServlet {
	

	private static final long serialVersionUID = 3723315838557468993L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			RequestDispatcher rd= null;
			ResetFactory.resetting(request.getParameter("resetId"));
			request.setAttribute("userType", 1);
			rd=request.getRequestDispatcher("view");  
			rd.forward(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
