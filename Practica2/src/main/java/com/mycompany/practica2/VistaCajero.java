package com.mycompany.practica2;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import my.cajero.Modelo.ModeloCajero; 
import my.cajero.main.MainCajero;

/**
 * Clase del modelo MVC parte de vista
 * En esta parte está todo el código que tiene que ver con el diseño grafico y el como se ve
 * @author enrmart
 * @author sarapar
 * @author sangonz
 */
public class VistaCajero extends javax.swing.JFrame {
    
    
    private ControladorCajero controladorCaj;
    private ModeloCajero modelo;
    
    /**
     * Constructor de la Clase CajeroVista que inicializa el modelo del cajero
     */
    public VistaCajero(ModeloCajero modelo) {
        initComponents();       
        this.modelo = modelo;
        controladorCaj = new ControladorCajero(this, modelo);
        controladorCaj.Inicio();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Pantalla = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        P2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Monitor = new javax.swing.JPanel();
        PanelMonitor = new javax.swing.JLabel();
        ExtractorDinero = new javax.swing.JButton();
        CanatidadDinero = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P6 = new javax.swing.JButton();
        P1 = new javax.swing.JButton();
        P5 = new javax.swing.JButton();
        Tarjetero = new javax.swing.JPanel();
        Tarjeta = new javax.swing.JButton();
        IluminacionTarjeta = new javax.swing.JTextField();
        ImagenTarjeta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Transacciones = new javax.swing.JList<>();
        Teclado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Blanco = new javax.swing.JButton();
        Vacio1 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Vacio2 = new javax.swing.JButton();
        Aceptar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 259));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        P2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        P2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        P2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });
        jPanel1.add(P2);

        PanelMonitor.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        PanelMonitor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelMonitor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        javax.swing.GroupLayout MonitorLayout = new javax.swing.GroupLayout(Monitor);
        Monitor.setLayout(MonitorLayout);
        MonitorLayout.setHorizontalGroup(
            MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonitorLayout.createSequentialGroup()
                .addComponent(PanelMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MonitorLayout.setVerticalGroup(
            MonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        ExtractorDinero.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ExtractorDinero.setText("Extractor Dinero");
        ExtractorDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtractorDineroActionPerformed(evt);
            }
        });

        CanatidadDinero.setBackground(new java.awt.Color(255, 255, 255));
        CanatidadDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CanatidadDinero.setText("Cantidad Dinero");
        CanatidadDinero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExtractorDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CanatidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CanatidadDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExtractorDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CanatidadDinero.getAccessibleContext().setAccessibleName("CanatidadDinero");

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        P6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        P6.setBorder(null);
        P6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6ActionPerformed(evt);
            }
        });
        jPanel3.add(P6);

        P1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PantallaLayout = new javax.swing.GroupLayout(Pantalla);
        Pantalla.setLayout(PantallaLayout);
        PantallaLayout.setHorizontalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P5, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
        );
        PantallaLayout.setVerticalGroup(
            PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PantallaLayout.createSequentialGroup()
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        Tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaActionPerformed(evt);
            }
        });

        IluminacionTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IluminacionTarjetaActionPerformed(evt);
            }
        });

        Transacciones.setBackground(new java.awt.Color(0, 0, 0));
        Transacciones.setForeground(new java.awt.Color(51, 255, 0));
        Transacciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "\t", "\t", " ", " ", "Transacciones" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Transacciones.setToolTipText("");
        jScrollPane2.setViewportView(Transacciones);

        javax.swing.GroupLayout TarjeteroLayout = new javax.swing.GroupLayout(Tarjetero);
        Tarjetero.setLayout(TarjeteroLayout);
        TarjeteroLayout.setHorizontalGroup(
            TarjeteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TarjeteroLayout.createSequentialGroup()
                .addGroup(TarjeteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TarjeteroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TarjeteroLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TarjeteroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(IluminacionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TarjeteroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ImagenTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        TarjeteroLayout.setVerticalGroup(
            TarjeteroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TarjeteroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(IluminacionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(ImagenTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setLayout(new java.awt.GridLayout(4, 4));

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel4.add(B1);

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel4.add(B2);

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel4.add(B3);

        Cancelar.setBackground(new java.awt.Color(255, 0, 51));
        Cancelar.setForeground(new java.awt.Color(153, 0, 0));
        Cancelar.setText("CANCELAR");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel4.add(Cancelar);

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel4.add(B4);

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel4.add(B5);

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel4.add(B6);

        Borrar.setBackground(new java.awt.Color(255, 255, 0));
        Borrar.setForeground(new java.awt.Color(153, 153, 0));
        Borrar.setText("BORRAR");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel4.add(Borrar);

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel4.add(B7);

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel4.add(B8);

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel4.add(B9);

        Blanco.setBackground(new java.awt.Color(0, 204, 255));
        Blanco.setForeground(new java.awt.Color(51, 102, 255));
        Blanco.setText("MENU");
        Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlancoActionPerformed(evt);
            }
        });
        jPanel4.add(Blanco);
        jPanel4.add(Vacio1);

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        jPanel4.add(B0);
        jPanel4.add(Vacio2);

        Aceptar.setBackground(new java.awt.Color(0, 204, 0));
        Aceptar.setForeground(new java.awt.Color(51, 153, 0));
        Aceptar.setText("CONFIRMAR");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jPanel4.add(Aceptar);

        javax.swing.GroupLayout TecladoLayout = new javax.swing.GroupLayout(Teclado);
        Teclado.setLayout(TecladoLayout);
        TecladoLayout.setHorizontalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TecladoLayout.setVerticalGroup(
            TecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TecladoLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Teclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tarjetero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tarjetero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Teclado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        Pantalla.getAccessibleContext().setAccessibleName("Pantalla");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    * Boton para solicitar la opcion 2, extrear dinero del cajero
    * @param evt variable que reacciona ante un evento del boton P1 que es el boton de Extractor Dinero
    */
    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        if(modelo.getEstadoPin()!= false){
            controladorCaj.cambiarTipoOpcion(2);
            imprimeTransacciones(null);
            controladorCaj.nombreOpciones(); 
            controladorCaj.inicializarNumero();
            imprimePantalla("<html><p> Introduzca la cantidad de dinero quee se desea retirar:</p></html>");
            
        }
    }//GEN-LAST:event_P1ActionPerformed
    /**
    * Boton para solicitar retirar la tarjeta del cajero y reincia los estados propios del cajero
    * @param evt variable que reacciona ante un evento del boton P6 que es el boton de Salir 
    */
    private void P6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6ActionPerformed
       controladorCaj.inicializarCajero();
       MainCajero.getStateMachine().enciendecajero();
    }//GEN-LAST:event_P6ActionPerformed

    /**
     * Boton que permite al usuario cancelar la operacion que se esta realizando y volver a la pantalla de inicio, o para 
     * borrar el numero que se ha introducido  
     * @param evt variable que reacciona ante un evento del boton Cancelar que cancela la accion que este realizando
     */
    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        controladorCaj.cambiarTipoOpcion(0);
        controladorCaj.nombreOpciones();
        imprimeTransacciones(null);
         
    }//GEN-LAST:event_CancelarActionPerformed

    /**
     * Boton que muestara las transacciones de la tarjeta introduciada en el cajero
     * @param evt variable que reacciona ante un evento del boton Consultar Transacciones
     */
    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        if(modelo.getEstadoPin()!= false){
            controladorCaj.cambiarTipoOpcion(3);
            controladorCaj.inicializarNumero();
            controladorCaj.muestraTransacciones();
            imprimePantalla("");
        }
    }//GEN-LAST:event_P2ActionPerformed

    /**
     * Boton que para confirmar el pin introducido y comprobar si es correcto, tambien para confirmar la cantidad de dinero que se desea introducir
     * @param evt variable que reacciona ante un evento del boton Aceptar que confirma los valores introducidos por el teclado del cajero
     */
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.retirarDinero(controladorCaj.getNumero());
        }
               
    }//GEN-LAST:event_AceptarActionPerformed

    /**
     * TextField que muestra cambiando se color si la tarjeta esta introducida en el cajero o no
     * @param evt variable que reacciona ante un evento del boton Tarjeta 
     */
    private void TarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaActionPerformed
   
    }//GEN-LAST:event_TarjetaActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 1 
     * @param evt variable que reacciona ante un evento de la tecla 1
     */
    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 1);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B1ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 2
     * @param evt variable que reacciona ante un evento de la tecla 2
     */
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 2);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B2ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 3
     * @param evt variable que reacciona ante un evento de la tecla 3
     */
    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 3);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B3ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 4
     * @param evt variable que reacciona ante un evento de la tecla 4
     */
    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 4);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B4ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 5 
     * @param evt variable que reacciona ante un evento de la tecla 5
     */
    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 5);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B5ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 6 
     * @param evt variable que reacciona ante un evento de la tecla 6
     */
    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 6);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B6ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 7
     * @param evt variable que reacciona ante un evento de la tecla 7
     */
    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 7);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B7ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 8
     * @param evt variable que reacciona ante un evento de la tecla 8
     */
    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 8);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B8ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 9 
     * @param evt variable que reacciona ante un evento de la tecla 9
     */
    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 9);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B9ActionPerformed

    /**
     * Boton que introduce en la variable "numero" el valor 0
     * @param evt variable que reacciona ante un evento de la tecla 0
     */
    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()*10 + 0);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_B0ActionPerformed

    /**
     * Boton que muestra por pantalla el saldo actual de la tarjeta introducida
     * @param evt variable que reacciona ante un evento del botón Consultar Saldo
     */
    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed
        if(modelo.getEstadoPin()!= false){
            controladorCaj.cambiarTipoOpcion(4);
            imprimeTransacciones(null);
            ExtractorDinero.setText("Extractor Dinero");
            CanatidadDinero.setText("Cantidad Dinero"); 
            controladorCaj.mostrarSaldoDisponible();
        }
    }//GEN-LAST:event_P5ActionPerformed

    /**
     * Boton que borra el ultimo numero introducido en la variable "numero" 
     * @param evt variable que reacciona ante un evento del boton Borrar que borra el último valor introducido
     */
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            controladorCaj.cambiarNumero(controladorCaj.getNumero()/10);
            imprimeDineroARetirar(controladorCaj.getNumero());
        }
    }//GEN-LAST:event_BorrarActionPerformed

    /**
     * JtextFild que cambia de color dependiendo de si la tarjeta esta insertada o no
     * @param evt variable que reacciona ante un evento del area de texto Ilumincacion tarjeta
     */
    
    private void IluminacionTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IluminacionTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IluminacionTarjetaActionPerformed

    /**
     * Boton que simula que se haya recogido el dinero solicitado pulsando dicho boton
     * @param evt variable que reacciona ante un evento del boton ExtractorDinero para recoger el dinero solicitado
     */
    private void ExtractorDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtractorDineroActionPerformed
        if(controladorCaj.getTipoOpcion() == 2){
            ExtractorDinero.setText("Extractor Dinero");
            CanatidadDinero.setText("Cantidad Dinero");        
            imprimePantalla("¿ Desea realizar alguna operacion ?");
        }
    }//GEN-LAST:event_ExtractorDineroActionPerformed

    private void BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlancoActionPerformed
        MainCajero.getStateMachine().recuperacajero();
    }//GEN-LAST:event_BlancoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton Blanco;
    private javax.swing.JButton Borrar;
    private javax.swing.JLabel CanatidadDinero;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton ExtractorDinero;
    private javax.swing.JTextField IluminacionTarjeta;
    private javax.swing.JLabel ImagenTarjeta;
    private javax.swing.JPanel Monitor;
    private javax.swing.JButton P1;
    private javax.swing.JButton P2;
    private javax.swing.JButton P5;
    private javax.swing.JButton P6;
    private javax.swing.JLabel PanelMonitor;
    private javax.swing.JPanel Pantalla;
    private javax.swing.JButton Tarjeta;
    private javax.swing.JPanel Tarjetero;
    private javax.swing.JPanel Teclado;
    private javax.swing.JList<String> Transacciones;
    private javax.swing.JButton Vacio1;
    private javax.swing.JButton Vacio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Metodo que establece el icono de la imagen Tarjeta
     * @param ruta, indica donde se haya la ruta para reconocer la imagen e implementarla
     */
    public void setImagenTarjeta(String ruta) {
        this.ImagenTarjeta.setIcon(new ImageIcon(ruta));
    }
    
    /**
     * Meteodo que establece el icono de la imagen InsertarTarjeta
     * @param ruta, indida donde se haya la ruta para reconocer la imagen e implementarla
     */
    public void setImagenInsertarTarjeta(String ruta) {
        this.Tarjeta.setIcon(new ImageIcon(ruta));
    }
        
    /**
     * Metodo que muestra el texto del panel monitor
     * @param frase, frase que se quiere mostrar por el panel principal del cajero
     */
    public void imprimePantalla(String frase){
        PanelMonitor.setText(frase);
    }
    
    /**
     * Metodo que establece el texto del ExtratorDinero
     * @param dinero, cantidad de dinero que deseamos retirar
     */
    public void imprimeRetiradaDinero(int dinero){
        ExtractorDinero.setText(dinero + " euros");
    }
    
    /**
     * Metodo que establece el texto de CantidadDinero
     * @param dinero, cantidad de dinero que hemos retirado
     */
    public void imprimeDineroARetirar(int dinero){
        CanatidadDinero.setText("Dinero a retirar " + dinero + " euros");
    }
    
    /**
     * Metodo que muestra por Transacciones todas las transacciones registradas hasta ese momento
     * @param trans, vector con todas las transacciones realizadas
     */
    public void imprimeTransacciones(String []trans){
        if(controladorCaj.getTipoOpcion() == 3){
            Transacciones.setListData(trans);
        }else{
            String[] transaccion = { "\t", "\t", "\t", "\t", "Transacciones" };
            Transacciones.setListData(transaccion);
        }   
    }
     
    /**
     * Metodo que establece el texto de diveros botones
     */
    public void imprimeOpciones(){
        IluminacionTarjeta.setBackground(Color.green);
        IluminacionTarjeta.setText("TARJETA INSERTADA");
        P1.setText("Retirar Dinero");
        P2.setText("Consultar transacciones");
        P5.setText("Consultar Saldo");
        P6.setText("Salir");
        ExtractorDinero.setText("Extractor Dinero");
        CanatidadDinero.setText("Cantidad Dinero");
        imprimePantalla("¿ Desea realizar alguna operacion ?");
        
    }
    
    /**
     * Metodo que inicialeza los textos de las celdas del cajero
     */
    public void imprimirInicializarCajero(){
        IluminacionTarjeta.setText("");
        IluminacionTarjeta.setBackground(Color.white);
        IluminacionTarjeta.setText("Introduzca tarjeta");
        ExtractorDinero.setText("Extractor Dinero");
        CanatidadDinero.setText("Cantidad Dinero");
    }
            
}