/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author matti
 */
public class Ventana2 extends javax.swing.JFrame {
    private int[][] matriz;

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
        initComponents();
        matriz = new int[2][2];
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

        rbOscuro = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPantalla = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        bCrearMatriz2 = new javax.swing.JButton();
        bCrearUnitaria2 = new javax.swing.JButton();
        bCrearSimetrica2 = new javax.swing.JButton();
        bMostrarMatriz2 = new javax.swing.JButton();
        bMostrarMaxMin2 = new javax.swing.JButton();
        bCambiarValor2 = new javax.swing.JButton();
        bTransponer2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbOscuro.setText("Modo Oscuro");
        rbOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOscuroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ventana dos");

        taPantalla.setColumns(20);
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        bCrearMatriz2.setText("Crea matriz");
        bCrearMatriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearMatriz2ActionPerformed(evt);
            }
        });

        bCrearUnitaria2.setText("Crea unitaria");
        bCrearUnitaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearUnitaria2ActionPerformed(evt);
            }
        });

        bCrearSimetrica2.setText("Crea simetrica");
        bCrearSimetrica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearSimetrica2ActionPerformed(evt);
            }
        });

        bMostrarMatriz2.setText("Muestra matriz");
        bMostrarMatriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarMatriz2ActionPerformed(evt);
            }
        });

        bMostrarMaxMin2.setText("Muestra max/min");
        bMostrarMaxMin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarMaxMin2ActionPerformed(evt);
            }
        });

        bCambiarValor2.setText("Cambia valor");
        bCambiarValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCambiarValor2ActionPerformed(evt);
            }
        });

        bTransponer2.setText("Transoponer matriz");
        bTransponer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransponer2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCrearMatriz2)
                    .addComponent(bCrearUnitaria2)
                    .addComponent(bCrearSimetrica2)
                    .addComponent(bMostrarMatriz2)
                    .addComponent(bMostrarMaxMin2)
                    .addComponent(bCambiarValor2)
                    .addComponent(bTransponer2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bCrearMatriz2)
                .addGap(18, 18, 18)
                .addComponent(bCrearUnitaria2)
                .addGap(18, 18, 18)
                .addComponent(bCrearSimetrica2)
                .addGap(18, 18, 18)
                .addComponent(bMostrarMatriz2)
                .addGap(18, 18, 18)
                .addComponent(bMostrarMaxMin2)
                .addGap(18, 18, 18)
                .addComponent(bCambiarValor2)
                .addGap(18, 18, 18)
                .addComponent(bTransponer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(229, 229, 229)
                .addComponent(rbOscuro)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbOscuro)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo que cuando pulsas el radio button cambia el color de la p??gina
 * @param evt 
 */
    private void rbOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOscuroActionPerformed
        // TODO add your handling code here:
        if (rbOscuro.isSelected()) {
            this.getContentPane().setBackground(Color.GRAY);
        }else{
            this.getContentPane().setBackground(Color.WHITE);
        }

    }//GEN-LAST:event_rbOscuroActionPerformed
 /**
 * Metodo que ejecuta la ventana vinculada al boton
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FPrincipal newframe = new FPrincipal();
        newframe.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
/**
 * Metodo que crea una matriz del tama??o dado por escrito en formato "filas/columnas"
 * @param evt 
 */
    private void bCrearMatriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearMatriz2ActionPerformed
        // TODO add your handling code here:
        String filasColumnas = JOptionPane.showInputDialog(this, "Introduce 'filas/columnas'");
        if (filasColumnas != null) {
            String[] datos = filasColumnas.split("/");
            if (datos.length == 2) {
                int filas = Integer.parseInt(datos[0]);
                filas = filas < 2 ? 2 : filas;
                int columnas = Integer.parseInt(datos[1]);
                columnas = columnas < 2 ? 2 : columnas;
                matriz = new int[filas][columnas];
                taPantalla.append("\n Se ha creado una matriz de " + filas + " X " + columnas);
                for (int fila = 0; fila < matriz.length; fila++) {
                    for (int columna = 0; columna < matriz[0].length; columna++) {
                        matriz[fila][columna] = -99 + (int) (Math.random() * 199);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Debes introducir 'filas/columnas'");
            }
        }
    }//GEN-LAST:event_bCrearMatriz2ActionPerformed
/**
 * Metodo que crea una fila unitaria es decir que la matriz es igual a 1
 * @param evt 
 */
    private void bCrearUnitaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearUnitaria2ActionPerformed
        // TODO add your handling code here:
        String tama??o = JOptionPane.showInputDialog(this, "Introduce el tama??o");
        if (tama??o != null) {
            int filas = Integer.parseInt(tama??o);
            filas = filas < 2 ? 2 : filas;
            matriz = new int[filas][filas];
            taPantalla.append("\n Se ha creado una matriz unitaria de " + filas + " X " + filas);
            for (int fila = 0; fila < matriz.length; fila++) {
                matriz[fila][fila] = 1;
            }
        }
    }//GEN-LAST:event_bCrearUnitaria2ActionPerformed
/**
 * Metodo que crea una matriz simetrica
 * @param evt 
 */
    private void bCrearSimetrica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearSimetrica2ActionPerformed
        // TODO add your handling code here:
        String tama??o = JOptionPane.showInputDialog(this, "Introduce el tama??o");
        if (tama??o != null) {
            int filas = Integer.parseInt(tama??o);
            filas = filas < 2 ? 2 : filas;
            matriz = new int[filas][filas];
            taPantalla.append("\n Se ha creado una matriz simetrica de " + filas + " X " + filas);
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = fila; columna < matriz[0].length; columna++) {
                    int numA = -99 + (int) (Math.random() * 199);
                    matriz[fila][columna] = numA;
                    matriz[columna][fila] = numA;
                }

            }
        }
    }//GEN-LAST:event_bCrearSimetrica2ActionPerformed
/**
 * Metodo que pasa los valores de la matriz a un string para mostrarlo en taPantalla
 * @param evt 
 */
    private void bMostrarMatriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarMatriz2ActionPerformed
        // TODO add your handling code here:

        String cad = "\nLos elementos de la matriz son: \n";
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                cad += String.format("%5d", matriz[fila][columna]);
            }
            cad += "\n";
        }
        taPantalla.append(cad);
    }//GEN-LAST:event_bMostrarMatriz2ActionPerformed
/**
 * Metodo que encuentra el maximo y el minimo de una matriz para luego mostrarlos por pantalla
 * @param evt 
 */
    private void bMostrarMaxMin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarMaxMin2ActionPerformed
        // TODO add your handling code here:

        int max = matriz[0][0];
        int min = matriz[0][0];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                if (matriz[fila][columna] > max) {
                    max = matriz[fila][columna];
                }
                if (matriz[fila][columna] < min) {
                    min = matriz[fila][columna];
                }
            }

        }
        taPantalla.append("\nEl maximo es " + max + " y el minimo " + min);
    }//GEN-LAST:event_bMostrarMaxMin2ActionPerformed
/**
 * Metodo en el que cambia el valor de la fila y columna introduci por texto
 * @param evt 
 */
    private void bCambiarValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCambiarValor2ActionPerformed
        // TODO add your handling code here:
        String valor = JOptionPane.showInputDialog(this, "Introduce el valor que quieres cambiar 'fila/columna/valor'");
        if (valor != null) {
            String[] nuevoValor = valor.split("/");

            if (nuevoValor.length == 3) {
                int filas = Integer.parseInt(nuevoValor[0]);
                if (filas < 0 || filas > matriz.length) {
                    JOptionPane.showMessageDialog(rootPane, "La fila va de 0 a " + (matriz.length - 1));
                } else {
                    int columnas = Integer.parseInt(nuevoValor[1]);
                    if (columnas < 0 || columnas > matriz[filas].length) {
                        JOptionPane.showMessageDialog(rootPane, "La columna va de 0 a " + (matriz[filas].length - 1));
                    } else {
                        int num = Integer.parseInt(nuevoValor[2]);

                        if (num < -99 || num > 99) {
                            JOptionPane.showMessageDialog(rootPane, "El numero introducido debe de estar entre -99 y 99");
                        } else {

                            matriz[filas][columnas] = num;
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Debes introducir 'filas/columnas/valor'");
            }
        }

    }//GEN-LAST:event_bCambiarValor2ActionPerformed
/**
 * Metodo que transpone la matriz, es decir cambia las filas por las columnas
 * @param evt 
 */
    private void bTransponer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTransponer2ActionPerformed
        // TODO add your handling code here:
        int[][] nueva = new int [matriz[0].length][matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                nueva[columna][fila] = matriz[fila][columna];
            }
        }
        matriz = nueva;
    }//GEN-LAST:event_bTransponer2ActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCambiarValor;
    private javax.swing.JButton bCambiarValor1;
    private javax.swing.JButton bCambiarValor2;
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bCerrar1;
    private javax.swing.JButton bCrearMatriz;
    private javax.swing.JButton bCrearMatriz1;
    private javax.swing.JButton bCrearMatriz2;
    private javax.swing.JButton bCrearSimetrica;
    private javax.swing.JButton bCrearSimetrica1;
    private javax.swing.JButton bCrearSimetrica2;
    private javax.swing.JButton bCrearUnitaria;
    private javax.swing.JButton bCrearUnitaria1;
    private javax.swing.JButton bCrearUnitaria2;
    private javax.swing.JButton bMostrarMatriz;
    private javax.swing.JButton bMostrarMatriz1;
    private javax.swing.JButton bMostrarMatriz2;
    private javax.swing.JButton bMostrarMaxMin;
    private javax.swing.JButton bMostrarMaxMin1;
    private javax.swing.JButton bMostrarMaxMin2;
    private javax.swing.JButton bTransponer;
    private javax.swing.JButton bTransponer1;
    private javax.swing.JButton bTransponer2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbOscuro;
    private javax.swing.JTextArea taPantalla;
    // End of variables declaration//GEN-END:variables
}
