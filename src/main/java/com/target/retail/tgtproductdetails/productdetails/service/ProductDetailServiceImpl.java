package com.target.retail.tgtproductdetails.productdetails.service;

import com.target.retail.tgtproductdetails.exception.ProductDetailErrorCode;
import com.target.retail.tgtproductdetails.exception.ProductDetailException;
import com.target.retail.tgtproductdetails.exception.ProductResourceConstant;
import com.target.retail.tgtproductdetails.productdetails.model.ProductDetail;
import com.target.retail.tgtproductdetails.productdetails.repository.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author abhilasha
 * @since 21/11/19
 */
@Service
public class ProductDetailServiceImpl implements ProductDetailService {


    @Autowired
    ProductDetailRepository productDetailRepository;

    @Override
    public ProductDetail getProductDetail(String id) {
        ProductDetail pd = productDetailRepository.findById(id);
        if(pd == null)
            throw new ProductDetailException(ProductResourceConstant.PRODUCT_NOT_FOUND, ProductDetailErrorCode.PRODUCT_NOT_FOUND);
        return pd;
    }
}
