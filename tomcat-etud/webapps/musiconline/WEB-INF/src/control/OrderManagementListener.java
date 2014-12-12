package control;

import db.*;

class OrderManagementListener {



	public String[] getShoppingCard()

		Cookie[] cookies = request.getCookies();
		String[] title_list=""; 
		int i=0;

		while(i < cookies.length && !cookies[i].getName().equals("shoppingcart")){
			i++;
		}

		if(cookies[i].getName().equals("shoppingcart")){
			title_list=cookies[i].getValue().split(",");
		}

		return title_list;



	}