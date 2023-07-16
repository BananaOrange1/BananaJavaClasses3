/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class RegisteredUser {
    private Integer id;
    private String name;
    private Integer phonenumber;
    private String address;
    private String password;
    
    RegisteredUser(Integer id, String name, Integer phonenumber, String address, String password){
        this.id = id;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.password = password;
        }
    
    // Getter
  public Integer getid() {
      return id;
    }
  public String getname() {
      return name;
  }
  public Integer getphonenumber() {
      return phonenumber;
  }
  public String getaddress() {
      return address;
  }
  public String getpassword() {
      return password;
  }    
  
   // Setter
  public void setid(Integer newid) {
    this.id = newid;
  }
  public void setname(String newname) {
    this.name = newname; 
  }
  public void setphonenumber(Integer newphonenumber) {
    this.phonenumber = newphonenumber;
  }
  public void setaddress (String newaddress) {
    this.address = newaddress;
  }
  public void setpassword (String newpassword) {
    this.password = newpassword;
  }
  }




