/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansAparelho;

/**
 *
 * @author Peter
 */
public class DaoAparelho {
    ConexaoBD conex = new ConexaoBD();
    BeansAparelho modaparelho = new BeansAparelho();
    
        public void salvar(BeansAparelho modaparelho){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadastro_equipamentos(Nome,NumeroSerial,Descricao,ValorPago,Garantia,LocalAtual) values(?,?,?,?,?,?)");
            pst.setString(1,modaparelho.getNome());
            pst.setString(2,modaparelho.getNumeroSerial());
            pst.setString(3,modaparelho.getDescricao());
            pst.setString(4,modaparelho.getValorPago());
            pst.setString(5,modaparelho.getGarantia());
            pst.setString(6,modaparelho.getLocalAtual());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos Com Sucesso! ");    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados! /nERRO " + ex);
        }
        
     }
        public void EditarAparelho(BeansAparelho modaparelho){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadastro_equipamentos set Nome=?,NumeroSerial=?,Descricao=?,ValorPago=?,Garantia=?,LocalAtual=? where idcadastro_equipamentos=?");
            pst.setString(1,modaparelho.getNome());
            pst.setString(2,modaparelho.getNumeroSerial());
            pst.setString(3,modaparelho.getDescricao());
            pst.setString(4,modaparelho.getValorPago());
            pst.setString(5,modaparelho.getGarantia());
            pst.setString(6,modaparelho.getLocalAtual());
            pst.setInt(7,modaparelho.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Alterar Dados!/Erro" + ex);
    }
            
}
        
        public void ExcluirEquipamento(BeansAparelho modaparelho){
            conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadastro_equipamentos where idcadastro_equipamentos=?");
            pst.setInt(1,modaparelho.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cadastro Excluido Com Sucesso! ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro Ao Excluir Cadastro!/ERRO " + ex);
        }
            
        }
        
        
        public BeansAparelho buscaAparelho(BeansAparelho modAparelho){
            conex.conexao();
            conex.executaSql("select*from cadastro_equipamentos where Nome like'%"+modAparelho.getPesquisa()+"%'");
            try {
                conex.rs.first();
                modAparelho.setCodigo(conex.rs.getInt("idcadastro_equipamentos"));
                modAparelho.setNome(conex.rs.getString("Nome"));
                modAparelho.setNumeroSerial(conex.rs.getString("NumeroSerial"));
                modAparelho.setDescricao(conex.rs.getString("Descricao"));
                modAparelho.setValorPago(conex.rs.getString("ValorPago"));
                modAparelho.setGarantia(conex.rs.getString("Garantia"));
                modAparelho.setLocalAtual(conex.rs.getString("LocalAtual"));
                
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao Buscar Aluno!/nERRO " + ex);
            }
        return modAparelho;
            
        }

    public BeansAparelho buscaaparelho(BeansAparelho modaparelho) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
