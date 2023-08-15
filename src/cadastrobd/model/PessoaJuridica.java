/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 * @author Windows 10
 */
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(){
        super();
        this.cnpj = "";
    }
    public PessoaJuridica(int id, String nome, String logradouro, String cidade, String estado, String telefone, String email, String cnpj) {
        super(id,nome,logradouro,cidade,estado,telefone,email);
        this.cnpj = cnpj;
    }
    //Get set Pessoa Fisica
    public String getCnpj(){
        return this.cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("CNPJ : " + this.cnpj);
        System.out.println("=======================================");
    }
}
