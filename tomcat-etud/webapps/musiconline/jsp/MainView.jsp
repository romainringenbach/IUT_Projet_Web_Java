<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//FR" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
 <head>
  <title>Accueil :)</title>
  <link rel="stylesheet" type="text/css" media="all" href="css/style.css" />
 </head>
 <body>
  
   <jsp:include page="../html/header.html"/>
   <jsp:include page="menu.jsp"/>
   <div class="main">

	<h1>Accueil</h1>

     <jsp:scriptlet>

	session = request.getSession();

	Object userCheck = session.getAttribute("user");
	
	if(userCheck!=null){

		String user = (String) userCheck;
		out.println("Bienvenue ! Vous &#234tes connect&#233 sur MusicOnline sous le compte-client "+user+" !");

	}
	else{
		out.println("Bienvenue sur MusicOnline (version JSP) cher visiteur :) !");
	}


     </jsp:scriptlet>
		

	 <br /> <br /> 

<IMG SRC="img/MUSICONLINE.png"
 TITLE="MusicOnline">
	

   </div>
 </body>
</html>
