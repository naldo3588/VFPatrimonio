/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.EquipamentoBean;
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
public class EquipamentoDAO {

    private Statement stmt;
    private ResultSet rsNavegar;
    private java.sql.ResultSet rsListar;
    private Connection con;

    public boolean inserir(EquipamentoBean equipamento) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_equipamento(descricao,modelo,num_serie,marca,processador,frequencia,ram,hd,filial,departamento,usuario,observacao,ult_verificacao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, equipamento.getDescricao());
            ps.setString(2, equipamento.getModelo());
            ps.setString(3, equipamento.getNum_serie());
            ps.setString(4, equipamento.getMarca());
            ps.setString(5, equipamento.getProcessador());
            ps.setString(6, equipamento.getFrequencia());
            ps.setString(7, equipamento.getRam());
            ps.setString(8, equipamento.getHd());
            ps.setString(9, equipamento.getFilial());
            ps.setString(10, equipamento.getDepartamento());
            ps.setString(11, equipamento.getUsuario());
            ps.setString(12, equipamento.getObservacao());
            ps.setObject(13, equipamento.getUlt_verificacao());

//            JOptionPane.showMessageDialog(null, "Equipamento do Usuario " + equipamento.getUsuario() + " Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }
    
     public boolean inserirProcessador(EquipamentoBean equipamento) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_equipamento(descricao,modelo,num_serie,marca,processador,frequencia,ram,hd,filial,departamento,usuario,observacao,ult_verificacao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, equipamento.getProcessador());
            ps.setString(6, equipamento.getFrequencia());
  
            JOptionPane.showMessageDialog(null, "Equipamento do Usuario " + equipamento.getUsuario() + " Cadastrado com sucesso! ");

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }
}
