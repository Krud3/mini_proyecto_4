/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.krud3.mini_proyecto_4;


import com.krud3.mini_proyecto_4.gui.Login;
import com.krud3.mini_proyecto_4.gui.MainFrame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author JSMC
 */
public class Mini_proyecto_4 {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Login();
                frame.setVisible(true);
                
                
            }
        });
    }
    
    
}
