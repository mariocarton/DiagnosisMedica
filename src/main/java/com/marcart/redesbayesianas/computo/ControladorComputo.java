/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.computo;

import org.eclipse.recommenders.jayes.BayesNet;

/**
 *
 * @author mario
 */
public class ControladorComputo {
    
    private BayesNet red;
    
    public ControladorComputo(){
        String ub = "./src/main/java/com/marcart/redesbayesianas/computo/red.xdsl";
        LectorXDSL lector = new LectorXDSL();
        
        this.red = lector.leeRed(ub);
    }
    
    public BayesNet getRed(){
        return this.red;
    }
}
