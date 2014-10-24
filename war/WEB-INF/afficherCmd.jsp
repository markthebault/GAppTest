<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Client</h1>
	${!commande.client.sontChampsObligatoiresRenseignes() ? '<font color="red">Champs obligatoires manquants</font>' : '' }
	<p>nom : ${commande.client.nom}</p>
	<p>prenom : ${commande.client.prenom}</p>
	<p>adresse : ${commande.client.adresse}</p>
	<p>email : ${commande.client.email}</p>
	<p>telephone : ${commande.client.telephone}</p>
	
	<h1>Commande</h1>
	<p>date : ${commande.date }</p>
	<p>montant : ${commande.montant }</p>
	<p>modePaiement : ${commande.modePaiement }</p>
	<p>statutPaiement : ${commande.statutPaiement }</p>
	<p>modeLivraison : ${commande.modeLivraison }</p>
	<p>statutLivraison : ${commande.statutLivraison }</p>
	
</body>
</html>