/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.EquipamentoBean;
import bean.FilialBean;
import bean.UsuarioBean;
import factory.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ronaldo.pedro
 */
public class UsuarioDAO {

    private Statement stmt;
    private ResultSet rsNavegar;
    private java.sql.ResultSet rsListar;
    private Connection con;

    public boolean inserir(UsuarioBean usuario) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_usuario(nome,cpf,filial,email,ativo,usuario,senha,permissao) VALUES (?,?,?,?,?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getCpf());
            ps.setString(3, usuario.getFilial());
            ps.setString(4, usuario.getEmail());
            ps.setInt(5, usuario.getAtivo());
            ps.setString(6, usuario.getUsuario());
            ps.setString(7, usuario.getSenha());
            ps.setString(8, usuario.getPermissao());
           

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

//    public boolean altera(FilialBean usuario) throws ClassNotFoundException {
//        try {
//
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE cad_usuario SET cnpj='"
//                    + usuario.getCnpj()+ "',inscricao_estadual='" + usuario.getInscricao_estadual() + "',razao_social='" + usuario.getRazao_social() + "',endereco='" + usuario.getEndereco() + "',numero='" + usuario.getNumero() + "',bairro='" + usuario.getBairro() + "',cep='" + usuario.getCep() + "',cidade='" + usuario.getCidade() + "',telefone='" + usuario.getTelefone() + "',uf='" + usuario.getUf() + "' WHERE id_usuario='" + usuario.getId_usuario() + "'");
////            JOptionPane.showMessageDialog(null, " Filial Atualizada com Sucesso!!");
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }

//    public boolean inserirDpto(FilialBean usuario) {
//        
//        try {
//           con = ConexaoFactory.getConnection();
//            String sql = "INSERT INTO cad_dpto(nome_dpto) VALUES (?)";
//            System.out.println("SQL");
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, usuario.getDepartamento());
//            
//         return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;
//
//        } catch (SQLException e) {
//
//            return false;
//        } catch (ClassNotFoundException e) {
//
//            return false;
//        }
//    }
    
}
