
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class dialogPlanEstudios extends javax.swing.JDialog {

    public dialogPlanEstudios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(600,520);
        this.setLocationRelativeTo(null);
        new TextPrompt("   Nombre del plan de estudios",txtNombrePlanEstudios);
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
        jLabel2 = new javax.swing.JLabel();
        txtNombrePlanEstudios = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        buttonPlanEstudios = new javax.swing.JPanel();
        labelReP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtFechaFin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(43, 113, 205));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Plan de Estudios");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 560, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(43, 113, 205));
        jLabel2.setText("Nombre Plan de Estudios:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 360, 40));

        txtNombrePlanEstudios.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombrePlanEstudios.setToolTipText("");
        txtNombrePlanEstudios.setBorder(null);
        txtNombrePlanEstudios.setOpaque(false);
        jPanel2.add(txtNombrePlanEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 390, 40));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 410, 3));

        buttonPlanEstudios.setBackground(new java.awt.Color(255, 255, 255));
        buttonPlanEstudios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonPlanEstudios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPlanEstudios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPlanEstudiosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPlanEstudiosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPlanEstudiosMouseEntered(evt);
            }
        });
        buttonPlanEstudios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReP.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        labelReP.setForeground(new java.awt.Color(43, 113, 205));
        labelReP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReP.setText("Registrar Plan");
        buttonPlanEstudios.add(labelReP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 230, 30));

        jPanel2.add(buttonPlanEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 240, 70));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 113, 205));
        jLabel4.setText("vigencia:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Fecha inicio:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 130, 30));

        txtFechaInicio.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtFechaInicio.setToolTipText("");
        txtFechaInicio.setBorder(null);
        txtFechaInicio.setOpaque(false);
        jPanel2.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 140, 40));

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 160, 3));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Fecha Fin:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 130, 30));

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 160, 3));

        txtFechaFin.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtFechaFin.setToolTipText("");
        txtFechaFin.setBorder(null);
        txtFechaFin.setOpaque(false);
        jPanel2.add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 140, 40));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 600, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanEstudiosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlanEstudiosMouseEntered
        buttonPlanEstudios.setBackground(new java.awt.Color(43,113,205));
        labelReP.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonPlanEstudiosMouseEntered

    private void buttonPlanEstudiosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlanEstudiosMouseExited
        buttonPlanEstudios.setBackground(new java.awt.Color(255,255,255));
        labelReP.setForeground(new java.awt.Color(3,113,205));
    }//GEN-LAST:event_buttonPlanEstudiosMouseExited

    private void buttonPlanEstudiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlanEstudiosMouseClicked
        if(txtNombrePlanEstudios.getText().trim().length()==0 || txtFechaInicio.getText().trim().length()==0 || txtFechaFin.getText().trim().length()==0)
            JOptionPane.showMessageDialog(null,"No rellenaste algún campo");
        else{
            try {
                String id=calcID();
                Splash.conexionBaseDatos.InsertPE(id,txtNombrePlanEstudios.getText(),txtFechaInicio.getText(),txtFechaFin.getText());
            } catch (SQLException ex) {
                Logger.getLogger(dialogPlanEstudios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonPlanEstudiosMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPlanEstudios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelReP;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombrePlanEstudios;
    // End of variables declaration//GEN-END:variables

    private String calcID() throws SQLException {
        String ulti ="",IdPE="PE-",nume="",idNuevoS="",idNuevoS2;
        int id,id_nuevo;
        String sql="select id_Plan_Estudios from Plan_Estudios";
        ResultSet ID_U=Splash.conexionBaseDatos.consulta(sql);
        while(ID_U.next()){//recorremos cada tupla de la base de datos
               ulti=ID_U.getString(1);
               JOptionPane.showMessageDialog(null,ID_U.getString(1));
        }
        if(ulti==null){
            IdPE=IdPE+"000";
        }
        else{
            nume=nume+ulti.charAt(3)+ulti.charAt(4)+ulti.charAt(5);
            JOptionPane.showMessageDialog(null,nume+"sub");
            nume="1"+nume;
            id=Integer.parseInt(nume);
            id_nuevo=id+1;
            idNuevoS=Integer.toString(id_nuevo);
            idNuevoS2=""+idNuevoS.charAt(1)+idNuevoS.charAt(2)+idNuevoS.charAt(3);
            IdPE=IdPE+idNuevoS2;
            JOptionPane.showMessageDialog(null,IdPE);
        } 
         return IdPE;
    }
   
}
