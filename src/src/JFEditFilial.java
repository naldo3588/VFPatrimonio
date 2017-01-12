/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import bean.FilialBean;
import factory.ConexaoFactory;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronaldo.pedro
 */
public class JFEditFilial extends javax.swing.JFrame {

    JFCadFilial jFCadFilial;
    private java.sql.Connection con;
    private java.sql.Statement stmtListar;
    private java.sql.ResultSet rsListar;
    String look_and_fell = ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

    /**
     * Creates new form JFEditFilial
     */
    public JFEditFilial() {
        initComponents();
        jRadioButtonNaoExato.setSelected(true);
        jComboBoxPesquisar.setSelectedItem("Cidade");
        jTextFieldBuscar.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonExato = new javax.swing.JRadioButton();
        jRadioButtonNaoExato = new javax.swing.JRadioButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPesquisar = new javax.swing.JComboBox<>();
        jButtonSetar = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilial = new javax.swing.JTable();
        jButtonSair = new javax.swing.JButton();
        jButtonLimparPesq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta Filiais Cadastradas");

        jRadioButtonExato.setText("Exato");

        jRadioButtonNaoExato.setText("Não Exato");

        jTextFieldID.setEditable(false);

        jLabel1.setText("ID:");

        jComboBoxPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Cidade", "CNPJ" }));

        jButtonSetar.setText("Setar");
        jButtonSetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Buscar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableFilial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CNPJ", "Insc. Estad", "Raz. Social", "Endereço", "Numero", "Bairro", "CEP", "Cidade", "Telefone", "UF"
            }
        ));
        jTableFilial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFilialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFilial);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonLimparPesq.setText("Limpar Pesquisa");
        jButtonLimparPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparPesqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonLimparPesq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSetar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar)
                        .addGap(55, 55, 55)
                        .addComponent(jRadioButtonExato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonNaoExato)
                        .addGap(115, 190, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jRadioButtonExato)
                    .addComponent(jRadioButtonNaoExato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonSetar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonLimparPesq))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetarActionPerformed
        // TODO add your handling code here:
        this.dispose();

        jFCadFilial = new JFCadFilial();
        jFCadFilial.setVisible(true);
        jFCadFilial.recebendo(jTextFieldID.getText());
        jFCadFilial.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonSetarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("Cidade") && jRadioButtonNaoExato.isSelected()) {
            buscarCidadeLike();
        }
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("Cidade") && jRadioButtonExato.isSelected()) {
            buscarCidadeNotLike();
        }
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("CNPJ") && jRadioButtonNaoExato.isSelected()) {
            buscarCNPJLike();
        }
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("CNPJ") && jRadioButtonExato.isSelected()) {
            buscarCNPJNotLike();
        }
        if (jTextFieldBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de Busca Vazio!");
            jTextFieldBuscar.requestFocus();
        }
        if (jComboBoxPesquisar.getSelectedItem().toString().equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de Pesquisa!!");
            jTextFieldBuscar.requestFocus();
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableFilialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFilialMouseClicked
        // TODO add your handling code here:
        clickMouse();
    }//GEN-LAST:event_jTableFilialMouseClicked

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        JFCadFilial filial = new JFCadFilial();
        filial.setLocationRelativeTo(null);
        filial.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLimparPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparPesqActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jTableFilial.getModel()).setNumRows(0);
        ((DefaultTableModel) jTableFilial.getModel()).setNumRows(9);
        jTextFieldBuscar.setText("");
        jTextFieldID.setText("");
        jTextFieldBuscar.requestFocus();
    }//GEN-LAST:event_jButtonLimparPesqActionPerformed

    private void buscarCidadeLike() {
        try {
            FilialBean filial = new FilialBean();
            filial.setCidade(jTextFieldBuscar.getText());
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cidade LIKE '%" + filial.getCidade() + "%'");
            if (!rsListar.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum resultado para esta pesqusa!!");
                jTextFieldBuscar.requestFocus();
            } else {
                rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cidade LIKE '%" + filial.getCidade() + "%'");
                montarTabela();
            }
        } catch (SQLException ex) {

        }
    }

    private void buscarCidadeNotLike() {
        try {
            FilialBean filial = new FilialBean();
            filial.setCidade(jTextFieldBuscar.getText());
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cidade ='" + filial.getCidade() + "'");
            if (!rsListar.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum resultado para esta pesqusa!!");
                jTextFieldBuscar.requestFocus();
            } else {
                rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cidade ='" + filial.getCidade() + "'");
                montarTabela();
            }
        } catch (SQLException ex) {

        }
    }

    private void buscarCNPJLike() {
        try {
            FilialBean filial = new FilialBean();
            filial.setCnpj(jTextFieldBuscar.getText());
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cnpj LIKE '%" + filial.getCnpj() + "%'");
            if (!rsListar.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum resultado para esta pesqusa!!");
                jTextFieldBuscar.requestFocus();
            } else {
                rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cnpj LIKE '%" + filial.getCnpj() + "%'");
                montarTabela();
            }
        } catch (SQLException ex) {

        }
    }

    private void buscarCNPJNotLike() {
        try {
            FilialBean filial = new FilialBean();
            filial.setCidade(jTextFieldBuscar.getText());
            iniciarBD();
            rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cnpj ='" + filial.getCnpj() + "'");
            if (!rsListar.next()) {
                JOptionPane.showMessageDialog(null, "Nenhum resultado para esta pesqusa!!");
                jTextFieldBuscar.requestFocus();
            } else {
                rsListar = stmtListar.executeQuery("SELECT * FROM cad_filial WHERE cnpj ='" + filial.getCnpj() + "'");
                montarTabela();
            }
        } catch (SQLException ex) {

        }
    }

    private void iniciarBD() {
        try {
            con = ConexaoFactory.getConnection();
            stmtListar = con.createStatement();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private void montarTabela() {
        int linha = 0;
        try {
            while (rsListar.next()) {
                String id_filial = rsListar.getString("id_filial");
                String cnpj = rsListar.getString("cnpj");
                String inscricao_estadual = rsListar.getString("inscricao_estadual");
                String razao_social = rsListar.getString("razao_social");
                String endereco = rsListar.getString("endereco");
                String numero = rsListar.getString("numero");
                String bairro = rsListar.getString("bairro");
                String cep = rsListar.getString("cep");
                String cidade = rsListar.getString("cidade");
                String telefone = rsListar.getString("telefone");
                String uf = rsListar.getString("uf");
                jTableFilial.getModel().setValueAt(id_filial, linha, 0);
                jTableFilial.getModel().setValueAt(cnpj, linha, 1);
                jTableFilial.getModel().setValueAt(inscricao_estadual, linha, 2);
                jTableFilial.getModel().setValueAt(razao_social, linha, 3);
                jTableFilial.getModel().setValueAt(telefone, linha, 4);
                jTableFilial.getModel().setValueAt(endereco, linha, 5);
                jTableFilial.getModel().setValueAt(numero, linha, 6);
                jTableFilial.getModel().setValueAt(bairro, linha, 7);
                jTableFilial.getModel().setValueAt(cep, linha, 8);
                jTableFilial.getModel().setValueAt(cidade, linha, 9);
                jTableFilial.getModel().setValueAt(uf, linha, 10);

                linha++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error " + ex.getMessage());
        }
    }

    private void clickMouse() {

        try {
            int indiceLinha = jTableFilial.getSelectedRow();
            jTextFieldID.setText(jTableFilial.getValueAt(indiceLinha, 0).toString());
//            jTextFieldNovoNome.setEnabled(true);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Selecione Uma Linha Preenchida!");
        }
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
            java.util.logging.Logger.getLogger(JFEditFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEditFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEditFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEditFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEditFilial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimparPesq;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSetar;
    private javax.swing.JComboBox<String> jComboBoxPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonExato;
    private javax.swing.JRadioButton jRadioButtonNaoExato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFilial;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}
