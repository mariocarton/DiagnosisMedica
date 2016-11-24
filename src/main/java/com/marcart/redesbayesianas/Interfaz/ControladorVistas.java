/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.Interfaz;

import javax.swing.JFrame;

/**
 *
 * @author mario
 */
public class ControladorVistas {
     private static ControladorVistas controlador;
    private JFrame vista;
    
    public static ControladorVistas getInstancia(){
        if (controlador==null)  controlador = new ControladorVistas();        
        return controlador;
    }
}
