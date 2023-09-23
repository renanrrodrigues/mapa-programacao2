/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author conta
 */
public class LoginController {
    private static Connection conexao;
    
    public static Usuario loginUsuario(Usuario usuario) throws SQLException {
     
        try{
            
            conexao = Conexao.getConnection();
            
            String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
            
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
                    
            preparedStatement.setString(1, usuario.getLogin());
            preparedStatement.setString(2, usuario.getSenha());
           
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                return new Usuario(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getString("login"),
                resultSet.getString("senha"),
                resultSet.getString("email")
                );
            }else{
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
                throw new SQLException("Login ou senha incorretos");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            conexao.close();
            return null;
        }
        finally{
            conexao.close();
        }
        
    }
}
