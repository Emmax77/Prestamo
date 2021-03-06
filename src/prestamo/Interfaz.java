/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Emmanuel GR
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JTextField();
        texto3 = new javax.swing.JTextField();
        imagencilla = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        texto4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Esta herramienta se utiliza para calcular prestamos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 70));

        jLabel2.setText("MONTO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("TASA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setText("PERIODOS:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 110, -1));
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 110, -1));

        imagencilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bicho.png"))); // NOI18N
        getContentPane().add(imagencilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 260, 190));

        jLabel5.setText("LIMITE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, -1));

        btCalcular.setText("CALCULAR CUOTA");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 190, -1));
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 110, -1));

        jLabel6.setText("CUOTA  A PAGAR POR MES:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 190, 20));
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 690, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    FormulaFinanciera n = new FormulaFinanciera();
    
    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
    double monto = parseDouble(texto1.getText());
    double tasa = parseDouble(texto2.getText());
    int periodo = parseInt(texto3.getText());
    int limite = parseInt(texto4.getText());// TODO add your handling code here:
    double todo = n.generarCuota(monto, tasa, periodo, limite);
    total.setText(String.valueOf(todo));
    }//GEN-LAST:event_btCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btCalcular;
    public static javax.swing.JLabel imagencilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbFondo;
    public static javax.swing.JTextField texto1;
    public static javax.swing.JTextField texto2;
    public static javax.swing.JTextField texto3;
    public static javax.swing.JTextField texto4;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
