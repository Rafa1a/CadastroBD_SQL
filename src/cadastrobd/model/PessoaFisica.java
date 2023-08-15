/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 * @author Windows 10
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    
    public PessoaFisica(){
        super();
        this.cpf = "";
    }
    public PessoaFisica(int id, String nome, String logradouro, String cidade, String estado, String telefone, String email, String cpf) {
        super(id,nome,logradouro,cidade,estado,telefone,email);
        this.cpf = cpf;
    }
    //Get set Pessoa Fisica
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("CPF : " + this.cpf);
        System.out.println("=======================================");
        
    }
    
}
