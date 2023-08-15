/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrobd;


import cadastro.modelDAO.PessoaFisicaDAO;
import cadastro.modelDAO.PessoaJuridicaDAO;
import java.util.Scanner;

import cadastrobd.model.PessoaFisica;
import cadastrobd.model.PessoaJuridica;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class CadastroBD {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaFisicaDAO pessoaFisicaDAO = new PessoaFisicaDAO();
        PessoaJuridicaDAO pessoaJuridicaDAO = new PessoaJuridicaDAO();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoajuridica = new PessoaJuridica();
        int opcao;

        do {
            System.out.println("=======================================");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Incluir pessoa");
            System.out.println("2. Alterar pessoa");
            System.out.println("3. Excluir pessoa");
            System.out.println("4. Exibir pessoa pelo ID");
            System.out.println("5. Exibir todas as pessoas");
            System.out.println("0. Sair");
            System.out.println("=======================================");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("=======================================");
                    System.out.println("1. Fisica");
                    System.out.println("2. Juridica");
                    System.out.println("=======================================");
                    int opcaofj = scanner.nextInt();
                    switch (opcaofj) {
                        case 1 -> {
                            
                            System.out.println("Qual o nome da pessoa?");
                            String nome = scanner.next();
                            pessoaFisica.setNome(nome);
                            
                            System.out.println("Qual o logradouro?");
                            String logradouro = scanner.next();
                            pessoaFisica.setLogradouro(logradouro);
                            
                            System.out.println("Qual o cidade?");
                            String cidade = scanner.next();
                            pessoaFisica.setCidade(cidade);
                            
                            System.out.println("Qual o estado?");
                            String estado = scanner.next();
                            pessoaFisica.setEstado(estado);
                            
                            System.out.println("Qual o telefone?");
                            String telefone = scanner.next();
                            pessoaFisica.setTelefone(telefone);
                            
                            System.out.println("Qual o email?");
                            String email = scanner.next();
                            pessoaFisica.setEmail(email);
                            
                            System.out.println("Qual o cpf?");
                            String cpf = scanner.next();
                            pessoaFisica.setCpf(cpf);
                            try{
                                pessoaFisicaDAO.incluir(pessoaFisica);
                                System.out.println("Pessoa física incluída com sucesso!");
                                
                            
                            }catch(SQLException e){
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa física nao incluida, por favor averiguar o error e tentar novamente");
                                
                            }
                            
                            
                        }
                        case 2 -> {
                            System.out.println("Qual o nome da pessoa?");
                            String nome = scanner.next();
                            pessoajuridica.setNome(nome);
                            
                            System.out.println("Qual o logradouro?");
                            String logradouro = scanner.next();
                            pessoajuridica.setLogradouro(logradouro);
                            
                            System.out.println("Qual o cidade?");
                            String cidade = scanner.next();
                            pessoajuridica.setCidade(cidade);
                            
                            System.out.println("Qual o estado?");
                            String estado = scanner.next();
                            pessoajuridica.setEstado(estado);
                            
                            System.out.println("Qual o telefone?");
                            String telefone = scanner.next();
                            pessoajuridica.setTelefone(telefone);
                            
                            System.out.println("Qual o email?");
                            String email = scanner.next();
                            pessoajuridica.setEmail(email);
                            
                            System.out.println("Qual o cnpj?");
                            String cnpj = scanner.next();
                            pessoajuridica.setCnpj(cnpj);
                            try{
                                pessoaJuridicaDAO.incluir(pessoajuridica);
                                System.out.println("Pessoa juridica incluída com sucesso!");
                                
                            
                            }catch(SQLException e){
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa juridica nao incluida, por favor averiguar o error e tentar novamente");
                                
                            }
                        }
                        default -> System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                }
                case 2 -> {
                    System.out.println("=======================================");
                    System.out.println("1. Fisica");
                    System.out.println("2. Juridica");
                    System.out.println("=======================================");
                    int opcaofj = scanner.nextInt();
                    switch (opcaofj) {
                        case 1 -> {
                            System.out.println("Qual o Id da pessoa que deseja alterar os dados?");
                            int id = scanner.nextInt();
                            pessoaFisica.setId(id);//ID da pessoa q vai alterar
                            
                            System.out.println("Qual o nome da pessoa?");
                            String nome = scanner.next();
                            pessoaFisica.setNome(nome);
                            
                            System.out.println("Qual o logradouro?");
                            String logradouro = scanner.next();
                            pessoaFisica.setLogradouro(logradouro);
                            
                            System.out.println("Qual o cidade?");
                            String cidade = scanner.next();
                            pessoaFisica.setCidade(cidade);
                            
                            System.out.println("Qual o estado?");
                            String estado = scanner.next();
                            pessoaFisica.setEstado(estado);
                            
                            System.out.println("Qual o telefone?");
                            String telefone = scanner.next();
                            pessoaFisica.setTelefone(telefone);
                            
                            System.out.println("Qual o email?");
                            String email = scanner.next();
                            pessoaFisica.setEmail(email);
                            
                            System.out.println("Qual o cpf?");
                            String cpf = scanner.next();
                            pessoaFisica.setCpf(cpf);
                            
                            
                            try{
                                pessoaFisicaDAO.alterar(pessoaFisica);
                                System.out.println("Pessoa física alterada com sucesso!");
                                
                            
                            }catch(SQLException e){
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa física nao alterada, por favor averiguar o error e tentar novamente");
                                
                            }
                        }
                        case 2 ->{
                            System.out.println("Qual o Id da pessoa que deseja alterar os dados?");
                            int id = scanner.nextInt();
                            pessoaFisica.setId(id);//ID da pessoa q vai alterar
                            
                            System.out.println("Qual o nome da pessoa?");
                            String nome = scanner.next();
                            pessoajuridica.setNome(nome);
                            
                            System.out.println("Qual o logradouro?");
                            String logradouro = scanner.next();
                            pessoajuridica.setLogradouro(logradouro);
                            
                            System.out.println("Qual o cidade?");
                            String cidade = scanner.next();
                            pessoajuridica.setCidade(cidade);
                            
                            System.out.println("Qual o estado?");
                            String estado = scanner.next();
                            pessoajuridica.setEstado(estado);
                            
                            System.out.println("Qual o telefone?");
                            String telefone = scanner.next();
                            pessoajuridica.setTelefone(telefone);
                            
                            System.out.println("Qual o email?");
                            String email = scanner.next();
                            pessoajuridica.setEmail(email);
                            
                            System.out.println("Qual o cnpj?");
                            String cnpj = scanner.next();
                            pessoajuridica.setCnpj(cnpj);
                            try{
                                pessoaJuridicaDAO.incluir(pessoajuridica);
                                System.out.println("Pessoa juridica alterada com sucesso!");
                                
                            
                            }catch(SQLException e){
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa juridica nao alterada, por favor averiguar o error e tentar novamente");
                                
                            }
                        }
                        default -> System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                       
                }
                case 3 -> {
                    System.out.println("=======================================");
                    System.out.println("1. Fisica");
                    System.out.println("2. Juridica");
                    System.out.println("=======================================");
                    int opcaofj = scanner.nextInt();
                    switch (opcaofj){
                        case 1 -> {
                            System.out.println("Qual o Id da pessoa que deseja excluir os dados?");
                            int id = scanner.nextInt();
                            
                            try {
                                pessoaFisicaDAO.excluir(id);
                                System.out.println("Pessoa fiscia excluida com sucesso!");
                                
                            }catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa fisica nao excluida, por favor averiguar o error e tentar novamente");
                            }
                            
                        }
                        case 2 ->{
                            System.out.println("Qual o Id da pessoa que deseja excluir os dados?");
                            int id = scanner.nextInt();
                            
                            try {
                                pessoaJuridicaDAO.excluir(id);
                                System.out.println("Pessoa juridica excluida com sucesso!");
                                
                            }catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa juridica nao excluida, por favor averiguar o error e tentar novamente");
                            }  
                        }
                        default -> System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                }
                case 4 -> {
                    System.out.println("=======================================");
                    System.out.println("1. Fisica");
                    System.out.println("2. Juridica");
                    System.out.println("=======================================");
                    int opcaofj = scanner.nextInt();
                    switch (opcaofj) {
                        case 1 -> {
                            System.out.println("Qual o Id da pessoa que deseja exbir os dados?");
                            int id = scanner.nextInt();
                            try {
                                PessoaFisica pessoa = pessoaFisicaDAO.getPessoa(id);
                                if (pessoa != null) {
                                    pessoa.exibir();
                                }
                            }
                            catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa fisica nao exibida, por favor averiguar o error e tentar novamente");
                            }
                        
                        }
                        case 2 -> {
                            System.out.println("Qual o Id da pessoa que deseja exbir os dados?");
                            int id = scanner.nextInt();
                            try {
                                PessoaJuridica pessoaJ = pessoaJuridicaDAO.getPessoa(id);
                                if (pessoaJ != null) {
                                    pessoaJ.exibir();
                                }
                            }
                            catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa fisica nao exibida, por favor averiguar o error e tentar novamente");
                            }
                        }
                        default -> System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                    
                    
                }
                case 5 -> {
                    System.out.println("=======================================");
                    System.out.println("1. Fisica");
                    System.out.println("2. Juridica");
                    System.out.println("=======================================");
                    int opcaofj = scanner.nextInt();
                    switch (opcaofj) {
                        case 1 -> {
                            try {
                                List<PessoaFisica> pessoas = pessoaFisicaDAO.getPessoas();
                                if (pessoas != null) {
                                    for (PessoaFisica pessoaa : pessoas) {
                                        pessoaa.exibir();
                                    }

                                }
                                else {
                                    System.out.println("Nenhuma pessoa encontrada.");
                                }
                            }
                            catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa fisica nao exibida, por favor averiguar o error e tentar novamente");
                            }
                            
                        }
                        case 2 ->{
                            try {
                                List<PessoaJuridica> pessoasJ = pessoaJuridicaDAO.getPessoas();
                                if (pessoasJ != null) {
                                    for (PessoaJuridica pessoaa : pessoasJ) {
                                        pessoaa.exibir();
                                    }
                                }else {
                                    System.out.println("Nenhuma pessoa encontrada.");
                                }
                            }
                            catch (SQLException e) {
                                System.out.println("Erro ao executar operação: " + e.getMessage());
                                System.out.println("Pessoa juridica nao exibida, por favor averiguar o error e tentar novamente");
                            }
                            
                            
                        }
                        default -> System.out.println("Opção inválida. Escolha uma opção válida.");
                    }
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida. Escolha uma opção válida.");
            }  
        } while (opcao != 0);
        scanner.close();
    }
    
}
