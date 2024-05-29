/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

/**
 *
 * @author 24.01414-0
 */
public class construtorPergunta {
    private String enunciado; 
    private String questaoA;
    private String questaoB;
    private String questaoC;
    private String questaoD;
    private int id_orgao; 
    private int resposta;
    
    public construtorPergunta(String enunciado, String questaoA, String questaoB, String questaoC, String questaoD){
        this.enunciado = enunciado; 
        this.questaoA = questaoA;
        this.questaoB = questaoB; 
        this.questaoC = questaoC;
        this.questaoD = questaoD;
    }
    
    public construtorPergunta(){
        
    }
    
    public construtorPergunta(int id_orgao){
        this.id_orgao = id_orgao; 
    }

    public String pegarEnunciado(){
        return enunciado;
    }
    
    public void definaEnunciado(String enunciado){
        this.enunciado = enunciado; 
    }
    
    public String pegarQuestaoA(){
        return questaoA; 
    }
    
    public void definaQuestaoA(String questaoA){
        this.questaoA = questaoA; 
    }

    public String pegarQuestaoB(){
        return questaoB; 
    }
    
    public void definaQuestaoB(String questaoB){
        this.questaoB = questaoB; 
    }

    public String pegarQuestaoC(){
        return questaoC; 
    }
    
    public void definaQuestaoC(String questaoC){
        this.questaoC = questaoC; 
    }

    
    public String pegarQuestaoD(){
        return questaoD; 
    }
    
    public void definaQuestaoD(String questaoD){
        this.questaoD = questaoD; 
    }    
    
    public int pegarIDOrgao(){
        return id_orgao;
    }
    
    public void definaIDOrgao(int id_orgao){
        this.id_orgao = id_orgao; 
    }
    
     public int pegarResposta(){
        return resposta;
    }
    
    public void definaResposta(int resposta){
        this.resposta = resposta; 
    }
}
