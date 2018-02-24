
package com.proyecto.laboratorio.dto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlEstudiante {
      public List<Estudiante> getEstud() {
 List<Estudiante> estudiants = new ArrayList<>();
  try (Connection connection = ConnectionUtil.getConnection()){
 Statement stmt = connection.createStatement();
 ResultSet rs = stmt.executeQuery("select * from estudiante");
 while (rs.next()) {
 String name = rs.getString("name");
 String surname = rs.getString("surname");
 int age = rs.getInt("age");
 String group = rs.getString("group");
 String specialty = rs.getString("specialty");
 Estudiante stu = new Estudiante(name, surname, age, group, specialty);
 estudiants.add(stu);
 }
 } catch (SQLException ex) {
 Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
 }
 return estudiants;
 }
}
