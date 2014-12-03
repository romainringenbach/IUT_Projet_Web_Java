package db;

import java.sql.*;
import org.sqlite.*;
import org.sqlite.JDBC;

/**
 * Cette classe (type singleton !!) établit la connexion entre une
 * application Java et une BDD SQLite.
 */

class SQLiteConnection {

    // !!REMPLACER xxx par vos paramètres de BDD mysql.
    private String dsn = "jdbc:sqlite:musiconline.db";
    
    private java.sql.Connection connect;
    private static SQLiteConnection theInst = null;

    /**
     * Constructeur privé !
     * Etablissement de la connexion.
     */
    private SQLiteConnection(){
        this.getConnection();
    }

    /**
     * Méthode statique de récupération de l'instance unique.
     * @return - l'instance de MySQLConnection.
     */
    public static SQLiteConnection getInstance(){
        if ( SQLiteConnection.theInst == null ) {
            SQLiteConnection.theInst = new SQLiteConnection();
        }
        return SQLiteConnection.theInst;
    }

    /**
     * Renvoie l'objet qui a établi la connexion avec la BDD.
     * @return - l'objet qui a établi la connexion.
     */
    public java.sql.Connection getConnection(){
        if ( this.connect == null ) {
            try {
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
        SQLiteConnection theObj = SQLiteConnection.getInstance();
        theObj.closeConnection();
    }

}
