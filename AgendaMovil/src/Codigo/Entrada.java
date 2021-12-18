
package Codigo;
    import java.awt.Image;
    import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;

public class Entrada extends javax.swing.JFrame {
    String usuario,passw,user,pass;
    ImageIcon Cromo=new ImageIcon();
    ImageIcon Escala=new ImageIcon();
    String tamaño;


    public Entrada() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cromo=new ImageIcon(getClass().getResource("/Imagenes/3.jpg"));
            Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblFondo.getWidth(),lblFondo.getHeight(),Image.SCALE_DEFAULT));
            lblFondo.setIcon(Escala);
        
            Cromo=new ImageIcon(getClass().getResource("/Imagenes/4.jpg"));
            Escala=new ImageIcon(Cromo.getImage().getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(),Image.SCALE_DEFAULT));
            lblImagen.setIcon(Escala);
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        lblTitulo.setText("Desarrollo Movil ");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btnValidar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnValidar.setText("Entrar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        getContentPane().add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        lblImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 79, 254, 250));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
            new Agenda().setVisible(true);
            this.setVisible(false);
 
    }//GEN-LAST:event_btnValidarActionPerformed

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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
