package control.listeners;

import javax.servlet.http.*;
import db.*;
import control.*;
import java.sql.*;

public class PreviousOrderListener implements ActionListener {

  public void handle(HttpServletRequest request){

    HttpSession session = request.getSession();

	try{
		String user = (String) session.getAttribute("user"); 

		CommandeDAO commandeDB = CommandeDAO.getInstance();
		ResultSet prev_order = commandeDB.findPrevOrder(user);
		
		session.setAttribute("prev_order", prev_order); 

	}
	catch(Exception ex){
		System.out.println("ERROR BDD");
	}

  }
  
}

