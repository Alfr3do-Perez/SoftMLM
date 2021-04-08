/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import DataBase.ConexionDB;
import DataBase.ProcedimientosDAO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AlfredoPerez
 */
public class JFrameLogin extends javax.swing.JFrame {

    public static ConexionDB conexionDB;
    private static ResultSet resultSet;
    private final ProcedimientosDAO procedimientosDAO;
    
    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        conexionDB = new ConexionDB();
        initComponents();
        procedimientosDAO = new ProcedimientosDAO(ConexionDB.conexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelLado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        separadorSoftMLM = new javax.swing.JSeparator();
        etiquetaIniciarSesion = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        panelCampoUsuario1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        txtUsuario1 = new javax.swing.JTextField();
        panelCampoUsuario = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        botonIniciarSesion = new interfazGraficaComponentes.BotonPersonalizado();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setForeground(new java.awt.Color(204, 204, 255));
        panelFondo.setToolTipText("");
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLado.setBackground(new java.awt.Color(29, 48, 107));
        panelLado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SoftMLM");
        panelLado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        panelLado.add(separadorSoftMLM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, 30));

        panelFondo.add(panelLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 570));

        etiquetaIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaIniciarSesion.setText("Iniciar Sesión");
        panelFondo.add(etiquetaIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        etiquetaUsuario.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaUsuario.setText("Usuario");
        panelFondo.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        etiquetaContraseña.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaContraseña.setText("Contraseña");
        panelFondo.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        panelCampoUsuario1.setBackground(new java.awt.Color(255, 255, 255));
        panelCampoUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        panelCampoUsuario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCampoUsuario1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 10));

        txtUsuario1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txtUsuario1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUsuario1.setBorder(null);
        txtUsuario1.setPreferredSize(new java.awt.Dimension(320, 30));
        panelCampoUsuario1.add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        panelFondo.add(panelCampoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 320, 50));

        panelCampoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        panelCampoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        panelCampoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelCampoUsuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 10));

        txtContraseña.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtContraseña.setBorder(null);
        txtContraseña.setPreferredSize(new java.awt.Dimension(320, 30));
        panelCampoUsuario.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelFondo.add(panelCampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 320, 50));

        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.setColorHover(new java.awt.Color(45, 116, 191));
        botonIniciarSesion.setColorNormal(new java.awt.Color(58, 103, 201));
        botonIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        botonIniciarSesion.setPreferredSize(new java.awt.Dimension(160, 40));
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        panelFondo.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/img/login_fotousuario.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelFondo.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 70, 70));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelFondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarDatos(){
        char[] arrayC = txtContraseña.getPassword();
        String contraseña = new String(arrayC);
        return (!txtUsuario1.getText().equals("") && !contraseña.equals(""));
    }
    
    
    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        JFrameAdministarCatalago administrarCatalago = new JFrameAdministarCatalago();
        /*if(validarDatos()){
            char[] arrayC = txtContraseña.getPassword();
            String contraseña = new String(arrayC);
            if(comprobarUsuario(txtUsuario1.getText(), contraseña)){
               this.dispose();
               NewJFrame administrarCatalago = new NewJFrame();
            }
            else{
                new AlertError(this, rootPaneCheckingEnabled, "El usuario o la contraseña son incorrectos!").setVisible(true);
            }
        }
        else{
            new AlertError(this, rootPaneCheckingEnabled, "No puede haber campos vacios!").setVisible(true);
        }*/
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new JDialogAgregarProducto(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private Boolean comprobarUsuario(String usuario, String contraseña){
        String sql = "SELECT Usuario, Contraseña FROM soft_mlmbd.empleado";
        try {
            resultSet = procedimientosDAO.ejecututarQuery(sql);
            while(resultSet.next()){
                Object[] datos = new Object[5];
                datos[0] = resultSet.getString(1);
                datos[1] = resultSet.getString(2);
                return (usuario.equals(datos[0])) && (contraseña.equals(datos[1]));
            }
           
        } catch (SQLException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfazGraficaComponentes.BotonPersonalizado botonIniciarSesion;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaIniciarSesion;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelCampoUsuario;
    private javax.swing.JPanel panelCampoUsuario1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelLado;
    private rojerusan.RSPanelImage rSPanelImage1;
    private javax.swing.JSeparator separadorSoftMLM;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
