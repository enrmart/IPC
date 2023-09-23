/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import my.cajero.Modelo.ModeloCajero;

/**
 * Clase que controla las transferencias
 * @author enrmart
 * @author sarapa
 * @author sangonz
 */

public class ControladorTransferencias{
    /*En este controlador va todas las operaciones relacionadas con las transferencias*/
    private VistaTransferencias vista;
    private ModeloCajero modelo;
   
    
    private int numero;
    private int capsula;
    private char previa;
    private String Concepto="";
    private String Iban="";

    
    /**
     * Constructor de la clase CajeroControlador
     * @param vista, inicializador de la clase CajeroVista
     * @param modelo, inicializador de la clase ModeloCajero
     */
    public ControladorTransferencias(VistaTransferencias vista, ModeloCajero modelo){
        this.vista = vista;
        this.modelo = modelo;
        
    }
    
    /**
     * Metodo para iniciar la variables y la información al inicio del programa.
     */
    public void Inicio(){
        inicializarNumero();
        modelo.setPulsaciones(0);
        inicializarConcepto();
        inicializarCapsula();
        vista.setImagenTarjeta("src\\main\\java\\Imagenes\\Tarjeta2.png");
        vista.setImagenInsertarTarjeta("src\\main\\java\\Imagenes\\FotoTarjeta1.png");
        vista.imprimeOpciones();
           
    }
    
    /**
     * Metodo para inicializar el Iban vacio
     */
    public void inicializarIban(){
        Iban = "";
    }
    
    /**
     * Modifica el valor de la variable Iban
     * @param cadena  iban introducido por teclado 
     */
    public void setIban(String cadena){
        Iban = cadena;
    }
    
    /**
     * Retorna el valor actual del Iban
     * @return Iban iban introducido
     */
    public String getIban(){
        return Iban;
    }
    /**
     * Metodo para inicializar la variable vacia
     */
    public void inicializarPrevia(){
        previa = ' ';
    }
    
    /**
     * Metodo para actualizar el numero introducido por teclado
     * @param num numero introducido por teclado
     */
    public void cambiarNumero(int num){
        numero = num;
    }
    
    /**
     * Obtinene el numero que se ha introducido por teclado
     * @return numero introducido por teclad
     */
    public int getNumero(){
        return numero;
    }
        
    /**
     * Metodo para iniciar a 0 la valiable numero
     */
    public void inicializarNumero(){
        numero = 0;
    }
    
    /**
     * Metodo para borrar la ultima letra de la cadena introducida
     * @param letra que se desea eliminar
     */
    public void borrarConcepto(String letra){
        Concepto = Concepto.substring(0, Concepto.length()-1);
    }
    
     /**
     * Metodo para actualizar el Concepto introducido por teclado
     * @param caracter caracter introducido por teclado
     */
    public void cambiarConcepto(char caracter){
        Concepto = Concepto + caracter;
    }
    
    /**
     * Obtinene el Concepto que se ha introducido por teclado
     * @return IBAN de la cuenta 
     */
    public String getConcepto(){
        return Concepto;
    }
        
    /**
     * Metodo para iniciar como vacia la variable Concepto
     */
    public void inicializarConcepto(){
        Concepto = "";
    }
    
    /**
     * Metodo para iniciar la variable capsula a 0, que sirve para saber si estas escribiendo en el 
     * concepto, Nombre del titular, Iban o cantidad de dinero
     */
    public void inicializarCapsula(){
        capsula = 0;
    }
        
    /**
     * Devuelve el valor actual de capsula, es decir en que dato de la transferencia se esta escribiendo:
     * concepto, nombre del titular, Iban o cantidad de dinero
     * @return capsula
     */
    public int getCapsula(){
        return this.capsula;
    }
    
    /**
     * Modifica la variable capsula (dato de la transferencia se esta escribiendo)
     * @param mod 
     */
    public void setCapsula(int mod){
        this.capsula = mod;
    }
    
    /**
     * Metodo que comprueba si el dinero que se desea transferir sea menor que la cantidad de saldo disponible en la tarjeta, si no,
     * se le volvera a pedir otra cantidad
     * @param dinero, cantidad a comprobar que se pueda sacar para dicha tarjeta y para dicho cajero
     */
    public void retirarDinero(int dinero){
        if(dinero < modelo.getSaldo()){
            modelo.setsaldo(modelo.getSaldo() - dinero);
            modelo.añadirTransaccion(dinero);
            vista.imprimeConfirmacion("TRANSFERENCIA COMPLETADA");
        }else{
            vista.imprimeConfirmacion("<html><p>Saldo menor al dinero que se desea transferir</p></html>");
            inicializarNumero();
        }            
    }
}