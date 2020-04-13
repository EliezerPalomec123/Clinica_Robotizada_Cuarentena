
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


public class InterfaceAdministrador extends javax.swing.JFrame {
    private String Usuario;
    public InterfaceAdministrador(String User) {
        this.Usuario=User;
        
        initComponents();
        panelActivo=panelHome;
        
        pnlPerfil = new panelPerfil();
        pnlPerfil.setVisible(false);
        
        pnlPaseDeCredencial = new panelPaseDeCredencial();
        pnlPaseDeCredencial.setVisible(false);
        
        pnlRegistrar = new panelRegistrar(this);
        pnlRegistrar.setVisible(false);
        
        pnlRegistrarEmpleado = new panelRegistrarEmpleado(this);
        pnlRegistrarEmpleado.setVisible(false);
        
        pnlActualizar = new panelEliminar();
        pnlActualizar.setVisible(false);
         
        pnlReporte = new panelReporte();
        pnlReporte.setVisible(false);
        
        pnlAgendar = new panelAgendar(this);
        pnlAgendar.setVisible(false);

        this.add(pnlPerfil);
        this.add(pnlPaseDeCredencial);
        this.add(pnlRegistrar);
        this.add(pnlRegistrarEmpleado);
        this.add(pnlActualizar);
        this.add(pnlReporte);
        this.add(pnlAgendar);
        
        this.setSize(1238, 735);
        this.setLocationRelativeTo(null);
    }
    public void ocultarPanelActual(javax.swing.JPanel panelMostrar){
        panelActivo.setVisible(false);
        panelActivo=panelMostrar;
        panelMostrar.setVisible(true);
        panelMostrar.setLocation(230,0);
        this.setLocationRelativeTo(null);
    }
    public void presionandoButton(javax.swing.JPanel button){
        button.setBackground(new java.awt.Color(20,20,20));
    }
    public void activBordeButton(javax.swing.JPanel button){
        button.setBackground(new java.awt.Color(23, 135, 225));
    }
    public void desactivBordeButton(javax.swing.JPanel button){
        button.setBackground(new java.awt.Color(43,113,205));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonReporte = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        buttonDesarrolladores = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        cerrarSesion = new javax.swing.JMenuItem();
        panelMenu = new javax.swing.JPanel();
        buttonPerfil = new javax.swing.JPanel();
        labelPerfil = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        labelHome = new javax.swing.JLabel();
        buttonPanelAsistencia = new javax.swing.JPanel();
        labelRegistro = new javax.swing.JLabel();
        buttonPanelHomeRegistrar = new javax.swing.JPanel();
        labelAgregar = new javax.swing.JLabel();
        buttonPanelHomeActualizar = new javax.swing.JPanel();
        labelEliminar = new javax.swing.JLabel();
        buttonPanelHomeGenerarReporte = new javax.swing.JPanel();
        labelReporte = new javax.swing.JLabel();
        buttonAjustes = new javax.swing.JPanel();
        labelAjustes = new javax.swing.JLabel();
        buttonPanelAgendar = new javax.swing.JPanel();
        labelCalendarizar = new javax.swing.JLabel();
        labelMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelHome = new javax.swing.JPanel();
        buttonAgendar = new javax.swing.JButton();
        buttonAsistencia = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        buttonActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonRegistrarEmpleado = new javax.swing.JButton();
        butonAgregarMateria = new javax.swing.JButton();
        buttonAgendarPractica = new javax.swing.JButton();
        butonAgregarPractica = new javax.swing.JButton();
        buttonAgendarPlanEstudios = new javax.swing.JButton();
        buttonVerDatos = new javax.swing.JButton();

        jPopupMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(200, 300));

        buttonReporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonReporte.setText("Generer Reporte");
        buttonReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonReporteMouseClicked(evt);
            }
        });
        jPopupMenu1.add(buttonReporte);
        jPopupMenu1.add(jSeparator2);

        buttonDesarrolladores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonDesarrolladores.setText("       Desarrolladores");
        buttonDesarrolladores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDesarrolladores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonDesarrolladores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPopupMenu1.add(buttonDesarrolladores);
        jPopupMenu1.add(jSeparator4);

        cerrarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cerrarSesion.setText("    Cerrar sesión");
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        jPopupMenu1.add(cerrarSesion);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1220, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panelMenu.setBackground(new java.awt.Color(43, 113, 205));
        panelMenu.setPreferredSize(new java.awt.Dimension(230, 680));
        panelMenu.setRequestFocusEnabled(false);
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPerfil.setBackground(new java.awt.Color(43, 113, 205));
        buttonPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPerfilMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPerfilMouseEntered(evt);
            }
        });
        buttonPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPerfil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        labelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        labelPerfil.setText("   Perfi");
        buttonPerfil.add(labelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        panelMenu.add(buttonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 223, 50));

        buttonHome.setBackground(new java.awt.Color(43, 113, 205));
        buttonHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonHomeMouseReleased(evt);
            }
        });
        buttonHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelHome.setForeground(new java.awt.Color(255, 255, 255));
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home.png"))); // NOI18N
        labelHome.setText("   Home");
        buttonHome.add(labelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 50));

        panelMenu.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 223, 50));

        buttonPanelAsistencia.setBackground(new java.awt.Color(43, 113, 205));
        buttonPanelAsistencia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanelAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanelAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPanelAsistenciaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPanelAsistenciaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanelAsistenciaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPanelAsistenciaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPanelAsistenciaMouseEntered(evt);
            }
        });
        buttonPanelAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelRegistro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Registro.png"))); // NOI18N
        labelRegistro.setText("  Asistencia");
        buttonPanelAsistencia.add(labelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        panelMenu.add(buttonPanelAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 223, 50));

        buttonPanelHomeRegistrar.setBackground(new java.awt.Color(43, 113, 205));
        buttonPanelHomeRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanelHomeRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanelHomeRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPanelHomeRegistrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPanelHomeRegistrarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanelHomeRegistrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPanelHomeRegistrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPanelHomeRegistrarMouseEntered(evt);
            }
        });
        buttonPanelHomeRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAgregar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelAgregar.setForeground(new java.awt.Color(255, 255, 255));
        labelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        labelAgregar.setText("   Registrar");
        buttonPanelHomeRegistrar.add(labelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 200, 50));

        panelMenu.add(buttonPanelHomeRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 223, 50));

        buttonPanelHomeActualizar.setBackground(new java.awt.Color(43, 113, 205));
        buttonPanelHomeActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanelHomeActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanelHomeActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPanelHomeActualizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPanelHomeActualizarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanelHomeActualizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPanelHomeActualizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPanelHomeActualizarMouseEntered(evt);
            }
        });
        buttonPanelHomeActualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelEliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelEliminar.setForeground(new java.awt.Color(255, 255, 255));
        labelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confi.png"))); // NOI18N
        labelEliminar.setText("   Eliminar o Actualizar");
        buttonPanelHomeActualizar.add(labelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 50));

        panelMenu.add(buttonPanelHomeActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 50));

        buttonPanelHomeGenerarReporte.setBackground(new java.awt.Color(43, 113, 205));
        buttonPanelHomeGenerarReporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanelHomeGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanelHomeGenerarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanelHomeGenerarReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPanelHomeGenerarReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPanelHomeGenerarReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPanelHomeGenerarReporteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPanelHomeGenerarReporteMouseReleased(evt);
            }
        });
        buttonPanelHomeGenerarReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelReporte.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelReporte.setForeground(new java.awt.Color(255, 255, 255));
        labelReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carpeta.png"))); // NOI18N
        labelReporte.setText("   Generar Reporte");
        buttonPanelHomeGenerarReporte.add(labelReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 50));

        panelMenu.add(buttonPanelHomeGenerarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 223, 50));

        buttonAjustes.setBackground(new java.awt.Color(43, 113, 205));
        buttonAjustes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAjustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAjustesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAjustesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAjustesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonAjustesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonAjustesMouseReleased(evt);
            }
        });
        buttonAjustes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAjustes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelAjustes.setForeground(new java.awt.Color(255, 255, 255));
        labelAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ajustes.png"))); // NOI18N
        buttonAjustes.add(labelAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 5, 40, 40));

        panelMenu.add(buttonAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 610, 60, 50));

        buttonPanelAgendar.setBackground(new java.awt.Color(43, 113, 205));
        buttonPanelAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanelAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPanelAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonPanelAgendarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonPanelAgendarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPanelAgendarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPanelAgendarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPanelAgendarMouseEntered(evt);
            }
        });
        buttonPanelAgendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCalendarizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCalendarizar.setForeground(new java.awt.Color(255, 255, 255));
        labelCalendarizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        labelCalendarizar.setText("   Agendar");
        buttonPanelAgendar.add(labelCalendarizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 50));

        panelMenu.add(buttonPanelAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 223, 50));

        labelMenu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosLogin/icons8_Menu_32px_1.png"))); // NOI18N
        labelMenu.setText("  Menu     ");
        panelMenu.add(labelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 232, 80));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 8));
        panelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 5, 680));

        getContentPane().add(panelMenu);
        panelMenu.setBounds(0, 0, 230, 680);

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setPreferredSize(new java.awt.Dimension(1000, 670));
        panelHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHomeMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelHomeMouseMoved(evt);
            }
        });
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAgendar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendar-clock-icon_34472.png"))); // NOI18N
        buttonAgendar.setText("Agendar");
        buttonAgendar.setToolTipText("Agendar una practica par los alumnos");
        buttonAgendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 2));
        buttonAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAgendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAgendar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAgendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAgendarMouseClicked(evt);
            }
        });
        panelHome.add(buttonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 200, 250));

        buttonAsistencia.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Registro(2).png"))); // NOI18N
        buttonAsistencia.setText("Asistencia");
        buttonAsistencia.setToolTipText("Pase de credencial para las practicas definida");
        buttonAsistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 2));
        buttonAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAsistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAsistencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAsistenciaActionPerformed(evt);
            }
        });
        panelHome.add(buttonAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 250));

        buttonRegistrar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuarioAgregar-ConvertImage.png"))); // NOI18N
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.setToolTipText("Registrar un alumno en el sistema");
        buttonRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 2));
        buttonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRegistrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });
        panelHome.add(buttonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 270, 250));

        buttonActualizar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/hombre(1).png"))); // NOI18N
        buttonActualizar.setText("Eliminar o Actualizar");
        buttonActualizar.setToolTipText("Eliminar o Actualizar un alumno en el sistema");
        buttonActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 2));
        buttonActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActualizarActionPerformed(evt);
            }
        });
        panelHome.add(buttonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logo.png"))); // NOI18N
        panelHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 990, -1));

        buttonRegistrarEmpleado.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        buttonRegistrarEmpleado.setText("Registrar Empleado");
        buttonRegistrarEmpleado.setToolTipText("Registrar un alumno en el sistema");
        buttonRegistrarEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 113, 205), 2));
        buttonRegistrarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRegistrarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRegistrarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarEmpleadoActionPerformed(evt);
            }
        });
        panelHome.add(buttonRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 270, 250));

        butonAgregarMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        butonAgregarMateria.setText("Materia");
        butonAgregarMateria.setToolTipText("Registra una Materia");
        butonAgregarMateria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 113, 205), 2, true));
        butonAgregarMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butonAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAgregarMateriaActionPerformed(evt);
            }
        });
        panelHome.add(butonAgregarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 110, 120));

        buttonAgendarPractica.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonAgendarPractica.setText("Practicas Reservadas");
        buttonAgendarPractica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 113, 205), 2, true));
        buttonAgendarPractica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAgendarPractica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendarPracticaActionPerformed(evt);
            }
        });
        panelHome.add(buttonAgendarPractica, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 180, 250));

        butonAgregarPractica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        butonAgregarPractica.setText("Practica");
        butonAgregarPractica.setToolTipText("Registra una practica");
        butonAgregarPractica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 113, 205), 2, true));
        butonAgregarPractica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butonAgregarPractica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonAgregarPracticaActionPerformed(evt);
            }
        });
        panelHome.add(butonAgregarPractica, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 110, 120));

        buttonAgendarPlanEstudios.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonAgendarPlanEstudios.setText("Registrar Plan de Estudios");
        buttonAgendarPlanEstudios.setToolTipText("Registrar un plan de estudios");
        buttonAgendarPlanEstudios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 113, 205), 2, true));
        buttonAgendarPlanEstudios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAgendarPlanEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendarPlanEstudiosActionPerformed(evt);
            }
        });
        panelHome.add(buttonAgendarPlanEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 270, 120));

        buttonVerDatos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        buttonVerDatos.setText("Ver datos Semestre");
        buttonVerDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(43, 113, 205), 2, true));
        buttonVerDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVerDatosActionPerformed(evt);
            }
        });
        panelHome.add(buttonVerDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 270, 120));

        getContentPane().add(panelHome);
        panelHome.setBounds(230, 0, 1000, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void panelHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen()-x, evt.getYOnScreen()-y);
    }//GEN-LAST:event_panelHomeMouseDragged

    int x,y;
    private void panelHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseMoved
        // TODO add your handling code here:
        x=evt.getX()+230;
        y=evt.getY();
        
    }//GEN-LAST:event_panelHomeMouseMoved

    private void buttonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAsistenciaActionPerformed
        pnlPaseDeCredencial.llenarBoxGrupos();
        ocultarPanelActual(pnlPaseDeCredencial);
    }//GEN-LAST:event_buttonAsistenciaActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        pnlRegistrar.vaciarTxt();
        ocultarPanelActual(pnlRegistrar);
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseClicked
    
        ocultarPanelActual(pnlPerfil);
    }//GEN-LAST:event_buttonPerfilMouseClicked

    private void buttonPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseEntered
        labelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario(1).png"))); // NOI18N
        activBordeButton(buttonPerfil);
    }//GEN-LAST:event_buttonPerfilMouseEntered

    private void buttonPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseExited
        labelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        desactivBordeButton(buttonPerfil);
    }//GEN-LAST:event_buttonPerfilMouseExited

    private void buttonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseClicked
        panelActivo.setVisible(false);
        panelActivo=panelHome;
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeMouseClicked

    private void buttonHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseExited
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home.png"))); // NOI18N
        desactivBordeButton(buttonHome);
    }//GEN-LAST:event_buttonHomeMouseExited

    private void buttonHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseEntered
        labelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/home(1).png"))); // NOI18N
        activBordeButton(buttonHome);
    }//GEN-LAST:event_buttonHomeMouseEntered

    private void buttonPanelAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAsistenciaMouseClicked
        pnlPaseDeCredencial.llenarBoxGrupos();
        ocultarPanelActual(pnlPaseDeCredencial);
    }//GEN-LAST:event_buttonPanelAsistenciaMouseClicked

    private void buttonPanelAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAsistenciaMouseExited
        labelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Registro.png"))); // NOI18N
        desactivBordeButton(buttonPanelAsistencia);
    }//GEN-LAST:event_buttonPanelAsistenciaMouseExited

    private void buttonPanelAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAsistenciaMouseEntered
        labelRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Registro(1).png"))); // NOI18N
        activBordeButton(buttonPanelAsistencia);
    }//GEN-LAST:event_buttonPanelAsistenciaMouseEntered

    private void buttonPanelHomeRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeRegistrarMouseClicked
        pnlRegistrar.vaciarTxt();
        ocultarPanelActual(pnlRegistrar);
    }//GEN-LAST:event_buttonPanelHomeRegistrarMouseClicked

    private void buttonPanelHomeRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeRegistrarMouseExited
        labelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        desactivBordeButton(buttonPanelHomeRegistrar);
    }//GEN-LAST:event_buttonPanelHomeRegistrarMouseExited

    private void buttonPanelHomeRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeRegistrarMouseEntered
        labelAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar(1).png"))); // NOI18N
        activBordeButton(buttonPanelHomeRegistrar);
    }//GEN-LAST:event_buttonPanelHomeRegistrarMouseEntered

    private void buttonPanelHomeActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeActualizarMouseClicked
        ocultarPanelActual(pnlActualizar);
        pnlActualizar.llenarTabla();
        pnlActualizar.llenarBoxGrupos();
    }//GEN-LAST:event_buttonPanelHomeActualizarMouseClicked

    private void buttonPanelHomeActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeActualizarMouseExited
        labelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confi.png"))); // NOI18N
        desactivBordeButton(buttonPanelHomeActualizar);
    }//GEN-LAST:event_buttonPanelHomeActualizarMouseExited

    private void buttonPanelHomeActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeActualizarMouseEntered
        labelEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confi(1).png"))); // NOI18N
        activBordeButton(buttonPanelHomeActualizar);
    }//GEN-LAST:event_buttonPanelHomeActualizarMouseEntered

    private void buttonPanelHomeGenerarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeGenerarReporteMouseClicked
        ocultarPanelActual(pnlReporte);
    }//GEN-LAST:event_buttonPanelHomeGenerarReporteMouseClicked

    private void buttonPanelHomeGenerarReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeGenerarReporteMouseExited
        labelReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carpeta.png"))); // NOI18N
        desactivBordeButton(buttonPanelHomeGenerarReporte);
    }//GEN-LAST:event_buttonPanelHomeGenerarReporteMouseExited

    private void buttonPanelHomeGenerarReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeGenerarReporteMouseEntered
        labelReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/carpeta(1).png"))); // NOI18N
        activBordeButton(buttonPanelHomeGenerarReporte);
    }//GEN-LAST:event_buttonPanelHomeGenerarReporteMouseEntered

    private void buttonPerfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMousePressed
        presionandoButton(buttonPerfil);
    }//GEN-LAST:event_buttonPerfilMousePressed

    private void buttonPerfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPerfilMouseReleased
        activBordeButton(buttonPerfil);
    }//GEN-LAST:event_buttonPerfilMouseReleased

    private void buttonHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMousePressed
        presionandoButton(buttonHome);
    }//GEN-LAST:event_buttonHomeMousePressed

    private void buttonHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeMouseReleased
        activBordeButton(buttonHome);
    }//GEN-LAST:event_buttonHomeMouseReleased

    private void buttonPanelAsistenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAsistenciaMousePressed
        presionandoButton(buttonPanelAsistencia);
    }//GEN-LAST:event_buttonPanelAsistenciaMousePressed

    private void buttonPanelAsistenciaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAsistenciaMouseReleased
        activBordeButton(buttonPanelAsistencia);
    }//GEN-LAST:event_buttonPanelAsistenciaMouseReleased

    private void buttonPanelHomeRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeRegistrarMousePressed
        presionandoButton(buttonPanelHomeRegistrar);
    }//GEN-LAST:event_buttonPanelHomeRegistrarMousePressed

    private void buttonPanelHomeRegistrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeRegistrarMouseReleased
        activBordeButton(buttonPanelHomeRegistrar);
    }//GEN-LAST:event_buttonPanelHomeRegistrarMouseReleased

    private void buttonPanelHomeActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeActualizarMousePressed
        presionandoButton(buttonPanelHomeActualizar);
    }//GEN-LAST:event_buttonPanelHomeActualizarMousePressed

    private void buttonPanelHomeActualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeActualizarMouseReleased
        activBordeButton(buttonPanelHomeActualizar);
    }//GEN-LAST:event_buttonPanelHomeActualizarMouseReleased

    private void buttonPanelHomeGenerarReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeGenerarReporteMousePressed
       presionandoButton(buttonPanelHomeGenerarReporte);
    }//GEN-LAST:event_buttonPanelHomeGenerarReporteMousePressed

    private void buttonPanelHomeGenerarReporteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelHomeGenerarReporteMouseReleased
        activBordeButton(buttonPanelHomeGenerarReporte);
    }//GEN-LAST:event_buttonPanelHomeGenerarReporteMouseReleased

    private void buttonPanelAgendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAgendarMousePressed
        presionandoButton(buttonPanelAgendar);
    }//GEN-LAST:event_buttonPanelAgendarMousePressed

    private void buttonPanelAgendarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAgendarMouseReleased
        activBordeButton(buttonPanelAgendar);
    }//GEN-LAST:event_buttonPanelAgendarMouseReleased

    private void buttonPanelAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAgendarMouseClicked
        ocultarPanelActual(pnlAgendar);
    }//GEN-LAST:event_buttonPanelAgendarMouseClicked

    private void buttonPanelAgendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAgendarMouseExited
        labelCalendarizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario.png"))); // NOI18N
        desactivBordeButton(buttonPanelAgendar);
    }//GEN-LAST:event_buttonPanelAgendarMouseExited

    private void buttonPanelAgendarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPanelAgendarMouseEntered
        labelCalendarizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendario(1).png"))); // NOI18N
        activBordeButton(buttonPanelAgendar);
    }//GEN-LAST:event_buttonPanelAgendarMouseEntered

    private void buttonAgendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAgendarMouseClicked
        ocultarPanelActual(pnlAgendar);
    }//GEN-LAST:event_buttonAgendarMouseClicked

    private void buttonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarEmpleadoActionPerformed
        pnlRegistrarEmpleado.vaciarTxt();
        ocultarPanelActual(pnlRegistrarEmpleado);
    }//GEN-LAST:event_buttonRegistrarEmpleadoActionPerformed

    private void buttonAjustesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjustesMouseEntered
        //labelAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ajustes(1).png"))); // NOI18N
        activBordeButton(buttonAjustes);
    }//GEN-LAST:event_buttonAjustesMouseEntered

    private void buttonAjustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjustesMouseExited
        labelAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ajustes.png"))); // NOI18N
        desactivBordeButton(buttonAjustes);
    }//GEN-LAST:event_buttonAjustesMouseExited

    private void buttonAjustesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjustesMousePressed
        presionandoButton(buttonAjustes);
    }//GEN-LAST:event_buttonAjustesMousePressed

    private void buttonAjustesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjustesMouseReleased
        activBordeButton(buttonAjustes);
    }//GEN-LAST:event_buttonAjustesMouseReleased

    private void buttonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActualizarActionPerformed
        ocultarPanelActual(pnlActualizar);
        pnlActualizar.llenarTabla();
        pnlActualizar.llenarBoxGrupos();
    }//GEN-LAST:event_buttonActualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea cerrar la aplicacion?", "Confirmar", JOptionPane.YES_NO_OPTION)==0){
            Splash.conexionBaseDatos.cerrar();
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        Splash.conexionBaseDatos.cerrar();
        this.dispose();
        new Login().setVisible(true);//Hacemos la instancia de la ventana que vamos a mostrar despues del splash
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void buttonReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReporteMouseClicked
        ocultarPanelActual(pnlReporte);
    }//GEN-LAST:event_buttonReporteMouseClicked

    private void butonAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAgregarMateriaActionPerformed
        dialogMateria dMateria = new dialogMateria(this, true);
        dMateria.setVisible(true);
    }//GEN-LAST:event_butonAgregarMateriaActionPerformed

    private void buttonAgendarPracticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendarPracticaActionPerformed

    }//GEN-LAST:event_buttonAgendarPracticaActionPerformed

    private void buttonAgendarPlanEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendarPlanEstudiosActionPerformed
        dialogPlanEstudios dPlan = new dialogPlanEstudios(this, true);
        dPlan.setVisible(true);
    }//GEN-LAST:event_buttonAgendarPlanEstudiosActionPerformed

    private void buttonVerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVerDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVerDatosActionPerformed

    private void butonAgregarPracticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonAgregarPracticaActionPerformed
        dialogPractica dPractica = new dialogPractica(this, true);
        dPractica.setVisible(true);
    }//GEN-LAST:event_butonAgregarPracticaActionPerformed

    private void buttonAjustesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjustesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAjustesMouseClicked
   
    private void checkPopup(MouseEvent e) {

         jPopupMenu1.show(e.getComponent(), e.getX()+65,-250 );

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonAgregarMateria;
    private javax.swing.JButton butonAgregarPractica;
    private javax.swing.JButton buttonActualizar;
    private javax.swing.JButton buttonAgendar;
    private javax.swing.JButton buttonAgendarPlanEstudios;
    private javax.swing.JButton buttonAgendarPractica;
    private javax.swing.JPanel buttonAjustes;
    private javax.swing.JButton buttonAsistencia;
    private javax.swing.JMenuItem buttonDesarrolladores;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonPanelAgendar;
    private javax.swing.JPanel buttonPanelAsistencia;
    private javax.swing.JPanel buttonPanelHomeActualizar;
    private javax.swing.JPanel buttonPanelHomeGenerarReporte;
    private javax.swing.JPanel buttonPanelHomeRegistrar;
    private javax.swing.JPanel buttonPerfil;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonRegistrarEmpleado;
    private javax.swing.JMenuItem buttonReporte;
    private javax.swing.JButton buttonVerDatos;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel labelAgregar;
    private javax.swing.JLabel labelAjustes;
    private javax.swing.JLabel labelCalendarizar;
    private javax.swing.JLabel labelEliminar;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelPerfil;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelReporte;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
    panelPerfil pnlPerfil;
    panelPaseDeCredencial pnlPaseDeCredencial;
    panelRegistrar pnlRegistrar;
    panelRegistrarEmpleado pnlRegistrarEmpleado;
    panelEliminar pnlActualizar;
    panelReporte pnlReporte;
    panelAgendar pnlAgendar;
    static javax.swing.JPanel panelActivo;
}
