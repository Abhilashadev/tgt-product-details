package com.target.retail.tgtproductdetails.productdetails;

import com.target.retail.tgtproductdetails.exception.ProductDetailErrorCode;
import com.target.retail.tgtproductdetails.exception.ProductDetailException;
import com.target.retail.tgtproductdetails.exception.ProductResourceConstant;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author abhilasha
 * @since 21/11/19
 */

@RepositoryRestController
public class ProductDetailController {


    @GetMapping(value = "/productdetail/{id}")
    ResponseEntity<Object> getProductDetail(@PathVariable(value = "id")ProductDetail productDetail){
        if(productDetail == null)
            throw new ProductDetailException(ProductResourceConstant.INVALID_REQUEST, ProductDetailErrorCode.INVALID_REQUEST);
        return new ResponseEntity<>(productDetail, HttpStatus.OK);
    }
}
