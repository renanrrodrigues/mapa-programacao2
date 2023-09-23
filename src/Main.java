
import connection.Conexao;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author conta
 */
public class Main {
    
    public static void main(String[] args) throws SQLException {
        Conexao conexaoTest = new Conexao();
        conexaoTest.testConection();
    }
    
}
