/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.cajero.main;

import com.mycompany.practica2.VistaCajero;
import com.mycompany.practica2.StateMachine;
import my.cajero.Modelo.ModeloCajero;
/**
 * Clase principal desde donde se ejecuta el codigo principal
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class MainCajero {
  
    private static StateMachine Statemachine;
    
    private static StateMachine Cajero; 
    private static ModeloCajero modelo;
    /**
   *   Inicio del programa pincipal
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        modelo = new ModeloCajero();
        Statemachine = new StateMachine(modelo);
        
    }
    
    public static StateMachine getStateMachine(){
       return MainCajero.Statemachine;
    } 
    
}
