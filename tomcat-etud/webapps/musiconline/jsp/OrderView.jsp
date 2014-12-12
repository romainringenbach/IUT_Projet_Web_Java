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
     <jsp:scriptlet>

  Object userCheck = session.getAttribute("user");
  
  if(userCheck!=null){

    String user = (String) userCheck;
    out.println("Voici la liste des musiques command&#233 : ");
    
  }
  else{
    out.println("Erreur lors de la connexion - Login ou Mot de passe invalide - Veuillez r&#233essayer");
  }
     </jsp:scriptlet>
<br />
<br />
<br />
        <table border=6 cellspacing=8 cellpadding=20>
          <tr>
          <th bgcolor="#F9BEC7"> Titre </th>
          <th bgcolor="#F9BEC7"> Album </th>
          <th bgcolor="#F9BEC7"> Artiste </th>
          <th bgcolor="#F9BEC7"> Style </th>
          <th bgcolor="#F9BEC7"> Prix </th>
          <th bgcolor="#F9BEC7"> Ajouter au panier </th>
          </tr>
  <%
    java.util.ArrayList<String> data = request.getSession().getAttribute("listPu");

    java.util.Iterator itr = data.iterator();

    int total = 0;

    while ( itr.hasNext()) { 



    db.Titre titre = itr.next();

    total = titre.getPrix();
  %>

           <tr>
                <td> <% out.println(titre.getNom()); %>  </td>
                <td> <% out.println(titre.getAlbum()); %>  </td>
          <td> <% out.println(titre.getArtiste()); %>  </td>
          <td> <% out.println(titre.getCategorie()); %>  </td>
          <td> <% out.println(titre.getPrix()+" &#128"); %>  </td>
           </tr>
    <% } %>

    <tr>
                <td></td>
                <td></td>
          <td></td>
          <td></td>
          <td> <% out.println( total +" &#128"); %>  </td>
           </tr>  

  <% } %> 



  </table>

<br />
<br />
<br />
   </div>

     </jsp:scriptlet>
   </div>
 </body>
</html>



