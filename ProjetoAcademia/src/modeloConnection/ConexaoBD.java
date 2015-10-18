/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConnection;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Peter, Luiz & Vinicius
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs; 
    private String caminho = "jdbc:mysql://localhost/academia";
    private String Driver = "com.mysql.jdbc.Driver";
    private String Usuario = "root";
    private String Senha = "root";
    public Connection con;
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.drivers", Driver);
            con=DriverManager.getConnection(caminho, Usuario, Senha);
            //JOptionPane.showMessageDialog(null, "Conexão Efetuada com Banco de Dados! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com Banco de Dados! " + ex);
        }
    }

    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Executar Sql! " + ex);
        }
        
    }

}


