package control.listeners;

import javax.servlet.http.*;
import db.*;
import control.*;

public class AccountCreationListener implements ActionListener {

  public void handle(HttpServletRequest request){

  	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String login = request.getParameter("login");
	String date = request.getParameter("date");	  
	String email = request.getParameter("email");
	String adresse = request.getParameter("adresse");
	String code = request.getParameter("code");
	String ville = request.getParameter("ville");
	String pays = request.getParameter("pays");

	if( nom != "" && prenom != "" && login != "" && date != "" && email != "" && adresse != "" && code != "" && ville != "" && pays != "" ){
    	
		HttpSession session = request.getSession();
		
	}   
	else{
		System.out.println("Error");
		session.setAttribute("error", true);
	}
   }  
}
