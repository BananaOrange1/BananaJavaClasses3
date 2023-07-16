/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javarobotshop;

/**
 *
 * @author japie
 */
public class Product {
    private Integer productid;
    private String name;
    private String description;
    private Float price;
    private String shippingtime;
    private Integer quantityinstock;
    private ProductType producttype;
    


Product(Integer productid, String name, String description, Float price, String shippingtime, Integer quantityinstock, ProductType productype) {
this.productid = productid;
this.name = name;
this.description = description;
this.price = price;
this.shippingtime = shippingtime;
this.quantityinstock = quantityinstock;
this.producttype = producttype;

} 

 // set getters
    public Integer productid() {
        return productid;
    }
    public String name() {
        return name;
    }
    public String description() {
        return description;
    }
    public Float price() {
        return price;
    }
    public String shippingtime() {
        return shippingtime;
    } 
    public Integer quantityinstock() {
        return quantityinstock;
    }
    public ProductType producttype() {
        return producttype;
    }

  // Setters
  public void setproductid(Integer newproductid) {
    this.productid = newproductid;
    }
  public void setname(String newname) {
      this.name = newname;
  }
  public void setdescription(String newdescription) {
      this.description = newdescription;
  }
  public void setprice(Float newprice) {
      this.price = newprice;
  }
  public void setquantityinstock(Integer newquantityinstock) {
      this.quantityinstock = newquantityinstock;
  }
  public void setproductttype(ProductType newproducttype) {
      this.producttype = newproducttype;
  }
}

