/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.ConexionBD;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author 56929006
 */
public class fmrRegitros extends javax.swing.JFrame {
    Connection conectar = ConexionBD.getConnection();
    DefaultTableModel modelo;
    Statement stm;
    ResultSet rs;
    TableRowSorter ts;

    public String valores() {
        int valores = 0;
    if(valores>15){
        jLabel6.setText("Cantidad de caracteres excedidos");
        
    }
        return null;
        
    
}
    /**
     * Creates new form fmrRegitros
     */
    public fmrRegitros() {
        initComponents();
        cargar_Usuario();
        setLocationRelativeTo(this);
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btneliminar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        txtfnya = new javax.swing.JTextField();
        txtfuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtusuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtfpass = new javax.swing.JPasswordField();
        txtbuscar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnvaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros");
        setBackground(new java.awt.Color(0, 0, 0));

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Nombre y Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Tipo Usuario");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Formulario Registros Usuarios");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));

        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Volver al Inicio");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jtusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtusuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtusuarios);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/open_pane_96px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtfpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfpassActionPerformed(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Buscar");

        btnvaciar.setText("Vaciar Campos");
        btnvaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfnya, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfuser, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(63, 63, 63)
                                            .addComponent(jLabel1))
                                        .addComponent(txtfpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(76, 76, 76)))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnagregar)
                            .addComponent(btneditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnvaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnagregar)
                        .addGap(32, 32, 32)
                        .addComponent(btneditar)
                        .addGap(27, 27, 27)
                        .addComponent(btneliminar)
                        .addGap(28, 28, 28)
                        .addComponent(btnvaciar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here
            
        
        try {
            conectar = (Connection) ConexionBD.getConnection();
            String sql = "INSERT INTO registros (usuario_nomape ,usuario_nom, usuario_pass, usuario_tipo) "
                    + "VALUES (?,?,?,?)";
             
           
           PreparedStatement ps = conectar.prepareCall(sql);
           ps.setString(1, txtfnya.getText());
           ps.setString(2, txtfuser.getText());
           ps.setString(3, txtfpass.getText());
           ps.setString(4, (String) jComboBox2.getSelectedItem());

         
           int n=ps.executeUpdate();
           if(n>0){
               JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
           }
          
        } catch (Exception e) {
          // al poner UNIQUE en la BD, al poner un mismo nombre de usuario salta error
            if(e.getMessage().toLowerCase().contains("duplicate entry")){
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
            }else {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario" + e.getMessage());

            }
                    
                    
        }
        txtfnya.setText("");
        txtfpass.setText("");
        txtfuser.setText("");
        
        
    }//GEN-LAST:event_btnagregarActionPerformed

    public void verificacion() {
        btnagregar.setEnabled(true);
        btneditar.setEnabled(true);
        String agregar = txtfnya.getText();
        agregar = txtfuser.getText();
        agregar = txtfpass.getText();
        if(agregar.isEmpty()){
            btnagregar.setEnabled(false);
            btneditar.setEnabled(false);
           
        }
        else{ 
            btnagregar.setEnabled(true);
            btneditar.setEnabled(true);
        }
    }
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        verificacion();
        try {
            int fila;
            String sql;
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea actualizar los datos anteriores?",
                    "Registro actualizado", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                fila =jtusuarios.getSelectedRow();
                sql="UPDATE registros SET usuario_nomape='"+txtfnya.getText()+"',usuario_nom='"+txtfuser.getText()+
                        "',usuario_pass='"+txtfpass.getText()+"',usuario_tipo='"+jComboBox2.getSelectedItem()+
                        "'WHERE id='"+jtusuarios.getValueAt(fila, 0)+"'";
                    PreparedStatement ps = conectar.prepareCall(sql);
                    int n= ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                }
            
        }
        } catch ( SQLException | HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "ERROR  "+e.getMessage());

            
        }
        cargar_Usuario();
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void jtusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtusuariosMouseClicked
        // TODO add your handling code here:
        
        if(evt.getButton() == 1) {
            int fila = jtusuarios.getSelectedRow();
            try {
                String sql = "SELECT * FROM registros WHERE id="+jtusuarios.getValueAt(fila, 0);
                stm =conectar.createStatement();
                ResultSet rs =stm.executeQuery(sql);
                rs.next();
                txtfnya.setText(rs.getString("usuario_nomape"));
                txtfuser.setText(rs.getString("usuario_nom"));
                txtfpass.setText(rs.getString("usuario_pass"));
                jComboBox2.setSelectedItem(rs.getString("usuario_tipo"));
                
                
           
                    
                    
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
    }//GEN-LAST:event_jtusuariosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            int fila =jtusuarios.getSelectedRow();
            String sql;
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar los datos anteriores?",
                    "Registro actualizado", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                fila =jtusuarios.getSelectedRow();
                sql= "DELETE FROM registros WHERE `registros`.`id` = "+jtusuarios.getValueAt(fila, 0);
                    PreparedStatement ps = conectar.prepareCall(sql);
                    int n= ps.executeUpdate();
                if(n>0){
                    JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
                }
            
        }
        } catch ( SQLException | HeadlessException e) {
                        JOptionPane.showMessageDialog(null, "ERROR  "+e.getMessage());

            
        }
        cargar_Usuario();
        
                       
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           frmLogin objsal = new frmLogin();
        objsal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfpassActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        // TODO add your handling code here:
        txtbuscar.addKeyListener(new KeyAdapter() {
        public void keyReleased(KeyEvent ke) {
        ts.setRowFilter(RowFilter.regexFilter("(?i)" + txtbuscar.getText(),1));

        }
        });
        ts = new TableRowSorter(modelo);
        jtusuarios.setRowSorter(ts);
        
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void btnvaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvaciarActionPerformed
        // TODO add your handling code here:
        txtfnya.setText("");
        txtfpass.setText("");
        txtfuser.setText("");
    }//GEN-LAST:event_btnvaciarActionPerformed

    private void cargar_Usuario() {
        jtusuarios.setAutoResizeMode(0);
        try {
            conectar = ConexionBD.getConnection();
            String[] titulos = {"ID Usuario", "Nombre/Apellido", "Username","Contraseña","Tipo"};
            String sql = "SELECT * FROM registros";
            modelo = new DefaultTableModel(null, titulos);
            stm = conectar.createStatement();
            rs = stm.executeQuery(sql); //consullta
            String[] fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("id");
                fila[1]=rs.getString("usuario_nomape");
                fila[2]=rs.getString("usuario_nom");
                fila[3]=rs.getString("usuario_pass");
                fila[4]=rs.getString("usuario_tipo");
                modelo.addRow(fila);
                
            }
            
            jtusuarios.setModel(modelo);
            configTabla();
        } catch (Exception e) {
        }
        
    }
    public void configTabla() {
        jtusuarios.setAutoResizeMode(0);
        TableColumnModel columnModel = jtusuarios.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(80);
                columnModel.getColumn(1).setPreferredWidth(80);
                columnModel.getColumn(2).setPreferredWidth(80);
                columnModel.getColumn(3).setPreferredWidth(80);
                columnModel.getColumn(4).setPreferredWidth(80);
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                jtusuarios.getColumnModel().getColumn(0).setCellRenderer(tcr);
                jtusuarios.getColumnModel().getColumn(1).setCellRenderer(tcr);
                jtusuarios.getColumnModel().getColumn(2).setCellRenderer(tcr);


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
            java.util.logging.Logger.getLogger(fmrRegitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrRegitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrRegitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrRegitros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrRegitros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnvaciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtusuarios;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtfnya;
    private javax.swing.JPasswordField txtfpass;
    private javax.swing.JTextField txtfuser;
    // End of variables declaration//GEN-END:variables
}
