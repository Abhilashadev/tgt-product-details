package com.target.retail.tgtproductdetails.productdetails.repository;

import com.target.retail.tgtproductdetails.productdetails.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author abhilasha
 * @since 22/11/19
 */

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Object> {

    ProductDetail findById(String id);
}
