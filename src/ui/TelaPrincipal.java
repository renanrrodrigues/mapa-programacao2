/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import controller.ListUser;
import controller.LoginController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import model.Usuario;

/**
 *
 * @author conta
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFild = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setName("telaPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jTextFieldLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLogin.setToolTipText("digite seu login");
        jTextFieldLogin.setName("tfLogin"); // NOI18N
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, 185, -1));

        jPasswordFild.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jPasswordFild.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFild.setToolTipText("");
        jPasswordFild.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordFild.setEchoChar('*');
        getContentPane().add(jPasswordFild, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 95, 185, -1));

        jButtonLogin.setBackground(new java.awt.Color(255, 51, 153));
        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(204, 255, 255));
        jButtonLogin.setText("ENTRAR");
        jButtonLogin.setBorder(null);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 80, 30));

        jButtonCadastrar.setBackground(new java.awt.Color(255, 51, 153));
        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(204, 255, 255));
        jButtonCadastrar.setText("CADASTRAR NOVO USUÁRIO");
        jButtonCadastrar.setBorder(null);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 230, 30));

        jButtonList.setBackground(new java.awt.Color(255, 51, 153));
        jButtonList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonList.setForeground(new java.awt.Color(204, 255, 255));
        jButtonList.setText("LISTA");
        jButtonList.setBorder(null);
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButtonListActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        getContentPane().add(jButtonList, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/img/tela-principal.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 200));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "USER", "EMAIL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 450, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed

        dispose();

        TelaCadastro tela = new TelaCadastro();
        setLocationRelativeTo(null);
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        char[] senha = jPasswordFild.getPassword();
        String senhaString = new String(senha);
        
        Usuario usuario = new Usuario(jTextFieldLogin.getText(), senhaString);
        

        try {
            usuario = LoginController.loginUsuario(usuario);
            
            JOptionPane.showMessageDialog(null, "Usuário: "+usuario.getNome()+"\nID: "+usuario.getId()+"\nConectado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_jButtonListActionPerformed
        // TODO add your handling code here:
        // Cria um novo DefaultTableModel para a tabela
        DefaultTableModel model = new DefaultTableModel();

        // clear table
        model.setRowCount(0);

        // Adiciona as colunas à tabela
        model.addColumn("ID");
        model.addColumn("USER");
        model.addColumn("EMAIL");


        List<Usuario> usuarios = ListUser.listUser();



        // Percorre o ResultSet e adiciona cada linha à tabela
        for (Usuario usuario : usuarios) {
            model.addRow(new Object[]{
                usuario.getId(),
                usuario.getLogin(),
                usuario.getEmail()
            });
        }

        // Define o novo modelo para a tabela
        jTable1.setModel(model);
        usuarios.clear();
    }//GEN-LAST:event_jButtonListActionPerformed

    

    public static void telaInicial() {
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordFild;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
