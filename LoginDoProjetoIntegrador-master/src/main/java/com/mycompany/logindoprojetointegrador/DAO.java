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
      String sql = "SELECT * FROM jogador WHERE nome = ? AND senha = ?"; // mudar aqui falta definir o banco de dados
    try(Connection conn = ConexaoBd.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
      ps.setString(1, usuario.pegaremail());
      ps.setString(2, usuario.pegarsenha());
    try(ResultSet rs = ps.executeQuery()){
        return rs.next(); 
    }
    
    
   }
  } 
    
     public void inserirCadastro(Usuario usuario) throws Exception{
       String sql = "INSERT INTO tb_curso(nome,email,senha) VALUES (?,?,?)"; // mudar aqui falta definir o banco de dados
         try(Connection conexao = ConexaoBd.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql)){
             ps.setString(1,usuario.pegarnome());
             ps.setString(2,usuario.pegaremail());  
             ps.setString(3,usuario.pegarsenha()); 
             ps.execute(); 
         }
       
     }
}
