/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class ProductType {
    private Integer producttypeid;
    private Integer robottask;
    private Boolean robotautonomous;
    private Boolean requirespermit;
    
    ProductType(Integer producttypeid, Integer robottask, Boolean robotautonomous, Boolean requirespermit) {
    this.producttypeid = producttypeid;
    this.robottask = robottask;
    this.robotautonomous = robotautonomous;
    this.requirespermit = requirespermit;
    }
    
    // set getters
    public Integer producttypeid() {
        return producttypeid;
    }
    public Integer robottask() {
        return robottask;
    }
    public Boolean robotautonomous() {
        return robotautonomous;
    }
    public Boolean requirespermit() {
        return requirespermit;
    }
    
    // Setters
  public void setproducttpeid(Integer newproducttypeid) {
    this.producttypeid = newproducttypeid;
    }
  public void setrobottask(Integer newrobottask) {
      this.robottask = newrobottask;
  }
  public void setrobotautonomous(Boolean newrobotautonomous)  {
      this.robotautonomous = newrobotautonomous;
  }      
    public void setrequirespermit(Boolean newrequirespermit) {
        this.requirespermit = newrequirespermit;
    }
}
