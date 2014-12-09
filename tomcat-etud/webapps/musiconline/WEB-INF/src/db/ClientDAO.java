package db;

/**
 * Description of ClientDAO  
 *
 * @author lesommer
 */
public class ClientDAO implements DataAccessObject{



    private static ClientDAO dao;
    
    
    private ClientDAO() {    }
    
   
    public final static ClientDAO getInstance() {
        if(dao == null) {
            dao= new ClientDAO();
        }
        return dao;
    }
    
    

   public final void insertPr(Client client, SQliteConnexion dbc){

	        String query = "insert into Client(login, email, passwd, nom, prenom, date_naissance, adresse, code_postal, ville, pays) values ("+client.getLogin()+", "+client.getEmail()+", "+client.getPassword()+", "+client.getNom()+", "+client.getPrenom()+", "+client.getDateNaissance()+", "+client.getAdresse()+", "+client.getCodePostal()+", "+client.getVille()+", "+client.getPays()+")";
	        super.statement(dbc,query);

    }
    
    
    public void deletePr(Client client, SQliteConnexion dbc){
     	

	        String query = "DELETE FROM Client WHERE loginClient="+client.getLogin();
	        super.statement(dbc,query);

     
      }
     
	public void updatePr(Client client, SQliteConnexion dbc){
			
	        String query = "UPDATE Client SET nom=" + client.getEmail()+",prenom=" + client.getPassword()+",email=" + client.getNom()+",passwd=" + client.getPrenom()+",date_naissance=" + client.getDateNaissance()+",adresse=" + client.getAdresse()+",code_postal=" + client.getCodePostal()+",ville=" + client.getVille()+",pays=" + client.getPays() +"WHERE loginClient=" + client.getLogin();
	        super.statement(dbc,query);
	
	}

	

}

