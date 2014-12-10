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
   	session = request.getSession();

	if((boolean)session.getAttribute("error-bdd") == true){
		out.println("ERROR ! cr&#233ation du compte n'a pu aboutir");
	}
	else{
		out.println("OKAY : la cr&#233ation de compte s'est effectu&#233e sans probl&#232me, vous pouvez maintenant vous connecter :) !");
	}
	
	if((boolean)session.getAttribute("error-form") == true){
		out.println("-> Il y a un probl&#232me dans le formulaire, tous les champs ne sont pas remplis, votre compte ne peut &#234tre cr&#233&#233");
	}
	else if((boolean)session.getAttribute("error-date1") == true){
		out.println("-> La date que vous avez saisie n'est pas valide, veuillez respecter le format AAAA-MM-JJ.");
	}
	else if((boolean)session.getAttribute("error-date2") == true){
		out.println("-> La date que vous avez saisie n'est pas valide, veuillez verifier votre saisie.");
	}
	else if((boolean)session.getAttribute("error-loginmdp") == true){
		out.println("-> Le login doit comporter plus de 4 caratères. \n->Le mot de passe doit comporter plus de 7 caratères.");
	}
	else if((boolean)session.getAttribute("error-email") == true){
		out.println("-> L'adresse e-mail n'est pas valide, veuillez saisir une adresse e-mail conforme (xxx@xxx.xx).");
	}

     </jsp:scriptlet>

   </div>
 </body>
</html>
