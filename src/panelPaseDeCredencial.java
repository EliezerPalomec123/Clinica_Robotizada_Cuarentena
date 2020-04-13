import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class panelPaseDeCredencial extends javax.swing.JPanel {
    Calendar calendario;
    DefaultTableModel modelo;//Modelo de la tabla
    boolean sistemaEstado=false;
    public panelPaseDeCredencial() {
        initComponents();
        setSize(990, 700);//Tamaño de el panel
        tabla.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
        tabla.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 18));//Cambiamos la fuente y tipo de letra de los titulo de la tabla
        modelo = (DefaultTableModel) tabla.getModel();//Asignamos al modelo creado el modelo de la tabla ya existente
        desactivarSistema();
        new TextPrompt("              Busqueda por Matricula",txtBusqueda);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        txtBusqueda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        boxGrupos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        buttonIniciar = new javax.swing.JPanel();
        labelIn = new javax.swing.JLabel();
        buttonEliminar = new javax.swing.JPanel();
        labelEl = new javax.swing.JLabel();
        buttonDetener = new javax.swing.JPanel();
        labelDe = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setForeground(new java.awt.Color(0, 102, 51));

        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Nombre", "Nombre Practica", "Hora Entrada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setRowHeight(35);
        tabla.setSelectionBackground(new java.awt.Color(43, 113, 205));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(145);
            tabla.getColumnModel().getColumn(0).setMaxWidth(145);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(3).setMaxWidth(150);
        }
        tabla.getAccessibleContext().setAccessibleName("");

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 970, 490));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 5));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 113, 500, 3));

        txtBusqueda.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.setBorder(null);
        txtBusqueda.setOpaque(false);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, 460, 40));

        jPanel2.setBackground(new java.awt.Color(43, 113, 205));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pase de credencial_");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 570, 60));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/busqueda.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 40, 60));

        add(boxGrupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 75, 130, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("GRUPO:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 100, 50));

        buttonIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonIniciarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonIniciarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonIniciarMouseEntered(evt);
            }
        });
        buttonIniciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelIn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelIn.setForeground(new java.awt.Color(43, 113, 205));
        labelIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIn.setText("Iniciar");
        labelIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonIniciar.add(labelIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 5, 130, 30));

        add(buttonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 140, 40));

        buttonEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        labelEl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEl.setForeground(new java.awt.Color(204, 0, 0));
        labelEl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEl.setText("Eliminar");
        labelEl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEliminar.add(labelEl, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 5, 110, 30));

        add(buttonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 140, 40));

        buttonDetener.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDetener.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDetener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDetenerMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDetenerMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDetenerMouseEntered(evt);
            }
        });
        buttonDetener.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelDe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDe.setForeground(new java.awt.Color(204, 0, 0));
        labelDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDe.setText("Detener");
        labelDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDetener.add(labelDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        add(buttonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 130, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        buscarAlumnoBD(txtBusqueda.getText());
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if(Character.isLetter(evt.getKeyChar()) || txtBusqueda.getText().length()==10){
            evt.consume();//Elimina el caracter
        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void buttonIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIniciarMouseClicked
        if(!sistemaEstado){
            LoginInterno logInterno = new LoginInterno(null, true);
            logInterno.setVisible(true);
            if (logInterno.isLogeado())
                activarSistema();
        }
        else{
            JOptionPane.showMessageDialog(this, "El sistema ya se a iniciado");
        }
    }//GEN-LAST:event_buttonIniciarMouseClicked

    private void buttonIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIniciarMouseEntered
        buttonIniciar.setBackground(new java.awt.Color(43,113,205));
        labelIn.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonIniciarMouseEntered

    private void buttonIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonIniciarMouseExited
        buttonIniciar.setBackground(new java.awt.Color(255,255,255));
        labelIn.setForeground(new java.awt.Color(3,113,205));
    }//GEN-LAST:event_buttonIniciarMouseExited

    private void buttonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseClicked
        if (sistemaEstado) {   
            if(modelo.getRowCount()==0)
                javax.swing.JOptionPane.showMessageDialog(null,"La tabla se encuatra vacia");
            else if(tabla.getSelectedRow()!=-1){
                //Mostramos un mensaje de verificacion para poder eliminar los datos
                if(JOptionPane.showConfirmDialog(this,"¿Esta seguro de eliminar el registro de "+modelo.getValueAt(tabla.getSelectedRow(), 1)+" en la tabla?\n Si hace esto no se le contara la asistencia al alumno","Confirmacion",javax.swing.JOptionPane.OK_CANCEL_OPTION)==0)
                    modelo.removeRow(tabla.getSelectedRow());//Del modelo eliminamos la fila seleccionada
            }
            else
                JOptionPane.showMessageDialog(null,"Porfavor eliga un registro para poder eliminarlo");
        }
        else{
            JOptionPane.showMessageDialog(this, "El sistema no se ha iniciado");
        }
    }//GEN-LAST:event_buttonEliminarMouseClicked

    private void buttonEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseExited
        buttonEliminar.setBackground(new java.awt.Color(255,255,255));
        labelEl.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_buttonEliminarMouseExited

    private void buttonEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminarMouseEntered
        buttonEliminar.setBackground(new java.awt.Color(204, 0, 0));
        labelEl.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonEliminarMouseEntered

    private void buttonDetenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDetenerMouseEntered
        buttonDetener.setBackground(new java.awt.Color(204, 0, 0));
        labelDe.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_buttonDetenerMouseEntered

    private void buttonDetenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDetenerMouseExited
        buttonDetener.setBackground(new java.awt.Color(255,255,255));
        labelDe.setForeground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_buttonDetenerMouseExited

    private void buttonDetenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDetenerMouseClicked
         if (sistemaEstado) {
            LoginInterno logInterno = new LoginInterno(null, true);
            logInterno.setVisible(true);
            if (logInterno.isLogeado())
                desactivarSistema();
        }
        else{
            JOptionPane.showMessageDialog(this, "El sistema no se ha iniciado");
        }
    }//GEN-LAST:event_buttonDetenerMouseClicked
    
    public void activarSistema(){
        sistemaEstado=true;
        txtBusqueda.setEnabled(true);
    }
    public void desactivarSistema(){
        sistemaEstado=false;
        txtBusqueda.setEnabled(false);
    }
    
    public void agregarAlumnoTabla(String Matricula, String Nombre, String nombrePractica){
        //Mostramos un mensaje de verificacion para poder agregar los datos
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");//Guardamos la hora del registro
        modelo.addRow(new Object[] {Matricula,Nombre,nombrePractica,dateFormat.format(new Date())});//agregamos los datos a la tabla
        modelo.moveRow(modelo.getRowCount() - 1, modelo.getRowCount() - 1, 0);//Movemos la fila agregada a la primera posicion
        tabla.changeSelection(0, 1, false, false);
        txtBusqueda.setText("");
    }
    
    public void buscarAlumnoBD(String dato_A_Buscar){
        if(txtBusqueda.getText().length()==10){
            boolean EncontradoBD=false;//variable para verificar si el alumno se encuentra en la base de datos
            boolean EncontradoTabla=false;//variable para verificar si el alumno se encuentra en la tabla
            try {
                ResultSet resultadoAlumno= Splash.conexionBaseDatos.consulta("select * from Alumno where Alumno.Matricula = "+ dato_A_Buscar);//se realiza la consulta a la base de datos
                while(resultadoAlumno.next()){//recorremos cada tupla de la base de datos
                    if(resultadoAlumno.getString(1).equalsIgnoreCase(dato_A_Buscar)){
                        EncontradoBD = true;
                        break;
                    }
                }
                if (!EncontradoBD) {
                    txtBusqueda.setText("");
                    JOptionPane.showMessageDialog(null, "La Matricula no existe, Consultar al encargado");
                }
                else{
                    EncontradoBD=false;
                    ResultSet resultado= Splash.conexionBaseDatos.consulta("select Alumno.Matricula,Alumno.nombre,Nombre_Practica from Alumno,Define,Practicas where Alumno.Matricula= "+dato_A_Buscar+" and Alumno.Matricula=Define.id_solicitante and Define.id_Practicas=Practicas.id_Practicas;");//se realiza la consulta a la base de datos
                    while(resultado.next()){//recorremos cada tupla de la base de datos
                        if(resultado.getString(1).equalsIgnoreCase(dato_A_Buscar)){
                            EncontradoBD = true;
                            for (int i = tabla.getRowCount()-1;i>=0 ; i--){
                                if (resultado.getString(1).equalsIgnoreCase((String) modelo.getValueAt(i,0))) {
                                    if(HoravalExit(dato_A_Buscar)){
                                        modelo.removeRow(i);
                                        updateSal(dato_A_Buscar);
                                        tabla.changeSelection(0, 1, false, false);
                                        EncontradoTabla=true;
                                        txtBusqueda.setText("");
                                        break;
                                    }
                                    else{
                                        EncontradoTabla=true;
                                    }
                                }
                            }
                            if (!EncontradoTabla){
                                    if(ValDate(dato_A_Buscar) && ValHoraandDate(dato_A_Buscar)){
                                        agregarAlumnoTabla(resultado.getString(1),resultado.getString(2),resultado.getString(3));
                                        callInsertTableRealiza(dato_A_Buscar);
                                    }
                            }
                            break;
                        }
                    }
                    if (!EncontradoBD) {
                        JOptionPane.showMessageDialog(null, "El alumno no tiene ninguna practica agendada");
                    }
                }

            } catch (Exception e) {
                System.out.println("Error Buscar alumno");
            }
            txtBusqueda.setText("");
        }
    }
    
    public void llenarBoxGrupos(){
        boxGrupos.removeAllItems();
        boxGrupos.addItem("TODOS");
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
    private javax.swing.JPanel buttonDetener;
    private javax.swing.JPanel buttonEliminar;
    private javax.swing.JPanel buttonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelDe;
    private javax.swing.JLabel labelEl;
    private javax.swing.JLabel labelIn;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
        private boolean ValHoraandDate(String mat) throws SQLException {
        String sql="Select Hora_Inicio from Define where id_solicitante="+mat,h_inicio ="",horac="",minC="";
        int hora,hora1,minutos,minutosaddtole;
        ResultSet H_Ini=Splash.conexionBaseDatos.consulta(sql);
        Calendar calendario = new GregorianCalendar();
        while(H_Ini.next()){//recorremos cada tupla de la base de datos
               JOptionPane.showMessageDialog(null,H_Ini.getString(1));
               h_inicio=H_Ini.getString(1);
        }
        horac=horac+h_inicio.charAt(0)+h_inicio.charAt(1);
        minC=minC+h_inicio.charAt(3)+h_inicio.charAt(4);
        //JOptionPane.showMessageDialog(null,horac);
        hora=Integer.parseInt(horac);
        minutosaddtole=Integer.parseInt(minC)+7;
        hora1 =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        JOptionPane.showMessageDialog(null,hora);
        JOptionPane.showMessageDialog(null,hora1);
        if((hora1>hora) || (minutos>minutosaddtole)){
            JOptionPane.showMessageDialog(null,"Lo siento,Llegaste tarde");
            return false;
        }
        else {
            return true;
        }

    }

    private boolean ValDate(String mat) throws SQLException{
        Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyy/MM/dd");
        String fechaSistema=formateador.format(fechaActual);
        JOptionPane.showMessageDialog(null,fechaSistema);
        String sql="select Fecha from Define where id_solicitante="+mat+" and Fecha= '"+fechaSistema+"'";
        System.out.println(sql);
        String Fecha2="";
        ResultSet Fecha=Splash.conexionBaseDatos.consulta(sql);
        while(Fecha.next()){//recorremos cada tupla de la base de datos
               //JOptionPane.showMessageDialog(null,H_Ini.getString(1));
               Fecha2=Fecha.getString(1);
               System.out.println(Fecha.getString(1)+"Fecha");
        }
        Fecha2=Fecha2.replace("-","/");
        JOptionPane.showMessageDialog(null,Fecha2+"buena");
        if(fechaSistema.equalsIgnoreCase(Fecha2))
          return true;
        else{
            JOptionPane.showMessageDialog(null,"No tienes práctica agendada Para el día de hoy");
            return false;
        }

    }

    private boolean HoravalExit(String mat) throws SQLException {
       String sql="Select Hora_Fin from Define where id_solicitante="+mat,h_fin ="",horac="",minC="";
       int minaddtole,minutos;
       ResultSet H_Fin=Splash.conexionBaseDatos.consulta(sql);
       calendario = new GregorianCalendar();
       while(H_Fin.next()){//recorremos cada tupla de la base de datos
               JOptionPane.showMessageDialog(null,H_Fin.getString(1));
               h_fin=H_Fin.getString(1);
        }
       minC=minC+h_fin.charAt(3)+h_fin.charAt(4);
       minaddtole=Integer.parseInt(minC)-5;
       minutos = calendario.get(Calendar.MINUTE);
       if(minutos<minaddtole){
           JOptionPane.showMessageDialog(null,"Regresa a tu práctica cabrón");
           return false;
       }
       else
        return true;
    }

    private void callInsertTableRealiza(String mat) throws SQLException {
        calendario = new GregorianCalendar();
        JOptionPane.showMessageDialog(null,"Si entre");
        String sql="select id_Practicas,Fecha from Define where id_solicitante="+mat;
        JOptionPane.showMessageDialog(null,"Pase la consulta");
        String hora_actual="",id_Practicas="",Fecha="";
        //String horas=String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        //String min=String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        //String seg=String.valueOf(calendario.get(Calendar.SECOND));
        int horas=calendario.get(Calendar.HOUR_OF_DAY);
        int min=calendario.get(Calendar.MINUTE);
        int seg=calendario.get(Calendar.SECOND);
        hora_actual=hora_actual+horas+":"+min+":"+seg;

        //hora_actual=hora_actual+String.valueOf(calendario.get(Calendar.HOUR_OF_DAY))+":"+String.valueOf(calendario.get(Calendar.MINUTE))+":"+String.valueOf(calendario.get(Calendar.SECOND));
        JOptionPane.showMessageDialog(null,"Pude definir la hora");
        JOptionPane.showMessageDialog(null,hora_actual+"La hora esta bien");
        ResultSet datos=Splash.conexionBaseDatos.consulta(sql);
        while(datos.next()){//recorremos cada tupla de la base de datos
               //JOptionPane.showMessageDialog(null,H_Fin.getString(1));
               id_Practicas=datos.getString(1);
               JOptionPane.showMessageDialog(null,id_Practicas+"ob");
               Fecha=datos.getString(2);
               JOptionPane.showMessageDialog(null,Fecha+"ob");

        }

        Splash.conexionBaseDatos.InsertRealiza(mat,id_Practicas,hora_actual,null,Fecha);
    }

    private void updateSal(String dato_A_Buscar) {
        String hora_actual="";
        calendario = new GregorianCalendar();
        int horas=calendario.get(Calendar.HOUR_OF_DAY);
        int min=calendario.get(Calendar.MINUTE);
        int seg=calendario.get(Calendar.SECOND);
        hora_actual=hora_actual+horas+":"+min+":"+seg;

        Splash.conexionBaseDatos.updateSal(hora_actual,dato_A_Buscar);
    }
}
