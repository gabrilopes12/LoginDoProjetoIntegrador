/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 

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
        String sql = "SELECT enunciado,questaoA, questaoB, questaoC, questaoD, resposta FROM questoes WHERE id_orgao = ? ORDER BY RAND()"; 
        try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setInt(1, pergunta.pegarIDOrgao()); 
             
             ResultSet rs = ps.executeQuery();
             if (rs.next()) {
                  String texto = rs.getString("enunciado");
                  pergunta.definaEnunciado(texto);
                  String texto1 = rs.getString("questaoA");
                  pergunta.definaQuestaoA(texto1);
                  String texto2 = rs.getString("questaoB");
                  pergunta.definaQuestaoB(texto2);
                  String texto3 = rs.getString("questaoC");
                  pergunta.definaQuestaoC(texto3);
                  String texto4 = rs.getString("questaoD");
                  pergunta.definaQuestaoD(texto4);
                  int resposta = rs.getInt("resposta");
                  pergunta.definaResposta(resposta);
                  
        } 
         
       }
    }
    
    public int verificaID(Usuario usuario) throws Exception{
        int id_aluno = 0; 
        String sql = "SELECT id_aluno, nome FROM aluno WHERE email = ?"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,usuario.pegaremail());
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                  id_aluno = rs.getInt("id_aluno");
                  usuario.definaID(id_aluno);
                  
                 
            }
        }
        return id_aluno;
             
         }
       public int verificaIDProfessor(Usuario usuario) throws Exception{
        int id_professor = 0; 
        String sql = "SELECT id_professor, nome FROM professor WHERE email = ?"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,usuario.pegaremail());
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                  id_professor = rs.getInt("id_professor");
                  usuario.definaIDProfessor(id_professor);
                  
                 
            }
        }
        return id_professor;
             
         }
    
        public String exibeRanking(Usuario usuario) throws Exception{
            String nome = null;
            String sql = "select nome from aluno as a join ranking as r on a.id_aluno = r.id_aluno where a.id_aluno = ?  order by r.pontuacao;"; 
            try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setInt(1,usuario.pegarID());
             ResultSet rs = ps.executeQuery();
             if (rs.next()) {
                  nome = rs.getString("nome");
                 
            }
        }
        return nome;
        }
    
       public List verificaTOP5() throws Exception{
        List<Integer> pontuacoes = new ArrayList<>();   
        String sql = "SELECT pontuacao FROM ranking order by pontuacao desc limit 5"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {
                int pontuacao = rs.getInt("pontuacao");
                pontuacoes.add(pontuacao);
            }
        }
        return pontuacoes;
             
         }
       public List verificaNOMETOP5() throws Exception{
        List<String> nomes = new ArrayList<>();   
        String sql = "select nome from aluno as a join ranking as r on a.id_aluno = r.id_aluno limit 5"; 
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             
             ResultSet rs = ps.executeQuery();
             
             while (rs.next()) {
                String nome = rs.getString("nome");
                nomes.add(nome);
            }
        }
        return nomes;
             
         }
       
       public void inserirPergunta(construtorPergunta pergunta, Usuario usuario) throws Exception{
       String sql = "INSERT INTO questoes(enunciado,id_professor,questaoA, questaoB, questaoC, questaoD, id_orgao,resposta) VALUES (?,?,?,?,?,?,?,?)";
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,pergunta.pegarEnunciado());
             ps.setInt(2,usuario.pegarIDProfessor());
             ps.setString(3,pergunta.pegarQuestaoA());  
             ps.setString(4,pergunta.pegarQuestaoB());
             ps.setString(5,pergunta.pegarQuestaoC());
             ps.setString(6,pergunta.pegarQuestaoD()); 
             ps.setInt(7,pergunta.pegarIDOrgao());
             ps.setInt(8,pergunta.pegarResposta());
              
             ps.execute(); 
         }
       
     }
     
      public construtorPergunta[] obterOrgaos() throws Exception {
      String sql = "SELECT*FROM orgao";
      try(Connection conn = ConexaoBd.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);ResultSet rs = ps.executeQuery()){
          
          int totalDeCursos = rs.last () ? rs.getRow() : 0;
          construtorPergunta [] pergunta = new construtorPergunta[totalDeCursos];
          rs.beforeFirst();
            int contador = 0;
        while (rs.next()){
            int id = rs.getInt("id_orgao"); 
            String nome = rs.getString("nome");
            pergunta[contador++] = new construtorPergunta (id, nome);

                           }
        return pergunta; 
      }
    }
   
        public List <Usuario> buscaAlunos() throws Exception{
        String sql = "SELECT nome, email FROM aluno";
        
        List <Usuario> aluno = new ArrayList <> ();
        try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
        
        try (ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                String nome = rs.getString ("nome");
                String email = rs.getString ("email");
                aluno.add(new Usuario( nome, email,null));
        }
        
       }
        }
      return aluno;
    }
}
  



   








