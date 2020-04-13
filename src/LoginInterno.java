
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labso10
 */
public class LoginInterno extends javax.swing.JDialog {
    boolean logeado=false;
    public LoginInterno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(450,350);
        labelUsuario.setText(Splash.conexionBaseDatos.UserServidor);
        this.setLocationRelativeTo(null);
        txtPassworInterno.setText("Huevos1*");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassworInterno = new javax.swing.JPasswordField();
        buttonEnter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassworInterno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassworInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassworInternoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassworInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, 40));

        buttonEnter.setText("Enter");
        buttonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnterActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 220, 150, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 30));

        labelUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 210, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("CONTRSEÑA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, 40));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnterActionPerformed
        if (Splash.conexionBaseDatos.PasswordServidor.equalsIgnoreCase(txtPassworInterno.getText())) {
            this.dispose();
            logeado=true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
            txtPassworInterno.setText("");
        }
    }//GEN-LAST:event_buttonEnterActionPerformed

    private void txtPassworInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassworInternoActionPerformed
        buttonEnter.doClick();
    }//GEN-LAST:event_txtPassworInternoActionPerformed

    public boolean isLogeado(){
        return logeado;
    }
    
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
            java.util.logging.Logger.getLogger(LoginInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginInterno dialog = new LoginInterno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField txtPassworInterno;
    // End of variables declaration//GEN-END:variables
}
