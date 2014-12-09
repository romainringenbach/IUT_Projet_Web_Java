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
	String date = request.getParameter("date");	  
	String email = request.getParameter("email");
	String adresse = request.getParameter("adresse");
	String code = request.getParameter("code");
	String ville = request.getParameter("ville");
	String pays = request.getParameter("pays");

	if( nom != "" && prenom != "" && login != "" && date != "" && email != "" && adresse != "" && code != "" && ville != "" && pays != "" ){
    	
		System.out.println("Formulaire Ok");
		session.setAttribute("error-form", false);

		try{
			Pays newPays = new Pays();
			newPays.init(pays);
			PaysDAO paysDB = ClientDAO.getInstance();
			PaysDAO.insert(newPays);
			
			
		}
		catch(Exception ex) { /* pays deja créer ... pas de probleme ! */ ;}
		
		Client newClient = new Client();
		newClient.init(login, email, passwd, nom, prenom, date, adresse, code_postal, ville, pays);
		ClientDAO clientDB = ClientDAO.getInstance();
		clientDB.insert(newClient);
	}   
	else{
		System.out.println("Formulaire Error");
		session.setAttribute("error-form", true);
	}
   }  
}
