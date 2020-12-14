/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana_Alumnos_IU;

import Alumnos.AlumnoBO;

/**
 *
 * @author WINDOWS
 */
public class FrmAlumno extends javax.swing.JFrame {

    private AlumnoBO ebo = new AlumnoBO();
    
    /**
     *
     */
    public FrmAlumno() {
        initComponents();
        listarAlumno();
    }
    //creado
    
    /**
     *
     */
    public void listarAlumno(){
        ebo.listarAlumno(tbAlumno);
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
        groupGenero = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUniversidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMujer = new javax.swing.JRadioButton();
        txtHombre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlumno = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ID:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtIdAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtIdAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Formulario Alumno");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombres: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        txtEdad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Edad: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtCiclo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCicloActionPerformed(evt);
            }
        });
        jPanel2.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ciclo: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Genero: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        txtUniversidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(txtUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Universidad: ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        txtMujer.setBackground(new java.awt.Color(255, 255, 255));
        groupGenero.add(txtMujer);
        txtMujer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMujer.setText("Mujer");
        jPanel2.add(txtMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        txtHombre.setBackground(new java.awt.Color(255, 255, 255));
        groupGenero.add(txtHombre);
        txtHombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHombre.setText("Hombre");
        jPanel2.add(txtHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        tbAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbAlumno);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 480, 370));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCicloActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup groupGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlumno;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JRadioButton txtHombre;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JRadioButton txtMujer;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtUniversidad;
    // End of variables declaration//GEN-END:variables
}
