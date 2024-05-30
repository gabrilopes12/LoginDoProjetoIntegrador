
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author 24.01414-0
 */
public class Usuario {
   private int id_aluno;
   private int id_professor;
   private String nome;
   private String email; // criei essa variravel para podermos destinguir email de nome na tela de cadastro e não ficar confuso
   private String senha;
    
public Usuario(String nome, String email, String senha, int id){
      this.nome = nome;
      this.senha = senha;
      this.email = email; 
    }
public Usuario(String email, String senha){ // construtor novo para a tela de login 
      this.email = email; 
      this.senha = senha; 
    }
public Usuario(String nome, String email,String senha){
    this.nome = nome;
    this.email = email;
    this.senha = senha; 
}
public Usuario(String email){
    this.email = email;
   
}

    public String pegarnome(){
        return nome;
    }
    
    public void definanome(String nome){
        this.nome = nome; 
    }
    
    public String pegarsenha(){
        return senha;
    }
    
    public void definasenha(String senha){
        this.senha = senha; 
    }
    
    public String pegaremail(){
        return email; 
    }
    
    public void definaemail(String email){
        this.email = email; 
    }
    
    public int pegarID(){
        return id_aluno; 
    }
    
    public void definaID(int id_aluno){
        this.id_aluno = id_aluno; 
       
}
    public int pegarIDProfessor(){
        return id_professor; 
    }
    
    public void definaIDProfessor(int id_professor){
        this.id_professor = id_professor;
    }

}
