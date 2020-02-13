/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progicielmsp;

/**
 *
 * @author Robin
 */
public enum ActivityState {
    PLANNED ("Prévue"),		
    ONGOING ("En cours"),		
    FINISHED ("Terminée"),		
    CANCELED ("Annulé");
    private String name = "";
   
  //Constructeur
    ActivityState(String name){
        this.name = name;
    }
   
    public String toString(){
        return name;
    }
}
