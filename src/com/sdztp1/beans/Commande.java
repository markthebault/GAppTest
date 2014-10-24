package com.sdztp1.beans;

public class Commande {
	private Client client;
	private String date;
	private double montant;
	private String modePaiement;
	private String statuPaiement;
	private String modeLivraison;
	private String statuLivraison;
	
	public Commande()
	{
		
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getModePaiement() {
		return modePaiement;
	}

	public void setModePaiement(String modePaiemement) {
		this.modePaiement = modePaiemement;
	}

	public String getStatutPaiement() {
		return statuPaiement;
	}

	public void setStatutPaiement(String statuPaiemement) {
		this.statuPaiement = statuPaiemement;
	}

	public String getModeLivraison() {
		return modeLivraison;
	}

	public void setModeLivraison(String modeLivraison) {
		this.modeLivraison = modeLivraison;
	}

	public String getStatutLivraison() {
		return statuLivraison;
	}

	public void setStatutLivraison(String statuLivraison) {
		this.statuLivraison = statuLivraison;
	}
	
	

}
