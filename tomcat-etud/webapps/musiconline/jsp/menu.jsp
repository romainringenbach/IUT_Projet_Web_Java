<%@ page import="db.CategorieDAO, db.Categorie, java.util.ArrayList, java.sql.ResultSet"%>

<div class="left_panel">
	<div class="menuBoxHeader">
		<span class="menuBoxTitle">Divers</span>
	</div>
	<div class="menuBoxContent">
		<a class="nav" href="/musiconline/?p=main">Retour accueil</a><br/>
	</div>

	<%
	// si il est connecté...
	if (session.getAttribute("user") != null) {
		out.println("<div class=\"menuBoxHeader\"><span class=\"menuBoxTitle\">Catalogue</span></div>");
		
		out.println("<div class=\"menuBoxContent\">");
		
		CategorieDAO theCategorieDAO = CategorieDAO.getInstance();
		ResultSet cats = theCategorieDAO.findAll();
		while(cats.next()) {
			out.println("<a class=\"nav\" href=\"/musiconline/?p=cat="+cats.getString(1)+"\">"+cats.getString(1)+"</a><br/>");
		}
		
		out.println("</div>");
	}
	%>


	<div class="menuBoxHeader">
		<span class="menuBoxTitle">Compte utilisateur</span>
	</div>
	<div class="menuBoxContent">
	<%
		// non connecté
		if (session.getAttribute("user") == null) {
			out.println("<a class=\"nav\" href=\"/musiconline/?p=newcpt\">Creer un compte</a><br/>");
			out.println("<a class=\"nav\" href=\"/musiconline/?p=concpt\">Se connecter</a><br/>");
		}
		// connecté
		else {
			out.println("<a class=\"nav\" href=\"/musiconline/?p=deconcpt\">Se Deconnecter</a><br/>");
		}
	%>
	</div>
</div>
