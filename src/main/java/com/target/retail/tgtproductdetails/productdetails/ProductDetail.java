package com.target.retail.tgtproductdetails.productdetails;

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

}
