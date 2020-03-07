/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojet;
import java.sql.*;

/**
 *
 * @author Robin
 */
public class Connexion {
    public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            String url="jdbc:mysql://localhost:3306/bibliotheque";
            String userName ="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,userName,password);
            System.out.println("Connexion effectuée");
            return con;
        }catch(Exception e){ 
            System.out.println("Connexion impossible : serveur non disponible");
            e.printStackTrace();
            return null;
        }
    }
}
