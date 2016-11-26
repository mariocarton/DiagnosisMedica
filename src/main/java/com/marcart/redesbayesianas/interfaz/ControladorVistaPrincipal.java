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
    
    public ControladorVistaPrincipal(JFrame vista){
        this.vista = vista;
    }
    
    public static ControladorVistaPrincipal getInstancia(JFrame vista) {
        if (controlador == null) {
            controlador = new ControladorVistaPrincipal(vista);
        }
        return controlador;
    }
    /** Trasmite el evento de click sobre la observación
     * 
     * @param obs 0 no, 1 si, 2 ns/nc
     */
    public void observacionObesidad(int obs) {
        
    }
    
    public void observacionEmbarazo(int obs){
        
    }
    
    public void observacionAntecedentesCancer(int obs){
        
    }
    
    public void observacionContaminantesQuimicos(int obs){
        
    }
    
    public void observacionContactoNeumonia(int obs){
        
    }
    
    public void observacionGripe(int obs){
        
    }
    
    public void observacionViajeAsia(int obs){
        
    }
    
    public void observacionContactoTuberculosis(int obs){
        
    }
    
    public void observacionFumador(int obs){
        
    }
    
    public void observacionAntecedentesAsma(int obs){
        
    }
    
    public void observacionExposicionAlergenos(int obs){
        
    }
    
    public void observacionAntecedentesEpoc(int obs){
        
    }
    
    public void observacionBroncoespasmo(int obs){
        
    }
    
    public void observacionCianosis(int obs){
        
    }
    
    public void observacionDisnea(int obs){
        
    }
    
    public void observacionDolorToracico(int obs){
        
    }
    
    public void observacionFaltaApetito(int obs){
        
    }
    
    public void observacionFiebre(int obs){
        
    }
    
    public void observacionInsuficienciaRenal(int obs){
        
    }
    
    public void observacionOxigenoSangre(int obs){
        
    }
    
    public void observacionPerdidaPeso(int obs){
        
    }
    
    public void observacionSudoraciones(int obs){
        
    }
    
    public void observacionTaquicardia(int obs){
        
    }
    
    public void observacionTosEsputo(int obs){
        
    }
    
    public void observacionTosSangre(int obs){
        
    }
    
    public void observacionTosSeca(int obs){
        
    }
    
    public void observacionTrombosis(int obs){
        
    }
    
    
    
    
}
