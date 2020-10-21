/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronted;

import Backend.Ficha;
import Backend.Hanoi;
import Backend.Torre;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author goldtux
 */
public class JuegoMain extends javax.swing.JFrame {

    private Torre torre1 = new Torre("Torre1");
    private Torre torre2 = new Torre("Torre2");
    private Torre torre3 = new Torre("Torre3");
    private int MovimientosMaximos;
    private int movimientos;
    String valor;

    public JuegoMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        DeshabilitarBotones();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        aceptarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        torre1Table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        torre2Table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        torre3Table = new javax.swing.JTable();
        moverTorre1Torre2Button = new javax.swing.JButton();
        moverTorre1Torre3Button = new javax.swing.JButton();
        moverTorre2Torre1Button = new javax.swing.JButton();
        moverTorre2Torre3Button = new javax.swing.JButton();
        moverTorre3Torre1Button = new javax.swing.JButton();
        moverTorre3Torre2Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        TextoMovimiento = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        TextoMinimos = new javax.swing.JTextField();
        BotonResolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torres de Hanoi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione la cantidad de fichas que desea:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8" }));

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        torre1Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre1"
            }
        ));
        torre1Table.setEnabled(false);
        jScrollPane1.setViewportView(torre1Table);

        torre2Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre2"
            }
        ));
        torre2Table.setEnabled(false);
        jScrollPane2.setViewportView(torre2Table);

        torre3Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre3"
            }
        ));
        torre3Table.setEnabled(false);
        jScrollPane3.setViewportView(torre3Table);

        moverTorre1Torre2Button.setText("Mover a Torre2");
        moverTorre1Torre2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre1Torre2ButtonActionPerformed(evt);
            }
        });

        moverTorre1Torre3Button.setText("Mover a Torre3");
        moverTorre1Torre3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre1Torre3ButtonActionPerformed(evt);
            }
        });

        moverTorre2Torre1Button.setText("Mover a Torre1");
        moverTorre2Torre1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre2Torre1ButtonActionPerformed(evt);
            }
        });

        moverTorre2Torre3Button.setText("Mover a Torre3");
        moverTorre2Torre3Button.setActionCommand("Mover a Torre1");
        moverTorre2Torre3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre2Torre3ButtonActionPerformed(evt);
            }
        });

        moverTorre3Torre1Button.setText("Mover a Torre1");
        moverTorre3Torre1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre3Torre1ButtonActionPerformed(evt);
            }
        });

        moverTorre3Torre2Button.setText("Mover a Torre2");
        moverTorre3Torre2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverTorre3Torre2ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("■");

        jLabel3.setText("■");

        jLabel4.setText("■");

        jLabel5.setText("■");

        jLabel6.setText("■");

        jLabel7.setText("■");

        jTextField1.setEditable(false);
        jTextField1.setText("Movimientos realizados: ");

        TextoMovimiento.setEditable(false);

        jTextField2.setEditable(false);
        jTextField2.setText("Movimientos minimos: ");

        TextoMinimos.setEditable(false);

        BotonResolver.setText("Resolver");
        BotonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoMinimos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(BotonResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(aceptarButton)))
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moverTorre1Torre3Button)
                    .addComponent(moverTorre1Torre2Button))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(moverTorre2Torre3Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(moverTorre2Torre1Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moverTorre3Torre1Button)
                    .addComponent(moverTorre3Torre2Button))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre2Torre1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre3Torre1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre1Torre2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre1Torre3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre2Torre3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(moverTorre3Torre2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoMinimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(BotonResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        torre1.Limpiar();
        torre2.Limpiar();
        torre3.Limpiar();
        movimientos = 0;
        valor = (String) jComboBox1.getSelectedItem();
        MovimientosMaximos = (int) Math.pow(2, Integer.parseInt(valor));
        MovimientosMaximos--;
        JOptionPane.showMessageDialog(null, "El maximo numero de movimientos que debes realizar es de: " + MovimientosMaximos);
        TextoMinimos.setText(String.valueOf(MovimientosMaximos));
        TextoMovimiento.setText(String.valueOf(movimientos));
        comenzarJuego(Integer.parseInt(valor));
        HabilitarBotones();
        actualizarTablas(valor);
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void moverTorre1Torre2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre1Torre2ButtonActionPerformed
        moverFicha(torre1, torre2);
        
    }//GEN-LAST:event_moverTorre1Torre2ButtonActionPerformed

    public void comenzarJuego(int valor) {
        String nombre = "#";
        for (int i = 1; i <= valor; i++) {
            Ficha ficha = new Ficha(nombre, i);
            torre1.Insertar(ficha);
            nombre = nombre + "#";
        }

    }
    private void moverTorre1Torre3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre1Torre3ButtonActionPerformed
        moverFicha(torre1, torre3);
    }//GEN-LAST:event_moverTorre1Torre3ButtonActionPerformed

    private void moverTorre2Torre1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre2Torre1ButtonActionPerformed
        moverFicha(torre2, torre1);
    }//GEN-LAST:event_moverTorre2Torre1ButtonActionPerformed

    private void moverTorre2Torre3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre2Torre3ButtonActionPerformed
        moverFicha(torre2, torre3);
    }//GEN-LAST:event_moverTorre2Torre3ButtonActionPerformed

    private void moverTorre3Torre1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre3Torre1ButtonActionPerformed
       moverFicha(torre3, torre1);
    }//GEN-LAST:event_moverTorre3Torre1ButtonActionPerformed

    private void moverTorre3Torre2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverTorre3Torre2ButtonActionPerformed
        moverFicha(torre3, torre2);
    }//GEN-LAST:event_moverTorre3Torre2ButtonActionPerformed

    private void BotonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResolverActionPerformed
        int numero = Integer.parseInt(valor);
        Hanoi hanoi = new Hanoi();
        hanoi.resolver(numero, 1, 2, 3);
        Solucion solucion = new Solucion(hanoi.getMensaje());
        solucion.Ejecutar();
    }//GEN-LAST:event_BotonResolverActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoMain().setVisible(true);
            }
        });
    }

    public boolean Comprobacion(Ficha ficha1, Ficha ficha2) {
        if (ficha1.getID() > ficha2.getID()) {
            return false;
        } else {
            return true;
        }

    }

    public void moverFicha(Torre torreActual, Torre torreObjetivo) {
        LinkedList<Ficha> listaTorre1 = torreActual.getFichas();
        LinkedList<Ficha> listaTorre2 = torreObjetivo.getFichas();
        if (listaTorre1.size() != 0) {
            if (listaTorre2.size() != 0) {
                Ficha ficha1 = torreActual.VerFicha();
                Ficha ficha2 = torreObjetivo.VerFicha();
                if (Comprobacion(ficha1, ficha2) == true) {
                    Ficha ficha = torreActual.ObtenerFicha();
                    torreObjetivo.InsertarPrimero(ficha);
                    actualizarTablas(valor);
                    movimientos++;
                    TextoMovimiento.setText(String.valueOf(movimientos));
                    ComprobarMovimietos();
                }
            } else {
                Ficha ficha = torreActual.ObtenerFicha();
                torreObjetivo.InsertarPrimero(ficha);
                actualizarTablas(valor);
                movimientos++;
                TextoMovimiento.setText(String.valueOf(movimientos));
                ComprobarMovimietos();
            }
        }
        LinkedList<Ficha> lista3 = torre3.getFichas();
        if (lista3.size() == Integer.parseInt(valor)){
            Ganar();
        }
    }

    public void Ganar(){
        JOptionPane.showMessageDialog(null, "¡Felicidades, completaste el juego!");
        DeshabilitarBotones();
    }
    public void DeshabilitarBotones() {
        moverTorre1Torre2Button.setEnabled(false);
        moverTorre1Torre3Button.setEnabled(false);
        moverTorre2Torre1Button.setEnabled(false);
        moverTorre2Torre3Button.setEnabled(false);
        moverTorre3Torre1Button.setEnabled(false);
        moverTorre3Torre2Button.setEnabled(false);
        BotonResolver.setEnabled(false);
    }

    public void HabilitarBotones() {
        moverTorre1Torre2Button.setEnabled(true);
        moverTorre1Torre3Button.setEnabled(true);
        moverTorre2Torre1Button.setEnabled(true);
        moverTorre2Torre3Button.setEnabled(true);
        moverTorre3Torre1Button.setEnabled(true);
        moverTorre3Torre2Button.setEnabled(true);
        BotonResolver.setEnabled(true);
    }

    public void ComprobarMovimietos() {
        if (movimientos > MovimientosMaximos) {
            JOptionPane.showMessageDialog(null, "Haz superado los movimientos minimos, haz perdido");
            DeshabilitarBotones();
        }
    }

    public void actualizarTablas(String valor) {
        LinkedList<Ficha> fichas1 = torre1.getFichas();
        LinkedList<Ficha> fichas2 = torre2.getFichas();
        LinkedList<Ficha> fichas3 = torre3.getFichas();
        int num = Integer.parseInt(valor);
        DefaultTableModel ModeloTabla1, ModeloTabla2, ModeloTabla3;

        ModeloTabla1 = (DefaultTableModel) torre1Table.getModel();
        ModeloTabla1.setRowCount(8 - num);
        ModeloTabla2 = (DefaultTableModel) torre2Table.getModel();
        ModeloTabla2.setRowCount(8 - num);
        ModeloTabla3 = (DefaultTableModel) torre3Table.getModel();
        ModeloTabla3.setRowCount(8 - num);

        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        render1.setHorizontalAlignment(SwingConstants.CENTER);

        torre1Table.getColumnModel().getColumn(0).setCellRenderer(render1);
        torre2Table.getColumnModel().getColumn(0).setCellRenderer(render1);
        torre3Table.getColumnModel().getColumn(0).setCellRenderer(render1);

        Object[] primero = new Object[1];
        for (int i = 0; i < fichas1.size(); i++) {
            Ficha ficha = fichas1.get(i);
            primero[0] = ficha.getNombre();
            ModeloTabla1.addRow(primero);
        }

        Object[] segundo = new Object[1];
        for (int i = 0; i < fichas2.size(); i++) {
            Ficha ficha = fichas2.get(i);
            segundo[0] = ficha.getNombre();
            ModeloTabla2.addRow(segundo);
        }

        Object[] tercero = new Object[1];
        for (int i = 0; i < fichas3.size(); i++) {
            Ficha ficha = fichas3.get(i);
            tercero[0] = ficha.getNombre();
            ModeloTabla3.addRow(tercero);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonResolver;
    private javax.swing.JTextField TextoMinimos;
    private javax.swing.JTextField TextoMovimiento;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton moverTorre1Torre2Button;
    private javax.swing.JButton moverTorre1Torre3Button;
    private javax.swing.JButton moverTorre2Torre1Button;
    private javax.swing.JButton moverTorre2Torre3Button;
    private javax.swing.JButton moverTorre3Torre1Button;
    private javax.swing.JButton moverTorre3Torre2Button;
    private javax.swing.JTable torre1Table;
    private javax.swing.JTable torre2Table;
    private javax.swing.JTable torre3Table;
    // End of variables declaration//GEN-END:variables
}
