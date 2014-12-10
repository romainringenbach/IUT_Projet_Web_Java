<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//FR" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
 <head>
  <title>Connexion au compte</title>
  <link rel="stylesheet" type="text/css" media="all" href="css/style.css" />
 </head>
 <body>
  
   <jsp:include page="../html/header.html"/>
   <jsp:include page="menu.jsp"/>
   <div class="main">
     <jsp:scriptlet>
   	Object data = request.getAttribute("data");

	if(data!=null && data instanceof String){
	out.println(data);
	}
     </jsp:scriptlet>
		<br />Veuillez remplir les formulaire ci-dessous afin de vous connecter.<br /><br />
		<fieldset> <legend>Connexion au compte client</legend>
			<form method="POST" action="http://m3104.iut-info-vannes.net/m3104_6/public_html/musiconline/?validLog" enctype="application/x-www-form-urlencoded">
				<table>
				   <tr>
				       <td>Login  :</th>
				       <td><INPUT  type="text" name="login" required /></th>
				   </tr>

				   <tr>
				       <td>Mot de passe  :</td>
				       <td><INPUT type="password" name="password" required ></td>
				   </tr>
				</table>
				<br/><INPUT type="submit" name="confirmer" value="Confirmer"/>
			</form>
		</fieldset>
   </div>
 </body>
</html>
