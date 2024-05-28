/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 24.01414-0
 */
public class DAO {
    
    public boolean existe(Usuario usuario) throws Exception{
      String sql = "SELECT * FROM aluno WHERE email = ? AND senha = ?"; 
    try(Connection conn = ConexaoBd.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
      ps.setString(1, usuario.pegaremail());
      ps.setString(2, usuario.pegarsenha());
    try(ResultSet rs = ps.executeQuery()){
        return rs.next(); 
    }
    
    
   }
  } 
    
     public void inserirCadastro(Usuario usuario) throws Exception{
       String sql = "INSERT INTO aluno(nome,email,senha) VALUES (?,?,?)"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,usuario.pegarnome());
             ps.setString(2,usuario.pegaremail());  
             ps.setString(3,usuario.pegarsenha()); 
             ps.execute(); 
         }
       
     }
     
      public void inserirRanking(int pontuacao, int id_aluno) throws Exception{
       String sql = "INSERT INTO ranking(pontuacao, id_aluno) VALUES (?,?)"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setInt(1,pontuacao);
             ps.setInt(2,id_aluno);  
             ps.execute(); 
         }
       
     }
     
    public boolean verificaProfessor(Usuario usuario) throws Exception{
      String sql = "SELECT * FROM professor WHERE email = ? AND senha = ?"; 
    try(Connection conn = ConexaoBd.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
      ps.setString(1, usuario.pegaremail());
      ps.setString(2, usuario.pegarsenha());
    try(ResultSet rs = ps.executeQuery()){
        return rs.next(); 
    }


   }
}
    public void escolhePergunta(construtorPergunta pergunta) throws Exception{
       String sql = "SELECT * FROM questoes WHERE enunciado = ? AND questaoA = ? AND questaoB = ? AND questaoC = ? AND questaoD = ? ORDER BY RAND()"; 
        try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1, pergunta.pegarEnunciado());
             ps.setString(2,pergunta.pegarQuestaoA());  
             ps.setString(3,pergunta.pegarQuestaoB()); 
             ps.setString(4,pergunta.pegarQuestaoC());
             ps.setString(5,pergunta.pegarQuestaoD()); 
             ps.execute(); 
        } 
         
       }
    
    public int verificaID(Usuario usuario) throws Exception{
        int id_aluno = 0; 
        String sql = "SELECT id_aluno FROM aluno WHERE email = ?"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,usuario.pegaremail());
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                  id_aluno = rs.getInt("id_aluno");
                 
            }
        }
        return id_aluno;
             
         }
    }






