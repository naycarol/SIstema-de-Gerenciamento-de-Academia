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
import modeloBeans.BeansAluno;

/**
 *
 * @author Peter, Luiz & Vinicius
 */
public class DaoAluno {
    ConexaoBD conex = new ConexaoBD();
    BeansAluno modaluno = new BeansAluno();
    
        public void salvar(BeansAluno modaluno){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadastro_aluno(Nome,Data_Matricula,CPF,Sexo,Cidade,Bairro,Endereco,Telefone,Celular,Turno) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,modaluno.getNome());
            pst.setString(2,modaluno.getData_Matricula());
            pst.setString(3,modaluno.getCPF());
            pst.setString(4,modaluno.getSexo());
            pst.setString(5,modaluno.getCidade());
            pst.setString(6,modaluno.getBairro());
            pst.setString(7,modaluno.getEndereco());
            pst.setString(8,modaluno.getTelefone());
            pst.setString(9,modaluno.getCelular());
            pst.setString(10,modaluno.getTurno());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos Com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Inserir Dados!/nERRO " + ex);
        }
            
    }
        public void EditarAluno(BeansAluno modaluno){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadastro_aluno set Nome=?,Data_Matricula=?,CPF=?,Sexo=?,Cidade=?,Bairro=?,Endereco=?,Telefone=?,Celular=?,Turno=? where idcadastro_aluno=?");
            pst.setString(1,modaluno.getNome());
            pst.setString(2,modaluno.getData_Matricula());
            pst.setString(3,modaluno.getCPF());
            pst.setString(4,modaluno.getSexo());
            pst.setString(5,modaluno.getCidade());
            pst.setString(6,modaluno.getBairro());
            pst.setString(7,modaluno.getEndereco());
            pst.setString(8,modaluno.getTelefone());
            pst.setString(9,modaluno.getCelular());
            pst.setString(10,modaluno.getTurno());
            pst.setInt(11,modaluno.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar Dados!/Erro" + ex);
        }
            
        }
        
        public void ExcluirAluno(BeansAluno modaluno){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadastro_aluno where idcadastro_aluno=?");
            pst.setInt(1,modaluno.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido Com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir Cadastro!/Erro" + ex);
        }
            
        }
        
        public BeansAluno buscaAluno(BeansAluno modAluno){ 
            conex.conexao();
            conex.executaSql("select*from cadastro_aluno where Nome like'%"+modAluno.getPesquisa()+"%'");
            try {
            conex.rs.first();
            modAluno.setCodigo(conex.rs.getInt("idcadastro_aluno"));
            modAluno.setNome(conex.rs.getString("Nome"));
            modAluno.setData_Matricula(conex.rs.getString("Data_Matricula"));
            modAluno.setCPF(conex.rs.getString("CPF"));
            modAluno.setSexo(conex.rs.getString("Sexo"));
            modAluno.setCidade(conex.rs.getString("Cidade"));
            modAluno.setBairro(conex.rs.getString("Bairro"));
            modAluno.setEndereco(conex.rs.getString("Endereco"));
            modAluno.setTelefone(conex.rs.getString("Telefone"));
            modAluno.setCelular(conex.rs.getString("Celular"));
            modAluno.setTurno(conex.rs.getString("Turno"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Aluno!/nERRO " + ex);
        }
        return modAluno;
        
    }
}        
        
