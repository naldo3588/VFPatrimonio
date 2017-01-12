/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ronaldo Pedro
 */
public class ConexaoFactory {

    public static Connection con;
    public Statement stmt;
    public ResultSet rs;

    String url = "jdbc:mysql://localhost:3306/vfpatrimonio/";
    String driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String password = "root";

    public static Connection getConnection() throws ClassNotFoundException,
            SQLException {
        if (con == null) {
            String url = "jdbc:mysql://localhost:3306/vfpatrimonio";
            String driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String pass = "root";

            con = DriverManager.getConnection(url, user, pass);
            return con;
        } else {
            return con;
        }
    }

    public void conexao() {
        try {
            System.setProperty("com.mysql.jdbc.Driver", driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
    }

    public void desconecta() {
        try {
            con.close();
        } catch (Exception e) {
        }
    }

    public void executaSQL(String sql) {
        try {

            stmt = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stmt.executeQuery(sql);

        } catch (SQLException ex) {

        }
    }

    public void createStatement() {
        try {
            stmt = con.createStatement();
        } catch (SQLException erroSQL) {
            System.err.println("Error " + erroSQL);
        }

    }
}
