/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro.modelDAO;
import cadastro.model.util.ConectorBD;
import cadastro.model.util.SequenceManager;
import cadastrobd.model.PessoaFisica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Windows 10
 */
public class PessoaFisicaDAO  {
    private static final String TABLE_PESSOA = "DBM.Pessoa";
    private static final String TABLE_NAME = "DBM.Pessoa_fisica";
    private static final String ID_COLUMN_NAME = "id_pessoa";
    private static final String NOME_COLUMN_NAME = "nome";
    private static final String LOGRADOURO_COLUMN_NAME = "logradouro";
    private static final String CIDADE_COLUMN_NAME = "cidade";
    private static final String ESTADO_COLUMN_NAME = "estado";
    private static final String TELEFONE_COLUMN_NAME = "telefone";
    private static final String EMAIL_COLUMN_NAME = "email";
    private static final String CPF_COLUMN_NAME = "id_cpf";
   
    public PessoaFisica getPessoa(int id) throws SQLException{
        
        ResultSet resultPf = ConectorBD.getSelect("SELECT * FROM " + TABLE_NAME + " WHERE " + ID_COLUMN_NAME + " = " + id);
        ResultSet resultP = ConectorBD.getSelect("SELECT * FROM " + TABLE_PESSOA + " WHERE " + ID_COLUMN_NAME + " = " + id);
        
        PessoaFisica pessoafisica=null;
        
        if(resultP.next() &&  resultPf.next()){
            int Id = resultP.getInt(ID_COLUMN_NAME);
            String nome = resultP.getString(NOME_COLUMN_NAME);
            String logradouro = resultP.getString(LOGRADOURO_COLUMN_NAME);
            String cidade = resultP.getString(CIDADE_COLUMN_NAME);
            String estado = resultP.getString(ESTADO_COLUMN_NAME);
            String telefone = resultP.getString(TELEFONE_COLUMN_NAME);
            String email = resultP.getString(EMAIL_COLUMN_NAME);
            String cpf = resultPf.getString(CPF_COLUMN_NAME);

            // Construa o objeto PessoaFisica usando os valores obtidos
            pessoafisica = new PessoaFisica(Id, nome, logradouro, cidade, estado, telefone, email,cpf);
        }else {
            System.out.println("Pessoa nao cadastrada no cpf");
        }
       
        // Feche o ResultSet
        ConectorBD.closeResultset(resultPf);
        ConectorBD.closeResultset(resultP);
        return pessoafisica;
    }
    
    public List<PessoaFisica> getPessoas() throws SQLException{
        ResultSet resultPf = ConectorBD.getSelect("SELECT * FROM " + TABLE_NAME);
        ResultSet resultP = ConectorBD.getSelect("SELECT * FROM " + TABLE_PESSOA);

        List<PessoaFisica> allpessoas = new ArrayList<>();
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        while (resultP.next()) {
            int Id = resultP.getInt(ID_COLUMN_NAME);
            String nome = resultP.getString(NOME_COLUMN_NAME);
            String logradouro = resultP.getString(LOGRADOURO_COLUMN_NAME);
            String cidade = resultP.getString(CIDADE_COLUMN_NAME);
            String estado = resultP.getString(ESTADO_COLUMN_NAME);
            String telefone = resultP.getString(TELEFONE_COLUMN_NAME);
            String email = resultP.getString(EMAIL_COLUMN_NAME);
            String cpf = "null";

            PessoaFisica pessoas = new PessoaFisica(Id, nome, logradouro, cidade, estado, telefone, email, cpf);
            allpessoas.add(pessoas);
        }

        while (resultPf.next()) {
            int Id = resultPf.getInt(ID_COLUMN_NAME);
            String cpf = resultPf.getString(CPF_COLUMN_NAME);
        
            for (PessoaFisica pessoa : allpessoas) {
                if (pessoa.getId() == Id) {
                    pessoa.setCpf(cpf);
                    pessoasFisicas.add(pessoa);
                    break;
                }
            }
        }
   
    // Feche os ResultSets
    ConectorBD.closeResultset(resultPf);
    ConectorBD.closeResultset(resultP);
    return pessoasFisicas;
        
    }
    
    public void incluir (PessoaFisica pessoafisica) throws SQLException{
        
        PreparedStatement statementP = ConectorBD.getPrepared("INSERT INTO " + TABLE_PESSOA + " (id_pessoa,nome, logradouro, cidade, estado,telefone,email) VALUES (?,?,?,?,?,?,?)");
        int id = SequenceManager.getValue();
        
        statementP.setInt(1, id);
        statementP.setString(2, pessoafisica.getNome());
        statementP.setString(3, pessoafisica.getLogradouro());
        statementP.setString(4, pessoafisica.getCidade());
        statementP.setString(5, pessoafisica.getEstado());
        statementP.setString(6, pessoafisica.getTelefone());
        statementP.setString(7, pessoafisica.getEmail());
        
        PreparedStatement statementPf = ConectorBD.getPrepared("INSERT INTO " + TABLE_NAME + " (id_cpf,id_pessoa) VALUES (?,?)");
        statementPf.setString(1,pessoafisica.getCpf());
        statementPf.setInt(2,id);

        statementP.executeUpdate();
        statementPf.executeUpdate();
        ConectorBD.closeStatement(statementP);
        ConectorBD.closeStatement(statementPf);
    }
    
    public void alterar (PessoaFisica pessoafisica) throws SQLException {
        
         PreparedStatement statementP = ConectorBD.getPrepared("UPDATE " + TABLE_PESSOA + " SET nome=?, logradouro=?, cidade=?, estado=?, telefone=?, email=? WHERE " + ID_COLUMN_NAME + "=?");
    PreparedStatement statementPf = ConectorBD.getPrepared("UPDATE " + TABLE_NAME + " SET id_cpf=? WHERE " + ID_COLUMN_NAME + "=?");
    
    statementP.setString(1, pessoafisica.getNome());
    statementP.setString(2, pessoafisica.getLogradouro());
    statementP.setString(3, pessoafisica.getCidade());
    statementP.setString(4, pessoafisica.getEstado());
    statementP.setString(5, pessoafisica.getTelefone());
    statementP.setString(6, pessoafisica.getEmail());
    statementP.setInt(7, pessoafisica.getId()); // Aqui definimos o ID do registro a ser atualizado

    // Tabela pessoafisica
    statementPf.setString(1, pessoafisica.getCpf());
    statementPf.setInt(2, pessoafisica.getId()); // Aqui definimos o ID do registro a ser atualizado

    statementP.executeUpdate();
    statementPf.executeUpdate();
    
    ConectorBD.closeStatement(statementP);
    ConectorBD.closeStatement(statementPf);
}
    
    public void excluir(int id) throws SQLException{
        PreparedStatement statementPF = ConectorBD.getPrepared("DELETE FROM " + TABLE_NAME + " WHERE id_pessoa = ?");
        PreparedStatement statementP = ConectorBD.getPrepared("DELETE FROM " + TABLE_PESSOA + " WHERE id_pessoa = ?");
        statementPF.setInt(1, id);
        statementP.setInt(1, id);
        statementPF.executeUpdate();
        statementP.executeUpdate();
        ConectorBD.closeStatement(statementPF);
        ConectorBD.closeStatement(statementP);
    }
    
}
