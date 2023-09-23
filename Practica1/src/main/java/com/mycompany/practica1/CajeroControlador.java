package com.mycompany.practica1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import my.cajero.Modelo.ModeloCajero;

/**
 * Clase que controla todos las acciones que realiza el programa
 * @author enrmart
 * @author sarapa
 * @author sangonz
 */
public class CajeroControlador {
    private CajeroVista vista;
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
    public CajeroControlador(CajeroVista vista, ModeloCajero modelo){
        this.vista = vista;
        this.modelo = modelo;
        
    }
    
    /**
     * Metodo para iniciar la variables y la información al inicio del programa.
     */
    public void Inicio(){
        inicializarNumero();
        inicializarContadoPin();
        cambiarTipoOpcion(0);
        vista.setImagenTarjeta("src\\main\\java\\Imagenes\\Tarjeta2.png");
        vista.setImagenInsertarTarjeta("src\\main\\java\\Imagenes\\FotoTarjeta1.png");
    }
    
        
    /**
     * Metodo para iniciar los valores de estado del cajero con la tarjeta insertada
     */
    public void inicializarCajero(){
        modelo.setEstadoPin(false);    
        vista.imprimeTransacciones(null);
        tipoOpcion = 0;
        modelo.resetFallos();
        inicializarNumero();
        inicializarContadoPin();
        vista.imprimirInicializarCajero();
        if (modelo.getFallos() != 0){
            vista.imprimePantalla("¡ Que tenga un buen dia !");
        }
    }   
    
    /**
     * Metodo que muestra las opciones del cajero
     */
    public void nombreOpciones(){
        vista.imprimeOpciones();
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
            vista.imprimePantalla("<html><p>  PIN Correcto </p> <p> ¿ Desea realizar alguna operacion ? </p>  </html>");
            modelo.setEstadoPin(true);
            nombreOpciones();
        }else{
            modelo.decrementoFallo();
            if(modelo.getFallos() != 0){
                inicializarContadoPin();
                vista.imprimePantalla("<html><p>PIN incorrecto y quedan "+ modelo.getFallos()+" intentos hasta que se bloquee</p></html>");
            }else{
                vista.imprimePantalla("<html><p>PIN incorrecto nos quedamos con la tarjeta, vuelva a la sucursal para poder recuperarla</p></html>");
                inicializarCajero();
            }
        }  
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
                vista.imprimePantalla("<html><p>Por favor, retire su dinero</p></html>");
                modelo.añadirTransaccion(dinero);
                vista.imprimeRetiradaDinero(dinero);
                
            }else{
                vista.imprimePantalla("<html><p>Saldo menor al dinero que se desea retirar</p></html>");
                inicializarNumero();
            }            
        }else{
            vista.imprimePantalla("<html><p>Introduce cantidades de 10€, 20€, 30€...</p></html>");
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
        
        vista.imprimeTransacciones(array);
    }
    
    /**
     * Metodo que muestra el saldo disponible por el panel principal
     */
    public void mostrarSaldoDisponible(){
        vista.imprimePantalla("dinero disponible " + modelo.getSaldo());
    }   
    
    /*
    * Metodo que imprimer por pantalla tantos asteriscos como numeros del pin hayas introducido
    */
    public void imprimirPin(){
        String[] caracterPin = {"","*","**", "***", "****"};
        vista.imprimePantalla(caracterPin[contadorPin]);
    }
    
}