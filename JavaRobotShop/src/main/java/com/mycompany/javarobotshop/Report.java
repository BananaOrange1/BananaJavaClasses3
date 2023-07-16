/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class Report {
    private Integer id;
    private String inventory;
    private Float totalsales;
    private String useractivity;
    
    
    Report(Integer id, String inventory, Float totalsales, String useractivity) {
        this.id = id;
        this.inventory = inventory;
        this.totalsales = totalsales;
        this.useractivity = useractivity;
                
    }
    // set getters
    public Integer id() {
        return id;
    }
    public String inventory() {
        return inventory;
    }
    public Float totalsales() {
        return totalsales;
    }
    public String useractivity() {
        return useractivity;
    }
    
    // Setters
  public void setid(Integer newid) {
    this.id = newid;
    }
  public void setinventory(String newinventory) {
      this.inventory = newinventory;
    }
  public void settotalsales(Float newtotalsales) {
      this.totalsales = newtotalsales;
  }
  public void setuseractivity(String newuseractivity) {
      this.useractivity = newuseractivity;
  }
    
}
