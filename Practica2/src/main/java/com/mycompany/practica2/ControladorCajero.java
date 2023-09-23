package com.mycompany.practica2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import my.cajero.Modelo.ModeloCajero;

/**
 * Clase que controla todos las acciones del cajero( Retirar dinaro,Consultar saldo y transacciones)
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class ControladorCajero {
    private VistaCajero vistaCaj;
    private ModeloCajero modelo;
    
    private int contadorPin;    
    private int numero;
    
    public int tipoOpcion;
    /*
        Opcion 0: Ninguna opcion seleccionada
        Opcion 1: Ingresar Pin
        Opcion 2: Retirar dinero
        Opcion 3: Consultar transacciones
        Opcion 4: Consultar saldo
    */

    
    /**
     * Constructor de la clase CajeroControlador
     * @param vista, inicializador de la clase CajeroVista
     * @param modelo, inicializador de la clase ModeloCajero
     */
    public ControladorCajero(VistaCajero vista, ModeloCajero modelo){
        this.vistaCaj = vista;
        this.modelo = modelo;
        
    }
    
    /**
     * Metodo para iniciar la variables y la información al inicio del programa.
     */
    public void Inicio(){
        inicializarNumero();
        cambiarTipoOpcion(1);
        vistaCaj.setImagenTarjeta("src\\main\\java\\Imagenes\\Tarjeta2.png");
        vistaCaj.setImagenInsertarTarjeta("src\\main\\java\\Imagenes\\FotoTarjeta1.png");
        nombreOpciones();
    }
    
        
    /**
     * Metodo para iniciar los valores de estado del cajero con la tarjeta insertada
     */
    public void inicializarCajero(){
        modelo.setEstadoPin(false);    
        vistaCaj.imprimeTransacciones(null);
        tipoOpcion = 0;
        modelo.resetFallos();
        inicializarNumero();
     //   vistaCaj.imprimirInicializarCajero();
    }   
    
    /**
     * Metodo que muestra las opciones del cajero
     */
    public void nombreOpciones(){
        vistaCaj.imprimeOpciones();
    }
    
    /**
     * Metodod para cambiar de opcion del cajero
     * @param num opcion que deseamos realizar
     */
    public void cambiarTipoOpcion(int num){
        tipoOpcion = num;
    }
    
    /**
     * Retorna la opcion en la que se encuentra el cajero
     * @return opcion que estamos realizando
     */
    public int getTipoOpcion(){
        return tipoOpcion;
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
     * Metodo que comprueba si el dinero que se desea retirar sea multiplo de 10 y menor que la cantidad de saldo disponible en la tarjeta, si no,
     * se le volvera a pedir otra cantidad
     * @param dinero, cantidad a comprobar que se pueda sacar para dicha tarjeta y para dicho cajero
     */
    public void retirarDinero(int dinero){
        if(dinero%10 == 0){
            if(dinero < modelo.getSaldo()){
                modelo.setsaldo(modelo.getSaldo() - dinero);
                vistaCaj.imprimePantalla("<html><p>Por favor, retire su dinero</p></html>");
                modelo.añadirTransaccion(dinero);
                vistaCaj.imprimeRetiradaDinero(dinero);
                
            }else{
                vistaCaj.imprimePantalla("<html><p>Saldo menor al dinero que se desea retirar</p></html>");
                inicializarNumero();
            }            
        }else{
            vistaCaj.imprimePantalla("<html><p>Introduce cantidades de 10€, 20€, 30€...</p></html>");
            inicializarNumero();
        }
    }
    
    /**
     * Metodo que muestra las transacciones por la pantalla de la listas
     */
    public void muestraTransacciones() {
        ArrayList <String> trans = modelo.getTransacciones();
       
        String [] array = new String[trans.size()];
        array = trans.toArray(array);
        
        vistaCaj.imprimeTransacciones(array);
    }
    
    /**
     * Metodo que muestra el saldo disponible por el panel principal
     */
    public void mostrarSaldoDisponible(){
        vistaCaj.imprimePantalla("dinero disponible " + modelo.getSaldo());
    }   
    
    
    
}