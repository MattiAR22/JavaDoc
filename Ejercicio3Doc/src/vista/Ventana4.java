/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author matti
 */
public class Ventana4 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana4
     */
    public Ventana4() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/vista/logo.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mCerrar = new javax.swing.JMenuItem();
        mVolver = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        slValorSuperior = new javax.swing.JSlider();
        slValorInferior = new javax.swing.JSlider();
        bCrea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();
        slNumEnters = new javax.swing.JSlider();
        bCerrar = new javax.swing.JButton();

        mCerrar.setText("Cerrar");
        mCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mCerrar);

        mVolver.setText("Volver");
        mVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVolverActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mVolver);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setComponentPopupMenu(jPopupMenu1);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        slValorSuperior.setMajorTickSpacing(10);
        slValorSuperior.setMinimum(-100);
        slValorSuperior.setPaintLabels(true);
        slValorSuperior.setPaintTicks(true);
        slValorSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor superior: 50", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        slValorSuperior.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slValorSuperiorStateChanged(evt);
            }
        });

        slValorInferior.setMajorTickSpacing(10);
        slValorInferior.setMinimum(-100);
        slValorInferior.setPaintLabels(true);
        slValorInferior.setPaintTicks(true);
        slValorInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor inferior: 50", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        slValorInferior.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slValorInferiorStateChanged(evt);
            }
        });

        bCrea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCrea.setText("Crea 0 enters");
        bCrea.setBorderPainted(false);
        bCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreaActionPerformed(evt);
            }
        });

        taPantalla.setEditable(false);
        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        slNumEnters.setMajorTickSpacing(10);
        slNumEnters.setPaintLabels(true);
        slNumEnters.setPaintTicks(true);
        slNumEnters.setValue(0);
        slNumEnters.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre d'enters a crear", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        slNumEnters.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slNumEntersStateChanged(evt);
            }
        });

        bCerrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slNumEnters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slValorSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slValorInferior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCrea, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                            .addComponent(bCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slNumEnters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(slValorInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(slValorSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bCrea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo que recoge el valor dado por el slider
 * @param evt 
 */
    private void slValorSuperiorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slValorSuperiorStateChanged

        slValorSuperior.setBorder(
            javax.swing.BorderFactory.createTitledBorder(
                null,
                "Valor superior: " + slValorSuperior.getValue(),
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 14)));

    }//GEN-LAST:event_slValorSuperiorStateChanged
/**
 * Metodo que recoge el valor dado por el slider
 * @param evt 
 */
    private void slValorInferiorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slValorInferiorStateChanged

        slValorInferior.setBorder(
            javax.swing.BorderFactory.createTitledBorder(
                null,
                "Valor inferior: " + slValorInferior.getValue(),
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 0, 14)));

    }//GEN-LAST:event_slValorInferiorStateChanged
/**
 * Metodo que crea la matriz y la muestra en cuanto pulsa el boton
 * @param evt 
 */
    private void bCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreaActionPerformed

        int nEnters = slNumEnters.getValue();
        int valorInf = slValorInferior.getValue();
        int valorSup = slValorSuperior.getValue();
        if (valorInf > valorSup) {
            slValorInferior.setValue(valorSup);
            slValorSuperior.setValue(valorInf);
        }
        int[] mat = omplirAmbAleatoris(nEnters,
            slValorInferior.getValue(),
            slValorSuperior.getValue());
        mostra(mat);
        mostraMaxMin(mat);
    }//GEN-LAST:event_bCreaActionPerformed
/**
 * Metodo que cambia el texto del boton según la posicion del slider
 * @param evt 
 */
    private void slNumEntersStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slNumEntersStateChanged

        bCrea.setText("Crea " + slNumEnters.getValue() + " enters");
    }//GEN-LAST:event_slNumEntersStateChanged
/**
 * Metodo que cuando pulsas el boton cerrar te muestra un mensaje diciendo que uses el menu
 * @param evt 
 */
    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Utiliza el popup menu");
    }//GEN-LAST:event_bCerrarActionPerformed
/**
 * Metodo que cierra la ventana mediante la opcion del popup menu
 * @param evt 
 */
    private void mCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_mCerrarActionPerformed
/**
 * Metodo que ejecuta la ventana vinculada a la opcion del popup menu
 * @param evt 
 */
    private void mVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVolverActionPerformed
        // TODO add your handling code here:
        FPrincipal newframe = new FPrincipal();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bCrea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mCerrar;
    private javax.swing.JMenuItem mVolver;
    private javax.swing.JSlider slNumEnters;
    private javax.swing.JSlider slValorInferior;
    private javax.swing.JSlider slValorSuperior;
    private javax.swing.JTextArea taPantalla;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que llena una matriz con numeros aleatorios
     * @param nElements es el numero de elementos introducidos por el slider
     * @param inf es el valor minimo que pueden tener los numeros generados aleatoriamente
     * @param supes el valor maximo que pueden tener los numeros generados aleatoriamente
     * @return Devuelve la matriz llena de valores aleatorios
     */
    private int[] omplirAmbAleatoris(int nElements, int inf, int sup) {
        if (inf > sup) {
            omplirAmbAleatoris(nElements, sup, inf);
        }
        int[] mat = new int[nElements];
        for (int i = 0; i < mat.length; i++) {
            mat[i] = inf + (int) (Math.random() * (sup - inf + 1));
        }
        return mat;
    }

    private void mostra(int[] mat) {
        taPantalla.setText("");
        for (int i = 0; i < mat.length; i++) {
            taPantalla.append(mat[i] + ((i + 1) % 10 == 0 ? "\n" : ", "));
        }
        taPantalla.append("\n");
    }

    /**
     * Metodos que muestra por pantalla la matriz rellenada en el metodo anterior
     * @param mat recibe mat que es la matriz creada en el anterior metodo
     */
    private void mostraMaxMin(int[] mat) {
        if (mat.length == 0) {
            taPantalla.append("La matriu està buida\n");
        } else {
            int iMax = 0;
            int iMin = 0;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i] > mat[iMax]) {
                    iMax = i;
                }
                if (mat[i] < mat[iMin]) {
                    iMin = i;
                }
            }
            taPantalla.append("El menor és " + mat[iMin] + " i està en l'índex " + iMin + "\n");
            taPantalla.append("El major és " + mat[iMax] + " i està en l'índex " + iMax + "\n");
        }
    }
}
