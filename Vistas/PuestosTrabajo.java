package Vistas;

import Modelo.*;
import Controlador.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class PuestosTrabajo extends javax.swing.JDialog {
  Conexion conexion = new Conexion();
  Connection connection;
  Statement st;
  ResultSet rs;
  ListarModeloDB cbSucursal;
  ArrayList mListaSucursales;
  ComboBoxModel enumPuestosTrabajo;

  public PuestosTrabajo(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    enumPuestosTrabajo = new DefaultComboBoxModel(EnumPuestosTrabajo.values());
    initComponents();
    this.setLocationRelativeTo(parent);
    cbSucursal = new ListarModeloDB();
    llenarComboBoxSucursales();
    mListaSucursales = new ArrayList(); //almacenar todas las sucursales
  }
  public void llenarComboBoxSucursales(){
    mListaSucursales = cbSucursal.getListaSucursales();//devuelve todas las sucursales que existen en la base de datos
    Iterator iterator = mListaSucursales.iterator(); //verificar cantidad de Items que tiene nuestra lista
    while(iterator.hasNext()){
      Sucursal sucursal = (Sucursal) iterator.next();
      cbSucursales.addItem(sucursal);   
    }
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    cbSucursales = new javax.swing.JComboBox<>();
    cbPuestosTrabajo = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    txtSalario = new javax.swing.JTextField();
    btnAdd = new javax.swing.JButton();
    btnEliminar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(204, 204, 204));

    jLabel1.setText("Sucursal");

    jLabel2.setText("Puestos de trabajo");

    cbPuestosTrabajo.setModel(enumPuestosTrabajo);
    cbPuestosTrabajo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cbPuestosTrabajoActionPerformed(evt);
      }
    });

    jLabel3.setText("Salario");

    btnAdd.setText("Añadir");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddActionPerformed(evt);
      }
    });

    btnEliminar.setText("Eliminar");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(92, 92, 92)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(btnAdd)
          .addComponent(jLabel3)
          .addComponent(jLabel2)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(cbSucursales, 0, 148, Short.MAX_VALUE)
            .addComponent(cbPuestosTrabajo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSalario))
          .addComponent(btnEliminar))
        .addContainerGap(103, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(60, 60, 60)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(cbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(cbPuestosTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(21, 21, 21)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnAdd)
          .addComponent(btnEliminar))
        .addContainerGap(44, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    String  puestoTrabajo = cbPuestosTrabajo.getSelectedItem().toString();
    String  sucursal = cbSucursales.getSelectedItem().toString();
    String salario = txtSalario.getText();
    String query = "SELECT idSucursal FROM sucursal WHERE nombreSucursal = '"+sucursal+"';";
    System.out.println(query);
    try {
      connection = conexion.getConnection();
      st = connection.createStatement();
      rs = st.executeQuery(query);
      while(rs.next()){ //mostrarme que es lo que esta capturando
        int idSucursal = rs.getInt("idSucursal");
        String queryInsertarPuestoT = "INSERT INTO `puestotrabajo`(`nombrePuestoTrabajo`, `salario`, `FK_idSucursal`) VALUES ('"+ puestoTrabajo +"','"+ salario +"',"+ idSucursal +");";
        System.out.println(queryInsertarPuestoT);   
        try{
          st.executeUpdate(queryInsertarPuestoT);
          this.dispose();   
          JOptionPane.showMessageDialog(this, "El puesto de trabajo ha sido creado en la sucursal"+ sucursal);
        }catch(SQLException e){
          System.out.println(e);
        }
      }
    } catch (SQLException e) {
      System.out.println(e);
    }
  }//GEN-LAST:event_btnAddActionPerformed

  private void cbPuestosTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuestosTrabajoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cbPuestosTrabajoActionPerformed

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
      java.util.logging.Logger.getLogger(PuestosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(PuestosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(PuestosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(PuestosTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        PuestosTrabajo dialog = new PuestosTrabajo(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAdd;
  private javax.swing.JButton btnEliminar;
  private javax.swing.JComboBox<String> cbPuestosTrabajo;
  private javax.swing.JComboBox<Sucursal> cbSucursales;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField txtSalario;
  // End of variables declaration//GEN-END:variables
}
