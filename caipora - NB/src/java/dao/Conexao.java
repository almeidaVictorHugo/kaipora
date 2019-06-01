/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author almeida.hugo
 */
public class Conexao {
    private static final String usuario = "root";
    private static final String senha = "root";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String banco = "jdbc:mysql://127.0.0.1/caipora";
    private Connection connection;
    
    public Conexao() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(banco, usuario, senha);
        }
        catch (SQLException e) {
        }
        catch (ClassNotFoundException e) {
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
}
