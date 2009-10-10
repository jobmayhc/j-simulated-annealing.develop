/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 16/09/2009, 12:22:59 PM
 */
package simulacion.interfaz;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import problema.mochila.EsquemaMochila;
import problema.mochila.HandlerMochila;
import problema.mochila.Objeto;
import problema.viajero.HandlerViajero;
import problema.viajero.EsquemaViajero;
import problema.viajero.Punto;
import simulacion.interfaz.viajero.TSPFilter;

/**
 *
 * @author jhon.arevalo
 */
public class Main extends javax.swing.JFrame {

    /** Creates new form Main */
    private File archivo;
    private EsquemaViajero viajero;
    private EsquemaMochila mochila;
    private DefaultTableModel mochilaTableModel;
    private DefaultTableModel viajeroTableModel;

    public Main() {
        iniciarMochila();
        viajeroTableModel = new DefaultTableModel();
        initComponents();
    }

    public void iniciarMochila() {
        mochilaTableModel = new DefaultTableModel();
        mochilaTableModel.addColumn("Nombre");
        mochilaTableModel.addColumn("Costo");
        mochilaTableModel.addColumn("Valor");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCapacidadMochila = new javax.swing.JTextField();
        scrollTableMochila = new javax.swing.JScrollPane();
        tablaMochila = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        scrollTablaViajero = new javax.swing.JScrollPane();
        tablaViajero = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAbrirViajero = new javax.swing.JMenuItem();
        menuAbrirMochila = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmos de Simulacion");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mochila"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Capacidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        textCapacidadMochila.setPreferredSize(new java.awt.Dimension(80, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(textCapacidadMochila, gridBagConstraints);

        tablaMochila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTableMochila.setViewportView(tablaMochila);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(scrollTableMochila, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Agente Viajero"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        tablaViajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaViajero.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaViajero.getTableHeader().setReorderingAllowed(false);
        scrollTablaViajero.setViewportView(tablaViajero);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(scrollTablaViajero, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jPanel2, gridBagConstraints);

        jMenu1.setText("Archivo");

        menuAbrirViajero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrirViajero.setText("Abrir Viajero...");
        menuAbrirViajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirViajeroActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrirViajero);

        menuAbrirMochila.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrirMochila.setText("Abrir Mochila...");
        menuAbrirMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirMochilaActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrirMochila);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirViajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirViajeroActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        DecimalFormat formateo = new DecimalFormat("#.##");
        fileChooser.addChoosableFileFilter(new TSPFilter());
        Vector<Object> fila;
        fileChooser.showOpenDialog(this);
        if ((archivo = fileChooser.getSelectedFile()) == null) {
            return;
        }
        try {
            viajero = HandlerViajero.cargar(archivo);
            viajeroTableModel = new DefaultTableModel();

            viajeroTableModel.addColumn("\\");
            for (Punto punto : viajero.getPuntos()) {
                viajeroTableModel.addColumn(punto.getNombre());
            }

            for (Punto origen : viajero.getPuntos()) {
                fila = new Vector<Object>();
                fila.add(origen);
                for (Punto destino : viajero.getPuntos()) {
                    fila.add(formateo.format(
                            viajero.getCosto(origen, destino)));
                }
                viajeroTableModel.addRow(fila);
            }
            tablaViajero.setModel(viajeroTableModel);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo:" + ex.getMessage(),
                    "Error en carga",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuAbrirViajeroActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuAbrirMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirMochilaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);
        if ((archivo = fileChooser.getSelectedFile()) == null) {
            return;
        }
        try {
            mochila = HandlerMochila.cargar(archivo);
            iniciarMochila();
            Vector<Object> fila;
            for (Objeto objeto : mochila.getObjetos()) {
                fila = new Vector<Object>();
                fila.add(objeto.getNombre());
                fila.add(objeto.getCosto());
                fila.add(objeto.getValor());
                textCapacidadMochila.setText(String.valueOf(mochila.getCapacidad()));
                mochilaTableModel.addRow(fila);
                tablaMochila.setModel(mochilaTableModel);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo:" + ex.getMessage(),
                    "Error en carga",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_menuAbrirMochilaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exc) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuAbrirMochila;
    private javax.swing.JMenuItem menuAbrirViajero;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JScrollPane scrollTablaViajero;
    private javax.swing.JScrollPane scrollTableMochila;
    private javax.swing.JTable tablaMochila;
    private javax.swing.JTable tablaViajero;
    private javax.swing.JTextField textCapacidadMochila;
    // End of variables declaration//GEN-END:variables
}
