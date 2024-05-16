
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author 24.01414-0
 */
public class Usuario {
   private String nome;
   private String email; // criei essa variravel para podermos destinguir email de nome na tela de cadastro e não ficar confuso
   private String senha;
    
public Usuario(String nome, String email, String senha){
      this.nome = nome;
      this.senha = senha;
      this.email = email; 
    }
public Usuario(String email, String senha){ // construtor novo para a tela de login 
      this.email = email; 
      this.senha = senha; 
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
       
}
