<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//FR" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
 <head>
  <title>Cr&#233ation d'un compte</title>
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
	
	<br />Veuillez remplir les formulaire ci-dessous afin de cr&#233er un compte sur MusicOnline.<br />  <br />
		<fieldset> 
			<legend>Cr&#233ation de compte</legend>
				<form method="POST" action="?p=validcpt" enctype="application/x-www-form-urlencoded">
					<br/>Nom: <INPUT  type="text" name="nom"/>
					<br/>Pr&#233nom : <INPUT  type="text" name="prenom"/>
					<br/>Login : <INPUT  type="text" name="login"/>
					<br/><label>Mot de passe  : </label>
					<INPUT type="password" name="password">
					<br/>Date de naissance (AAAA-MM-JJ) : <INPUT  type="text" name="date"/>
					<br/>Adresse e-mail : <INPUT  type="text" name="email"/>
					<br/>Adresse (lieu-dit, rue, ...) : <INPUT  type="text" name="adresse"/>
					<br/>Code postal : <INPUT  type="text" name="code"/>
					<br/>Ville : <INPUT  type="text" name="ville"/>
					<br/>Pays : <INPUT  type="text" name="pays"/>
					<br/><INPUT type="submit" name="confirmer" value="Confirmer"/>
				</form>
		</fieldset>
   </div>
 </body>
</html>