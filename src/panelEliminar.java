import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class panelEliminar extends javax.swing.JPanel {

    DefaultTableModel modelo;//Modelo de la tabla
    public panelEliminar() {
        initComponents();
        setSize(990, 700);//Tamaño de el panel
        tabla.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
        tabla.getTableHeader().setFont(new Font("Dialog", Font.BOLD,18));//Cambiamo la fuente y tipo de letra de los titulo de la tabla
        modelo = (DefaultTableModel) tabla.getModel();//Asignamos al modelo creado el modelo de la tabla ya existente
        new TextPrompt(" Busqueda por Matricula o Nombre del Alumno",txtBusqueda);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        buttonEliminar = new javax.swing.JPanel();
        labelE = new javax.swing.JLabel();
        buttonEditar = new javax.swing.JPanel();
        labelEd = new javax.swing.JLabel();
        boxGrupos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 560, 3));

        txtBusqueda.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.setBorder(null);
        txtBusqueda.setOpaque(false);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 510, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/busqueda.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 50, 40));

        jPanel1.setBackground(new java.awt.Color(43, 113, 205));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar o Actualizar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 560, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Apellido Paterno", "Apellido Materno", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setRowHeight(35);
        tabla.setSelectionBackground(new java.awt.Color(43, 113, 205));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 950, 490));

        buttonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEliminarMouseEntered(evt);
            }
        });
        buttonEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelE.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelE.setForeground(new java.awt.Color(204, 51, 0));
        labelE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE.setText("Eliminar");
        buttonEliminar.add(labelE, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, 110, 50));

        add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 130, 50));

        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonEditar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditarMouseEntered(evt);
            }
        });
        buttonEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEd.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEd.setForeground(new java.awt.Color(0, 153, 51));
        labelEd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEd.setText("Editar");
        buttonEditar.add(labelEd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 90, 40));

        add(buttonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 130, 50));

        boxGrupos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boxGrupos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxGruposItemStateChanged(evt);
            }
        });
        add(boxGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 140, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Alumnos en el grupo:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 290, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        buscarAlumnoEnTabla(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void buttonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseClicked
        if (tabla.getRowCount()==0) {
            JOptionPane.showMessageDialog(null,"No tienes ningun registro en el sistema");
        }
        else{
            LoginInterno logInterno = new LoginInterno(null, true);
            logInterno.setVisible(true);
            if (logInterno.isLogeado()){
                if (modelo.getRowCount()==0) {
                    JOptionPane.showMessageDialog(this, "La tabla se encuentra vacia");
                }
                else if(tabla.getSelectedRow()==-1)
                    JOptionPane.showMessageDialog(this, "Seleccione un registro");
                else if((JOptionPane.showConfirmDialog(null,"¿Desea realmente dar de baja del sistema al Alumno "+modelo.getValueAt(tabla.getSelectedRow(),1)+" "+modelo.getValueAt(tabla.getSelectedRow(),2)+"?\n todos los datos del alumno se borrarran permanetemente","Confimacion",JOptionPane.YES_NO_OPTION)==0)){
                    Splash.conexionBaseDatos.DeleteAlumno((String)modelo.getValueAt(tabla.getSelectedRow(),0));
                    modelo.removeRow(tabla.getSelectedRow());
                    tabla.changeSelection(0, 1, false, false);
                }
            }
        }
    }//GEN-LAST:event_buttonEliminarMouseClicked

    private void buttonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseEntered
        buttonEliminar.setBackground(new java.awt.Color(204, 51, 0));
        labelE.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonEliminarMouseEntered

    private void buttonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseExited
        buttonEliminar.setBackground(new java.awt.Color(255,255,255));
        labelE.setForeground(new java.awt.Color(204, 51, 0));
    }//GEN-LAST:event_buttonEliminarMouseExited

    private void buttonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseClicked
         if (modelo.getRowCount()==0) {
                JOptionPane.showMessageDialog(null,"No tienes ningun registro en el sistema");
        }
        else if(tabla.getSelectedRow()!=-1){
            dialogEditar dlogEditar = new dialogEditar(null, true,(String)modelo.getValueAt(tabla.getSelectedRow(),1),(String)modelo.getValueAt(tabla.getSelectedRow(),2),(String)modelo.getValueAt(tabla.getSelectedRow(),3),(String)modelo.getValueAt(tabla.getSelectedRow(),0),(String)modelo.getValueAt(tabla.getSelectedRow(),4));
            dlogEditar.setVisible(true);
            llenarTabla();
        }
        else
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
    }//GEN-LAST:event_buttonEditarMouseClicked

    private void buttonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseEntered
        buttonEditar.setBackground(new java.awt.Color(0, 153, 51));
        labelEd.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonEditarMouseEntered

    private void buttonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseExited
        buttonEditar.setBackground(new java.awt.Color(255,255,255));
        labelEd.setForeground(new java.awt.Color(0, 153, 51));
    }//GEN-LAST:event_buttonEditarMouseExited

    private void boxGruposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxGruposItemStateChanged
        llenarTabla();
    }//GEN-LAST:event_boxGruposItemStateChanged
    
    public void llenarTabla(){
        vaciarTabla(tabla,modelo);
        try {
            ResultSet resultado=Splash.conexionBaseDatos.consulta("select Alumno.Matricula,nombre,ApellidoP,ApellidoM,grupo from Alumno,Inscrito where Alumno.Matricula = Inscrito.Matricula and grupo="+(String)boxGrupos.getSelectedItem() +" order by ApellidoP;");
            while(resultado.next()){
                modelo.addRow(new Object[] {resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5)});//agregamos los datos a la tabla
                tabla.changeSelection(0, 1, false, false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No tienes ningun registro en el sistema");
        }
    }
    
    
    public void buscarAlumnoEnTabla(String dato_A_Buscar){
        vaciarTabla(tabla,modelo);
        try {
            System.out.println();
            ResultSet resultado=Splash.conexionBaseDatos.consulta("select Alumno.Matricula,nombre,ApellidoP,ApellidoM,grupo from Alumno,Inscrito where Alumno.Matricula = Inscrito.Matricula and (Alumno.nombre LIKE '%"+ dato_A_Buscar +"%' or Alumno.Matricula LIKE '%"+ dato_A_Buscar +"%') order by ApellidoP;");
            while(resultado.next()){
                modelo.addRow(new Object[] {resultado.getString(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5)});//agregamos los datos a la tabla
                tabla.changeSelection(0, 1, false, false);
            }
        } catch (Exception e) {
            System.out.println("Error llenar tabla");
        }
    }
    
    public void vaciarTabla(javax.swing.JTable table,DefaultTableModel model){
        if (table.getRowCount()>0) {
            for (int i = table.getRowCount()-1;i>=0 ; i--)
                model.removeRow(i);
        }
    }
    
    public void llenarBoxGrupos(){
        boxGrupos.removeAllItems();
        try {
            ResultSet resultado= Splash.conexionBaseDatos.consulta("select Grupo from Inscrito group by grupo order by grupo;");
            while(resultado.next()){
                boxGrupos.addItem(resultado.getString(1));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGrupos;
    private javax.swing.JPanel buttonEditar;
    private javax.swing.JPanel buttonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelE;
    private javax.swing.JLabel labelEd;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}

