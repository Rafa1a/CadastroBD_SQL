/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd;
import cadastro.modelDAO.PessoaFisicaDAO;
import cadastro.modelDAO.PessoaJuridicaDAO;
import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaJuridica;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Windows 10
 */
public class CadastroBDTest {
    public static void main(String[] args)  {
           try{
            // INCLUIR CPF ================================================
            
            PessoaFisica pessoaFisica = new PessoaFisica();
            PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
            
            pessoaFisica.setNome("João da Silva");
            pessoaFisica.setLogradouro("Rua das Flores, 123");
            pessoaFisica.setCidade("São Paulo");
            pessoaFisica.setEstado("SP");
            pessoaFisica.setTelefone("119999-9999");
            pessoaFisica.setEmail("joao.da.silva@gmail.com");
            pessoaFisica.setCpf("12345678900");

            
            pessoaFisicaDAO.incluir(pessoaFisica);
            
            //OBTEM ATRAVEZ DO ID ===================================
            
            // Obtém a pessoa com ID 10 do banco de dados
            PessoaFisica pessoa = pessoaFisicaDAO.getPessoa(10);

            // Verifica se a pessoa foi encontrada antes de imprimir o nome
            if (pessoa != null) {
                pessoa.exibir();
            }
            
            // OBTEM TODAS AS PESSOAS DO BANCO DE DADOS================
            
               List<PessoaFisica> pessoas = pessoaFisicaDAO.getPessoas();
            if (pessoas != null) {
                for (PessoaFisica pessoaa : pessoas) {
                    pessoaa.exibir();
                }
            }else {
                System.out.println("Nenhuma pessoa encontrada.");
            }
           //ALTERAR ==================================================
            pessoaFisica.setId(6);//ID da pessoa q vai alterar
            pessoaFisica.setNome("rafa");
            pessoaFisica.setLogradouro("Rua das bc, 123");
            pessoaFisica.setCidade("São pao");
            pessoaFisica.setEstado("SP");
            pessoaFisica.setTelefone("119999-9999");
            pessoaFisica.setEmail("joao.da.ocu@gmaibosta.cu");
            pessoaFisica.setCpf("333333333");

            pessoaFisicaDAO.alterar(pessoaFisica);
            
            // EXCLUIR ===============================================
            
            pessoaFisicaDAO.excluir(10);
           
             // INCLUIR CNPJ================================================
            
            PessoaJuridica pessoajuridica = new PessoaJuridica();
            PessoaJuridicaDAO pessoajuridicaDAO = new PessoaJuridicaDAO();
            
            pessoajuridica.setNome("João da Silva");
            pessoajuridica.setLogradouro("Rua das Flores, 123");
            pessoajuridica.setCidade("São Paulo");
            pessoajuridica.setEstado("SP");
            pessoajuridica.setTelefone("119999-9999");
            pessoajuridica.setEmail("joao.da.silva@gmail.com");
            pessoajuridica.setCnpj("12345678900");

            
            pessoajuridicaDAO.incluir(pessoajuridica);
             //OBTEM ATRAVEZ DO ID ===================================
            
            // Obtém a pessoa com ID 10 do banco de dados
            
            PessoaJuridica pessoaJ = pessoajuridicaDAO.getPessoa(12);

            // Verifica se a pessoa foi encontrada antes de imprimir o nome
            if (pessoaJ != null) {
                pessoaJ.exibir();
            }
            
            // OBTEM TODAS AS PESSOAS DO BANCO DE DADOS================
            
               List<PessoaJuridica> pessoasJ = pessoajuridicaDAO.getPessoas();
            if (pessoasJ != null) {
                for (PessoaJuridica pessoaa : pessoasJ) {
                    pessoaa.exibir();
                }
            }else {
                System.out.println("Nenhuma pessoa encontrada.");
            }
             // EXCLUIR ===============================================
            
            pessoajuridicaDAO.excluir(13);
            
           }catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
