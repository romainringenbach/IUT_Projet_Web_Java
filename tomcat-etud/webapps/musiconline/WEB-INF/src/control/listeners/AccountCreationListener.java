package control.listeners;

import javax.servlet.http.*;
import db.*;
import control.*;

public class AccountCreationListener implements ActionListener {

  public void handle(HttpServletRequest request){

	HttpSession session = request.getSession();

  	String nom = request.getParameter("nom");
	String prenom = request.getParameter("prenom");
	String login = request.getParameter("login");
	String passwd = request.getParameter("password");
	String date = request.getParameter("date");	  
	String email = request.getParameter("email");
	String adresse = request.getParameter("adresse");
	String code = request.getParameter("code");
	String ville = request.getParameter("ville");
	String pays = request.getParameter("pays");

	if( nom != "" && prenom != "" && login != "" && date != "" && email != "" && adresse != "" && code != "" && ville != "" && pays != "" && passwd != "" ){
    	
		System.out.println("Formulaire Ok");
		session.setAttribute("error-form", false);

		try{
			Pays newPays = new Pays(pays);
			PaysDAO paysDB = PaysDAO.getInstance();
			paysDB.insert(newPays);
			
		}
		catch(Exception ex) { System.out.println(ex.getMessage());}
		
		Client newClient = new Client(login, email, passwd, nom, prenom, date, adresse, code, ville, pays);
		ClientDAO clientDB = ClientDAO.getInstance();

		try{
			clientDB.insert(newClient);
		}
		catch(Exception ex){ System.out.println("Erreur lors de l'insertion client"); session.setAttribute("error-form", true); System.out.println(ex.getMessage()); }
	}    
	else{
		System.out.println("Formulaire Error");
		session.setAttribute("error-form", true);
	}
   }  
}
