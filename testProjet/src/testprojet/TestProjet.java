/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testprojet;
import java.sql.*;

import javax.swing.*;
import testprojet.Connexion.*;
import static testprojet.Connexion.connecterDB;
/**
 *
 * @author Robin
 */
public class TestProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Connection cnx = connecterDB();
        Statement state = cnx.createStatement();
      //L'objet ResultSet contient le résultat de la requête SQL
      ResultSet result = state.executeQuery("SELECT * FROM livre;");
      //On récupère les MetaData (les informations sur les données = le nom des colonnes)
      ResultSetMetaData resultMeta = result.getMetaData();
         
      System.out.println("\n**********************************");
      //On affiche le nom des colonnes
      for(int i = 1; i <= resultMeta.getColumnCount(); i++){
          System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
      }
         
      System.out.println("\n**********************************");
         
      while(result.next()){         
        for(int i = 1; i <= resultMeta.getColumnCount(); i++){
            System.out.print("\t" + result.getObject(i).toString() + "\t |");
            
        }
          
            
           
        System.out.println("\n---------------------------------");
        
      }
      
     
      
      FrameTest t = new FrameTest();
      result.first();
      t.initCB1(result);
      
      
      
      
      
    }
    
          
    
}
