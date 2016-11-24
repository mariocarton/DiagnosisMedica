/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.recommenders.jayes.BayesNet;
import org.eclipse.recommenders.jayes.BayesNode;
import org.eclipse.recommenders.jayes.inference.IBayesInferer;
import org.eclipse.recommenders.jayes.inference.jtree.JunctionTreeAlgorithm;


/**
 *
 * @author mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Comentarop
        String ub = "./src/main/java/com/marcart/redesbayesianas/red.xdsl";
        LectorXDSL lector = new LectorXDSL();
        
        BayesNet net = lector.leeRed(ub);
        JunctionTreeAlgorithm jta = new JunctionTreeAlgorithm(); 
        jta.setNetwork(net);
        
        for (int i=0; i<net.getNodes().size();i++){
        System.out.println(net.getNode(i).getName());
        }
        /*
        BayesNet net = new BayesNet();
        BayesNode visita_asia = net.createNode("VA");
        visita_asia.addOutcomes("si", "no");
        visita_asia.setProbabilities(0.01, 0.99);
        
        BayesNode tuberculosis = net.createNode("T");
        tuberculosis.addOutcomes("si", "no");
        tuberculosis.setParents(Arrays.asList(visita_asia));
        tuberculosis.setProbabilities(
               
                0.05, 0.95,
                0.01, 0.99
                
        );
        
        BayesNode fumador = net.createNode("F");
        fumador.addOutcomes("si", "no");
        fumador.setProbabilities(0.5, 0.5);

        BayesNode cancer_pulmon = net.createNode("C");
        cancer_pulmon.addOutcomes("si", "no");
        cancer_pulmon.setParents(Arrays.asList(fumador));
        cancer_pulmon.setProbabilities(
               
                0.1, 0.9,
                0.01, 0.99
                
        );
        
        BayesNode tuberculosis_cancer = net.createNode("TC");
        tuberculosis_cancer.addOutcomes("si", "no");
        tuberculosis_cancer.setParents(Arrays.asList(tuberculosis,cancer_pulmon));
        tuberculosis_cancer.setProbabilities(
               
                0.05, 0.95,
                0.01, 0.99,
                
                0.1, 0.9,
                0.01, 0.99
                
        );
        
        BayesNode rayosx = net.createNode("R");
        rayosx.addOutcomes("anormal", "normal");
        rayosx.setParents(Arrays.asList(tuberculosis_cancer));
        rayosx.setProbabilities(
               
                0.98, 0.02,
                0.05, 0.95
                
        );
        
        
        IBayesInferer inferer = new JunctionTreeAlgorithm();
        inferer.setNetwork(net);
        
        double[] beliefsC = inferer.getBeliefs(tuberculosis_cancer);        
        System.out.println(Arrays.toString(beliefsC));
        
        Map<BayesNode, String> evidence = new HashMap<BayesNode, String>();
        //evidence.put(r, "r1");
        //evidence.put(r, "three");
        
        //inferer.setEvidence(evidence);

        //double[] beliefsC = inferer.getBeliefs(c);
        
        //System.out.println(Arrays.toString(beliefsC));
        */
    }

}
