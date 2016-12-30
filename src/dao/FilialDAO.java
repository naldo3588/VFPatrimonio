/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.EquipamentoBean;
import bean.FilialBean;
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
public class FilialDAO {

    private Statement stmt;
    private ResultSet rsNavegar;
    private java.sql.ResultSet rsListar;
    private Connection con;

    public boolean inserir(FilialBean filial) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_filial(cnpj,inscricao_estadual,razao_social,endereco,numero,bairro,cep,cidade,telefone,uf) VALUES (?,?,?,?,?,?,?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, filial.getCnpj());
            ps.setString(2, filial.getInscricao_estadual());
            ps.setString(3, filial.getRazao_social());
            ps.setString(4, filial.getEndereco());
            ps.setString(5, filial.getNumero());
            ps.setString(6, filial.getBairro());
            ps.setString(7, filial.getCep());
            ps.setString(8, filial.getCidade());
            ps.setString(9, filial.getTelefone());
            ps.setString(10, filial.getUf());

//            JOptionPane.showMessageDialog(null, "Filial de " + filial.getCidade() + " Cadastrada com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

    public boolean altera(FilialBean filial) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE cad_filial SET cnpj='"
                    + filial.getCnpj()+ "',inscricao_estadual='" + filial.getInscricao_estadual() + "',razao_social='" + filial.getRazao_social() + "',endereco='" + filial.getEndereco() + "',numero='" + filial.getNumero() + "',bairro='" + filial.getBairro() + "',cep='" + filial.getCep() + "',cidade='" + filial.getCidade() + "',telefone='" + filial.getTelefone() + "',uf='" + filial.getUf() + "' WHERE id_filial='" + filial.getId_filial() + "'");
//            JOptionPane.showMessageDialog(null, " Filial Atualizada com Sucesso!!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

}
