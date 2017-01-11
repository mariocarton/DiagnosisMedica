/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.interfaz;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author mario
 */
public class VistaPrincipal extends javax.swing.JFrame {
    ControladorVistaPrincipal controlador;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.controlador = ControladorVistaPrincipal.getInstancia(this);
        
        ButtonGroup grupoobesidad = new ButtonGroup();
        grupoobesidad.add(radio_obesidadsi);
        grupoobesidad.add(radio_obesidadno);
        grupoobesidad.add(radio_obesidadnsnc);
        radio_obesidadnsnc.setSelected(true);
        
        ButtonGroup grupoembarazo = new ButtonGroup();
        grupoembarazo.add(radio_embarazosi);
        grupoembarazo.add(radio_embarazono);
        grupoembarazo.add(radio_embarazonsnc);
        radio_embarazonsnc.setSelected(true);
        
        ButtonGroup grupoantecedentescancer = new ButtonGroup();
        grupoantecedentescancer.add(radio_antecedentescancersi);
        grupoantecedentescancer.add(radio_antecedentescancerno);
        grupoantecedentescancer.add(radio_antecedentescancernsnc);
        radio_antecedentescancernsnc.setSelected(true);
        
        ButtonGroup grupocontaminantesquimicos = new ButtonGroup();
        grupocontaminantesquimicos.add(radio_contaminantesquimicossi);
        grupocontaminantesquimicos.add(radio_contaminantesquimicosno);
        grupocontaminantesquimicos.add(radio_contaminantesquimicosnsnc);
        radio_contaminantesquimicosnsnc.setSelected(true);
        
        ButtonGroup grupoedadavanzada = new ButtonGroup();
        grupoedadavanzada.add(radio_edadavanzadasi);
        grupoedadavanzada.add(radio_edadavanzadano);
        grupoedadavanzada.add(radio_edadavanzadansnc);
        radio_edadavanzadansnc.setSelected(true);
        
        ButtonGroup grupogripe = new ButtonGroup();
        grupogripe.add(radio_gripesi);
        grupogripe.add(radio_gripeno);
        grupogripe.add(radio_gripensnc);
        radio_gripensnc.setSelected(true);
        
        ButtonGroup grupocontactotuberculosis = new ButtonGroup();
        grupocontactotuberculosis.add(radio_contactotuberculosissi);
        grupocontactotuberculosis.add(radio_contactotuberculosisno);
        grupocontactotuberculosis.add(radio_contactotuberculosisnsnc);
        radio_contactotuberculosisnsnc.setSelected(true);
        
        ButtonGroup grupofumador = new ButtonGroup();
        grupofumador.add(radio_fumadorsi);
        grupofumador.add(radio_fumadorno);
        grupofumador.add(radio_fumadornsnc);
        radio_fumadornsnc.setSelected(true);
        
        ButtonGroup grupomujer = new ButtonGroup();
        grupomujer.add(radio_mujersi);
        grupomujer.add(radio_mujerno);
        grupomujer.add(radio_mujernsnc);
        radio_mujernsnc.setSelected(true);
        
        ButtonGroup grupoantecedentesasma = new ButtonGroup();
        grupoantecedentesasma.add(radio_antecedentesasmasi);
        grupoantecedentesasma.add(radio_antecedentesasmano);
        grupoantecedentesasma.add(radio_antecedentesasmansnc);
        radio_antecedentesasmansnc.setSelected(true);
        
        ButtonGroup grupoexposicionalergenos = new ButtonGroup();
        grupoexposicionalergenos.add(radio_exposicionalergenossi);
        grupoexposicionalergenos.add(radio_exposicionalergenosno);
        grupoexposicionalergenos.add(radio_exposicionalergenosnsnc);
        radio_exposicionalergenosnsnc.setSelected(true);
        
        ButtonGroup grupoantecedentesepoc = new ButtonGroup();
        grupoantecedentesepoc.add(radio_antecedentesepocsi);
        grupoantecedentesepoc.add(radio_antecedentesepocno);
        grupoantecedentesepoc.add(radio_antecedentesepocnsnc);
        radio_antecedentesepocnsnc.setSelected(true);
        
        ButtonGroup grupobroncoespasmo = new ButtonGroup();
        grupobroncoespasmo.add(radio_broncoespasmosi);
        grupobroncoespasmo.add(radio_broncoespasmono);
        grupobroncoespasmo.add(radio_broncoespasmonsnc);
        radio_broncoespasmonsnc.setSelected(true);
        
        ButtonGroup grupocianosis = new ButtonGroup();
        grupocianosis.add(radio_cianosissi);
        grupocianosis.add(radio_cianosisno);
        grupocianosis.add(radio_cianosisnsnc);
        radio_cianosisnsnc.setSelected(true);
        
        ButtonGroup grupodisnea = new ButtonGroup();
        grupodisnea.add(radio_disneasi);
        grupodisnea.add(radio_disneano);
        grupodisnea.add(radio_disneansnc);
        radio_disneansnc.setSelected(true);
        
        ButtonGroup grupodolortoracico = new ButtonGroup();
        grupodolortoracico.add(radio_dolortoracicosi);
        grupodolortoracico.add(radio_dolortoracicono);
        grupodolortoracico.add(radio_dolortoraciconsnc);
        radio_dolortoraciconsnc.setSelected(true);
        
        ButtonGroup grupofaltaapetito = new ButtonGroup();
        grupofaltaapetito.add(radio_faltaapetitosi);
        grupofaltaapetito.add(radio_faltaapetitono);
        grupofaltaapetito.add(radio_faltaapetitonsnc);
        radio_faltaapetitonsnc.setSelected(true);
        
        ButtonGroup grupofiebre = new ButtonGroup();
        grupofiebre.add(radio_fiebresi);
        grupofiebre.add(radio_fiebreno);
        grupofiebre.add(radio_fiebrensnc);
        radio_fiebrensnc.setSelected(true);
        
        ButtonGroup grupoinsuficienciarenal = new ButtonGroup();
        grupoinsuficienciarenal.add(radio_insuficienciarenalsi);
        grupoinsuficienciarenal.add(radio_insuficienciarenalno);
        grupoinsuficienciarenal.add(radio_insuficienciarenalnsnc);
        radio_insuficienciarenalnsnc.setSelected(true);
        
        ButtonGroup grupooxigenosangre = new ButtonGroup();
        grupooxigenosangre.add(radio_oxigenosangresi);
        grupooxigenosangre.add(radio_oxigenosangreno);
        grupooxigenosangre.add(radio_oxigenosangrensnc);
        radio_oxigenosangrensnc.setSelected(true);
        
        ButtonGroup grupoperdidapeso = new ButtonGroup();
        grupoperdidapeso.add(radio_perdidapesosi);
        grupoperdidapeso.add(radio_perdidapesono);
        grupoperdidapeso.add(radio_perdidapesonsnc);
        radio_perdidapesonsnc.setSelected(true);
        
        ButtonGroup gruposudoraciones = new ButtonGroup();
        gruposudoraciones.add(radio_sudoracionessi);
        gruposudoraciones.add(radio_sudoracionesno);
        gruposudoraciones.add(radio_sudoracionesnsnc);
        radio_sudoracionesnsnc.setSelected(true);
        
        ButtonGroup grupotaquicardia = new ButtonGroup();
        grupotaquicardia.add(radio_taquicardiasi);
        grupotaquicardia.add(radio_taquicardiano);
        grupotaquicardia.add(radio_taquicardiansnc);
        radio_taquicardiansnc.setSelected(true);
        
        ButtonGroup grupotosesputo = new ButtonGroup();
        grupotosesputo.add(radio_tosesputosi);
        grupotosesputo.add(radio_tosesputono);
        grupotosesputo.add(radio_tosesputonsnc);
        radio_tosesputonsnc.setSelected(true);
        
        ButtonGroup grupotossangre = new ButtonGroup();
        grupotossangre.add(radio_tossangresi);
        grupotossangre.add(radio_tossangreno);
        grupotossangre.add(radio_tossangrensnc);
        radio_tossangrensnc.setSelected(true);
        
        ButtonGroup grupotosseca = new ButtonGroup();
        grupotosseca.add(radio_tossecasi);
        grupotosseca.add(radio_tossecano);
        grupotosseca.add(radio_tossecansnc);
        radio_tossecansnc.setSelected(true);
        
        ButtonGroup grupotrombosis = new ButtonGroup();
        grupotrombosis.add(radio_trombosissi);
        grupotrombosis.add(radio_trombosisno);
        grupotrombosis.add(radio_trombosisnsnc);
        radio_trombosisnsnc.setSelected(true);
        
        ButtonGroup grupoasma = new ButtonGroup();
        grupoasma.add(radio_asmasi);
        grupoasma.add(radio_asmano);
        grupoasma.add(radio_asmansnc);
        radio_trombosisnsnc.setSelected(true);
        
        ButtonGroup grupocancer = new ButtonGroup();
        grupocancer.add(radio_cancersi);
        grupocancer.add(radio_cancerno);
        grupocancer.add(radio_cancernsnc);
        radio_cancernsnc.setSelected(true);
        
        ButtonGroup grupoderramepleural = new ButtonGroup();
        grupoderramepleural.add(radio_derramepleuralsi);
        grupoderramepleural.add(radio_derramepleuralno);
        grupoderramepleural.add(radio_derramepleuralnsnc);
        radio_derramepleuralnsnc.setSelected(true);
        
        ButtonGroup grupoer = new ButtonGroup();
        grupoer.add(radio_ersi);
        grupoer.add(radio_erno);
        grupoer.add(radio_ernsnc);
        radio_ernsnc.setSelected(true);
        
        ButtonGroup grupoepoc = new ButtonGroup();
        grupoepoc.add(radio_epocsi);
        grupoepoc.add(radio_epocno);
        grupoepoc.add(radio_epocnsnc);
        radio_epocnsnc.setSelected(true);
        
        ButtonGroup gruponeumonia = new ButtonGroup();
        gruponeumonia.add(radio_neumoniasi);
        gruponeumonia.add(radio_neumoniano);
        gruponeumonia.add(radio_neumoniansnc);
        radio_neumoniansnc.setSelected(true);
        
        ButtonGroup grupotep = new ButtonGroup();
        grupotep.add(radio_tepsi);
        grupotep.add(radio_tepno);
        grupotep.add(radio_tepnsnc);
        radio_tepnsnc.setSelected(true);
        
        ButtonGroup grupotuberculosis = new ButtonGroup();
        grupotuberculosis.add(radio_tuberculosissi);
        grupotuberculosis.add(radio_tuberculosisno);
        grupotuberculosis.add(radio_tuberculosisnsnc);
        radio_tuberculosisnsnc.setSelected(true);
    }
    
    public void publicaProbabilidades(ArrayList resultado){
        int precision = 5;
        label_e1.setText((String)resultado.get(0));
        double valor = round((double) resultado.get(1),precision);
        label_p1.setText(Double.toString(valor));
        label_e2.setText((String)resultado.get(2));
        valor = round((double) resultado.get(3),precision);
        label_p2.setText(Double.toString(valor));        
        label_e3.setText((String)resultado.get(4));
        valor = round((double) resultado.get(5),precision);
        label_p3.setText(Double.toString(valor));
        label_e4.setText((String)resultado.get(6));
        valor = round((double) resultado.get(7),precision);
        label_p4.setText(Double.toString(valor));
        label_e5.setText((String)resultado.get(8));
        valor = round((double) resultado.get(9),precision);
        label_p5.setText(Double.toString(valor));
        label_e6.setText((String)resultado.get(10));
        valor = round((double) resultado.get(11),precision);
        label_p6.setText(Double.toString(valor));
        label_e7.setText((String)resultado.get(12));
        valor = round((double) resultado.get(13),precision);
        label_p7.setText(Double.toString(valor));
        label_e8.setText((String)resultado.get(14));
        valor = round((double) resultado.get(15),precision);
        label_p8.setText(Double.toString(valor));
    }
    
    private void reseteaObservaciones(){       
        radio_obesidadnsnc.setSelected(true);
        radio_embarazonsnc.setSelected(true);        
        radio_antecedentescancernsnc.setSelected(true);   
        radio_contaminantesquimicosnsnc.setSelected(true);
        radio_edadavanzadansnc.setSelected(true);    
        radio_gripensnc.setSelected(true);        
        radio_contactotuberculosisnsnc.setSelected(true);        
        radio_fumadornsnc.setSelected(true);       
        radio_mujernsnc.setSelected(true); 
        radio_antecedentesasmansnc.setSelected(true);  
        radio_exposicionalergenosnsnc.setSelected(true);       
        radio_antecedentesepocnsnc.setSelected(true);       
        radio_broncoespasmonsnc.setSelected(true);       
        radio_cianosisnsnc.setSelected(true);       
        radio_disneansnc.setSelected(true);       
        radio_dolortoraciconsnc.setSelected(true);      
        radio_faltaapetitonsnc.setSelected(true);       
        radio_fiebrensnc.setSelected(true);       
        radio_insuficienciarenalnsnc.setSelected(true);       
        radio_oxigenosangrensnc.setSelected(true);       
        radio_perdidapesonsnc.setSelected(true);       
        radio_sudoracionesnsnc.setSelected(true);       
        radio_taquicardiansnc.setSelected(true);       
        radio_tosesputonsnc.setSelected(true);    
        radio_tossangrensnc.setSelected(true);      
        radio_tossecansnc.setSelected(true);             
        radio_trombosisnsnc.setSelected(true);             
        radio_trombosisnsnc.setSelected(true);                
        radio_cancernsnc.setSelected(true);
        radio_derramepleuralnsnc.setSelected(true);           
        radio_ernsnc.setSelected(true);              
        radio_epocnsnc.setSelected(true);         
        radio_neumoniansnc.setSelected(true);                
        radio_tepnsnc.setSelected(true);                
        radio_tuberculosisnsnc.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton_cargared = new javax.swing.JButton();
        label_redcargada = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        radio_obesidadsi = new javax.swing.JRadioButton();
        radio_obesidadno = new javax.swing.JRadioButton();
        label_obesidad = new javax.swing.JLabel();
        radio_obesidadnsnc = new javax.swing.JRadioButton();
        label_embarazo = new javax.swing.JLabel();
        radio_embarazosi = new javax.swing.JRadioButton();
        radio_embarazono = new javax.swing.JRadioButton();
        radio_embarazonsnc = new javax.swing.JRadioButton();
        label_antecedentescancer = new javax.swing.JLabel();
        radio_antecedentescancersi = new javax.swing.JRadioButton();
        radio_antecedentescancerno = new javax.swing.JRadioButton();
        radio_antecedentescancernsnc = new javax.swing.JRadioButton();
        label_contaminantesquimicos = new javax.swing.JLabel();
        radio_contaminantesquimicossi = new javax.swing.JRadioButton();
        radio_contaminantesquimicosno = new javax.swing.JRadioButton();
        radio_contaminantesquimicosnsnc = new javax.swing.JRadioButton();
        label_edadavanzada = new javax.swing.JLabel();
        radio_edadavanzadasi = new javax.swing.JRadioButton();
        radio_edadavanzadano = new javax.swing.JRadioButton();
        radio_edadavanzadansnc = new javax.swing.JRadioButton();
        label_gripe = new javax.swing.JLabel();
        label_contactotuberculosis = new javax.swing.JLabel();
        label_fumador = new javax.swing.JLabel();
        label_antecedentesasma = new javax.swing.JLabel();
        label_exposicionalergenos = new javax.swing.JLabel();
        label_antecedentesepoc = new javax.swing.JLabel();
        radio_gripesi = new javax.swing.JRadioButton();
        radio_gripeno = new javax.swing.JRadioButton();
        radio_gripensnc = new javax.swing.JRadioButton();
        radio_contactotuberculosissi = new javax.swing.JRadioButton();
        radio_contactotuberculosisno = new javax.swing.JRadioButton();
        radio_contactotuberculosisnsnc = new javax.swing.JRadioButton();
        radio_fumadorsi = new javax.swing.JRadioButton();
        radio_fumadorno = new javax.swing.JRadioButton();
        radio_fumadornsnc = new javax.swing.JRadioButton();
        radio_exposicionalergenossi = new javax.swing.JRadioButton();
        radio_exposicionalergenosno = new javax.swing.JRadioButton();
        radio_exposicionalergenosnsnc = new javax.swing.JRadioButton();
        radio_antecedentesepocsi = new javax.swing.JRadioButton();
        radio_antecedentesepocno = new javax.swing.JRadioButton();
        radio_antecedentesepocnsnc = new javax.swing.JRadioButton();
        radio_antecedentesasmasi = new javax.swing.JRadioButton();
        radio_antecedentesasmano = new javax.swing.JRadioButton();
        radio_antecedentesasmansnc = new javax.swing.JRadioButton();
        label_oxigenosangre = new javax.swing.JLabel();
        label_trombosis = new javax.swing.JLabel();
        label_cianosis = new javax.swing.JLabel();
        label_tosesputo = new javax.swing.JLabel();
        label_taquicardia = new javax.swing.JLabel();
        label_fiebre = new javax.swing.JLabel();
        label_tossangre = new javax.swing.JLabel();
        label_dolortoracico = new javax.swing.JLabel();
        label_tosseca = new javax.swing.JLabel();
        label_disnea = new javax.swing.JLabel();
        label_perdidapeso = new javax.swing.JLabel();
        label_sudoraciones = new javax.swing.JLabel();
        label_broncoespasmo = new javax.swing.JLabel();
        label_faltaapetito = new javax.swing.JLabel();
        label_insuficienciarenal = new javax.swing.JLabel();
        radio_oxigenosangresi = new javax.swing.JRadioButton();
        radio_oxigenosangreno = new javax.swing.JRadioButton();
        radio_oxigenosangrensnc = new javax.swing.JRadioButton();
        radio_insuficienciarenalsi = new javax.swing.JRadioButton();
        radio_insuficienciarenalno = new javax.swing.JRadioButton();
        radio_insuficienciarenalnsnc = new javax.swing.JRadioButton();
        radio_fiebresi = new javax.swing.JRadioButton();
        radio_fiebreno = new javax.swing.JRadioButton();
        radio_fiebrensnc = new javax.swing.JRadioButton();
        radio_faltaapetitosi = new javax.swing.JRadioButton();
        radio_faltaapetitono = new javax.swing.JRadioButton();
        radio_faltaapetitonsnc = new javax.swing.JRadioButton();
        radio_dolortoracicosi = new javax.swing.JRadioButton();
        radio_dolortoracicono = new javax.swing.JRadioButton();
        radio_dolortoraciconsnc = new javax.swing.JRadioButton();
        radio_disneasi = new javax.swing.JRadioButton();
        radio_disneano = new javax.swing.JRadioButton();
        radio_disneansnc = new javax.swing.JRadioButton();
        radio_cianosissi = new javax.swing.JRadioButton();
        radio_cianosisno = new javax.swing.JRadioButton();
        radio_cianosisnsnc = new javax.swing.JRadioButton();
        radio_broncoespasmosi = new javax.swing.JRadioButton();
        radio_broncoespasmono = new javax.swing.JRadioButton();
        radio_broncoespasmonsnc = new javax.swing.JRadioButton();
        radio_perdidapesosi = new javax.swing.JRadioButton();
        radio_perdidapesono = new javax.swing.JRadioButton();
        radio_perdidapesonsnc = new javax.swing.JRadioButton();
        radio_sudoracionessi = new javax.swing.JRadioButton();
        radio_sudoracionesno = new javax.swing.JRadioButton();
        radio_sudoracionesnsnc = new javax.swing.JRadioButton();
        radio_taquicardiasi = new javax.swing.JRadioButton();
        radio_taquicardiano = new javax.swing.JRadioButton();
        radio_taquicardiansnc = new javax.swing.JRadioButton();
        radio_tosesputosi = new javax.swing.JRadioButton();
        radio_tosesputono = new javax.swing.JRadioButton();
        radio_tosesputonsnc = new javax.swing.JRadioButton();
        radio_tossangresi = new javax.swing.JRadioButton();
        radio_tossangreno = new javax.swing.JRadioButton();
        radio_tossangrensnc = new javax.swing.JRadioButton();
        radio_tossecasi = new javax.swing.JRadioButton();
        radio_tossecano = new javax.swing.JRadioButton();
        radio_tossecansnc = new javax.swing.JRadioButton();
        radio_trombosissi = new javax.swing.JRadioButton();
        radio_trombosisno = new javax.swing.JRadioButton();
        radio_trombosisnsnc = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        radio_ersi = new javax.swing.JRadioButton();
        radio_erno = new javax.swing.JRadioButton();
        radio_ernsnc = new javax.swing.JRadioButton();
        radio_derramepleuralsi = new javax.swing.JRadioButton();
        radio_derramepleuralno = new javax.swing.JRadioButton();
        radio_derramepleuralnsnc = new javax.swing.JRadioButton();
        radio_cancersi = new javax.swing.JRadioButton();
        radio_cancerno = new javax.swing.JRadioButton();
        radio_cancernsnc = new javax.swing.JRadioButton();
        radio_asmasi = new javax.swing.JRadioButton();
        radio_asmano = new javax.swing.JRadioButton();
        radio_asmansnc = new javax.swing.JRadioButton();
        radio_epocsi = new javax.swing.JRadioButton();
        radio_epocno = new javax.swing.JRadioButton();
        radio_epocnsnc = new javax.swing.JRadioButton();
        radio_neumoniasi = new javax.swing.JRadioButton();
        radio_neumoniano = new javax.swing.JRadioButton();
        radio_neumoniansnc = new javax.swing.JRadioButton();
        radio_tepsi = new javax.swing.JRadioButton();
        radio_tepno = new javax.swing.JRadioButton();
        radio_tepnsnc = new javax.swing.JRadioButton();
        radio_tuberculosissi = new javax.swing.JRadioButton();
        radio_tuberculosisno = new javax.swing.JRadioButton();
        radio_tuberculosisnsnc = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        label_mujer = new javax.swing.JLabel();
        radio_mujersi = new javax.swing.JRadioButton();
        radio_mujerno = new javax.swing.JRadioButton();
        radio_mujernsnc = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        label_e1 = new javax.swing.JLabel();
        label_e2 = new javax.swing.JLabel();
        label_e3 = new javax.swing.JLabel();
        label_e4 = new javax.swing.JLabel();
        label_e5 = new javax.swing.JLabel();
        label_e6 = new javax.swing.JLabel();
        label_e7 = new javax.swing.JLabel();
        label_e8 = new javax.swing.JLabel();
        label_p1 = new javax.swing.JLabel();
        label_p2 = new javax.swing.JLabel();
        label_p3 = new javax.swing.JLabel();
        label_p4 = new javax.swing.JLabel();
        label_p5 = new javax.swing.JLabel();
        label_p6 = new javax.swing.JLabel();
        label_p7 = new javax.swing.JLabel();
        label_p8 = new javax.swing.JLabel();
        boton_reddefecto = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnosis de Enfermedades Pulmonares");

        boton_cargared.setText("Cargar otra red");
        boton_cargared.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_cargaredMouseClicked(evt);
            }
        });

        label_redcargada.setText("Red cargada por defeto");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Observaciones del paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Síntomas");

        radio_obesidadsi.setText("Sí");
        radio_obesidadsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_obesidadsiMouseClicked(evt);
            }
        });
        radio_obesidadsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_obesidadsiActionPerformed(evt);
            }
        });

        radio_obesidadno.setText("No");
        radio_obesidadno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_obesidadnoMouseClicked(evt);
            }
        });

        label_obesidad.setText("Obesidad");

        radio_obesidadnsnc.setText("NS/NC");
        radio_obesidadnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_obesidadnsncMouseClicked(evt);
            }
        });

        label_embarazo.setText("Embarazo");

        radio_embarazosi.setText("Sí");
        radio_embarazosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_embarazosiMouseClicked(evt);
            }
        });
        radio_embarazosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_embarazosiActionPerformed(evt);
            }
        });

        radio_embarazono.setText("No");
        radio_embarazono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_embarazonoMouseClicked(evt);
            }
        });

        radio_embarazonsnc.setText("NS/NC");
        radio_embarazonsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_embarazonsncMouseClicked(evt);
            }
        });

        label_antecedentescancer.setText("Antecedentes de cáncer");

        radio_antecedentescancersi.setText("Sí");
        radio_antecedentescancersi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentescancersiMouseClicked(evt);
            }
        });
        radio_antecedentescancersi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_antecedentescancersiActionPerformed(evt);
            }
        });

        radio_antecedentescancerno.setText("No");
        radio_antecedentescancerno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentescancernoMouseClicked(evt);
            }
        });

        radio_antecedentescancernsnc.setText("NS/NC");
        radio_antecedentescancernsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentescancernsncMouseClicked(evt);
            }
        });

        label_contaminantesquimicos.setText("Contacto con contaminantes químicos ");

        radio_contaminantesquimicossi.setText("Sí");
        radio_contaminantesquimicossi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contaminantesquimicossiMouseClicked(evt);
            }
        });
        radio_contaminantesquimicossi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_contaminantesquimicossiActionPerformed(evt);
            }
        });

        radio_contaminantesquimicosno.setText("No");
        radio_contaminantesquimicosno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contaminantesquimicosnoMouseClicked(evt);
            }
        });

        radio_contaminantesquimicosnsnc.setText("NS/NC");
        radio_contaminantesquimicosnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contaminantesquimicosnsncMouseClicked(evt);
            }
        });

        label_edadavanzada.setText("Edad avanzada");

        radio_edadavanzadasi.setText("Sí");
        radio_edadavanzadasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_edadavanzadasiMouseClicked(evt);
            }
        });
        radio_edadavanzadasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_edadavanzadasiActionPerformed(evt);
            }
        });

        radio_edadavanzadano.setText("No");
        radio_edadavanzadano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_edadavanzadanoMouseClicked(evt);
            }
        });

        radio_edadavanzadansnc.setText("NS/NC");
        radio_edadavanzadansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_edadavanzadansncMouseClicked(evt);
            }
        });

        label_gripe.setText("Gripe");

        label_contactotuberculosis.setText("Contacto con tuberculosis");

        label_fumador.setText("Fumador");

        label_antecedentesasma.setText("Antecedentes de asma");

        label_exposicionalergenos.setText("Exposición a alérgenos");

        label_antecedentesepoc.setText("Antecedentes de EPOC");

        radio_gripesi.setText("Sí");
        radio_gripesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_gripesiMouseClicked(evt);
            }
        });
        radio_gripesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_gripesiActionPerformed(evt);
            }
        });

        radio_gripeno.setText("No");
        radio_gripeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_gripenoMouseClicked(evt);
            }
        });

        radio_gripensnc.setText("NS/NC");
        radio_gripensnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_gripensncMouseClicked(evt);
            }
        });

        radio_contactotuberculosissi.setText("Sí");
        radio_contactotuberculosissi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactotuberculosissiMouseClicked(evt);
            }
        });
        radio_contactotuberculosissi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_contactotuberculosissiActionPerformed(evt);
            }
        });

        radio_contactotuberculosisno.setText("No");
        radio_contactotuberculosisno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactotuberculosisnoMouseClicked(evt);
            }
        });

        radio_contactotuberculosisnsnc.setText("NS/NC");
        radio_contactotuberculosisnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactotuberculosisnsncMouseClicked(evt);
            }
        });

        radio_fumadorsi.setText("Sí");
        radio_fumadorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fumadorsiMouseClicked(evt);
            }
        });
        radio_fumadorsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_fumadorsiActionPerformed(evt);
            }
        });

        radio_fumadorno.setText("No");
        radio_fumadorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fumadornoMouseClicked(evt);
            }
        });

        radio_fumadornsnc.setText("NS/NC");
        radio_fumadornsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fumadornsncMouseClicked(evt);
            }
        });

        radio_exposicionalergenossi.setText("Sí");
        radio_exposicionalergenossi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_exposicionalergenossiMouseClicked(evt);
            }
        });
        radio_exposicionalergenossi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_exposicionalergenossiActionPerformed(evt);
            }
        });

        radio_exposicionalergenosno.setText("No");
        radio_exposicionalergenosno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_exposicionalergenosnoMouseClicked(evt);
            }
        });

        radio_exposicionalergenosnsnc.setText("NS/NC");
        radio_exposicionalergenosnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_exposicionalergenosnsncMouseClicked(evt);
            }
        });

        radio_antecedentesepocsi.setText("Sí");
        radio_antecedentesepocsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesepocsiMouseClicked(evt);
            }
        });
        radio_antecedentesepocsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_antecedentesepocsiActionPerformed(evt);
            }
        });

        radio_antecedentesepocno.setText("No");
        radio_antecedentesepocno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesepocnoMouseClicked(evt);
            }
        });

        radio_antecedentesepocnsnc.setText("NS/NC");
        radio_antecedentesepocnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesepocnsncMouseClicked(evt);
            }
        });

        radio_antecedentesasmasi.setText("Sí");
        radio_antecedentesasmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesasmasiMouseClicked(evt);
            }
        });
        radio_antecedentesasmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_antecedentesasmasiActionPerformed(evt);
            }
        });

        radio_antecedentesasmano.setText("No");
        radio_antecedentesasmano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesasmanoMouseClicked(evt);
            }
        });

        radio_antecedentesasmansnc.setText("NS/NC");
        radio_antecedentesasmansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_antecedentesasmansncMouseClicked(evt);
            }
        });

        label_oxigenosangre.setText("Oxígeno bajo en sangre");

        label_trombosis.setText("Trombosis");

        label_cianosis.setText("Cianosis");

        label_tosesputo.setText("Tos con esputo");

        label_taquicardia.setText("Taquicardia");

        label_fiebre.setText("Fiebre");

        label_tossangre.setText("Tos con sangre");

        label_dolortoracico.setText("Dolor torácico");

        label_tosseca.setText("Tos seca");

        label_disnea.setText("Disnea");

        label_perdidapeso.setText("Pérdida de peso");

        label_sudoraciones.setText("Sudoraciones");

        label_broncoespasmo.setText("Broncoespasmo");

        label_faltaapetito.setText("Falta de apetito");

        label_insuficienciarenal.setText("Insuficiencia renal");

        radio_oxigenosangresi.setText("Sí");
        radio_oxigenosangresi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_oxigenosangresiMouseClicked(evt);
            }
        });
        radio_oxigenosangresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_oxigenosangresiActionPerformed(evt);
            }
        });

        radio_oxigenosangreno.setText("No");
        radio_oxigenosangreno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_oxigenosangrenoMouseClicked(evt);
            }
        });

        radio_oxigenosangrensnc.setText("NS/NC");
        radio_oxigenosangrensnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_oxigenosangrensncMouseClicked(evt);
            }
        });

        radio_insuficienciarenalsi.setText("Sí");
        radio_insuficienciarenalsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_insuficienciarenalsiMouseClicked(evt);
            }
        });
        radio_insuficienciarenalsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_insuficienciarenalsiActionPerformed(evt);
            }
        });

        radio_insuficienciarenalno.setText("No");
        radio_insuficienciarenalno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_insuficienciarenalnoMouseClicked(evt);
            }
        });

        radio_insuficienciarenalnsnc.setText("NS/NC");
        radio_insuficienciarenalnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_insuficienciarenalnsncMouseClicked(evt);
            }
        });

        radio_fiebresi.setText("Sí");
        radio_fiebresi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fiebresiMouseClicked(evt);
            }
        });
        radio_fiebresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_fiebresiActionPerformed(evt);
            }
        });

        radio_fiebreno.setText("No");
        radio_fiebreno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fiebrenoMouseClicked(evt);
            }
        });

        radio_fiebrensnc.setText("NS/NC");
        radio_fiebrensnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_fiebrensncMouseClicked(evt);
            }
        });

        radio_faltaapetitosi.setText("Sí");
        radio_faltaapetitosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_faltaapetitosiMouseClicked(evt);
            }
        });
        radio_faltaapetitosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_faltaapetitosiActionPerformed(evt);
            }
        });

        radio_faltaapetitono.setText("No");
        radio_faltaapetitono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_faltaapetitonoMouseClicked(evt);
            }
        });

        radio_faltaapetitonsnc.setText("NS/NC");
        radio_faltaapetitonsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_faltaapetitonsncMouseClicked(evt);
            }
        });

        radio_dolortoracicosi.setText("Sí");
        radio_dolortoracicosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_dolortoracicosiMouseClicked(evt);
            }
        });
        radio_dolortoracicosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_dolortoracicosiActionPerformed(evt);
            }
        });

        radio_dolortoracicono.setText("No");
        radio_dolortoracicono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_dolortoraciconoMouseClicked(evt);
            }
        });

        radio_dolortoraciconsnc.setText("NS/NC");
        radio_dolortoraciconsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_dolortoraciconsncMouseClicked(evt);
            }
        });

        radio_disneasi.setText("Sí");
        radio_disneasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_disneasiMouseClicked(evt);
            }
        });
        radio_disneasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_disneasiActionPerformed(evt);
            }
        });

        radio_disneano.setText("No");
        radio_disneano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_disneanoMouseClicked(evt);
            }
        });

        radio_disneansnc.setText("NS/NC");
        radio_disneansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_disneansncMouseClicked(evt);
            }
        });

        radio_cianosissi.setText("Sí");
        radio_cianosissi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cianosissiMouseClicked(evt);
            }
        });
        radio_cianosissi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_cianosissiActionPerformed(evt);
            }
        });

        radio_cianosisno.setText("No");
        radio_cianosisno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cianosisnoMouseClicked(evt);
            }
        });

        radio_cianosisnsnc.setText("NS/NC");
        radio_cianosisnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cianosisnsncMouseClicked(evt);
            }
        });

        radio_broncoespasmosi.setText("Sí");
        radio_broncoespasmosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_broncoespasmosiMouseClicked(evt);
            }
        });
        radio_broncoespasmosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_broncoespasmosiActionPerformed(evt);
            }
        });

        radio_broncoespasmono.setText("No");
        radio_broncoespasmono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_broncoespasmonoMouseClicked(evt);
            }
        });

        radio_broncoespasmonsnc.setText("NS/NC");
        radio_broncoespasmonsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_broncoespasmonsncMouseClicked(evt);
            }
        });

        radio_perdidapesosi.setText("Sí");
        radio_perdidapesosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_perdidapesosiMouseClicked(evt);
            }
        });
        radio_perdidapesosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_perdidapesosiActionPerformed(evt);
            }
        });

        radio_perdidapesono.setText("No");
        radio_perdidapesono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_perdidapesonoMouseClicked(evt);
            }
        });

        radio_perdidapesonsnc.setText("NS/NC");
        radio_perdidapesonsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_perdidapesonsncMouseClicked(evt);
            }
        });

        radio_sudoracionessi.setText("Sí");
        radio_sudoracionessi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_sudoracionessiMouseClicked(evt);
            }
        });
        radio_sudoracionessi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_sudoracionessiActionPerformed(evt);
            }
        });

        radio_sudoracionesno.setText("No");
        radio_sudoracionesno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_sudoracionesnoMouseClicked(evt);
            }
        });

        radio_sudoracionesnsnc.setText("NS/NC");
        radio_sudoracionesnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_sudoracionesnsncMouseClicked(evt);
            }
        });

        radio_taquicardiasi.setText("Sí");
        radio_taquicardiasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_taquicardiasiMouseClicked(evt);
            }
        });
        radio_taquicardiasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_taquicardiasiActionPerformed(evt);
            }
        });

        radio_taquicardiano.setText("No");
        radio_taquicardiano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_taquicardianoMouseClicked(evt);
            }
        });

        radio_taquicardiansnc.setText("NS/NC");
        radio_taquicardiansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_taquicardiansncMouseClicked(evt);
            }
        });

        radio_tosesputosi.setText("Sí");
        radio_tosesputosi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tosesputosiMouseClicked(evt);
            }
        });
        radio_tosesputosi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tosesputosiActionPerformed(evt);
            }
        });

        radio_tosesputono.setText("No");
        radio_tosesputono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tosesputonoMouseClicked(evt);
            }
        });

        radio_tosesputonsnc.setText("NS/NC");
        radio_tosesputonsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tosesputonsncMouseClicked(evt);
            }
        });

        radio_tossangresi.setText("Sí");
        radio_tossangresi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossangresiMouseClicked(evt);
            }
        });
        radio_tossangresi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tossangresiActionPerformed(evt);
            }
        });

        radio_tossangreno.setText("No");
        radio_tossangreno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossangrenoMouseClicked(evt);
            }
        });

        radio_tossangrensnc.setText("NS/NC");
        radio_tossangrensnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossangrensncMouseClicked(evt);
            }
        });

        radio_tossecasi.setText("Sí");
        radio_tossecasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossecasiMouseClicked(evt);
            }
        });
        radio_tossecasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tossecasiActionPerformed(evt);
            }
        });

        radio_tossecano.setText("No");
        radio_tossecano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossecanoMouseClicked(evt);
            }
        });

        radio_tossecansnc.setText("NS/NC");
        radio_tossecansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tossecansncMouseClicked(evt);
            }
        });

        radio_trombosissi.setText("Sí");
        radio_trombosissi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissiMouseClicked(evt);
            }
        });
        radio_trombosissi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissiActionPerformed(evt);
            }
        });

        radio_trombosisno.setText("No");
        radio_trombosisno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnoMouseClicked(evt);
            }
        });

        radio_trombosisnsnc.setText("NS/NC");
        radio_trombosisnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsncMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Diagnóstico");

        jLabel3.setText("Asma");

        jLabel6.setText("Cáncer");

        jLabel7.setText("Derrame Pleural");

        jLabel8.setText("Enfermedad Rara");

        jLabel9.setText("EPOC");

        jLabel10.setText("Neumonía");

        jLabel11.setText("Tromboembolia");

        jLabel12.setText("Tuberculosis");

        radio_ersi.setText("Sí");
        radio_ersi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_ersiMouseClicked(evt);
            }
        });
        radio_ersi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_ersiActionPerformed(evt);
            }
        });

        radio_erno.setText("No");
        radio_erno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_ernoMouseClicked(evt);
            }
        });

        radio_ernsnc.setText("NS/NC");
        radio_ernsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_ernsncMouseClicked(evt);
            }
        });

        radio_derramepleuralsi.setText("Sí");
        radio_derramepleuralsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_derramepleuralsiMouseClicked(evt);
            }
        });
        radio_derramepleuralsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_derramepleuralsiActionPerformed(evt);
            }
        });

        radio_derramepleuralno.setText("No");
        radio_derramepleuralno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_derramepleuralnoMouseClicked(evt);
            }
        });

        radio_derramepleuralnsnc.setText("NS/NC");
        radio_derramepleuralnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_derramepleuralnsncMouseClicked(evt);
            }
        });

        radio_cancersi.setText("Sí");
        radio_cancersi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cancersiMouseClicked(evt);
            }
        });
        radio_cancersi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_cancersiActionPerformed(evt);
            }
        });

        radio_cancerno.setText("No");
        radio_cancerno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cancernoMouseClicked(evt);
            }
        });

        radio_cancernsnc.setText("NS/NC");
        radio_cancernsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_cancernsncMouseClicked(evt);
            }
        });

        radio_asmasi.setText("Sí");
        radio_asmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_asmasiMouseClicked(evt);
            }
        });
        radio_asmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_asmasiActionPerformed(evt);
            }
        });

        radio_asmano.setText("No");
        radio_asmano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_asmanoMouseClicked(evt);
            }
        });

        radio_asmansnc.setText("NS/NC");
        radio_asmansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_asmansncMouseClicked(evt);
            }
        });
        radio_asmansnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_asmansncActionPerformed(evt);
            }
        });

        radio_epocsi.setText("Sí");
        radio_epocsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_epocsiMouseClicked(evt);
            }
        });
        radio_epocsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_epocsiActionPerformed(evt);
            }
        });

        radio_epocno.setText("No");
        radio_epocno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_epocnoMouseClicked(evt);
            }
        });

        radio_epocnsnc.setText("NS/NC");
        radio_epocnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_epocnsncMouseClicked(evt);
            }
        });

        radio_neumoniasi.setText("Sí");
        radio_neumoniasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_neumoniasiMouseClicked(evt);
            }
        });
        radio_neumoniasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_neumoniasiActionPerformed(evt);
            }
        });

        radio_neumoniano.setText("No");
        radio_neumoniano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_neumonianoMouseClicked(evt);
            }
        });

        radio_neumoniansnc.setText("NS/NC");
        radio_neumoniansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_neumoniansncMouseClicked(evt);
            }
        });

        radio_tepsi.setText("Sí");
        radio_tepsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tepsiMouseClicked(evt);
            }
        });
        radio_tepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tepsiActionPerformed(evt);
            }
        });

        radio_tepno.setText("No");
        radio_tepno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tepnoMouseClicked(evt);
            }
        });

        radio_tepnsnc.setText("NS/NC");
        radio_tepnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tepnsncMouseClicked(evt);
            }
        });

        radio_tuberculosissi.setText("Sí");
        radio_tuberculosissi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tuberculosissiMouseClicked(evt);
            }
        });
        radio_tuberculosissi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_tuberculosissiActionPerformed(evt);
            }
        });

        radio_tuberculosisno.setText("No");
        radio_tuberculosisno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tuberculosisnoMouseClicked(evt);
            }
        });

        radio_tuberculosisnsnc.setText("NS/NC");
        radio_tuberculosisnsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_tuberculosisnsncMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Padece alguna enfermedad pulmonar");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Diagnósis de Enfermedades Pulmonares");

        label_mujer.setText("Mujer");

        radio_mujersi.setText("Sí");
        radio_mujersi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_mujersiMouseClicked(evt);
            }
        });
        radio_mujersi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_mujersiActionPerformed(evt);
            }
        });

        radio_mujerno.setText("No");
        radio_mujerno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_mujernoMouseClicked(evt);
            }
        });

        radio_mujernsnc.setText("NS/NC");
        radio_mujernsnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_mujernsncMouseClicked(evt);
            }
        });

        label_e1.setText("Enfermedad 1");

        label_e2.setText("Enfermedad 2");

        label_e3.setText("Enfermedad 3");

        label_e4.setText("Enfermedad 4");

        label_e5.setText("Enfermedad 5");

        label_e6.setText("Enfermedad 6");

        label_e7.setText("Enfermedad 7");

        label_e8.setText("Enfermedad 8");

        label_p1.setText("Probabilidad 1");

        label_p2.setText("Probabilidad 2");

        label_p3.setText("Probabilidad 3");

        label_p4.setText("Probabilidad 4");

        label_p5.setText("Probabilidad 5");

        label_p6.setText("Probabilidad 6");

        label_p7.setText("Probabilidad 7");

        label_p8.setText("Probabilidad 8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(label_p8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_e7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_p7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e1)
                    .addComponent(label_p1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e2)
                    .addComponent(label_p2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e3)
                    .addComponent(label_p3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e4)
                    .addComponent(label_p4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e5)
                    .addComponent(label_p5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e6)
                    .addComponent(label_p6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e7)
                    .addComponent(label_p7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e8)
                    .addComponent(label_p8)))
        );

        boton_reddefecto.setText("Carga red por defecto");
        boton_reddefecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reddefectoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_reddefecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_cargared)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_redcargada))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_antecedentesepoc)
                                    .addComponent(label_embarazo)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_contaminantesquimicos)
                                            .addComponent(label_antecedentescancer)
                                            .addComponent(label_antecedentesasma)
                                            .addComponent(label_edadavanzada)
                                            .addComponent(label_contactotuberculosis)
                                            .addComponent(label_exposicionalergenos)
                                            .addComponent(label_fumador)
                                            .addComponent(label_obesidad))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_fumadorsi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_fumadorno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_fumadornsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_exposicionalergenossi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_exposicionalergenosno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_exposicionalergenosnsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_contactotuberculosissi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_contactotuberculosisno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_contactotuberculosisnsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_edadavanzadasi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_edadavanzadano)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_edadavanzadansnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_antecedentesasmasi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentesasmano)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentesasmansnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_antecedentescancersi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentescancerno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentescancernsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_antecedentesepocsi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentesepocno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_antecedentesepocnsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_contaminantesquimicossi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_contaminantesquimicosno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_contaminantesquimicosnsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_embarazosi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_embarazono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_embarazonsnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_obesidadsi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_obesidadno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_obesidadnsnc))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(label_mujer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radio_mujersi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_mujerno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_mujernsnc))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(label_gripe)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(radio_gripesi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_gripeno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_gripensnc)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_perdidapeso)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_cianosis)
                                            .addComponent(label_broncoespasmo)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label_oxigenosangre)
                                                        .addComponent(label_insuficienciarenal)
                                                        .addComponent(label_fiebre)
                                                        .addComponent(label_faltaapetito)
                                                        .addComponent(label_tossangre)
                                                        .addComponent(label_tosseca)
                                                        .addComponent(label_trombosis))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_faltaapetitosi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_faltaapetitono)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_faltaapetitonsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_fiebresi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_fiebreno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_fiebrensnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_insuficienciarenalsi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_insuficienciarenalno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_insuficienciarenalnsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_oxigenosangresi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_oxigenosangreno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_oxigenosangrensnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_perdidapesosi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_perdidapesono)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_perdidapesonsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_sudoracionessi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_sudoracionesno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_sudoracionesnsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_taquicardiasi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_taquicardiano)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_taquicardiansnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_tosesputosi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tosesputono)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tosesputonsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_tossangresi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tossangreno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tossangrensnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_tossecasi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tossecano)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_tossecansnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_trombosissi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_trombosisno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_trombosisnsnc))))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(label_dolortoracico)
                                                        .addComponent(label_disnea))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_disneasi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_disneano)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_disneansnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_dolortoracicosi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_dolortoracicono)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_dolortoraciconsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_cianosissi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_cianosisno)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_cianosisnsnc))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(radio_broncoespasmosi)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_broncoespasmono)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(radio_broncoespasmonsnc)))))
                                            .addComponent(jLabel4)
                                            .addComponent(label_tosesputo)
                                            .addComponent(label_taquicardia)
                                            .addComponent(label_sudoraciones))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel12))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_tuberculosissi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_tuberculosisno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_tuberculosisnsnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_tepsi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_tepno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_tepnsnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_neumoniasi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_neumoniano)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_neumoniansnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_epocsi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_epocno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_epocnsnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_asmasi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_asmano)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_asmansnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_cancersi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_cancerno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_cancernsnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_derramepleuralsi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_derramepleuralno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_derramepleuralnsnc))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(radio_ersi)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_erno)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radio_ernsnc))))
                                            .addComponent(jLabel5))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_broncoespasmo)
                            .addComponent(radio_broncoespasmosi)
                            .addComponent(radio_broncoespasmono)
                            .addComponent(radio_broncoespasmonsnc)
                            .addComponent(jLabel3)
                            .addComponent(radio_asmasi)
                            .addComponent(radio_asmano)
                            .addComponent(radio_asmansnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_cianosis)
                            .addComponent(radio_cianosissi)
                            .addComponent(radio_cianosisno)
                            .addComponent(radio_cianosisnsnc)
                            .addComponent(jLabel6)
                            .addComponent(radio_cancersi)
                            .addComponent(radio_cancerno)
                            .addComponent(radio_cancernsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_disnea)
                            .addComponent(radio_disneasi)
                            .addComponent(radio_disneano)
                            .addComponent(radio_disneansnc)
                            .addComponent(jLabel7)
                            .addComponent(radio_derramepleuralsi)
                            .addComponent(radio_derramepleuralno)
                            .addComponent(radio_derramepleuralnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_dolortoracico)
                            .addComponent(radio_dolortoracicosi)
                            .addComponent(radio_dolortoracicono)
                            .addComponent(radio_dolortoraciconsnc)
                            .addComponent(jLabel8)
                            .addComponent(radio_ersi)
                            .addComponent(radio_erno)
                            .addComponent(radio_ernsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_faltaapetito)
                            .addComponent(radio_faltaapetitosi)
                            .addComponent(radio_faltaapetitono)
                            .addComponent(radio_faltaapetitonsnc)
                            .addComponent(jLabel9)
                            .addComponent(radio_epocsi)
                            .addComponent(radio_epocno)
                            .addComponent(radio_epocnsnc)
                            .addComponent(label_contactotuberculosis)
                            .addComponent(radio_contactotuberculosissi)
                            .addComponent(radio_contactotuberculosisno)
                            .addComponent(radio_contactotuberculosisnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_fiebre)
                            .addComponent(radio_fiebresi)
                            .addComponent(radio_fiebreno)
                            .addComponent(radio_fiebrensnc)
                            .addComponent(jLabel10)
                            .addComponent(radio_neumoniasi)
                            .addComponent(radio_neumoniano)
                            .addComponent(radio_neumoniansnc)
                            .addComponent(label_edadavanzada)
                            .addComponent(radio_edadavanzadasi)
                            .addComponent(radio_edadavanzadano)
                            .addComponent(radio_edadavanzadansnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_insuficienciarenal)
                            .addComponent(radio_insuficienciarenalsi)
                            .addComponent(radio_insuficienciarenalno)
                            .addComponent(radio_insuficienciarenalnsnc)
                            .addComponent(jLabel11)
                            .addComponent(radio_tepsi)
                            .addComponent(radio_tepno)
                            .addComponent(radio_tepnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_oxigenosangre)
                            .addComponent(radio_oxigenosangresi)
                            .addComponent(radio_oxigenosangreno)
                            .addComponent(radio_oxigenosangrensnc)
                            .addComponent(jLabel12)
                            .addComponent(radio_tuberculosissi)
                            .addComponent(radio_tuberculosisno)
                            .addComponent(radio_tuberculosisnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_perdidapeso)
                            .addComponent(radio_perdidapesosi)
                            .addComponent(radio_perdidapesono)
                            .addComponent(radio_perdidapesonsnc))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_mujer)
                                .addComponent(radio_mujersi)
                                .addComponent(radio_mujerno)
                                .addComponent(radio_mujernsnc))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_sudoraciones)
                                .addComponent(radio_sudoracionessi)
                                .addComponent(radio_sudoracionesno)
                                .addComponent(radio_sudoracionesnsnc)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radio_obesidadsi)
                                        .addComponent(radio_obesidadno)
                                        .addComponent(radio_obesidadnsnc)
                                        .addComponent(label_obesidad))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_taquicardia)
                                        .addComponent(radio_taquicardiasi)
                                        .addComponent(radio_taquicardiano)
                                        .addComponent(radio_taquicardiansnc)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_gripe)
                                        .addComponent(radio_gripesi)
                                        .addComponent(radio_gripeno)
                                        .addComponent(radio_gripensnc))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_tosesputo)
                                        .addComponent(radio_tosesputosi)
                                        .addComponent(radio_tosesputono)
                                        .addComponent(radio_tosesputonsnc)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_tossangre)
                                    .addComponent(radio_tossangresi)
                                    .addComponent(radio_tossangreno)
                                    .addComponent(radio_tossangrensnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radio_tossecasi)
                                    .addComponent(radio_tossecano)
                                    .addComponent(radio_tossecansnc)
                                    .addComponent(label_tosseca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radio_trombosissi)
                                    .addComponent(radio_trombosisno)
                                    .addComponent(radio_trombosisnsnc)
                                    .addComponent(label_trombosis)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_antecedentesasma)
                            .addComponent(radio_antecedentesasmasi)
                            .addComponent(radio_antecedentesasmano)
                            .addComponent(radio_antecedentesasmansnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_antecedentescancer)
                            .addComponent(radio_antecedentescancersi)
                            .addComponent(radio_antecedentescancerno)
                            .addComponent(radio_antecedentescancernsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_antecedentesepoc)
                            .addComponent(radio_antecedentesepocsi)
                            .addComponent(radio_antecedentesepocno)
                            .addComponent(radio_antecedentesepocnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_contaminantesquimicos)
                            .addComponent(radio_contaminantesquimicossi)
                            .addComponent(radio_contaminantesquimicosno)
                            .addComponent(radio_contaminantesquimicosnsnc))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_embarazo)
                            .addComponent(radio_embarazosi)
                            .addComponent(radio_embarazono)
                            .addComponent(radio_embarazonsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_exposicionalergenos)
                            .addComponent(radio_exposicionalergenossi)
                            .addComponent(radio_exposicionalergenosno)
                            .addComponent(radio_exposicionalergenosnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_fumador)
                            .addComponent(radio_fumadorsi)
                            .addComponent(radio_fumadorno)
                            .addComponent(radio_fumadornsnc))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_cargared)
                    .addComponent(label_redcargada)
                    .addComponent(boton_reddefecto))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_obesidadsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_obesidadsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_obesidadsiActionPerformed

    private void radio_embarazosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_embarazosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_embarazosiActionPerformed

    private void radio_antecedentescancersiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_antecedentescancersiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_antecedentescancersiActionPerformed

    private void radio_contaminantesquimicossiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_contaminantesquimicossiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_contaminantesquimicossiActionPerformed

    private void radio_edadavanzadasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_edadavanzadasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_edadavanzadasiActionPerformed

    private void radio_gripesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_gripesiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_gripesiActionPerformed

    private void radio_contactotuberculosissiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_contactotuberculosissiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_contactotuberculosissiActionPerformed

    private void radio_fumadorsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_fumadorsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_fumadorsiActionPerformed

    private void radio_exposicionalergenossiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_exposicionalergenossiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_exposicionalergenossiActionPerformed

    private void radio_antecedentesepocsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_antecedentesepocsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_antecedentesepocsiActionPerformed

    private void radio_antecedentesasmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_antecedentesasmasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_antecedentesasmasiActionPerformed

    private void radio_obesidadsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_obesidadsiMouseClicked
        controlador.observacionObesidad(1);
    }//GEN-LAST:event_radio_obesidadsiMouseClicked

    private void radio_obesidadnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_obesidadnoMouseClicked
        controlador.observacionObesidad(0);
    }//GEN-LAST:event_radio_obesidadnoMouseClicked

    private void radio_obesidadnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_obesidadnsncMouseClicked
        controlador.observacionObesidad(2);
    }//GEN-LAST:event_radio_obesidadnsncMouseClicked

    private void radio_embarazosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_embarazosiMouseClicked
        controlador.observacionEmbarazo(1);
    }//GEN-LAST:event_radio_embarazosiMouseClicked

    private void radio_embarazonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_embarazonoMouseClicked
        controlador.observacionEmbarazo(0);
    }//GEN-LAST:event_radio_embarazonoMouseClicked

    private void radio_embarazonsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_embarazonsncMouseClicked
        controlador.observacionEmbarazo(2);
    }//GEN-LAST:event_radio_embarazonsncMouseClicked

    private void radio_antecedentescancersiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentescancersiMouseClicked
        controlador.observacionAntecedentesCancer(1);
    }//GEN-LAST:event_radio_antecedentescancersiMouseClicked

    private void radio_antecedentescancernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentescancernoMouseClicked
        controlador.observacionAntecedentesCancer(0);
    }//GEN-LAST:event_radio_antecedentescancernoMouseClicked

    private void radio_antecedentescancernsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentescancernsncMouseClicked
        controlador.observacionAntecedentesCancer(2);
    }//GEN-LAST:event_radio_antecedentescancernsncMouseClicked

    private void radio_contaminantesquimicossiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contaminantesquimicossiMouseClicked
        controlador.observacionContaminantesQuimicos(1);
    }//GEN-LAST:event_radio_contaminantesquimicossiMouseClicked

    private void radio_contaminantesquimicosnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contaminantesquimicosnoMouseClicked
        controlador.observacionContaminantesQuimicos(0);
    }//GEN-LAST:event_radio_contaminantesquimicosnoMouseClicked

    private void radio_contaminantesquimicosnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contaminantesquimicosnsncMouseClicked
        controlador.observacionContaminantesQuimicos(2);
    }//GEN-LAST:event_radio_contaminantesquimicosnsncMouseClicked

    private void radio_edadavanzadasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_edadavanzadasiMouseClicked
        controlador.observacionEdadAvanzada(1);
    }//GEN-LAST:event_radio_edadavanzadasiMouseClicked

    private void radio_edadavanzadanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_edadavanzadanoMouseClicked
        controlador.observacionEdadAvanzada(0);
    }//GEN-LAST:event_radio_edadavanzadanoMouseClicked

    private void radio_edadavanzadansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_edadavanzadansncMouseClicked
        controlador.observacionEdadAvanzada(2);
    }//GEN-LAST:event_radio_edadavanzadansncMouseClicked

    private void radio_gripesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripesiMouseClicked
        controlador.observacionGripe(1);
    }//GEN-LAST:event_radio_gripesiMouseClicked

    private void radio_gripenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripenoMouseClicked
        controlador.observacionGripe(0);
    }//GEN-LAST:event_radio_gripenoMouseClicked

    private void radio_gripensncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripensncMouseClicked
        controlador.observacionGripe(2);
    }//GEN-LAST:event_radio_gripensncMouseClicked

    private void radio_contactotuberculosissiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactotuberculosissiMouseClicked
        controlador.observacionContactoTuberculosis(1);
    }//GEN-LAST:event_radio_contactotuberculosissiMouseClicked

    private void radio_contactotuberculosisnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactotuberculosisnoMouseClicked
        controlador.observacionContactoTuberculosis(0);
    }//GEN-LAST:event_radio_contactotuberculosisnoMouseClicked

    private void radio_contactotuberculosisnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactotuberculosisnsncMouseClicked
        controlador.observacionContactoTuberculosis(2);
    }//GEN-LAST:event_radio_contactotuberculosisnsncMouseClicked

    private void radio_fumadorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fumadorsiMouseClicked
        controlador.observacionFumador(1);
    }//GEN-LAST:event_radio_fumadorsiMouseClicked

    private void radio_fumadornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fumadornoMouseClicked
        controlador.observacionFumador(0);
    }//GEN-LAST:event_radio_fumadornoMouseClicked

    private void radio_fumadornsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fumadornsncMouseClicked
        controlador.observacionFumador(2);
    }//GEN-LAST:event_radio_fumadornsncMouseClicked

    private void radio_antecedentesasmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesasmasiMouseClicked
        controlador.observacionAntecedentesAsma(1);
    }//GEN-LAST:event_radio_antecedentesasmasiMouseClicked

    private void radio_antecedentesasmanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesasmanoMouseClicked
        controlador.observacionAntecedentesAsma(0);
    }//GEN-LAST:event_radio_antecedentesasmanoMouseClicked

    private void radio_antecedentesasmansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesasmansncMouseClicked
        controlador.observacionAntecedentesAsma(2);
    }//GEN-LAST:event_radio_antecedentesasmansncMouseClicked

    private void radio_exposicionalergenossiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_exposicionalergenossiMouseClicked
        controlador.observacionExposicionAlergenos(1);
    }//GEN-LAST:event_radio_exposicionalergenossiMouseClicked

    private void radio_exposicionalergenosnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_exposicionalergenosnoMouseClicked
        controlador.observacionExposicionAlergenos(0);
    }//GEN-LAST:event_radio_exposicionalergenosnoMouseClicked

    private void radio_exposicionalergenosnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_exposicionalergenosnsncMouseClicked
        controlador.observacionExposicionAlergenos(2);
    }//GEN-LAST:event_radio_exposicionalergenosnsncMouseClicked

    private void radio_antecedentesepocsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesepocsiMouseClicked
        controlador.observacionAntecedentesEpoc(1);
    }//GEN-LAST:event_radio_antecedentesepocsiMouseClicked

    private void radio_antecedentesepocnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesepocnoMouseClicked
        controlador.observacionAntecedentesEpoc(0);
    }//GEN-LAST:event_radio_antecedentesepocnoMouseClicked

    private void radio_antecedentesepocnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_antecedentesepocnsncMouseClicked
        controlador.observacionAntecedentesEpoc(2);
    }//GEN-LAST:event_radio_antecedentesepocnsncMouseClicked

    private void radio_oxigenosangresiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_oxigenosangresiMouseClicked
        controlador.observacionOxigenoSangre(1);
    }//GEN-LAST:event_radio_oxigenosangresiMouseClicked

    private void radio_oxigenosangresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_oxigenosangresiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_oxigenosangresiActionPerformed

    private void radio_oxigenosangrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_oxigenosangrenoMouseClicked
        controlador.observacionOxigenoSangre(0);
    }//GEN-LAST:event_radio_oxigenosangrenoMouseClicked

    private void radio_oxigenosangrensncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_oxigenosangrensncMouseClicked
        controlador.observacionOxigenoSangre(2);
    }//GEN-LAST:event_radio_oxigenosangrensncMouseClicked

    private void radio_insuficienciarenalsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_insuficienciarenalsiMouseClicked
        controlador.observacionInsuficienciaRenal(1);
    }//GEN-LAST:event_radio_insuficienciarenalsiMouseClicked

    private void radio_insuficienciarenalsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_insuficienciarenalsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_insuficienciarenalsiActionPerformed

    private void radio_insuficienciarenalnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_insuficienciarenalnoMouseClicked
        controlador.observacionInsuficienciaRenal(0);
    }//GEN-LAST:event_radio_insuficienciarenalnoMouseClicked

    private void radio_insuficienciarenalnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_insuficienciarenalnsncMouseClicked
        controlador.observacionInsuficienciaRenal(2);
    }//GEN-LAST:event_radio_insuficienciarenalnsncMouseClicked

    private void radio_fiebresiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fiebresiMouseClicked
        controlador.observacionFiebre(1);
    }//GEN-LAST:event_radio_fiebresiMouseClicked

    private void radio_fiebresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_fiebresiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_fiebresiActionPerformed

    private void radio_fiebrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fiebrenoMouseClicked
        controlador.observacionFiebre(0);
    }//GEN-LAST:event_radio_fiebrenoMouseClicked

    private void radio_fiebrensncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_fiebrensncMouseClicked
        controlador.observacionFiebre(2);
    }//GEN-LAST:event_radio_fiebrensncMouseClicked

    private void radio_faltaapetitosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_faltaapetitosiMouseClicked
        controlador.observacionFaltaApetito(1);
    }//GEN-LAST:event_radio_faltaapetitosiMouseClicked

    private void radio_faltaapetitosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_faltaapetitosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_faltaapetitosiActionPerformed

    private void radio_faltaapetitonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_faltaapetitonoMouseClicked
        controlador.observacionFaltaApetito(0);
    }//GEN-LAST:event_radio_faltaapetitonoMouseClicked

    private void radio_faltaapetitonsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_faltaapetitonsncMouseClicked
        controlador.observacionFaltaApetito(2);
    }//GEN-LAST:event_radio_faltaapetitonsncMouseClicked

    private void radio_dolortoracicosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_dolortoracicosiMouseClicked
        controlador.observacionDolorToracico(1);
    }//GEN-LAST:event_radio_dolortoracicosiMouseClicked

    private void radio_dolortoracicosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_dolortoracicosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_dolortoracicosiActionPerformed

    private void radio_dolortoraciconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_dolortoraciconoMouseClicked
        controlador.observacionDolorToracico(0);
    }//GEN-LAST:event_radio_dolortoraciconoMouseClicked

    private void radio_dolortoraciconsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_dolortoraciconsncMouseClicked
        controlador.observacionDolorToracico(2);
    }//GEN-LAST:event_radio_dolortoraciconsncMouseClicked

    private void radio_disneasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_disneasiMouseClicked
        controlador.observacionDisnea(1);
    }//GEN-LAST:event_radio_disneasiMouseClicked

    private void radio_disneasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_disneasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_disneasiActionPerformed

    private void radio_disneanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_disneanoMouseClicked
        controlador.observacionDisnea(0);
    }//GEN-LAST:event_radio_disneanoMouseClicked

    private void radio_disneansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_disneansncMouseClicked
        controlador.observacionDisnea(2);
    }//GEN-LAST:event_radio_disneansncMouseClicked

    private void radio_cianosissiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cianosissiMouseClicked
        controlador.observacionCianosis(1);
    }//GEN-LAST:event_radio_cianosissiMouseClicked

    private void radio_cianosissiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_cianosissiActionPerformed
        
    }//GEN-LAST:event_radio_cianosissiActionPerformed

    private void radio_cianosisnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cianosisnoMouseClicked
        controlador.observacionCianosis(0);
    }//GEN-LAST:event_radio_cianosisnoMouseClicked

    private void radio_cianosisnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cianosisnsncMouseClicked
        controlador.observacionCianosis(2);
    }//GEN-LAST:event_radio_cianosisnsncMouseClicked

    private void radio_broncoespasmosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_broncoespasmosiMouseClicked
        controlador.observacionBroncoespasmo(1);
    }//GEN-LAST:event_radio_broncoespasmosiMouseClicked

    private void radio_broncoespasmosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_broncoespasmosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_broncoespasmosiActionPerformed

    private void radio_broncoespasmonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_broncoespasmonoMouseClicked
        controlador.observacionBroncoespasmo(0);
    }//GEN-LAST:event_radio_broncoespasmonoMouseClicked

    private void radio_broncoespasmonsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_broncoespasmonsncMouseClicked
        controlador.observacionBroncoespasmo(2);
    }//GEN-LAST:event_radio_broncoespasmonsncMouseClicked

    private void radio_perdidapesosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_perdidapesosiMouseClicked
        controlador.observacionPerdidaPeso(1);
    }//GEN-LAST:event_radio_perdidapesosiMouseClicked

    private void radio_perdidapesosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_perdidapesosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_perdidapesosiActionPerformed

    private void radio_perdidapesonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_perdidapesonoMouseClicked
        controlador.observacionPerdidaPeso(0);
    }//GEN-LAST:event_radio_perdidapesonoMouseClicked

    private void radio_perdidapesonsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_perdidapesonsncMouseClicked
        controlador.observacionPerdidaPeso(2);
    }//GEN-LAST:event_radio_perdidapesonsncMouseClicked

    private void radio_sudoracionessiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_sudoracionessiMouseClicked
        controlador.observacionSudoraciones(1);
    }//GEN-LAST:event_radio_sudoracionessiMouseClicked

    private void radio_sudoracionessiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_sudoracionessiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_sudoracionessiActionPerformed

    private void radio_sudoracionesnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_sudoracionesnoMouseClicked
        controlador.observacionSudoraciones(0);
    }//GEN-LAST:event_radio_sudoracionesnoMouseClicked

    private void radio_sudoracionesnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_sudoracionesnsncMouseClicked
        controlador.observacionSudoraciones(2);
    }//GEN-LAST:event_radio_sudoracionesnsncMouseClicked

    private void radio_taquicardiasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_taquicardiasiMouseClicked
        controlador.observacionTaquicardia(1);
    }//GEN-LAST:event_radio_taquicardiasiMouseClicked

    private void radio_taquicardiasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_taquicardiasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_taquicardiasiActionPerformed

    private void radio_taquicardianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_taquicardianoMouseClicked
        controlador.observacionTaquicardia(0);
    }//GEN-LAST:event_radio_taquicardianoMouseClicked

    private void radio_taquicardiansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_taquicardiansncMouseClicked
        controlador.observacionTaquicardia(2);
    }//GEN-LAST:event_radio_taquicardiansncMouseClicked

    private void radio_tosesputosiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tosesputosiMouseClicked
        controlador.observacionTosEsputo(1);
    }//GEN-LAST:event_radio_tosesputosiMouseClicked

    private void radio_tosesputosiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tosesputosiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_tosesputosiActionPerformed

    private void radio_tosesputonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tosesputonoMouseClicked
        controlador.observacionTosEsputo(0);
    }//GEN-LAST:event_radio_tosesputonoMouseClicked

    private void radio_tosesputonsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tosesputonsncMouseClicked
        controlador.observacionTosEsputo(2);
    }//GEN-LAST:event_radio_tosesputonsncMouseClicked

    private void radio_tossangresiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossangresiMouseClicked
        controlador.observacionTosSangre(1);
    }//GEN-LAST:event_radio_tossangresiMouseClicked

    private void radio_tossangresiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tossangresiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_tossangresiActionPerformed

    private void radio_tossangrenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossangrenoMouseClicked
        controlador.observacionTosSangre(0);
    }//GEN-LAST:event_radio_tossangrenoMouseClicked

    private void radio_tossangrensncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossangrensncMouseClicked
        controlador.observacionTosSangre(2);
    }//GEN-LAST:event_radio_tossangrensncMouseClicked

    private void radio_tossecasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossecasiMouseClicked
        controlador.observacionTosSeca(1);
    }//GEN-LAST:event_radio_tossecasiMouseClicked

    private void radio_tossecasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tossecasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_tossecasiActionPerformed

    private void radio_tossecanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossecanoMouseClicked
        controlador.observacionTosSeca(0);
    }//GEN-LAST:event_radio_tossecanoMouseClicked

    private void radio_tossecansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tossecansncMouseClicked
        controlador.observacionTosSeca(2);
    }//GEN-LAST:event_radio_tossecansncMouseClicked

    private void radio_trombosissiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissiMouseClicked
        controlador.observacionTrombosis(1);
    }//GEN-LAST:event_radio_trombosissiMouseClicked

    private void radio_trombosissiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissiActionPerformed

    private void radio_trombosisnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnoMouseClicked
        controlador.observacionTrombosis(0);
    }//GEN-LAST:event_radio_trombosisnoMouseClicked

    private void radio_trombosisnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsncMouseClicked
        controlador.observacionTrombosis(2);
    }//GEN-LAST:event_radio_trombosisnsncMouseClicked

    private void radio_ersiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_ersiMouseClicked
        controlador.observacionEnfermedadRara(1);
    }//GEN-LAST:event_radio_ersiMouseClicked

    private void radio_ersiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_ersiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_ersiActionPerformed

    private void radio_ernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_ernoMouseClicked
        controlador.observacionEnfermedadRara(0);
    }//GEN-LAST:event_radio_ernoMouseClicked

    private void radio_ernsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_ernsncMouseClicked
        controlador.observacionEnfermedadRara(2);
    }//GEN-LAST:event_radio_ernsncMouseClicked

    private void radio_derramepleuralsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_derramepleuralsiMouseClicked
        controlador.observacionDerramePleural(1);
    }//GEN-LAST:event_radio_derramepleuralsiMouseClicked

    private void radio_derramepleuralsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_derramepleuralsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_derramepleuralsiActionPerformed

    private void radio_derramepleuralnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_derramepleuralnoMouseClicked
        controlador.observacionDerramePleural(0);
    }//GEN-LAST:event_radio_derramepleuralnoMouseClicked

    private void radio_derramepleuralnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_derramepleuralnsncMouseClicked
        controlador.observacionDerramePleural(2);
    }//GEN-LAST:event_radio_derramepleuralnsncMouseClicked

    private void radio_cancersiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cancersiMouseClicked
        controlador.observacionCancer(1);
    }//GEN-LAST:event_radio_cancersiMouseClicked

    private void radio_cancersiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_cancersiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_cancersiActionPerformed

    private void radio_cancernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cancernoMouseClicked
        controlador.observacionCancer(0);
    }//GEN-LAST:event_radio_cancernoMouseClicked

    private void radio_cancernsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_cancernsncMouseClicked
        controlador.observacionCancer(2);
    }//GEN-LAST:event_radio_cancernsncMouseClicked

    private void radio_asmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_asmasiMouseClicked
        controlador.observacionAsma(1);
    }//GEN-LAST:event_radio_asmasiMouseClicked

    private void radio_asmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_asmasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_asmasiActionPerformed

    private void radio_asmanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_asmanoMouseClicked
        controlador.observacionAsma(0);
    }//GEN-LAST:event_radio_asmanoMouseClicked

    private void radio_asmansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_asmansncMouseClicked
        controlador.observacionAsma(2);
    }//GEN-LAST:event_radio_asmansncMouseClicked

    private void radio_epocsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_epocsiMouseClicked
        controlador.observacionEpoc(1);
    }//GEN-LAST:event_radio_epocsiMouseClicked

    private void radio_epocsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_epocsiActionPerformed
        
    }//GEN-LAST:event_radio_epocsiActionPerformed

    private void radio_epocnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_epocnoMouseClicked
        controlador.observacionEpoc(0);
    }//GEN-LAST:event_radio_epocnoMouseClicked

    private void radio_epocnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_epocnsncMouseClicked
        controlador.observacionEpoc(2);
    }//GEN-LAST:event_radio_epocnsncMouseClicked

    private void radio_neumoniasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_neumoniasiMouseClicked
        controlador.observacionNeumonia(1);
    }//GEN-LAST:event_radio_neumoniasiMouseClicked

    private void radio_neumoniasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_neumoniasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_neumoniasiActionPerformed

    private void radio_neumonianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_neumonianoMouseClicked
        controlador.observacionNeumonia(0);
    }//GEN-LAST:event_radio_neumonianoMouseClicked

    private void radio_neumoniansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_neumoniansncMouseClicked
        controlador.observacionNeumonia(2);
    }//GEN-LAST:event_radio_neumoniansncMouseClicked

    private void radio_tepsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tepsiMouseClicked
        controlador.observacionTep(1);
    }//GEN-LAST:event_radio_tepsiMouseClicked

    private void radio_tepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tepsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_tepsiActionPerformed

    private void radio_tepnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tepnoMouseClicked
        controlador.observacionTep(0);
    }//GEN-LAST:event_radio_tepnoMouseClicked

    private void radio_tepnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tepnsncMouseClicked
        controlador.observacionTep(2);
    }//GEN-LAST:event_radio_tepnsncMouseClicked

    private void radio_tuberculosissiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tuberculosissiMouseClicked
        controlador.observacionTuberculosis(1);
    }//GEN-LAST:event_radio_tuberculosissiMouseClicked

    private void radio_tuberculosissiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_tuberculosissiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_tuberculosissiActionPerformed

    private void radio_tuberculosisnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tuberculosisnoMouseClicked
        controlador.observacionTuberculosis(0);
    }//GEN-LAST:event_radio_tuberculosisnoMouseClicked

    private void radio_tuberculosisnsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_tuberculosisnsncMouseClicked
        controlador.observacionTuberculosis(2);
    }//GEN-LAST:event_radio_tuberculosisnsncMouseClicked

    private void radio_asmansncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_asmansncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_asmansncActionPerformed

    private void radio_mujersiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_mujersiMouseClicked
        controlador.observacionMujer(1);
    }//GEN-LAST:event_radio_mujersiMouseClicked

    private void radio_mujersiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_mujersiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_mujersiActionPerformed

    private void radio_mujernoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_mujernoMouseClicked
        controlador.observacionMujer(0);
    }//GEN-LAST:event_radio_mujernoMouseClicked

    private void radio_mujernsncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_mujernsncMouseClicked
        controlador.observacionMujer(2);
    }//GEN-LAST:event_radio_mujernsncMouseClicked

    private void boton_cargaredMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_cargaredMouseClicked
        //ControladorVistas cv = ControladorVistas.getInstancia();
        //cv.muestraCargaRed();
        JFileChooser selector = new JFileChooser();
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("xdsl","XDSL");
        selector.setFileFilter(filtro);
        int seleccion = selector.showOpenDialog(new VistaBuscaRed());
        if(seleccion == selector.APPROVE_OPTION){
            File fichero = selector.getSelectedFile();
            this.controlador.cambiaRed(fichero.getPath());
            this.reseteaObservaciones();
            this.label_redcargada.setText("Red cargada: "+fichero.getPath());
        }
                
    }//GEN-LAST:event_boton_cargaredMouseClicked

    private void boton_reddefectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reddefectoMouseClicked
        this.controlador.cambiaRed("./src/main/java/com/marcart/redesbayesianas/computo/red.xdsl");
        this.reseteaObservaciones();
        this.label_redcargada.setText("Red cargada por defecto");
    }//GEN-LAST:event_boton_reddefectoMouseClicked
    
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    /**
     * @param args the command line arguments
     
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cargared;
    private javax.swing.JButton boton_reddefecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_antecedentesasma;
    private javax.swing.JLabel label_antecedentescancer;
    private javax.swing.JLabel label_antecedentesepoc;
    private javax.swing.JLabel label_broncoespasmo;
    private javax.swing.JLabel label_cianosis;
    private javax.swing.JLabel label_contactotuberculosis;
    private javax.swing.JLabel label_contaminantesquimicos;
    private javax.swing.JLabel label_disnea;
    private javax.swing.JLabel label_dolortoracico;
    private javax.swing.JLabel label_e1;
    private javax.swing.JLabel label_e2;
    private javax.swing.JLabel label_e3;
    private javax.swing.JLabel label_e4;
    private javax.swing.JLabel label_e5;
    private javax.swing.JLabel label_e6;
    private javax.swing.JLabel label_e7;
    private javax.swing.JLabel label_e8;
    private javax.swing.JLabel label_edadavanzada;
    private javax.swing.JLabel label_embarazo;
    private javax.swing.JLabel label_exposicionalergenos;
    private javax.swing.JLabel label_faltaapetito;
    private javax.swing.JLabel label_fiebre;
    private javax.swing.JLabel label_fumador;
    private javax.swing.JLabel label_gripe;
    private javax.swing.JLabel label_insuficienciarenal;
    private javax.swing.JLabel label_mujer;
    private javax.swing.JLabel label_obesidad;
    private javax.swing.JLabel label_oxigenosangre;
    private javax.swing.JLabel label_p1;
    private javax.swing.JLabel label_p2;
    private javax.swing.JLabel label_p3;
    private javax.swing.JLabel label_p4;
    private javax.swing.JLabel label_p5;
    private javax.swing.JLabel label_p6;
    private javax.swing.JLabel label_p7;
    private javax.swing.JLabel label_p8;
    private javax.swing.JLabel label_perdidapeso;
    private javax.swing.JLabel label_redcargada;
    private javax.swing.JLabel label_sudoraciones;
    private javax.swing.JLabel label_taquicardia;
    private javax.swing.JLabel label_tosesputo;
    private javax.swing.JLabel label_tossangre;
    private javax.swing.JLabel label_tosseca;
    private javax.swing.JLabel label_trombosis;
    private javax.swing.JRadioButton radio_antecedentesasmano;
    private javax.swing.JRadioButton radio_antecedentesasmansnc;
    private javax.swing.JRadioButton radio_antecedentesasmasi;
    private javax.swing.JRadioButton radio_antecedentescancerno;
    private javax.swing.JRadioButton radio_antecedentescancernsnc;
    private javax.swing.JRadioButton radio_antecedentescancersi;
    private javax.swing.JRadioButton radio_antecedentesepocno;
    private javax.swing.JRadioButton radio_antecedentesepocnsnc;
    private javax.swing.JRadioButton radio_antecedentesepocsi;
    private javax.swing.JRadioButton radio_asmano;
    private javax.swing.JRadioButton radio_asmansnc;
    private javax.swing.JRadioButton radio_asmasi;
    private javax.swing.JRadioButton radio_broncoespasmono;
    private javax.swing.JRadioButton radio_broncoespasmonsnc;
    private javax.swing.JRadioButton radio_broncoespasmosi;
    private javax.swing.JRadioButton radio_cancerno;
    private javax.swing.JRadioButton radio_cancernsnc;
    private javax.swing.JRadioButton radio_cancersi;
    private javax.swing.JRadioButton radio_cianosisno;
    private javax.swing.JRadioButton radio_cianosisnsnc;
    private javax.swing.JRadioButton radio_cianosissi;
    private javax.swing.JRadioButton radio_contactotuberculosisno;
    private javax.swing.JRadioButton radio_contactotuberculosisnsnc;
    private javax.swing.JRadioButton radio_contactotuberculosissi;
    private javax.swing.JRadioButton radio_contaminantesquimicosno;
    private javax.swing.JRadioButton radio_contaminantesquimicosnsnc;
    private javax.swing.JRadioButton radio_contaminantesquimicossi;
    private javax.swing.JRadioButton radio_derramepleuralno;
    private javax.swing.JRadioButton radio_derramepleuralnsnc;
    private javax.swing.JRadioButton radio_derramepleuralsi;
    private javax.swing.JRadioButton radio_disneano;
    private javax.swing.JRadioButton radio_disneansnc;
    private javax.swing.JRadioButton radio_disneasi;
    private javax.swing.JRadioButton radio_dolortoracicono;
    private javax.swing.JRadioButton radio_dolortoraciconsnc;
    private javax.swing.JRadioButton radio_dolortoracicosi;
    private javax.swing.JRadioButton radio_edadavanzadano;
    private javax.swing.JRadioButton radio_edadavanzadansnc;
    private javax.swing.JRadioButton radio_edadavanzadasi;
    private javax.swing.JRadioButton radio_embarazono;
    private javax.swing.JRadioButton radio_embarazonsnc;
    private javax.swing.JRadioButton radio_embarazosi;
    private javax.swing.JRadioButton radio_epocno;
    private javax.swing.JRadioButton radio_epocnsnc;
    private javax.swing.JRadioButton radio_epocsi;
    private javax.swing.JRadioButton radio_erno;
    private javax.swing.JRadioButton radio_ernsnc;
    private javax.swing.JRadioButton radio_ersi;
    private javax.swing.JRadioButton radio_exposicionalergenosno;
    private javax.swing.JRadioButton radio_exposicionalergenosnsnc;
    private javax.swing.JRadioButton radio_exposicionalergenossi;
    private javax.swing.JRadioButton radio_faltaapetitono;
    private javax.swing.JRadioButton radio_faltaapetitonsnc;
    private javax.swing.JRadioButton radio_faltaapetitosi;
    private javax.swing.JRadioButton radio_fiebreno;
    private javax.swing.JRadioButton radio_fiebrensnc;
    private javax.swing.JRadioButton radio_fiebresi;
    private javax.swing.JRadioButton radio_fumadorno;
    private javax.swing.JRadioButton radio_fumadornsnc;
    private javax.swing.JRadioButton radio_fumadorsi;
    private javax.swing.JRadioButton radio_gripeno;
    private javax.swing.JRadioButton radio_gripensnc;
    private javax.swing.JRadioButton radio_gripesi;
    private javax.swing.JRadioButton radio_insuficienciarenalno;
    private javax.swing.JRadioButton radio_insuficienciarenalnsnc;
    private javax.swing.JRadioButton radio_insuficienciarenalsi;
    private javax.swing.JRadioButton radio_mujerno;
    private javax.swing.JRadioButton radio_mujernsnc;
    private javax.swing.JRadioButton radio_mujersi;
    private javax.swing.JRadioButton radio_neumoniano;
    private javax.swing.JRadioButton radio_neumoniansnc;
    private javax.swing.JRadioButton radio_neumoniasi;
    private javax.swing.JRadioButton radio_obesidadno;
    private javax.swing.JRadioButton radio_obesidadnsnc;
    private javax.swing.JRadioButton radio_obesidadsi;
    private javax.swing.JRadioButton radio_oxigenosangreno;
    private javax.swing.JRadioButton radio_oxigenosangrensnc;
    private javax.swing.JRadioButton radio_oxigenosangresi;
    private javax.swing.JRadioButton radio_perdidapesono;
    private javax.swing.JRadioButton radio_perdidapesonsnc;
    private javax.swing.JRadioButton radio_perdidapesosi;
    private javax.swing.JRadioButton radio_sudoracionesno;
    private javax.swing.JRadioButton radio_sudoracionesnsnc;
    private javax.swing.JRadioButton radio_sudoracionessi;
    private javax.swing.JRadioButton radio_taquicardiano;
    private javax.swing.JRadioButton radio_taquicardiansnc;
    private javax.swing.JRadioButton radio_taquicardiasi;
    private javax.swing.JRadioButton radio_tepno;
    private javax.swing.JRadioButton radio_tepnsnc;
    private javax.swing.JRadioButton radio_tepsi;
    private javax.swing.JRadioButton radio_tosesputono;
    private javax.swing.JRadioButton radio_tosesputonsnc;
    private javax.swing.JRadioButton radio_tosesputosi;
    private javax.swing.JRadioButton radio_tossangreno;
    private javax.swing.JRadioButton radio_tossangrensnc;
    private javax.swing.JRadioButton radio_tossangresi;
    private javax.swing.JRadioButton radio_tossecano;
    private javax.swing.JRadioButton radio_tossecansnc;
    private javax.swing.JRadioButton radio_tossecasi;
    private javax.swing.JRadioButton radio_trombosisno;
    private javax.swing.JRadioButton radio_trombosisnsnc;
    private javax.swing.JRadioButton radio_trombosissi;
    private javax.swing.JRadioButton radio_tuberculosisno;
    private javax.swing.JRadioButton radio_tuberculosisnsnc;
    private javax.swing.JRadioButton radio_tuberculosissi;
    // End of variables declaration//GEN-END:variables
}
