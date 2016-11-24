/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.recommenders.jayes.BayesNet;
import org.eclipse.recommenders.jayes.io.xdsl.XDSLReader;

/**
 *
 * @author mario
 */
public class LectorXDSL {
    public BayesNet leeRed(String ub){
        try {
            InputStream io = new FileInputStream(ub);
            XDSLReader rdr = new XDSLReader(io);
       
            BayesNet net = rdr.read();
            rdr.close();   
            return net;
        } catch (IOException ex) {
           System.out.println("Error de lectura");
        }
        return new BayesNet();
    }
}
