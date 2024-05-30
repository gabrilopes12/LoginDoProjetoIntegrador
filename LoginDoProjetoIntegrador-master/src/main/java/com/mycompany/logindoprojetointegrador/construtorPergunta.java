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
    private int id_professor; 
    private String NomeOrgao; 
    
    public construtorPergunta(String enunciado,int id_professor, String questaoA, String questaoB, String questaoC, String questaoD, int id_orgao, int resposta){
        this.enunciado = enunciado; 
        this.questaoA = questaoA;
        this.questaoB = questaoB; 
        this.questaoC = questaoC;
        this.questaoD = questaoD;
        this.id_professor = id_professor; 
        this.id_orgao = id_orgao;
        this.resposta = resposta; 
    }
    
    public construtorPergunta(){
        
    }
     public construtorPergunta(int id_orgao){
        
    }
    
    public construtorPergunta(int id_orgao,String NomeOrgao){
        this.id_orgao = id_orgao; 
        this.NomeOrgao = NomeOrgao; 
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
    
     @Override
    public String toString() {
        return NomeOrgao;  // ou qualquer outra representação de string que você desejar
    }
}
