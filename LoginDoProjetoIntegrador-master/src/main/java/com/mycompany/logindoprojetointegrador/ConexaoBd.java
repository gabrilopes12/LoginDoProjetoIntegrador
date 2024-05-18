
package com.mycompany.logindoprojetointegrador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 24.01414-0
 */
public class ConexaoBd {
 private static String host = "mysql-26b95b58-java-imt.h.aivencloud.com";
 private static String porta = "21309";
 private static String db = "ux_login";
 private static String usuario = "avnadmin";
 private static String senha = "AVNS_3RBiG8hBL7X0NM8xh5O";
    
public static Connection obterConexao () throws Exception{
    String url = String.format("jdbc:mysql://%s:%s/%s",host,porta,db);
    return DriverManager.getConnection(url, usuario, senha);

}  
}
