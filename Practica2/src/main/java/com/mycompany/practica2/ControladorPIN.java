/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica2;

import my.cajero.Modelo.ModeloCajero;

/**
 * Clase que controla todos la accion para cambiar el pin de la tarjeta
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class ControladorPIN {

    private VistaPIN vista;
    private ModeloCajero modelo;
    private int numero;
    private int contadorPin;
    
    public ControladorPIN(VistaPIN vista, ModeloCajero modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    
    /**
     * Metodo para iniciar la variables y la información al inicio del programa.
     */
    public void Inicio(){
        vista.setImagenTarjeta("src\\main\\java\\Imagenes\\Tarjeta2.png");
        vista.setImagenInsertarTarjeta("src\\main\\java\\Imagenes\\FotoTarjeta1.png");
    }
    
    
    /**
     * Obtinene el numero que se ha introducido por teclado
     * @return numero introducido por teclado
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
     * Metodo para actualizar el numero introducido por teclado
     * @param num numero introducido por teclado
     */
    public void cambiarNumero(int num){
        numero = num;
    }
    
     /**
     * Metodo para actualizar el PIN de la tarjeta
     */
    public void cambiarPIN(){
        modelo.setPIN(numero);
    }
    
     /**
     * Metodod que actualiza la variable contadorPin
     * @param cont cuenta el numero de lo numero introducidos por teclado
     */
    public void cambiarContadorPin(int cont){
        contadorPin = cont;
    }
    
    /**
     * Metodo para obtener contadorPin
     * @return numero de lo numero introducidos por teclado
     */
    public int getContadorPin(){
        return contadorPin;
    }
    
    /*
    * Metodo que imprime por pantalla tantos asteriscos como numeros del pin hayas introducido
    */
    public void imprimirPin(){
        String[] caracterPin = {"","*","**","***","****"};
        vista.imprimePantalla(caracterPin[contadorPin]);
        
    }
    
}
