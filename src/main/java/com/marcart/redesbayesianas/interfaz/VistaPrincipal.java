/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marcart.redesbayesianas.interfaz;

import javax.swing.ButtonGroup;

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
        
        ButtonGroup grupocontactoneumonia = new ButtonGroup();
        grupocontactoneumonia.add(radio_contactoneumoniasi);
        grupocontactoneumonia.add(radio_contactoneumoniano);
        grupocontactoneumonia.add(radio_contactoneumoniansnc);
        radio_contactoneumoniansnc.setSelected(true);
        
        ButtonGroup grupogripe = new ButtonGroup();
        grupogripe.add(radio_gripesi);
        grupogripe.add(radio_gripeno);
        grupogripe.add(radio_gripensnc);
        radio_gripensnc.setSelected(true);
        
        ButtonGroup grupoviajeasia = new ButtonGroup();
        grupoviajeasia.add(radio_viajeasiasi);
        grupoviajeasia.add(radio_viajeasiano);
        grupoviajeasia.add(radio_viajeasiansnc);
        radio_viajeasiansnc.setSelected(true);
        
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
        jButton1 = new javax.swing.JButton();
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
        label_contactoneumonia = new javax.swing.JLabel();
        radio_contactoneumoniasi = new javax.swing.JRadioButton();
        radio_contactoneumoniano = new javax.swing.JRadioButton();
        radio_contactoneumoniansnc = new javax.swing.JRadioButton();
        label_gripe = new javax.swing.JLabel();
        label_viajeasia = new javax.swing.JLabel();
        label_contactotuberculosis = new javax.swing.JLabel();
        label_fumador = new javax.swing.JLabel();
        label_antecedentesasma = new javax.swing.JLabel();
        label_exposicionalergenos = new javax.swing.JLabel();
        label_antecedentesepoc = new javax.swing.JLabel();
        radio_gripesi = new javax.swing.JRadioButton();
        radio_gripeno = new javax.swing.JRadioButton();
        radio_gripensnc = new javax.swing.JRadioButton();
        radio_viajeasiasi = new javax.swing.JRadioButton();
        radio_viajeasiano = new javax.swing.JRadioButton();
        radio_viajeasiansnc = new javax.swing.JRadioButton();
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
        radio_trombosissi1 = new javax.swing.JRadioButton();
        radio_trombosisno1 = new javax.swing.JRadioButton();
        radio_trombosisnsnc1 = new javax.swing.JRadioButton();
        radio_trombosissi2 = new javax.swing.JRadioButton();
        radio_trombosisno2 = new javax.swing.JRadioButton();
        radio_trombosisnsnc2 = new javax.swing.JRadioButton();
        radio_trombosissi3 = new javax.swing.JRadioButton();
        radio_trombosisno3 = new javax.swing.JRadioButton();
        radio_trombosisnsnc3 = new javax.swing.JRadioButton();
        radio_trombosissi4 = new javax.swing.JRadioButton();
        radio_trombosisno4 = new javax.swing.JRadioButton();
        radio_trombosisnsnc4 = new javax.swing.JRadioButton();
        radio_trombosissi5 = new javax.swing.JRadioButton();
        radio_trombosisno5 = new javax.swing.JRadioButton();
        radio_trombosisnsnc5 = new javax.swing.JRadioButton();
        radio_trombosissi6 = new javax.swing.JRadioButton();
        radio_trombosisno6 = new javax.swing.JRadioButton();
        radio_trombosisnsnc6 = new javax.swing.JRadioButton();
        radio_trombosissi7 = new javax.swing.JRadioButton();
        radio_trombosisno7 = new javax.swing.JRadioButton();
        radio_trombosisnsnc7 = new javax.swing.JRadioButton();
        radio_trombosissi8 = new javax.swing.JRadioButton();
        radio_trombosisno8 = new javax.swing.JRadioButton();
        radio_trombosisnsnc8 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diagnosis de Enfermedades Pulmonares");

        jButton1.setText("Cargar otra red");

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

        label_contactoneumonia.setText("Contacto con neumonía");

        radio_contactoneumoniasi.setText("Sí");
        radio_contactoneumoniasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactoneumoniasiMouseClicked(evt);
            }
        });
        radio_contactoneumoniasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_contactoneumoniasiActionPerformed(evt);
            }
        });

        radio_contactoneumoniano.setText("No");
        radio_contactoneumoniano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactoneumonianoMouseClicked(evt);
            }
        });

        radio_contactoneumoniansnc.setText("NS/NC");
        radio_contactoneumoniansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_contactoneumoniansncMouseClicked(evt);
            }
        });

        label_gripe.setText("Tiene gripe");

        label_viajeasia.setText("Viaje a Asia");

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

        radio_viajeasiasi.setText("Sí");
        radio_viajeasiasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_viajeasiasiMouseClicked(evt);
            }
        });
        radio_viajeasiasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_viajeasiasiActionPerformed(evt);
            }
        });

        radio_viajeasiano.setText("No");
        radio_viajeasiano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_viajeasianoMouseClicked(evt);
            }
        });

        radio_viajeasiansnc.setText("NS/NC");
        radio_viajeasiansnc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_viajeasiansncMouseClicked(evt);
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

        label_oxigenosangre.setText("Oxígeno en sangre");

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

        jLabel11.setText("Trombosis");

        jLabel12.setText("Tuberculosis");

        radio_trombosissi1.setText("Sí");
        radio_trombosissi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi1MouseClicked(evt);
            }
        });
        radio_trombosissi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi1ActionPerformed(evt);
            }
        });

        radio_trombosisno1.setText("No");
        radio_trombosisno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno1MouseClicked(evt);
            }
        });

        radio_trombosisnsnc1.setText("NS/NC");
        radio_trombosisnsnc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc1MouseClicked(evt);
            }
        });

        radio_trombosissi2.setText("Sí");
        radio_trombosissi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi2MouseClicked(evt);
            }
        });
        radio_trombosissi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi2ActionPerformed(evt);
            }
        });

        radio_trombosisno2.setText("No");
        radio_trombosisno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno2MouseClicked(evt);
            }
        });

        radio_trombosisnsnc2.setText("NS/NC");
        radio_trombosisnsnc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc2MouseClicked(evt);
            }
        });

        radio_trombosissi3.setText("Sí");
        radio_trombosissi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi3MouseClicked(evt);
            }
        });
        radio_trombosissi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi3ActionPerformed(evt);
            }
        });

        radio_trombosisno3.setText("No");
        radio_trombosisno3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno3MouseClicked(evt);
            }
        });

        radio_trombosisnsnc3.setText("NS/NC");
        radio_trombosisnsnc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc3MouseClicked(evt);
            }
        });

        radio_trombosissi4.setText("Sí");
        radio_trombosissi4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi4MouseClicked(evt);
            }
        });
        radio_trombosissi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi4ActionPerformed(evt);
            }
        });

        radio_trombosisno4.setText("No");
        radio_trombosisno4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno4MouseClicked(evt);
            }
        });

        radio_trombosisnsnc4.setText("NS/NC");
        radio_trombosisnsnc4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc4MouseClicked(evt);
            }
        });

        radio_trombosissi5.setText("Sí");
        radio_trombosissi5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi5MouseClicked(evt);
            }
        });
        radio_trombosissi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi5ActionPerformed(evt);
            }
        });

        radio_trombosisno5.setText("No");
        radio_trombosisno5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno5MouseClicked(evt);
            }
        });

        radio_trombosisnsnc5.setText("NS/NC");
        radio_trombosisnsnc5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc5MouseClicked(evt);
            }
        });

        radio_trombosissi6.setText("Sí");
        radio_trombosissi6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi6MouseClicked(evt);
            }
        });
        radio_trombosissi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi6ActionPerformed(evt);
            }
        });

        radio_trombosisno6.setText("No");
        radio_trombosisno6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno6MouseClicked(evt);
            }
        });

        radio_trombosisnsnc6.setText("NS/NC");
        radio_trombosisnsnc6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc6MouseClicked(evt);
            }
        });

        radio_trombosissi7.setText("Sí");
        radio_trombosissi7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi7MouseClicked(evt);
            }
        });
        radio_trombosissi7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi7ActionPerformed(evt);
            }
        });

        radio_trombosisno7.setText("No");
        radio_trombosisno7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno7MouseClicked(evt);
            }
        });

        radio_trombosisnsnc7.setText("NS/NC");
        radio_trombosisnsnc7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc7MouseClicked(evt);
            }
        });

        radio_trombosissi8.setText("Sí");
        radio_trombosissi8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosissi8MouseClicked(evt);
            }
        });
        radio_trombosissi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trombosissi8ActionPerformed(evt);
            }
        });

        radio_trombosisno8.setText("No");
        radio_trombosisno8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisno8MouseClicked(evt);
            }
        });

        radio_trombosisnsnc8.setText("NS/NC");
        radio_trombosisnsnc8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_trombosisnsnc8MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Padece alguna enfermedad pulmonar");

        jLabel14.setText("Diagnostico 1");

        jLabel15.setText("Diagnostico 2");

        jLabel16.setText("Diagnostico 3");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Diagnósis de Enfermedades Pulmonares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_viajeasia)
                            .addComponent(label_antecedentesepoc)
                            .addComponent(label_embarazo)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_contaminantesquimicos)
                                    .addComponent(label_antecedentescancer)
                                    .addComponent(label_antecedentesasma)
                                    .addComponent(label_contactoneumonia)
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
                                        .addComponent(radio_contactoneumoniasi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_contactoneumoniano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio_contactoneumoniansnc))
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
                                        .addComponent(radio_obesidadnsnc))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(radio_viajeasiasi)
                                            .addComponent(radio_gripesi))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_gripeno)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_gripensnc))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_viajeasiano)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_viajeasiansnc))))))
                            .addComponent(label_gripe))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_sudoraciones)
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
                                    .addComponent(label_taquicardia))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(radio_trombosissi8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radio_trombosissi1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisno1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radio_trombosisnsnc1))))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_redcargada)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_contactoneumonia)
                            .addComponent(radio_contactoneumoniasi)
                            .addComponent(radio_contactoneumoniano)
                            .addComponent(radio_contactoneumoniansnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_contactotuberculosis)
                            .addComponent(radio_contactotuberculosissi)
                            .addComponent(radio_contactotuberculosisno)
                            .addComponent(radio_contactotuberculosisnsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(radio_fumadornsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_obesidadsi)
                            .addComponent(radio_obesidadno)
                            .addComponent(radio_obesidadnsnc)
                            .addComponent(label_obesidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_gripe)
                            .addComponent(radio_gripesi)
                            .addComponent(radio_gripeno)
                            .addComponent(radio_gripensnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_viajeasia)
                            .addComponent(radio_viajeasiasi)
                            .addComponent(radio_viajeasiano)
                            .addComponent(radio_viajeasiansnc)))
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
                            .addComponent(radio_trombosissi4)
                            .addComponent(radio_trombosisno4)
                            .addComponent(radio_trombosisnsnc4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_cianosis)
                            .addComponent(radio_cianosissi)
                            .addComponent(radio_cianosisno)
                            .addComponent(radio_cianosisnsnc)
                            .addComponent(jLabel6)
                            .addComponent(radio_trombosissi3)
                            .addComponent(radio_trombosisno3)
                            .addComponent(radio_trombosisnsnc3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_disnea)
                            .addComponent(radio_disneasi)
                            .addComponent(radio_disneano)
                            .addComponent(radio_disneansnc)
                            .addComponent(jLabel7)
                            .addComponent(radio_trombosissi2)
                            .addComponent(radio_trombosisno2)
                            .addComponent(radio_trombosisnsnc2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_dolortoracico)
                            .addComponent(radio_dolortoracicosi)
                            .addComponent(radio_dolortoracicono)
                            .addComponent(radio_dolortoraciconsnc)
                            .addComponent(jLabel8)
                            .addComponent(radio_trombosissi1)
                            .addComponent(radio_trombosisno1)
                            .addComponent(radio_trombosisnsnc1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_faltaapetito)
                            .addComponent(radio_faltaapetitosi)
                            .addComponent(radio_faltaapetitono)
                            .addComponent(radio_faltaapetitonsnc)
                            .addComponent(jLabel9)
                            .addComponent(radio_trombosissi5)
                            .addComponent(radio_trombosisno5)
                            .addComponent(radio_trombosisnsnc5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_fiebre)
                            .addComponent(radio_fiebresi)
                            .addComponent(radio_fiebreno)
                            .addComponent(radio_fiebrensnc)
                            .addComponent(jLabel10)
                            .addComponent(radio_trombosissi6)
                            .addComponent(radio_trombosisno6)
                            .addComponent(radio_trombosisnsnc6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_insuficienciarenal)
                            .addComponent(radio_insuficienciarenalsi)
                            .addComponent(radio_insuficienciarenalno)
                            .addComponent(radio_insuficienciarenalnsnc)
                            .addComponent(jLabel11)
                            .addComponent(radio_trombosissi7)
                            .addComponent(radio_trombosisno7)
                            .addComponent(radio_trombosisnsnc7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_oxigenosangre)
                            .addComponent(radio_oxigenosangresi)
                            .addComponent(radio_oxigenosangreno)
                            .addComponent(radio_oxigenosangrensnc)
                            .addComponent(jLabel12)
                            .addComponent(radio_trombosissi8)
                            .addComponent(radio_trombosisno8)
                            .addComponent(radio_trombosisnsnc8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_perdidapeso)
                            .addComponent(radio_perdidapesosi)
                            .addComponent(radio_perdidapesono)
                            .addComponent(radio_perdidapesonsnc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_sudoraciones)
                            .addComponent(radio_sudoracionessi)
                            .addComponent(radio_sudoracionesno)
                            .addComponent(radio_sudoracionesnsnc))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_taquicardia)
                                    .addComponent(radio_taquicardiasi)
                                    .addComponent(radio_taquicardiano)
                                    .addComponent(radio_taquicardiansnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_tosesputo)
                                    .addComponent(radio_tosesputosi)
                                    .addComponent(radio_tosesputono)
                                    .addComponent(radio_tosesputonsnc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_tossangre)
                                    .addComponent(radio_tossangresi)
                                    .addComponent(radio_tossangreno)
                                    .addComponent(radio_tossangrensnc)
                                    .addComponent(jLabel14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_tossecasi)
                            .addComponent(radio_tossecano)
                            .addComponent(radio_tossecansnc)
                            .addComponent(label_tosseca)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_trombosissi)
                            .addComponent(radio_trombosisno)
                            .addComponent(radio_trombosisnsnc)
                            .addComponent(label_trombosis)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(label_redcargada))
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

    private void radio_contactoneumoniasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_contactoneumoniasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_contactoneumoniasiActionPerformed

    private void radio_gripesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_gripesiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_gripesiActionPerformed

    private void radio_viajeasiasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_viajeasiasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_viajeasiasiActionPerformed

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

    private void radio_contactoneumoniasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactoneumoniasiMouseClicked
        controlador.observacionContactoNeumonia(1);
    }//GEN-LAST:event_radio_contactoneumoniasiMouseClicked

    private void radio_contactoneumonianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactoneumonianoMouseClicked
        controlador.observacionContactoNeumonia(0);
    }//GEN-LAST:event_radio_contactoneumonianoMouseClicked

    private void radio_contactoneumoniansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_contactoneumoniansncMouseClicked
        controlador.observacionContactoNeumonia(2);
    }//GEN-LAST:event_radio_contactoneumoniansncMouseClicked

    private void radio_gripesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripesiMouseClicked
        controlador.observacionGripe(1);
    }//GEN-LAST:event_radio_gripesiMouseClicked

    private void radio_gripenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripenoMouseClicked
        controlador.observacionGripe(0);
    }//GEN-LAST:event_radio_gripenoMouseClicked

    private void radio_gripensncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_gripensncMouseClicked
        controlador.observacionGripe(2);
    }//GEN-LAST:event_radio_gripensncMouseClicked

    private void radio_viajeasiasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_viajeasiasiMouseClicked
        controlador.observacionViajeAsia(1);
    }//GEN-LAST:event_radio_viajeasiasiMouseClicked

    private void radio_viajeasianoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_viajeasianoMouseClicked
        controlador.observacionViajeAsia(0);
    }//GEN-LAST:event_radio_viajeasianoMouseClicked

    private void radio_viajeasiansncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_viajeasiansncMouseClicked
        controlador.observacionViajeAsia(2);
    }//GEN-LAST:event_radio_viajeasiansncMouseClicked

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

    private void radio_trombosissi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi1MouseClicked

    private void radio_trombosissi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi1ActionPerformed

    private void radio_trombosisno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno1MouseClicked

    private void radio_trombosisnsnc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc1MouseClicked

    private void radio_trombosissi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi2MouseClicked

    private void radio_trombosissi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi2ActionPerformed

    private void radio_trombosisno2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno2MouseClicked

    private void radio_trombosisnsnc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc2MouseClicked

    private void radio_trombosissi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi3MouseClicked

    private void radio_trombosissi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi3ActionPerformed

    private void radio_trombosisno3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno3MouseClicked

    private void radio_trombosisnsnc3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc3MouseClicked

    private void radio_trombosissi4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi4MouseClicked

    private void radio_trombosissi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi4ActionPerformed

    private void radio_trombosisno4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno4MouseClicked

    private void radio_trombosisnsnc4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc4MouseClicked

    private void radio_trombosissi5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi5MouseClicked

    private void radio_trombosissi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi5ActionPerformed

    private void radio_trombosisno5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno5MouseClicked

    private void radio_trombosisnsnc5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc5MouseClicked

    private void radio_trombosissi6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi6MouseClicked

    private void radio_trombosissi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi6ActionPerformed

    private void radio_trombosisno6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno6MouseClicked

    private void radio_trombosisnsnc6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc6MouseClicked

    private void radio_trombosissi7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi7MouseClicked

    private void radio_trombosissi7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi7ActionPerformed

    private void radio_trombosisno7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno7MouseClicked

    private void radio_trombosisnsnc7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc7MouseClicked

    private void radio_trombosissi8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosissi8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi8MouseClicked

    private void radio_trombosissi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trombosissi8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosissi8ActionPerformed

    private void radio_trombosisno8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisno8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisno8MouseClicked

    private void radio_trombosisnsnc8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_trombosisnsnc8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_trombosisnsnc8MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_antecedentesasma;
    private javax.swing.JLabel label_antecedentescancer;
    private javax.swing.JLabel label_antecedentesepoc;
    private javax.swing.JLabel label_broncoespasmo;
    private javax.swing.JLabel label_cianosis;
    private javax.swing.JLabel label_contactoneumonia;
    private javax.swing.JLabel label_contactotuberculosis;
    private javax.swing.JLabel label_contaminantesquimicos;
    private javax.swing.JLabel label_disnea;
    private javax.swing.JLabel label_dolortoracico;
    private javax.swing.JLabel label_embarazo;
    private javax.swing.JLabel label_exposicionalergenos;
    private javax.swing.JLabel label_faltaapetito;
    private javax.swing.JLabel label_fiebre;
    private javax.swing.JLabel label_fumador;
    private javax.swing.JLabel label_gripe;
    private javax.swing.JLabel label_insuficienciarenal;
    private javax.swing.JLabel label_obesidad;
    private javax.swing.JLabel label_oxigenosangre;
    private javax.swing.JLabel label_perdidapeso;
    private javax.swing.JLabel label_redcargada;
    private javax.swing.JLabel label_sudoraciones;
    private javax.swing.JLabel label_taquicardia;
    private javax.swing.JLabel label_tosesputo;
    private javax.swing.JLabel label_tossangre;
    private javax.swing.JLabel label_tosseca;
    private javax.swing.JLabel label_trombosis;
    private javax.swing.JLabel label_viajeasia;
    private javax.swing.JRadioButton radio_antecedentesasmano;
    private javax.swing.JRadioButton radio_antecedentesasmansnc;
    private javax.swing.JRadioButton radio_antecedentesasmasi;
    private javax.swing.JRadioButton radio_antecedentescancerno;
    private javax.swing.JRadioButton radio_antecedentescancernsnc;
    private javax.swing.JRadioButton radio_antecedentescancersi;
    private javax.swing.JRadioButton radio_antecedentesepocno;
    private javax.swing.JRadioButton radio_antecedentesepocnsnc;
    private javax.swing.JRadioButton radio_antecedentesepocsi;
    private javax.swing.JRadioButton radio_broncoespasmono;
    private javax.swing.JRadioButton radio_broncoespasmonsnc;
    private javax.swing.JRadioButton radio_broncoespasmosi;
    private javax.swing.JRadioButton radio_cianosisno;
    private javax.swing.JRadioButton radio_cianosisnsnc;
    private javax.swing.JRadioButton radio_cianosissi;
    private javax.swing.JRadioButton radio_contactoneumoniano;
    private javax.swing.JRadioButton radio_contactoneumoniansnc;
    private javax.swing.JRadioButton radio_contactoneumoniasi;
    private javax.swing.JRadioButton radio_contactotuberculosisno;
    private javax.swing.JRadioButton radio_contactotuberculosisnsnc;
    private javax.swing.JRadioButton radio_contactotuberculosissi;
    private javax.swing.JRadioButton radio_contaminantesquimicosno;
    private javax.swing.JRadioButton radio_contaminantesquimicosnsnc;
    private javax.swing.JRadioButton radio_contaminantesquimicossi;
    private javax.swing.JRadioButton radio_disneano;
    private javax.swing.JRadioButton radio_disneansnc;
    private javax.swing.JRadioButton radio_disneasi;
    private javax.swing.JRadioButton radio_dolortoracicono;
    private javax.swing.JRadioButton radio_dolortoraciconsnc;
    private javax.swing.JRadioButton radio_dolortoracicosi;
    private javax.swing.JRadioButton radio_embarazono;
    private javax.swing.JRadioButton radio_embarazonsnc;
    private javax.swing.JRadioButton radio_embarazosi;
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
    private javax.swing.JRadioButton radio_trombosisno1;
    private javax.swing.JRadioButton radio_trombosisno2;
    private javax.swing.JRadioButton radio_trombosisno3;
    private javax.swing.JRadioButton radio_trombosisno4;
    private javax.swing.JRadioButton radio_trombosisno5;
    private javax.swing.JRadioButton radio_trombosisno6;
    private javax.swing.JRadioButton radio_trombosisno7;
    private javax.swing.JRadioButton radio_trombosisno8;
    private javax.swing.JRadioButton radio_trombosisnsnc;
    private javax.swing.JRadioButton radio_trombosisnsnc1;
    private javax.swing.JRadioButton radio_trombosisnsnc2;
    private javax.swing.JRadioButton radio_trombosisnsnc3;
    private javax.swing.JRadioButton radio_trombosisnsnc4;
    private javax.swing.JRadioButton radio_trombosisnsnc5;
    private javax.swing.JRadioButton radio_trombosisnsnc6;
    private javax.swing.JRadioButton radio_trombosisnsnc7;
    private javax.swing.JRadioButton radio_trombosisnsnc8;
    private javax.swing.JRadioButton radio_trombosissi;
    private javax.swing.JRadioButton radio_trombosissi1;
    private javax.swing.JRadioButton radio_trombosissi2;
    private javax.swing.JRadioButton radio_trombosissi3;
    private javax.swing.JRadioButton radio_trombosissi4;
    private javax.swing.JRadioButton radio_trombosissi5;
    private javax.swing.JRadioButton radio_trombosissi6;
    private javax.swing.JRadioButton radio_trombosissi7;
    private javax.swing.JRadioButton radio_trombosissi8;
    private javax.swing.JRadioButton radio_viajeasiano;
    private javax.swing.JRadioButton radio_viajeasiansnc;
    private javax.swing.JRadioButton radio_viajeasiasi;
    // End of variables declaration//GEN-END:variables
}
