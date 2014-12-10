package control.listeners;

import javax.servlet.http.*;
import db.*;
import control.*;
import java.io.*;
import java.util.regex.*;
import java.util.StringTokenizer;

public class AccountCreationListener implements ActionListener {

  public void handle(HttpServletRequest request){

	HttpSession session = request.getSession();
	
	session.setAttribute("error-bdd", true); 

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
    	
		System.out.println("Formulaire non-null Ok");
		session.setAttribute("error-form", false);

		String regexDate = "(\\d){4}(-)(\\d){2}(-)(\\d){2}";
		Pattern pattern = Pattern.compile(regexDate);
		Matcher matcher = pattern.matcher(date);
		System.out.println(date);
		if(matcher.find()){
			
			System.out.println("Date okay 1");
			session.setAttribute("error-date1", false);

			StringTokenizer stk = new StringTokenizer(date, "-"); 
			int data1 = Integer.parseInt(stk.nextToken());
			int data2 = Integer.parseInt(stk.nextToken());
			int data3 = Integer.parseInt(stk.nextToken());	
			
			if(data1<2050 && data1>1900 && data2<13 && data2>0 && data3<32 && data3>0){
				
				System.out.println("Date okay 2");
				session.setAttribute("error-date2", false);

				if(login.length() > 4 && passwd.length() > 7){
				
					System.out.println("login et mdp okay");
					session.setAttribute("error-loginmdp", false);
				
					Pattern checkMailPat = Pattern.compile("@");
					Matcher checkMailMat = checkMailPat.matcher(email);

					if(checkMailMat.find()){

						System.out.println("Email okay");
						session.setAttribute("error-email", false);

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
							session.setAttribute("error-bdd", false); 
						}
						catch(Exception ex){ 
							System.out.println("Erreur lors de l'insertion client dans la BDD"); 
							session.setAttribute("error-bdd", true); 
							System.out.println(ex.getMessage()); 
						}
					}
					else{
	
						System.out.println("Email error");
						session.setAttribute("error-email", true);

					}
				}
				else{
					System.out.println("login et mdp erreur");
					session.setAttribute("error-loginmdp", true);
				}
			
			}
			else{
				System.out.println("Date error 2");
				session.setAttribute("error-date2", true);
			}
		}
		else{
			System.out.println("Date error 1");
			session.setAttribute("error-date1", true);
		}
		
	}    
	else{
		System.out.println("Formulaire Error");
		session.setAttribute("error-form", true);
	}
   }  
}
