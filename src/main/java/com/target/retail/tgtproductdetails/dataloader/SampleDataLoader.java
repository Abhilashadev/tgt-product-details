package com.target.retail.tgtproductdetails.dataloader;

import com.target.retail.tgtproductdetails.productdetails.model.ProductDetail;
import com.target.retail.tgtproductdetails.productdetails.repository.ProductDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * @author abhilasha
 * @since 22/11/19
 */

@Component
public class SampleDataLoader implements CommandLineRunner {
    @Autowired
    ProductDetailRepository productDetailRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSampleProductDetails();
    }

    private void loadSampleProductDetails() {

        Stream<String> productDetailsStream = Stream.of("15117729,Smart watch, Apple","16483589,Laptop,Dell","16696652,Mobile,Samsung","16752456,Pen,Cello","15643793,HeadPhones,Boss");
         productDetailsStream.forEach(pds->{
            String[] info = pds.split(",");
            createProductDetail(info[0],info[1],info[2]);
        });

    }

    private void createProductDetail(String id,String  name, String brand){
        ProductDetail pdr = new ProductDetail(id,name,brand);
        productDetailRepository.save(pdr);
    }
}