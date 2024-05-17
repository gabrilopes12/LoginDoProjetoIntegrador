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
      String sql = "SELECT * FROM jogador WHERE nome = ? AND senha = ?";
    try(Connection conn = ConexaoBd.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
      ps.setString(1, usuario.pegarnome());
      ps.setString(2, usuario.pegarsenha());
    try(ResultSet rs = ps.executeQuery()){
        return rs.next(); 
    }
    
    
   }
  } 
}
