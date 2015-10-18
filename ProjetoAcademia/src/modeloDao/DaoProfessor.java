/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansProfessor;

/**
 *
 * @author Peter
 */
public class DaoProfessor {
    ConexaoBD conex = new ConexaoBD();
    BeansProfessor modprof = new BeansProfessor();
    
        public void salvar(BeansProfessor modprof){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadastro_professor(Nome,CPF,Sexo,Cidade,Bairro,Endereco,Telefone,Celular,Turno) values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1,modprof.getNome());
            pst.setString(2,modprof.getCPF());
            pst.setString(3,modprof.getSexo());
            pst.setString(4,modprof.getCidade());
            pst.setString(5,modprof.getBairro());
            pst.setString(6,modprof.getEndereco());
            pst.setString(7,modprof.getTelefone());
            pst.setString(8,modprof.getCelular());
            pst.setString(9,modprof.getTurno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados! /nERRO" + ex);
            
        }
            
    }
        
        public void EditarProfessor(BeansProfessor modprof){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadastro_professor set Nome=?,CPF=?,Sexo=?,Cidade=?,Bairro=?,Endereco=?,Telefone=?,Celular=?,Turno=? where idcadastro_professor=?");
            pst.setString(1,modprof.getNome());
            pst.setString(2,modprof.getCPF());
            pst.setString(3,modprof.getSexo());
            pst.setString(4,modprof.getCidade());
            pst.setString(5,modprof.getBairro());
            pst.setString(6,modprof.getEndereco());
            pst.setString(7,modprof.getTelefone());
            pst.setString(8,modprof.getCelular());
            pst.setString(9,modprof.getTurno());
            pst.setInt(10,modprof.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar Dados!/Erro" + ex);
        }
            
    }
        
        public void ExcluirProfessor(BeansProfessor modprofessor){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadastro_professor where idcadastro_professor=?");
            pst.setInt(1,modprofessor.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido Com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir Cadastro!/Erro" + ex);
        }
            
        }
        
        public BeansProfessor buscaProfessor(BeansProfessor modProfessor){
            conex.conexao();
            conex.executaSql("select*from cadastro_professor where Nome like '%"+modProfessor.getPesquisa()+"%'");
        try {
            conex.rs.first();
            modProfessor.setCodigo(conex.rs.getInt("idcadastro_professor"));
            modProfessor.setNome(conex.rs.getString("Nome"));
            modProfessor.setCPF(conex.rs.getString("CPF"));
            modProfessor.setSexo(conex.rs.getString("Sexo"));
            modProfessor.setCidade(conex.rs.getString("Cidade"));
            modProfessor.setBairro(conex.rs.getString("Bairro"));
            modProfessor.setEndereco(conex.rs.getString("Endereco"));
            modProfessor.setTelefone(conex.rs.getString("Telefone"));
            modProfessor.setCelular(conex.rs.getString("Celular"));
            modProfessor.setTurno(conex.rs.getString("Turno"));
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Aluno!/nERRO " + ex);
        }
            
            return modProfessor;
            
        }

}
