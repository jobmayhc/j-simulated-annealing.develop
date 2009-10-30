/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfiguracionUI.java
 *
 * Created on 28/10/2009, 03:38:11 PM
 */
package simulacion.interfaz;

import java.awt.event.FocusEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import problema.viajero.vecindad.AleatorioDoble;
import problema.viajero.vecindad.AleatorioSimple;
import problema.viajero.vecindad.ArcoAleatorio;
import simulacion.Configuracion;
import simulacion.simulatedAnnealing.SimulatedAnnealing;

/**
 *
 * @author jhon.arevalo
 */
public class ConfiguracionUI extends javax.swing.JPanel {

    /** Creates new form ConfiguracionUI */
    public ConfiguracionUI() {
        initComponents();
    }

    public ConfiguracionUI(Configuracion configuracion) {
        initComponents();
        this.configuracion = configuracion;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        grupoEsquemaReduccion = new javax.swing.ButtonGroup();
        grupoVecindadViajero = new javax.swing.ButtonGroup();
        configuracion = new simulacion.Configuracion();
        panelSolapas = new javax.swing.JTabbedPane();
        panelGeneral = new javax.swing.JPanel();
        labelTemperaturaInicial = new javax.swing.JLabel();
        textTemperaturaInicial = new javax.swing.JTextField();
        labelIteracionesMismaTemperatura = new javax.swing.JLabel();
        textIteracionesMismaTemperatura = new javax.swing.JTextField();
        labelDiferenteTemperatura = new javax.swing.JLabel();
        textDiferenteTemperatura = new javax.swing.JTextField();
        labelAlfa = new javax.swing.JLabel();
        textAlfa = new javax.swing.JTextField();
        labelBeta = new javax.swing.JLabel();
        textBeta = new javax.swing.JTextField();
        labelEsquemaReduccion = new javax.swing.JLabel();
        radioReduccionPorIteracion = new javax.swing.JRadioButton();
        radioReduccionPorFactor = new javax.swing.JRadioButton();
        radioReduccionPorCociente = new javax.swing.JRadioButton();
        panelMochila = new javax.swing.JPanel();
        labelCapacidadMochila = new javax.swing.JLabel();
        textCapacidadMochila = new javax.swing.JTextField();
        labelEsquemaVecindadMochila = new javax.swing.JLabel();
        radioEsquemaVecindadMochila = new javax.swing.JRadioButton();
        panelViajero = new javax.swing.JPanel();
        labelEsquemaVecindadViajero = new javax.swing.JLabel();
        radioAleatorioSimple = new javax.swing.JRadioButton();
        radioAleatorioDoble = new javax.swing.JRadioButton();
        radioArcoAleatorio = new javax.swing.JRadioButton();
        botonCerrar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelGeneral.setLayout(new java.awt.GridBagLayout());

        labelTemperaturaInicial.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelTemperaturaInicial.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelTemperaturaInicial, gridBagConstraints);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, configuracion, org.jdesktop.beansbinding.ELProperty.create("${temperaturaInicial}"), textTemperaturaInicial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textTemperaturaInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textTemperaturaInicialFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(textTemperaturaInicial, gridBagConstraints);

        labelIteracionesMismaTemperatura.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelIteracionesMismaTemperatura.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelIteracionesMismaTemperatura, gridBagConstraints);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, configuracion, org.jdesktop.beansbinding.ELProperty.create("${iteracionesMismaTemperatura}"), textIteracionesMismaTemperatura, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textIteracionesMismaTemperatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textIteracionesMismaTemperaturaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(textIteracionesMismaTemperatura, gridBagConstraints);

        labelDiferenteTemperatura.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelDiferenteTemperatura.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelDiferenteTemperatura, gridBagConstraints);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, configuracion, org.jdesktop.beansbinding.ELProperty.create("${iteracionesDiferenteTemperatura}"), textDiferenteTemperatura, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textDiferenteTemperatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textDiferenteTemperaturaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(textDiferenteTemperatura, gridBagConstraints);

        labelAlfa.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelAlfa.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelAlfa, gridBagConstraints);

        textAlfa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textAlfaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(textAlfa, gridBagConstraints);

        labelBeta.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelBeta.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelBeta, gridBagConstraints);

        textBeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textBetaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(textBeta, gridBagConstraints);

        labelEsquemaReduccion.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelEsquemaReduccion.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(labelEsquemaReduccion, gridBagConstraints);

        grupoEsquemaReduccion.add(radioReduccionPorIteracion);
        radioReduccionPorIteracion.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioReduccionPorIteracion.text")); // NOI18N
        radioReduccionPorIteracion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioReduccionPorIteracionStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(radioReduccionPorIteracion, gridBagConstraints);

        grupoEsquemaReduccion.add(radioReduccionPorFactor);
        radioReduccionPorFactor.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioReduccionPorFactor.text")); // NOI18N
        radioReduccionPorFactor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioReduccionPorFactorStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(radioReduccionPorFactor, gridBagConstraints);

        grupoEsquemaReduccion.add(radioReduccionPorCociente);
        radioReduccionPorCociente.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioReduccionPorCociente.text")); // NOI18N
        radioReduccionPorCociente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioReduccionPorCocienteStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelGeneral.add(radioReduccionPorCociente, gridBagConstraints);

        panelSolapas.addTab(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.panelGeneral.TabConstraints.tabTitle"), panelGeneral); // NOI18N

        panelMochila.setLayout(new java.awt.GridBagLayout());

        labelCapacidadMochila.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelCapacidadMochila.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelMochila.add(labelCapacidadMochila, gridBagConstraints);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, configuracion, org.jdesktop.beansbinding.ELProperty.create("${capacidadMochila}"), textCapacidadMochila, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textCapacidadMochila.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textCapacidadMochilaFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelMochila.add(textCapacidadMochila, gridBagConstraints);

        labelEsquemaVecindadMochila.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelEsquemaVecindadMochila.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelMochila.add(labelEsquemaVecindadMochila, gridBagConstraints);

        radioEsquemaVecindadMochila.setSelected(true);
        radioEsquemaVecindadMochila.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioEsquemaVecindadMochila.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelMochila.add(radioEsquemaVecindadMochila, gridBagConstraints);

        panelSolapas.addTab(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.panelMochila.TabConstraints.tabTitle"), panelMochila); // NOI18N

        panelViajero.setLayout(new java.awt.GridBagLayout());

        labelEsquemaVecindadViajero.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.labelEsquemaVecindadViajero.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelViajero.add(labelEsquemaVecindadViajero, gridBagConstraints);

        grupoVecindadViajero.add(radioAleatorioSimple);
        radioAleatorioSimple.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioAleatorioSimple.text")); // NOI18N
        radioAleatorioSimple.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioAleatorioSimpleStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelViajero.add(radioAleatorioSimple, gridBagConstraints);

        grupoVecindadViajero.add(radioAleatorioDoble);
        radioAleatorioDoble.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioAleatorioDoble.text")); // NOI18N
        radioAleatorioDoble.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioAleatorioDobleStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelViajero.add(radioAleatorioDoble, gridBagConstraints);

        grupoVecindadViajero.add(radioArcoAleatorio);
        radioArcoAleatorio.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.radioArcoAleatorio.text")); // NOI18N
        radioArcoAleatorio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioArcoAleatorioStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelViajero.add(radioArcoAleatorio, gridBagConstraints);

        panelSolapas.addTab(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.panelViajero.TabConstraints.tabTitle"), panelViajero); // NOI18N

        add(panelSolapas, java.awt.BorderLayout.CENTER);

        botonCerrar.setText(org.openide.util.NbBundle.getMessage(ConfiguracionUI.class, "ConfiguracionUI.botonCerrar.text")); // NOI18N
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        add(botonCerrar, java.awt.BorderLayout.PAGE_END);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void radioReduccionPorCocienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioReduccionPorCocienteStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setEsquemaReduccion(SimulatedAnnealing.REDUCCION_POR_ITERACION);
        }
    }//GEN-LAST:event_radioReduccionPorCocienteStateChanged

    private void radioReduccionPorFactorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioReduccionPorFactorStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setEsquemaReduccion(SimulatedAnnealing.REDUCCION_POR_FACTOR);
        }
    }//GEN-LAST:event_radioReduccionPorFactorStateChanged

    private void radioReduccionPorIteracionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioReduccionPorIteracionStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setEsquemaReduccion(SimulatedAnnealing.REDUCCION_POR_COCIENTE);
        }
    }//GEN-LAST:event_radioReduccionPorIteracionStateChanged

    private void radioAleatorioSimpleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioAleatorioSimpleStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setVecindadViajero(AleatorioSimple.class);
        }
    }//GEN-LAST:event_radioAleatorioSimpleStateChanged

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void radioAleatorioDobleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioAleatorioDobleStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setVecindadViajero(AleatorioDoble.class);
        }
    }//GEN-LAST:event_radioAleatorioDobleStateChanged

    private void radioArcoAleatorioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioArcoAleatorioStateChanged
        if (((JRadioButton) evt.getSource()).isSelected()) {
            configuracion.setVecindadViajero(ArcoAleatorio.class);
        }
    }//GEN-LAST:event_radioArcoAleatorioStateChanged

    private void textTemperaturaInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textTemperaturaInicialFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textTemperaturaInicialFocusGained

    private void textIteracionesMismaTemperaturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textIteracionesMismaTemperaturaFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textIteracionesMismaTemperaturaFocusGained

    private void textDiferenteTemperaturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textDiferenteTemperaturaFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textDiferenteTemperaturaFocusGained

    private void textAlfaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textAlfaFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textAlfaFocusGained

    private void textBetaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textBetaFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textBetaFocusGained

    private void textCapacidadMochilaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textCapacidadMochilaFocusGained
        seleccionarTextoEnFoco(evt);
    }//GEN-LAST:event_textCapacidadMochilaFocusGained

    private void seleccionarTextoEnFoco(FocusEvent evt) {
        JTextField cajaTexto = ((JTextField) evt.getSource());
        cajaTexto.setSelectionStart(0);
        cajaTexto.setSelectionEnd(cajaTexto.getText().length());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private simulacion.Configuracion configuracion;
    private javax.swing.ButtonGroup grupoEsquemaReduccion;
    private javax.swing.ButtonGroup grupoVecindadViajero;
    private javax.swing.JLabel labelAlfa;
    private javax.swing.JLabel labelBeta;
    private javax.swing.JLabel labelCapacidadMochila;
    private javax.swing.JLabel labelDiferenteTemperatura;
    private javax.swing.JLabel labelEsquemaReduccion;
    private javax.swing.JLabel labelEsquemaVecindadMochila;
    private javax.swing.JLabel labelEsquemaVecindadViajero;
    private javax.swing.JLabel labelIteracionesMismaTemperatura;
    private javax.swing.JLabel labelTemperaturaInicial;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMochila;
    private javax.swing.JTabbedPane panelSolapas;
    private javax.swing.JPanel panelViajero;
    private javax.swing.JRadioButton radioAleatorioDoble;
    private javax.swing.JRadioButton radioAleatorioSimple;
    private javax.swing.JRadioButton radioArcoAleatorio;
    private javax.swing.JRadioButton radioEsquemaVecindadMochila;
    private javax.swing.JRadioButton radioReduccionPorCociente;
    private javax.swing.JRadioButton radioReduccionPorFactor;
    private javax.swing.JRadioButton radioReduccionPorIteracion;
    private javax.swing.JTextField textAlfa;
    private javax.swing.JTextField textBeta;
    private javax.swing.JTextField textCapacidadMochila;
    private javax.swing.JTextField textDiferenteTemperatura;
    private javax.swing.JTextField textIteracionesMismaTemperatura;
    private javax.swing.JTextField textTemperaturaInicial;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    public Configuracion getConfiguracion() {
        return configuracion;
    }
}
