/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.krud3.mini_proyecto_4.gui;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author JSMC
 */
public class FrameDialogo extends javax.swing.JFrame {

    /**
     * Creates new form FrameDialogo
     */
    private int xMouse, yMouse;
    private final String mensaje;
    private final Icon icon;
    
    /**
     * Constructor del fram dialogo que tiene en cuenta el parametro de mensaje 
     * y su valor de verdad para mostrar un dialogo
     * @param mensaje Muestra el mensaje en pantalla
     * @param value Ayuda a cambiar el icono desplegado
     */
    public FrameDialogo(String mensaje, boolean value) {
        this.mensaje = mensaje;
        if(value){
            icon = new javax.swing.ImageIcon(getClass().getResource("/images/aceptedIcon.png"));
        }
        else {
            icon = new javax.swing.ImageIcon(getClass().getResource("/images/errorIcon.png"));
        }
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_icon = new javax.swing.JLabel();
        jLabel_mensaje = new javax.swing.JLabel();
        jButton_aceptar = new javax.swing.JButton();
        jPanel_header = new javax.swing.JPanel();
        jPanel_btn_salir = new javax.swing.JPanel();
        jLabel_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(16, 36, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_icon.setIcon(icon);
        jPanel1.add(jLabel_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 150, 150));

        jLabel_mensaje.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_mensaje.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel_mensaje.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_mensaje.setText(mensaje);
        jLabel_mensaje.setToolTipText("");
        jPanel1.add(jLabel_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 86, 300, 100));

        jButton_aceptar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jButton_aceptar.setText("Aceptar");
        jButton_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_aceptarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, 40));

        jPanel_header.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_header.setPreferredSize(new java.awt.Dimension(823, 50));
        jPanel_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_headerMouseDragged(evt);
            }
        });
        jPanel_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_headerMousePressed(evt);
            }
        });

        jPanel_btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel_salir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_salir.setText("X");
        jLabel_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_btn_salirLayout = new javax.swing.GroupLayout(jPanel_btn_salir);
        jPanel_btn_salir.setLayout(jPanel_btn_salirLayout);
        jPanel_btn_salirLayout.setHorizontalGroup(
            jPanel_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel_btn_salirLayout.setVerticalGroup(
            jPanel_btn_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_headerLayout.createSequentialGroup()
                .addGap(0, 570, Short.MAX_VALUE)
                .addComponent(jPanel_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_headerLayout.setVerticalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addComponent(jPanel_btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_salirMouseClicked

    private void jLabel_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseEntered
        jPanel_btn_salir.setBackground(Color.red);

    }//GEN-LAST:event_jLabel_salirMouseEntered

    private void jLabel_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_salirMouseExited
        jPanel_btn_salir.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel_salirMouseExited

    private void jPanel_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel_headerMouseDragged

    private void jPanel_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_headerMousePressed

    private void jButton_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_aceptarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton_aceptarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_aceptar;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JLabel jLabel_mensaje;
    private javax.swing.JLabel jLabel_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_btn_salir;
    private javax.swing.JPanel jPanel_header;
    // End of variables declaration//GEN-END:variables
}