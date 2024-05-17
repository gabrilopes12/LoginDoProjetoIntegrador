
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author 24.01414-0
 */
public class Usuario {
   private String nome;
    private String senha;
    
public Usuario(String nome, String senha){
      this.nome = nome;
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
       
}
