
package com.proyecto.laboratorio.dto;

public class Estudiante {
   private String name;
 private String surname;
 private int age;
 private String group;
 private String specialty;
 public Estudiante() {
 }
 public Estudiante(String name, String surname, int age, String group, String specialty) {
 this.name = name;
 this.surname = surname;
this.age = age;
this.group=group;
this.specialty = specialty;
 }
 public String getName() {
 return name;
 }
 public String getSurname() {
 return surname;
 }
 public int getAge() {
 return age;
 }
 public String getGroup() {
 return group;
 }
 public String getSpecialty() {
 return specialty;
 }
 public void setName(String name) {
 this.name = name;
 }
 public void setSurname(String surname) {
 this.surname = surname;
 }
 public void setAge(int age) {
 this.age = age;
 }
 public void setGroup(String group) {
 this.group = group;
 }
 public void setSpecialty(String specialty) {
 this.specialty = specialty;
 }
 @Override
 public String toString() {
 
return "Person{" + "name=" + name + ", surname=" + surname + ",group=" + group + ",specialty=" + specialty + ", age=" + age + '}';
}  
}
