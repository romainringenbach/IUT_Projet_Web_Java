<%@ page import="db.CategorieDAO, db.Categorie, java.util.ArrayList, java.util.Iterator"%>

<div class="left_panel">
	<div class="menuBoxHeader">
		<span class="menuBoxTitle">Divers</span>
	</div>
	<div class="menuBoxContent">
		<a class="nav" href="/musiconline/">Retour accueil</a><br/>
	</div>

	<%
	// si il est connecté...
	if (session.getAttribute("user_firstname") != null) {
		out.println("<div class=\"menuBoxHeader\"><span class=\"menuBoxTitle\">Catalogue</span></div>");
		
		out.println("<div class=\"menuBoxContent\">");
		
		CategorieDAO theCategorieDAO = CategorieDAO.getInstance();
		ArrayList<Categorie> cats = theCategorieDAO.findAll();
		Iterator<Categorie> it = cats.iterator();
		while(it.hasNext()) {
			Categorie cat = it.next();
			out.println("<a class=\"nav\" href=\"/musiconline/index?action=null&view=catTitView&cat="+cat.idCategorie+"\">"+cat.label+"</a><br/>");
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
		if (session.getAttribute("user_firstname") == null) {
			out.println("<a class=\"nav\" href=\"/musiconline/index?action=null&view=newCptView\">Creer un compte</a><br/>");
			out.println("<a class=\"nav\" href=\"/musiconline/index?action=null&view=conCptView\">Se connecter</a><br/>");
		}
		// connecté
		else {
			out.println("Se deconnecter [TODO]");
		}
	%>
	</div>
</div>
