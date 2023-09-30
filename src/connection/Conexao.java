/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author conta
 */
public class Conexao {
    

    
    private static final String url = "jdbc:mysql://192.168.79.128:3306/mapa";
    private static final String user = "root";
    private static final String password = "t00r";
    
    
    private static Connection conn;
    
    
    
    public static Connection getConnection() throws SQLException{
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado.");
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            System.err.println("Erro na conexão com o banco de dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    
    public void testConection() throws SQLException{
        Connection conexao;
        conexao = getConnection();
        try {
            if (conexao != null && !conexao.isClosed()) {
                System.out.println("Conexão bem-sucedida!");
            } else {
                System.err.println("A conexão está fechada ou é nula.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao verificar a conexão: " + e.getMessage());
        }
    }
}
