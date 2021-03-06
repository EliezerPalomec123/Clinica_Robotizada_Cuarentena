
import java.sql.ResultSet;

public class dialogPractica extends javax.swing.JDialog {

    public dialogPractica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        new TextPrompt("Nombre de la practica",txtNombrePractica);
        llenarBoxNombreMateria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boxNombreMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePractica = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonRegistrarPractica = new javax.swing.JPanel();
        labelReP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(43, 113, 205));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Practica");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 460, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxNombreMateria.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jPanel2.add(boxNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 270, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(43, 113, 205));
        jLabel3.setText("Nombre Materia:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 113, 205));
        jLabel2.setText("Nombre Practica:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 40));

        txtNombrePractica.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombrePractica.setToolTipText("");
        txtNombrePractica.setBorder(null);
        txtNombrePractica.setOpaque(false);
        jPanel2.add(txtNombrePractica, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 240, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 260, 3));

        buttonRegistrarPractica.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegistrarPractica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonRegistrarPractica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistrarPractica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRegistrarPracticaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRegistrarPracticaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRegistrarPracticaMouseEntered(evt);
            }
        });
        buttonRegistrarPractica.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReP.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        labelReP.setForeground(new java.awt.Color(43, 113, 205));
        labelReP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReP.setText("Registrar Practica");
        buttonRegistrarPractica.add(labelReP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 230, 30));

        jPanel2.add(buttonRegistrarPractica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 240, 70));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarPracticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegistrarPracticaMouseEntered
        buttonRegistrarPractica.setBackground(new java.awt.Color(43,113,205));
        labelReP.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonRegistrarPracticaMouseEntered

    private void buttonRegistrarPracticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegistrarPracticaMouseExited
        buttonRegistrarPractica.setBackground(new java.awt.Color(255,255,255));
        labelReP.setForeground(new java.awt.Color(3,113,205));
    }//GEN-LAST:event_buttonRegistrarPracticaMouseExited

    private void buttonRegistrarPracticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRegistrarPracticaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRegistrarPracticaMouseClicked
    
    public void llenarBoxNombreMateria(){
        boxNombreMateria.removeAllItems();
        try {
            ResultSet resultado= Splash.conexionBaseDatos.consulta("select Nombre from Materia;");
            while(resultado.next()){
                boxNombreMateria.addItem(resultado.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxNombreMateria;
    private javax.swing.JPanel buttonRegistrarPractica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelReP;
    private javax.swing.JTextField txtNombrePractica;
    // End of variables declaration//GEN-END:variables
}
