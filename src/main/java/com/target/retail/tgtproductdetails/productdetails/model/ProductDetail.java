package com.target.retail.tgtproductdetails.productdetails.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author abhilasha
 * @since 21/11/19
 */

@Entity
public class ProductDetail {


    @Id
    private String id;

    private String name;
    private String brand;

    ProductDetail(){

    }

    public ProductDetail(String id, String name,String brand){
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
