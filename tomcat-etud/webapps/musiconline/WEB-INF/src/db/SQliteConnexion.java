package db;

import java.sql.*;
import org.sqlite.*;
import org.sqlite.JDBC;

/**
 * Cette classe (type singleton !!) établit la connexion entre une
 * application Java et une BDD SQLite.
 */

class SQliteConnexion {

    // !!REMPLACER xxx par vos paramètres de BDD mysql.
    private String dsn = "jdbc:sqlite:musiconline.db";
    
    private java.sql.Connection connect;
    private static SQliteConnexion theInst = null;

    /**
     * Constructeur privé !
     * Etablissement de la connexion.
     */
    private SQliteConnexion(){
        this.getConnection();
    }

    /**
     * Méthode statique de récupération de l'instance unique.
     * @return - l'instance de MySQLConnection.
     */
    public static SQliteConnexion getInstance(){
        if ( SQliteConnexion.theInst == null ) {
            SQliteConnexion.theInst = new SQliteConnexion();
        }
        return SQliteConnexion.theInst;
    }

    /**
     * Renvoie l'objet qui a établi la connexion avec la BDD.
     * @return - l'objet qui a établi la connexion.
     */
    public java.sql.Connection getConnection(){
        if ( this.connect == null ) {
		

            try {
		Class.forName("org.sqlite.JDBC");
            this.connect =  DriverManager.getConnection(dsn);
            System.out.println( "Connexion reussie" );
            }
            catch ( Exception e ) {
                System.err.println( "Erreur de connexion : " + e.getMessage() );
            }
        }
        return this.connect;
    }

    /**
     * Ferme la connexion avec la BDD.
     */
    public void closeConnection(){
        try {
            this.connect.close();
            this.connect = null;
        } catch ( Exception e ) {
            System.out.println ( "Probleme de fermeture" + e.getMessage() );
        }
    }


    /**
     * Lanceur qui teste la classe MySQLConnection
     */
    public static void main(String[] args){
        SQliteConnexion theObj = SQliteConnexion.getInstance();
        theObj.closeConnection();
    }

}
