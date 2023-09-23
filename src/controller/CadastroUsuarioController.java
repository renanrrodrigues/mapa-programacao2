/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import connection.Conexao;
import java.sql.Connection;
import model.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author conta
 */
public class CadastroUsuarioController {
    
    private static Connection conexao;

    
    public static boolean cadastrarUsuario(Usuario usuario) throws SQLException {
        
        conexao = Conexao.getConnection();
        
        String sql = "INSERT INTO usuario (nome, login, senha, email) VALUES (?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getLogin());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setString(4, usuario.getEmail());

            int linhasAfetadas = preparedStatement.executeUpdate();
            conexao.close();
            // Verifica se o usuário foi cadastrado com sucesso
            if(linhasAfetadas > 0){
                JOptionPane.showMessageDialog(null, "usuário foi cadastrado com sucesso!");
                System.out.println("usuário foi cadastrado com sucesso!");
            }
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            conexao.close();
            return false; // Ocorreu um erro ao cadastrar o usuário
        }
        finally{
            conexao.close();
        }
    }
    
}
