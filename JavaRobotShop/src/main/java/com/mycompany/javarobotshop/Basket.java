/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class Basket {
    private Integer id;
    private Integer productcount;
    private Float totalprice;
    private Float valueaddedtax;
    
    
    Basket(Integer id, Integer productcount, Float totalprice, Float valueaddedtax) {
        this.id = id;
        this.productcount = productcount;
        this.totalprice = totalprice;
        this.valueaddedtax = valueaddedtax;
    }
    
    // set getters
    public Integer id() {
        return id;
    }
    public Integer productcount() {
        return productcount;
    }
    public Float totalprice() {
        return totalprice;
    }
    public Float valueaddedtax() {
        return valueaddedtax;
    }
    
    // Setter
  public void setid(Integer newid) {
    this.id = newid;
    }
  public void setproductcount(Integer newproductcount) {
    this.productcount = newproductcount;
  }
  public void settotalprice(Float newtotalprice) {
      this.totalprice = newtotalprice;
  }
  public void setvalueaddedtax(Float newvalueaddedtax){
      this.valueaddedtax = newvalueaddedtax; 
    }
  }
