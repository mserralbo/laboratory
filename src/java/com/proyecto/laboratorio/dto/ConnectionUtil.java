
package com.proyecto.laboratorio.dto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {
   private static final String JDBC_URL = "jdbc:mysql://localhost:3306/estudiante";
private static final String JDBC_USER = "root";
private static final String JDBC_PASSWORD = "";
static {
 try {
 Class.forName("com.mysql.jdbc.Driver");
 } catch (ClassNotFoundException ex) {
 Logger.getLogger(MysqlEstudiante.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
 public static Connection getConnection() {
 Connection connection = null;
 try {
 connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, 
JDBC_PASSWORD);
 } catch (SQLException ex) {
Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
}
return connection;
}
 
}
