package com.target.retail.tgtproductdetails.productdetails.rest;

import com.target.retail.tgtproductdetails.exception.ProductDetailErrorCode;
import com.target.retail.tgtproductdetails.exception.ProductDetailException;
import com.target.retail.tgtproductdetails.exception.ProductResourceConstant;
import com.target.retail.tgtproductdetails.productdetails.model.ProductDetail;
import com.target.retail.tgtproductdetails.productdetails.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author abhilasha
 * @since 21/11/19
 */

@RepositoryRestController
public class ProductDetailController {


    @Autowired
    ProductDetailService productDetailService;



    @GetMapping(value = "/productDetails/{id}")
    ResponseEntity<Object> getProductDetail(@PathVariable(value = "id")String id){
        if(id == null)
            throw new ProductDetailException(ProductResourceConstant.INVALID_REQUEST, ProductDetailErrorCode.INVALID_REQUEST);
        ProductDetail productDetail = productDetailService.getProductDetail(id);
        return new ResponseEntity<>(productDetail, HttpStatus.OK);
    }

}
