package com.sdztp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.sdztp1.beans.Client;
import com.sdztp1.beans.Commande;

public class CreationCommande extends HttpServlet {
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		Client cli = new Client();
		cli.setAdresse(request.getParameter("adresseClient"));
		cli.setPrenom(request.getParameter("prenomClient"));
		cli.setEmail(request.getParameter("emailClient"));
		cli.setNom(request.getParameter("nomClient"));
		cli.setTelephone(request.getParameter("telephoneClient"));
		
		
		Commande cmd = new Commande();
		cmd.setClient(cli);
		
		/* Récupération de la date courante */
        DateTime dt = new DateTime();
        /* Conversion de la date en String selon le format défini */
        DateTimeFormatter formatter = DateTimeFormat.forPattern( "dd/MM/yyyy HH:mm:ss" );
        String date = dt.toString( formatter );
        double montant;
        try {
            /* Récupération du montant */
            montant = Double.parseDouble( request.getParameter( "montantCommande" ) );
        } catch ( NumberFormatException e ) {
            /* Initialisation à -1 si le montant n'est pas un nombre correct */
            montant = -1;
        }
        String modePaiement = request.getParameter( "modePaiementCommande" );
        String statutPaiement = request.getParameter( "statutPaiementCommande" );
        String modeLivraison = request.getParameter( "modeLivraisonCommande" );
        String statutLivraison = request.getParameter( "statutLivraisonCommande" );
        
        cmd.setDate( date );
        cmd.setMontant( montant );
        cmd.setModePaiement( modePaiement );
        cmd.setStatutPaiement( statutPaiement );
        cmd.setModeLivraison( modeLivraison );
        cmd.setStatutLivraison( statutLivraison );
        
        request.setAttribute("commande", cmd);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/afficherCmd.jsp").forward(request, response);
	}
}
