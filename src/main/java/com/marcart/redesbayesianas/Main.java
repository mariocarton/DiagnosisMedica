/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas;

import com.marcart.redesbayesianas.interfaz.ControladorVistas;


/**
 *
 * @author mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorVistas cv = ControladorVistas.getInstancia();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                cv.muestraVistaPrincipal();
            }
        });
    }
    
}
