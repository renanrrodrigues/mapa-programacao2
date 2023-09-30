package controller;

import connection.Conexao;
import model.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private static Connection conexao;
    static List<Usuario> usuarios = new ArrayList<>();

    public static List<Usuario> listUser() throws SQLException {

        try{

            conexao = Conexao.getConnection();

            String sql = "SELECT * FROM usuario";

            PreparedStatement preparedStatement = conexao.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("id"));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setEmail(resultSet.getString("email"));
                usuarios.add(usuario);
            }

            return usuarios;

        } catch (SQLException e) {
            e.printStackTrace();
            conexao.close();
            return null;
        } finally{
            conexao.close();
        }

    }
}
