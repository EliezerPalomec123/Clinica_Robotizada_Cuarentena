/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aldair
 */
public class dialogAgendar extends javax.swing.JDialog {

    /**
     * Creates new form dialogCalendarizar
     */
    public dialogAgendar(java.awt.Frame parent, boolean modal,String nombreLaboratorio) {
        super(parent, modal);
        initComponents();
        panelDialogAgendar pnlDialogAgendar= new panelDialogAgendar(this,nombreLaboratorio);
        pnlDialogAgendar.llenarTabla();
        pnlDialogAgendar.llenarBoxGrupos();
        pnlDialogAgendar.llenarBoxPracticas();
        pnlDialogAgendar.llenarBoxNombreProfesor();
        this.setSize(1100,735);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}