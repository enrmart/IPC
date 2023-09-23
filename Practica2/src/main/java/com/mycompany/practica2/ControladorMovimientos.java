package com.mycompany.practica2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import my.cajero.Modelo.ModeloCajero;

/**
 * Clase que controla todos los movimientos (cajaero, cambiar pin y transacciones)
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class ControladorMovimientos {
    
    private VistaMovimientos vistaMov;
    private ModeloCajero modelo;
    
    private int contadorPin;    
    private int numero;
    
    public int tipoOpcion;
    /*
        Opcion 0: Ninguna opcion seleccionada
        Opcion 1: Ingresar Pin
    */

    
    /**
     * Constructor de la clase CajeroControlador
     * @param vista, inicializador de la clase CajeroVista
     * @param modelo, inicializador de la clase ModeloCajero
     */
    public ControladorMovimientos(VistaMovimientos vista, ModeloCajero modelo){
        this.vistaMov = vista;
        this.modelo = modelo;
        
    }
    
    /**
     * Metodo para iniciar la variables y la información al inicio del programa.
     */
    public void Inicio(){
        inicializarNumero();
        inicializarContadoPin();
        cambiarTipoOpcion(0);
        vistaMov.setImagenTarjeta("src\\main\\java\\Imagenes\\Tarjeta2.png");
        vistaMov.setImagenInsertarTarjeta("src\\main\\java\\Imagenes\\FotoTarjeta1.png");
    }
    
    /**
     * Metodo para iniciar los valores de estado del cajero con la tarjeta insertada
     */
    public void inicializarCajero(){
        modelo.setEstadoPin(false);    
        vistaMov.imprimeTransacciones(null);
        tipoOpcion = 0;
        modelo.resetFallos();
        inicializarNumero();
        inicializarContadoPin();
        vistaMov.imprimirInicializarCajero();
        if (modelo.getFallos() != 0){
            vistaMov.imprimePantalla("¡ Que tenga un buen dia !");
        }
    }   
    
    /**
     * Metodo que muestra las opciones del cajero
     */
    public void nombreOpciones(){
        vistaMov.imprimeOpciones();
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
    
    /**
     * Metodo para iniciar a 0 la valiable contadorNumero
     */
    public void inicializarContadoPin(){
        contadorPin = 0;
    }
    
    /**
     * Metodo para comprobar si el PIN introducido, si es correcto imprime por pantalla un mensaje y acontinuacion muestra las operaciones
     * para realizar en el cajero, en caso contrario, muesta por pantalla los intentos restantes y si el contador de fallos es 0, el cajero
     * se quedara con la tarjeta
     * @param pin, numero (pin) que se va a comprobar
     */
    public void comprobarPin(int pin){
        if(pin == modelo.getPinTarjeta()){
            vistaMov.imprimePantalla("<html><p>  PIN Correcto </p> <p> ¿ Desea realizar alguna operacion ? </p>  </html>");
            modelo.setEstadoPin(true);
            nombreOpciones();
        }else{
            modelo.decrementoFallo();
            this.inicializarNumero();
            nombreOpciones();
            modelo.decrementoFallo();
            if(modelo.getFallos() != 0){
                inicializarContadoPin();
                vistaMov.imprimePantalla("<html><p>PIN incorrecto y quedan "+ modelo.getFallos()+" intentos hasta que se bloquee</p></html>");
            }else{
                vistaMov.imprimePantalla("<html><p>PIN incorrecto nos quedamos con la tarjeta, vuelva a la sucursal para poder recuperarla</p></html>");
                inicializarCajero();
            }
        }  
    }  
    
    /*
    * Metodo que imprimer por pantalla tantos asteriscos como numeros del pin hayas introducido
    */
    public void imprimirPin(){
        String[] caracterPin = {"","*","**", "***", "****"};
        vistaMov.imprimePantalla(caracterPin[contadorPin]);
    }
    
}