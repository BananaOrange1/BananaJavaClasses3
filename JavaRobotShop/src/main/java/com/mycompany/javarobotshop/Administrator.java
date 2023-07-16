/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class Administrator {
    private Integer id;
    private String email;
    private String password;
    private String name;
    
    
Administrator(Integer id, String email, String password, String name) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
}
 // set getters
    public Integer id() {
        return id;
    }
    public String email() {
        return email;
    }
    public String password() {
        return password;
    }
    public String name() {
        return name;
    }
// Setters
  public void setid(Integer newid) {
    this.id = newid;
    }
  public void setemail(String newemail) {
      this.email = newemail;
  }
  public void setpassword(String newpassword) {
      this.password = newpassword;
  }
  public void setname(String newname) {
      this.name = newname;
  }
  

}
