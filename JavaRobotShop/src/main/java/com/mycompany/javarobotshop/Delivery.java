/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class Delivery {
    private Integer id;
    private Integer deliveryprice;
    private String shippingspeed;
    
    Delivery(Integer id, Integer deliveryprice, String shippingspeed) {
        this.id = id;
        this.deliveryprice = deliveryprice;
        this.shippingspeed = shippingspeed;
    }
    
    // set getters
    public Integer id() {
        return id;
    }
    public Integer deliveryprice() {
        return deliveryprice;
    }
    public String shippingspeed() {
        return shippingspeed;
    }
        
  // Setter
  public void setid(Integer newid) {
    this.id = newid;
    }
  public void setdeliveryprice(Integer newdeliveryprice) {
      this.deliveryprice = newdeliveryprice;
  }
  public void setshippingspeed(String newshippingspeed) {
      this.shippingspeed = newshippingspeed;
  }
  
}
