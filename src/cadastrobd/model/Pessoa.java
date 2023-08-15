/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrobd.model;

/**
 *
 * @author Windows 10
 */
public class Pessoa {
    private int id;
    private String nome, logradouro, cidade, estado, telefone, email;
        public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.logradouro = "";
        this.cidade = "";
        this.estado = "";
        this.telefone = "";
        this.email = "";
        }
        
        public Pessoa (int id, String nome, String logradouro, String cidade, String estado, String telefone, String email){
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        }
        
        //GET SET ID
        public int getId(){
            return this.id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        // GET SET nome
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        
        // GET SET logradouro
        public String getLogradouro() {
            return this.logradouro;
        }
        public void setLogradouro (String logradouro) {
            this.logradouro = logradouro;
        }
        
        //GET SET logradouro
        public String getCidade(){
            return this.cidade;
        }
        public void setCidade (String cidade){
            this.cidade = cidade;
        }
        
        //GET SET estado
        public String getEstado() {
            return this.estado;
        } 
        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        //GET SET telefone
        public String getTelefone(){
            return this.telefone;
        }
        public void setTelefone(String telefone){
            this.telefone = telefone;
        }
        
        //GET SET email    
        public String getEmail(){
            return this.email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        
        public void exibir(){
            System.out.println("ID : "+this.id);
            System.out.println("Nome : "+this.nome);
            System.out.println("Logradouro : "+this.logradouro);
            System.out.println("Cidade : "+this.cidade);
            System.out.println("Estado : "+this.estado);
            System.out.println("Telefone : "+this.telefone);
            System.out.println("Email : "+this.email);
            
        }
}
