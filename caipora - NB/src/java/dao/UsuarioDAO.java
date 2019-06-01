/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author almeida.hugo
 */
public class UsuarioDAO {
    private Conexao conn;
    private PreparedStatement statement;
    private String query;
    private Usuario u;
    private ResultSet resultado;
    
    public UsuarioDAO() {
        conn = new Conexao();
    }
    
    public void inserir(Usuario u) {
        try{
            this.u = u;
            query = "INSERT INTO usuario (nome, email, usuario, senha, nascimento) VALUES ('" + u.getNome() + "', '" + u.getEmail() + "', '" + u.getUsuario() + "', '" + u.getSenha() + "', '" + u.getNascimento() + "');";
            statement = conn.getConnection().prepareStatement(query);
            statement.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public ResultSet listar(int id) {
        try{
            id = 1;
            query = "SELEECT * FROM usuario WHERE id_usuario = " + id;
            statement = conn.getConnection().prepareStatement(query);
            statement.executeQuery();
            return resultado;
        }
        catch (SQLException e) {
            return resultado;
        }
    }
}
