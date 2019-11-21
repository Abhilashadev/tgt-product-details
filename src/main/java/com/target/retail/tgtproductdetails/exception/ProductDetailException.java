package com.target.retail.tgtproductdetails.exception;

/**
 * @author abhilasha
 * @since 21/11/19
 */

public class ProductDetailException extends RuntimeException {

    private Integer errorCode = null;

    public ProductDetailException(String message, Integer errorCode) {
        super(message);
        this.errorCode = errorCode;

    }
}
