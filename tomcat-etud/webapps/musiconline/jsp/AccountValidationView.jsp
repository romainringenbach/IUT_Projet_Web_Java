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
   	HttpSession session = request.getSession();
	boolean error = session.getAttribute("error");

	if(error == true){
		out.println("ERROR Il y a un problème dans le formulaire, votre compte ne peut être créé");
	}

	
     </jsp:scriptlet>
	
	<br />Votre compte a bien &#233t&#233 cr&#233&#233 :) ! Vous pouvez d&#233sormais vous connecter.<br /> <br />
	
   </div>
 </body>
</html>
