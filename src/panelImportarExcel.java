
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import Excel.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class panelImportarExcel extends javax.swing.JPanel {
    
    DefaultTableModel modelo;//Modelo de la tabla
    Excel e1= new Excel();//creamos un objeto de la clase Excel el cual permite importar los archivos de excel
    
    public panelImportarExcel() {
        initComponents();
        tabla.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));//Cambiamos el tamaño del heder de la tabla
        tabla.getTableHeader().setFont(new Font("Dialog", Font.PLAIN, 20));//Cambiamos la fuente y tipo de letra de los titulo de la tabla
        modelo = (DefaultTableModel) tabla.getModel();//Asignamos al modelo creado el modelo de la tabla ya existente
        setSize(990, 700);//Tamaño de el panel
    }
    
    public void importarExcelATabla(){
        e1.importarExcel(modelo);//iportamos los datos de el archivo xls a la tabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buttonVaciarRegistros = new javax.swing.JPanel();
        labelVR = new javax.swing.JLabel();
        buttonCargarArchivoxls = new javax.swing.JPanel();
        labelCAX = new javax.swing.JLabel();
        buttonGuardarRegistros = new javax.swing.JPanel();
        labelGR = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 113, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Importar Archivo Excel_");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 850, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        tabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre (s)", "Apellido Paterno", "Apellido Materno", "Grupo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 960, 490));

        buttonVaciarRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonVaciarRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVaciarRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVaciarRegistrosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVaciarRegistrosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVaciarRegistrosMouseEntered(evt);
            }
        });
        buttonVaciarRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelVR.setForeground(new java.awt.Color(43, 113, 205));
        labelVR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVR.setText("Vaciar Registros");
        buttonVaciarRegistros.add(labelVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 190, 60));

        add(buttonVaciarRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 210, 70));

        buttonCargarArchivoxls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCargarArchivoxls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCargarArchivoxls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCargarArchivoxlsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCargarArchivoxlsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCargarArchivoxlsMouseEntered(evt);
            }
        });
        buttonCargarArchivoxls.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCAX.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCAX.setForeground(new java.awt.Color(0, 153, 51));
        labelCAX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCAX.setText("Cargar Archivo xls");
        buttonCargarArchivoxls.add(labelCAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 190, 60));

        add(buttonCargarArchivoxls, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 210, 70));

        buttonGuardarRegistros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonGuardarRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGuardarRegistrosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGuardarRegistrosMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGuardarRegistrosMouseEntered(evt);
            }
        });
        buttonGuardarRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelGR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelGR.setForeground(new java.awt.Color(43, 113, 205));
        labelGR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGR.setText("Guardar Registros");
        buttonGuardarRegistros.add(labelGR, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 190, 60));

        add(buttonGuardarRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 210, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVaciarRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVaciarRegistrosMouseClicked
        if (tabla.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"La tabla esta vacia");
        }
        else if (JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea vaciar la tabla?","Confirmacion",JOptionPane.YES_NO_OPTION)==0) {
            for (int i = tabla.getRowCount()-1;i>=0 ; i--)
                modelo.removeRow(i);
        }
    }//GEN-LAST:event_buttonVaciarRegistrosMouseClicked

    private void buttonVaciarRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVaciarRegistrosMouseEntered
        buttonVaciarRegistros.setBackground(new java.awt.Color(43,113,205));
        labelVR.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonVaciarRegistrosMouseEntered

    private void buttonVaciarRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVaciarRegistrosMouseExited
        buttonVaciarRegistros.setBackground(new java.awt.Color(255,255,255));
        labelVR.setForeground(new java.awt.Color(3,113,205));
    }//GEN-LAST:event_buttonVaciarRegistrosMouseExited

    private void buttonCargarArchivoxlsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCargarArchivoxlsMouseClicked
        importarExcelATabla();//iportamos los datos de el archivo xls a la tabla
    }//GEN-LAST:event_buttonCargarArchivoxlsMouseClicked

    private void buttonCargarArchivoxlsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCargarArchivoxlsMouseExited
        buttonCargarArchivoxls.setBackground(new java.awt.Color(255,255,255));
        labelCAX.setForeground(new java.awt.Color(0, 153, 51));
    }//GEN-LAST:event_buttonCargarArchivoxlsMouseExited

    private void buttonCargarArchivoxlsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCargarArchivoxlsMouseEntered
        buttonCargarArchivoxls.setBackground(new java.awt.Color(0, 153, 51));
        labelCAX.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonCargarArchivoxlsMouseEntered

    private void buttonGuardarRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuardarRegistrosMouseClicked
         if (tabla.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"La tabla esta vacia");
        }
        else{
            LoginInterno logInterno = new LoginInterno(null, true);
            logInterno.setVisible(true);
            boolean agregadoSistema=true;
            int contadorNoAgregados=0;
            if (logInterno.isLogeado()){
                if (JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea guardar los registros?","Confirmacion",JOptionPane.YES_NO_OPTION)==0){
                    for (int i = tabla.getRowCount()-1;i>=0 ; i--){
                        try {
                            String resul=Splash.conexionBaseDatos.CallProcVal((String)modelo.getValueAt(i, 0),(String)modelo.getValueAt(i, 1),(String)modelo.getValueAt(i, 2),(String)modelo.getValueAt(i, 3));
                            if(resul==null){
                                if(isImpar((String)modelo.getValueAt(i, 4))){
                                    Splash.conexionBaseDatos.InsertTableInscrito((String)modelo.getValueAt(i, 0),"001",(String)modelo.getValueAt(i, 4));
                                }
                                else{
                                    Splash.conexionBaseDatos.InsertTableInscrito((String)modelo.getValueAt(i, 0),"002",(String)modelo.getValueAt(i, 4));
                                }
                                modelo.removeRow(i);
                            }
                            else{
                                contadorNoAgregados++;
                                agregadoSistema=false;
                            }
                                    
                        } catch (SQLException ex) {
                            agregadoSistema=false;
                            contadorNoAgregados++;
                        }
                    }
                    if (agregadoSistema)
                        JOptionPane.showMessageDialog(null, "¡¡Exito al registrar los alumnos!!");
                    else
                        JOptionPane.showMessageDialog(null, contadorNoAgregados+" registros no pudieron ser guardados, revise la tabla se muestran los archivos que no se agregaron");
                }
            }
        }
    }//GEN-LAST:event_buttonGuardarRegistrosMouseClicked

    private boolean isImpar(String grup) {
        char c=grup.charAt(0);
        int i=(int) c;
        if((i%2)==0)
            return false;  
       else
            return true;
            
    }
    
    private void buttonGuardarRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuardarRegistrosMouseEntered
        buttonGuardarRegistros.setBackground(new java.awt.Color(43,113,205));
        labelGR.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonGuardarRegistrosMouseEntered

    private void buttonGuardarRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGuardarRegistrosMouseExited
        buttonGuardarRegistros.setBackground(new java.awt.Color(255,255,255));
        labelGR.setForeground(new java.awt.Color(3,113,205));
    }//GEN-LAST:event_buttonGuardarRegistrosMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonCargarArchivoxls;
    private javax.swing.JPanel buttonGuardarRegistros;
    private javax.swing.JPanel buttonVaciarRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCAX;
    private javax.swing.JLabel labelGR;
    private javax.swing.JLabel labelVR;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}