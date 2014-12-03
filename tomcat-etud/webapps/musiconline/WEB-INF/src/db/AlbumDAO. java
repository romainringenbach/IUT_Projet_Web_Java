package db;

/**
 * Description of AlbumDAO  
 *
 * @author lesommer
 */

class AlbumDAO implements DataAccessObject{



    private static AlbumDAO dao;
    
    
    
    private AlbumDAO() {    }
    
   
    public final static getInstance() {
        if(this.dao == null) {
            this.dao= new AlbumDAO();
        }
        return this.dao;
    }
    
    
  	public final findAll(){
  	
		SQLiteConnexion dbc = SQLiteConnexion.getDBConnection();
		String query = "select * from Album order by nom";
		stmt = dbc.query(query);
		ResultSet rs = stmt.fetchALL(PDO::FETCH_CLASS, 'Album');
    		
    	return rs;
    }
    
    
    
   public final void insert(DataObject album){
        if(album instanceof Album){
	        SQLiteConnexion dbc = SQLiteConnexion.getDBConnection();
		dbc.exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        String query = "insert into Album(nom) values (:n)";
	        stmt = dbc.prepare(query);
	
	        // bind the paramaters
	        stmt.bindValue(':n',album.getNom(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        stmt.execute();
        }
    }
    
    
     public void delete(DataObject album){
     	
     	if(album instanceof Album){
	        SQLiteConnexion dbc = SQLiteConnexion.getDBConnection();
		dbc.exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        String query = "DELETE FROM Album WHERE id_album=:n";
	        stmt = dbc.prepare(query);
	
	        // bind the paramaters
	        stmt.bindValue(':n',album.getId(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        stmt.execute();
      	}
     
      }
     
	public void update(DataObject album){
	
	    if(album instanceof Album){
	        SQLiteConnexion dbc = SQLiteConnexion.getDBConnection();
			dbc.exec("SET NAMES UTF8");
	        // prepare the SQL statement
	        String query = "UPDATE Album SET nom=:n WHERE id_album=:i";
	        stmt = dbc.prepare(query);
	
	        // bind the paramaters
	        stmt.bindValue(':n',album.getNom(),PDO::PARAM_STR);
	        stmt.bindValue(':i',album.getId(),PDO::PARAM_STR);
	
	         // execute the prepared statement
	        stmt.execute();
      	}
	
	
	}
	
	
}
