package com.sdztp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdztp1.beans.Client;

public class CreationClient extends HttpServlet {

	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		Client cli = new Client();
		cli.setAdresse(request.getParameter("adresseClient"));
		cli.setPrenom(request.getParameter("prenomClient"));
		cli.setEmail(request.getParameter("emailClient"));
		cli.setNom(request.getParameter("nomClient"));
		cli.setTelephone(request.getParameter("telephoneClient"));
		
		
		request.setAttribute("client", cli);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/afficherCli.jsp").forward(request, response);
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		this.doGet(request, response);
	}

}
