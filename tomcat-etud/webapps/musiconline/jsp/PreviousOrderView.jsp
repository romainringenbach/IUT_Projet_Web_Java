<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//FR" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
 <head>
  <title>Application de depot de TP</title>
  <link rel="stylesheet" type="text/css" media="all" href="css/style.css" />
 </head>
 <body>
  
   <jsp:include page="../html/header.html"/>
   <jsp:include page="menu.jsp"/>
   <div class="main">

<br />

     <jsp:scriptlet>

	session = request.getSession();

	Object userCheck = session.getAttribute("user");
	
	if(userCheck!=null){

		String user = (String) userCheck;
		out.println("Voici la liste de toutes les musiques que vous avez achet&#233es, "+user+" : ");
		
	}
	else{
		out.println("Erreur lors de la connexion - Login ou Mot de passe invalide - Veuillez r&#233essayer");
	}
     </jsp:scriptlet>
<br />
<br />
				<table border=6 cellspacing=8 cellpadding=20>
				   <tr>
				        <th bgcolor="#F9BEC7"> Titre </th>
				        <th bgcolor="#F9BEC7"> Prix </th>
					<th bgcolor="#F9BEC7"> Achet&#233 le </th>
					<th bgcolor="#F9BEC7"> T&#233l&#233charger </th>
				   </tr>
	<%
	session = request.getSession();
	java.sql.ResultSet prev_order = (java.sql.ResultSet) session.getAttribute("prev_order");
	if(userCheck!=null){
		while ( prev_order.next ()) { 
	%>

				   <tr>
				        <td> <% out.println(prev_order.getString(1)); %>  </td>
				        <td> <% out.println(prev_order.getString(2)+" &#128"); %>  </td>
					<td> <% out.println(prev_order.getString(3)); %>  </td>
					<td> <a href=/ > <img src="img/telecharger.png"></a>  </td>
				   </tr>
		<% } %>
	<% } %>	
	</table>

<br />
<br />

   </div>
 </body>
</html>
