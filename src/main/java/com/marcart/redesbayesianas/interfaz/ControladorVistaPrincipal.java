/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.interfaz;

import javax.swing.JFrame;

/**
 *
 * @author mario
 */
public class ControladorVistaPrincipal {
    private static ControladorVistaPrincipal controlador;
    private JFrame vista;

    public static ControladorVistaPrincipal getInstancia() {
        if (controlador == null) {
            controlador = new ControladorVistaPrincipal();
        }
        return controlador;
    }
    /** Trasmite el evento de click sobre la observación
     * 
     * @param selected True si tiene obesidad False si no la tiene
     */
    void clickObesidad(boolean seleccionado) {
        
    }
}
