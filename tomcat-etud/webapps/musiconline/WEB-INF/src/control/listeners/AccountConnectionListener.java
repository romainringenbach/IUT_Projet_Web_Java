package control.listeners;

import javax.servlet.http.*;
import db.*;
import control.*;
import java.sql.*;

public class AccountConnectionListener implements ActionListener {

  public void handle(HttpServletRequest request){

	HttpSession session = request.getSession();

	session.setAttribute("user", null);

	try{
		String login = (String) request.getParameter("login");
		String passwd = (String) request.getParameter("password");

		ClientDAO clientDB = ClientDAO.getInstance();
		ResultSet res = clientDB.findUser(login, passwd);

		res.next();
		String user = res.getString(1);
		System.out.println("Connexion -------> USER : {"+user+"}");
		session.setAttribute("user", user); 

		TitreDAO titreDB = TitreDAO.getInstance();
		ResultSet music_title = titreDB.findSomeMusic();
		

		session.setAttribute("music_title", music_title); 

		
	}
	catch(Exception ex){
		System.out.println("ERROR BDD");
	}


	
    


  }
  
}

