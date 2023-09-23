/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica2;

import javax.swing.JFrame;
import my.cajero.Modelo.ModeloCajero;

/**
 * 
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class StateMachine {
    private JFrame currentState;
    private JFrame Vista;
    private static ModeloCajero modelo;
    
    public StateMachine(ModeloCajero modelo) {
        this.modelo = modelo;
        enciendecajero();
    }
    
    /**
     * Cambia de estado a VistaMovimientos (cajero, cambiar pin y transacciones)
     */
    void enciendecajero() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(currentState!=null){
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaMovimientos(modelo);
                modelo.setEstadoPin(false);
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cambia de estado a VistaCajero (Consultar saldo, retirar dinero y consultar contracciones)
     */
    void UsoNormalCajero() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(currentState!=null){
                    Vista = currentState;
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaCajero(modelo);
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cambia de estado a VistaPIN
     */
    void cambiarPinCajero() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(currentState!=null){
                    Vista=currentState;
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaPIN(modelo);
                currentState.setVisible(true);
            }
        });
    }
    
    /**
     * Cambia de estado a VistaTransferencias
     */
    void transferencias() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(currentState!=null){
                    Vista = currentState;
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = new VistaTransferencias(modelo);
                currentState.setVisible(true);
            }
        });
    }
    
    void recuperacajero(){
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              if(currentState!=null){
                    currentState.setVisible(false);
                    currentState.dispose();
                }
                currentState = Vista;
                currentState.setVisible(true);
            }
        });
    }
}
