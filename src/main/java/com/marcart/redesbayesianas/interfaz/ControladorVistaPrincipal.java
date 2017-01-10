/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.interfaz;

import com.marcart.redesbayesianas.computo.ControladorComputo;
import com.marcart.redesbayesianas.computo.LectorXDSL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.eclipse.recommenders.jayes.BayesNet;
import org.eclipse.recommenders.jayes.BayesNode;
import org.eclipse.recommenders.jayes.inference.IBayesInferer;
import org.eclipse.recommenders.jayes.inference.IBayesInferrer;
import org.eclipse.recommenders.jayes.inference.jtree.JunctionTreeAlgorithm;

/**
 *
 * @author mario
 */
public class ControladorVistaPrincipal {
    private static ControladorVistaPrincipal controlador;
    private BayesNet red;
    private IBayesInferer inferencia;
    private Map<BayesNode, String> evidencia;
    private VistaPrincipal vista;
    
    public ControladorVistaPrincipal(VistaPrincipal vista){
        this.vista = vista;
        
        String ub = "./src/main/java/com/marcart/redesbayesianas/computo/red.xdsl";
        LectorXDSL lector = new LectorXDSL();        
        this.red = lector.leeRed(ub);
        
        this.inferencia = new JunctionTreeAlgorithm();
        this.inferencia.setNetwork(this.red);
        
        this.evidencia = new HashMap<BayesNode, String>();
        actualizaVista();
    }
    
    public static ControladorVistaPrincipal getInstancia(VistaPrincipal vista) {
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
        //Se obtiene el nodo
        BayesNode obesidad = red.getNode("Obesidad");
        this.evidencia.remove(obesidad);
        switch(obs){
            case 0:
                System.out.println("Obesidad NO");
                this.evidencia.put(obesidad,"no");
                break;
            case 1:
                this.evidencia.put(obesidad,"si");
                System.out.println("Obesidad SI");
                break;
            case 2:
                //this.evidencia.remove(obesidad);
                System.out.println("Obesidad NSNC");
                break;
            default:
                System.out.println("Algo fue mal: ¡No deberia estar aqui!");
                break;                     
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionEmbarazo(int obs){
        //Se obtiene el nodo
        BayesNode embarazo = red.getNode("Embarazo");
        this.evidencia.remove(embarazo);
        switch(obs){
            case 0:
                System.out.println("Embarazo NO");
                this.evidencia.put(embarazo,"no");
                break;
            case 1:
                System.out.println("Embarazo SI");
                this.evidencia.put(embarazo,"si");
                break;
            case 2:
                System.out.println("Embarazo NSNC");
                //this.evidencia.remove(embarazo);
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionAntecedentesCancer(int obs){
        //Se obtiene el nodo
        BayesNode acancer = red.getNode("AntecedentesCancer");
        this.evidencia.remove(acancer);
        switch(obs){
            case 0:
                System.out.println("A.Cancer NO");
                this.evidencia.put(acancer,"no");
                break;
            case 1:
                System.out.println("A.Cancer SI");
                this.evidencia.put(acancer,"si");
                break;
            case 2:
                System.out.println("A.Cancer NSNC");
                //this.evidencia.remove(acancer);
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionContaminantesQuimicos(int obs){
        BayesNode cquimicos = red.getNode("ContaminantesQu_micos");
        this.evidencia.remove(cquimicos);
        switch(obs){
            case 0:
                System.out.println("C.Quimicos NO");
                this.evidencia.put(cquimicos,"no");
                break;
            case 1:
                System.out.println("C.Quimicos SI");
                this.evidencia.put(cquimicos,"si");
                break;
            case 2:
                System.out.println("C.Quimicos NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionEdadAvanzada(int obs){
        BayesNode edada = red.getNode("AvanzadaEdad");
        this.evidencia.remove(edada);
        switch(obs){
            case 0:
                System.out.println("E.Avanzada NO");
                this.evidencia.put(edada,"no");
                break;
            case 1:
                System.out.println("E.Avanzada SI");
                this.evidencia.put(edada,"si");
                break;
            case 2:
                System.out.println("E.Avanzada NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionGripe(int obs){
        BayesNode gripe = red.getNode("Gripe");
        this.evidencia.remove(gripe);
        switch(obs){
            case 0:
                System.out.println("Gripe NO");
                this.evidencia.put(gripe,"no");
                break;
            case 1:
                System.out.println("Gripe SI");
                this.evidencia.put(gripe,"si");
                break;
            case 2:
                System.out.println("Gripe NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
        
    public void observacionContactoTuberculosis(int obs){
        BayesNode contactotb = red.getNode("ContactoTuberculosis");
        this.evidencia.remove(contactotb);
        switch(obs){
            case 0:
                System.out.println("C.Tuberculosis NO");
                this.evidencia.put(contactotb,"no");
                break;
            case 1:
                System.out.println("C.Tuberculosis SI");
                this.evidencia.put(contactotb,"si");
                break;
            case 2:
                System.out.println("C.Tuberculosis NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionFumador(int obs){
        BayesNode fumador = red.getNode("Fumador");
        this.evidencia.remove(fumador);
        switch(obs){
            case 0:
                System.out.println("Fumador NO");
                this.evidencia.put(fumador,"no");
                break;
            case 1:
                System.out.println("Fumador SI");
                this.evidencia.put(fumador,"si");
                break;
            case 2:
                System.out.println("Fumador NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionAntecedentesAsma(int obs){
        BayesNode aasma = red.getNode("AntecedentesAsma");
        this.evidencia.remove(aasma);
        switch(obs){
            case 0:
                System.out.println("A.Asma NO");
                this.evidencia.put(aasma,"no");
                break;
            case 1:
                System.out.println("A.Asma SI");
                this.evidencia.put(aasma,"si");
                break;
            case 2:
                System.out.println("A.Asma NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionExposicionAlergenos(int obs){
        BayesNode ealergenos = red.getNode("ExposicionAlergenos");
        this.evidencia.remove(ealergenos);
        switch(obs){
            case 0:
                System.out.println("E.Alergenos NO");
                this.evidencia.put(ealergenos,"no");
                break;
            case 1:
                System.out.println("E.Alergenos SI");
                this.evidencia.put(ealergenos,"si");
                break;
            case 2:
                System.out.println("E.Alergenos NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionAntecedentesEpoc(int obs){
        BayesNode aepoc = red.getNode("AntecedentesEPOC");
        this.evidencia.remove(aepoc);
        switch(obs){
            case 0:
                System.out.println("A.Epoc NO");
                this.evidencia.put(aepoc,"no");
                break;
            case 1:
                System.out.println("A.Epoc SI");
                this.evidencia.put(aepoc,"si");
                break;
            case 2:
                System.out.println("A.Epoc NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionBroncoespasmo(int obs){
        BayesNode broncoespasmo = red.getNode("Broncoespasmo");
        this.evidencia.remove(broncoespasmo);
        switch(obs){
            case 0:
                System.out.println("Broncoespasmo NO");
                this.evidencia.put(broncoespasmo,"no");
                break;
            case 1:
                System.out.println("Broncoespasmo SI");
                this.evidencia.put(broncoespasmo,"si");
                break;
            case 2:
                System.out.println("Broncoespasmo NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionCianosis(int obs){
        BayesNode cianosis = red.getNode("Cianosis");
        this.evidencia.remove(cianosis);
        switch(obs){
            case 0:
                System.out.println("Cianosis NO");
                this.evidencia.put(cianosis,"no");
                break;
            case 1:
                System.out.println("Cianosis SI");
                this.evidencia.put(cianosis,"si");
                break;
            case 2:
                System.out.println("Cianosis NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionDisnea(int obs){
        BayesNode disnea = red.getNode("Disnea");
        this.evidencia.remove(disnea);
        switch(obs){
            case 0:
                System.out.println("Disnea NO");
                this.evidencia.put(disnea,"no");
                break;
            case 1:
                System.out.println("Disnea SI");
                this.evidencia.put(disnea,"si");
                break;
            case 2:
                System.out.println("Disnea NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionDolorToracico(int obs){
        BayesNode dolort = red.getNode("DolorToracico");
        this.evidencia.remove(dolort);
        switch(obs){
            case 0:
                System.out.println("D.Toracico NO");
                this.evidencia.put(dolort,"no");
                break;
            case 1:
                System.out.println("D.Toracico SI");
                this.evidencia.put(dolort,"si");
                break;
            case 2:
                System.out.println("D.Toracico NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionFaltaApetito(int obs){
        BayesNode faltaa = red.getNode("FaltaApetito");
        this.evidencia.remove(faltaa);
        switch(obs){
            case 0:
                System.out.println("Falta Apetito NO");
                this.evidencia.put(faltaa,"no");
                break;
            case 1:
                System.out.println("Falta Apetito SI");
                this.evidencia.put(faltaa,"si");
                break;
            case 2:
                System.out.println("Falta Apetito NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionFiebre(int obs){
        BayesNode fiebre = red.getNode("Fiebre");
        this.evidencia.remove(fiebre);
        switch(obs){
            case 0:
                System.out.println("Fiebre NO");
                this.evidencia.put(fiebre,"no");
                break;
            case 1:
                System.out.println("Fiebre SI");
                this.evidencia.put(fiebre,"si");
                break;
            case 2:
                System.out.println("Fiebre NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionInsuficienciaRenal(int obs){
        BayesNode irenal = red.getNode("InsuficienciaRenal");
        this.evidencia.remove(irenal);
        switch(obs){
            case 0:
                System.out.println("I.Renal NO");
                this.evidencia.put(irenal,"no");
                break;
            case 1:
                System.out.println("I.Renal SI");
                this.evidencia.put(irenal,"si");
                break;
            case 2:
                System.out.println("I.Renal NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionOxigenoSangre(int obs){
        BayesNode obajos = red.getNode("OxigenoBajoSangre");
        this.evidencia.remove(obajos);
        switch(obs){
            case 0:
                System.out.println("O.Sangre NO");
                this.evidencia.put(obajos,"no");
                break;
            case 1:
                System.out.println("O.Sangre SI");
                this.evidencia.put(obajos,"si");
                break;
            case 2:
                System.out.println("O.Sangre NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionPerdidaPeso(int obs){
        BayesNode ppeso = red.getNode("PerdidaPeso");
        this.evidencia.remove(ppeso);
        switch(obs){
            case 0:
                System.out.println("P.Peso NO");
                this.evidencia.put(ppeso,"no");
                break;
            case 1:
                System.out.println("P.Peso SI");
                this.evidencia.put(ppeso,"si");
                break;
            case 2:
                System.out.println("P.Peso NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionSudoraciones(int obs){
        BayesNode sudoraciones = red.getNode("Sudoraciones");
        this.evidencia.remove(sudoraciones);
        switch(obs){
            case 0:
                System.out.println("Sudoraciones NO");
                this.evidencia.put(sudoraciones,"no");
                break;
            case 1:
                System.out.println("Sudoraciones SI");
                this.evidencia.put(sudoraciones,"si");
                break;
            case 2:
                System.out.println("Sudoraciones NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTaquicardia(int obs){
        BayesNode taquicardia = red.getNode("Taquicardia");
        this.evidencia.remove(taquicardia);
        switch(obs){
            case 0:
                System.out.println("Taquicardia NO");
                this.evidencia.put(taquicardia,"no");
                break;
            case 1:
                System.out.println("Taquicardia SI");
                this.evidencia.put(taquicardia,"si");
                break;
            case 2:
                System.out.println("Taquicardia NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTosEsputo(int obs){
        BayesNode tose = red.getNode("TosConEsputo");
        this.evidencia.remove(tose);
        switch(obs){
            case 0:
                System.out.println("Tos E. NO");
                this.evidencia.put(tose,"no");
                break;
            case 1:
                System.out.println("Tos E. SI");
                this.evidencia.put(tose,"si");
                break;
            case 2:
                System.out.println("Tos E. NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTosSangre(int obs){
        BayesNode toss = red.getNode("TosConSangre");
        this.evidencia.remove(toss);
        switch(obs){
            case 0:
                System.out.println("Tos S. NO");
                this.evidencia.put(toss,"no");
                break;
            case 1:
                System.out.println("Tos S. SI");
                this.evidencia.put(toss,"si");
                break;
            case 2:
                System.out.println("Tos S. NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTosSeca(int obs){
        BayesNode tossec = red.getNode("TosSeca");
        this.evidencia.remove(tossec);
        switch(obs){
            case 0:
                System.out.println("Tos Sec NO");
                this.evidencia.put(tossec,"no");
                break;
            case 1:
                System.out.println("Tos Sec SI");
                this.evidencia.put(tossec,"si");
                break;
            case 2:
                System.out.println("Tos Sec NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTrombosis(int obs){
        BayesNode trombosis = red.getNode("Trombosis");
        this.evidencia.remove(trombosis);
        switch(obs){
            case 0:
                System.out.println("Trombosis NO");
                this.evidencia.put(trombosis,"no");
                break;
            case 1:
                System.out.println("Trombosis SI");
                this.evidencia.put(trombosis,"si");
                break;
            case 2:
                System.out.println("Trombosis NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionEnfermedadRara(int obs){
        BayesNode er = red.getNode("EnfermedadesRaras");
        this.evidencia.remove(er);
        switch(obs){
            case 0:
                System.out.println("ER NO");
                this.evidencia.put(er,"no");
                break;
            case 1:
                System.out.println("ER SI");
                this.evidencia.put(er,"si");
                break;
            case 2:
                System.out.println("ER NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionDerramePleural(int obs){
        BayesNode derramepleural = red.getNode("DerramePleural");
        this.evidencia.remove(derramepleural);
        switch(obs){
            case 0:
                System.out.println("DP NO");
                this.evidencia.put(derramepleural,"no");
                break;
            case 1:
                System.out.println("DP SI");
                this.evidencia.put(derramepleural,"si");
                break;
            case 2:
                System.out.println("DP NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionCancer(int obs){
        BayesNode cancer = red.getNode("Cancer");
        this.evidencia.remove(cancer);
        switch(obs){
            case 0:
                System.out.println("Cancer NO");
                this.evidencia.put(cancer,"no");
                break;
            case 1:
                System.out.println("Cancer SI");
                this.evidencia.put(cancer,"si");
                break;
            case 2:
                System.out.println("Cancer NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionAsma(int obs){
        BayesNode asma = red.getNode("Asma");
        this.evidencia.remove(asma);
        switch(obs){
            case 0:
                System.out.println("Asma NO");
                this.evidencia.put(asma,"no");
                break;
            case 1:
                System.out.println("Asma SI");
                this.evidencia.put(asma,"si");
                break;
            case 2:
                System.out.println("Asma NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionEpoc(int obs){
        BayesNode epoc = red.getNode("EPOC");
        this.evidencia.remove(epoc);
        switch(obs){
            case 0:
                System.out.println("EPOC NO");
                this.evidencia.put(epoc,"no");
                break;
            case 1:
                System.out.println("EPOC SI");
                this.evidencia.put(epoc,"si");
                break;
            case 2:
                System.out.println("EPOC NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionNeumonia(int obs){
        BayesNode neumonia = red.getNode("Neumonia");
        this.evidencia.remove(neumonia);
        switch(obs){
            case 0:
                System.out.println("Neumonia NO");
                this.evidencia.put(neumonia,"no");
                break;
            case 1:
                System.out.println("Neumonia SI");
                this.evidencia.put(neumonia,"si");
                break;
            case 2:
                System.out.println("Neumonia NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTep(int obs){
        BayesNode tep = red.getNode("Tromboembolia");
        this.evidencia.remove(tep);
        switch(obs){
            case 0:
                System.out.println("TEP NO");
                this.evidencia.put(tep,"no");
                break;
            case 1:
                System.out.println("TEP SI");
                this.evidencia.put(tep,"si");
                break;
            case 2:
                System.out.println("TEP NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionTuberculosis(int obs){
        BayesNode tb = red.getNode("Tuberculosis");
        this.evidencia.remove(tb);
        switch(obs){
            case 0:
                System.out.println("TB NO");
                this.evidencia.put(tb,"no");
                break;
            case 1:
                System.out.println("TB SI");
                this.evidencia.put(tb,"si");
                break;
            case 2:
                System.out.println("TB NSNC");
                break;
            default:
                break;        
                       
        } 
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    public void observacionMujer(int obs){
        BayesNode mujer = red.getNode("Mujer");
        this.evidencia.remove(mujer);
        switch(obs){
            case 0:
                System.out.println("Mujer NO");
                this.evidencia.put(mujer,"no");
                break;
            case 1:
                System.out.println("Mujer SI");
                this.evidencia.put(mujer,"si");
                break;
            case 2:
                System.out.println("Mujer NSNC");
                break;
            default:
                break;        
                       
        }
        inferencia.setEvidence(evidencia);
        actualizaVista();
    }
    
    private void actualizaVista(){
        String [] nodos = {"Asma","Neumonia","Tuberculosis","EnfermedadesRaras","EPOC","Cancer","Tromboembolia","DerramePleural"};
                
        ArrayList <String> n = new ArrayList<String>();
        ArrayList <Double> p = new ArrayList<Double>();
        
        for (int i=0;i<nodos.length;i++){
            double valor = inferencia.getBeliefs(red.getNode(nodos[i]))[0];
            n.add(nodos[i]);
            p.add(valor);          
        }
        
        ArrayList <Object> resultado = new ArrayList();
        for(int i=0;i<nodos.length;i++){
            
            int pos = 0;
            String nodo = n.get(pos);
            double posib = p.get(pos);
            
            for(int j=0;j<p.size();j++){
                if(posib<p.get(j)){
                    pos=j;
                    nodo=n.get(pos);
                    posib=p.get(pos);
                }
            }
            resultado.add(nodo);
            n.remove(pos);
            resultado.add(posib);
            p.remove(pos);     
        } 
        this.vista.publicaProbabilidades(resultado);       
    } 
    
    
    
    
    
}
