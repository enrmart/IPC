package my.cajero.Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

/**
 * Clase que contiene todos las variables usadas por el programa cajero
 * @author enrmart
 * @author sarapa
 * @author sangonz
 */
public class ModeloCajero {
    
    private String identificadorTajeta;
    private Integer pin;
    private int saldo;
    private boolean estadoPin;
    private int contfallos;
    
    private HashMap<String, Integer> tarjeta;
    private HashMap<String, ArrayList<String>> transacciones;
    private ArrayList<String> trans;
    
   
    
    /**
     * Constructor de la clase ModeloCajero
     */
    public ModeloCajero(){
        contfallos = 3;
        datosTarjeta();
    }
    
    /**
     * Metodo que contiene los datos de la tarjeta
     */
    private void datosTarjeta(){
        identificadorTajeta = "123456789";
        pin = 1234;
        saldo = 500;
        estadoPin = false;
        
        tarjeta = new HashMap<String,Integer>();
        tarjeta.put(identificadorTajeta, pin);
        
        transacciones = new HashMap<String, ArrayList<String>>();
        trans = new ArrayList<String>();
        trans.add("12/02/2022 -200");
        trans.add("10/01/2022 -100");
        transacciones.put(identificadorTajeta,trans);
    }
    
    /**
     * Metodo para añadir una nueva transaccion 
     * @param importe, cantidad de dinero retirado, ultima extraccion de dinero
     */
    public void añadirTransaccion(int importe){
        Date dia = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<String> trans = new ArrayList<String>(transacciones.get(getIdentificadorTarjeta()));
        trans.add(0, formatter.format(dia)+"  -" + importe);
        transacciones.put(getIdentificadorTarjeta(),trans);
    }
    
    /**
     * Da la lista con las transacciones guardadas para esa tarjeta
     * @return lista con todas las transacciones de la tarjeta
     */
    public ArrayList getTransacciones(){
        return transacciones.get(getIdentificadorTarjeta());
    }
    
    /**
     * Metodo que modifica el saldo antiguo por el actual
     * @param saldoActual, saldo nuevo que se va a cambiar por el antiguo
     */
    public void setsaldo(int saldoActual){
        saldo = saldoActual;
    }
    
    /**
     * Metodo que muestra el saldo actual
     * @return saldo acutal de la tarjeta
     */
    public int getSaldo(){
        return saldo;
    }
    
    /**
     * Metodo para restaurar el valor de los fallos disponibles 
     */
    public void resetFallos(){
        contfallos = 3;
    }
    
    /**
     * 
     * Metodo que devuelve la cantidad de fallos disponibles en eso momento
     * @return numero de fallos disponibles para introducir el pin
     */
    public int getFallos(){
        return contfallos;
    }
    
    /**
     * Metodo que ecrementa la cantidad de fallos disponibles
     */
    public void decrementoFallo(){
        contfallos --;
    }
    
    /**
     * Metodo que cambia el estado del pin 
     * @param estado, estado del pin, false si el pin no se ha introducido todavia o es incorrecto, pero si el 
     * pin es correcto pasara a true
     */
    public void setEstadoPin(boolean estado){
        estadoPin = estado;
    }
    
    /**
     * Metodo que retorina el estado el pin
     * @return estadoPin, false si el pin no se ha introducido todavia o es incorrecto, pero si el 
     * pin es correcto pasara a true
     */
    public boolean getEstadoPin(){
        return estadoPin;
    }
    
    /**
     * Metodo que retorina el pin de la tarjeta
     * @return PIN numero pin de la tarjeta
     */
    public int getPinTarjeta(){
        return tarjeta.get(identificadorTajeta);
    } 
    
    /**
     * Metodo que retorna el numero  identificador de la tarjeta
     * @return numero identificador de la tarjeta
     */
    public String getIdentificadorTarjeta(){
        return identificadorTajeta;
    } 
}