/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModeloAluno;

/**
 *
 * @author Peter, Luiz & Vinicius
 */
public class ControleAluno {
    ConexaoBD conex = new ConexaoBD();
    ModeloAluno modaluno = new ModeloAluno();
    
        public void salvar(ModeloAluno modaluno){
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
    
    
}
