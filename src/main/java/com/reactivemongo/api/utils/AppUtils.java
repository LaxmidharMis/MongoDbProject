package com.reactivemongo.api.utils;

import org.springframework.beans.BeanUtils;

import com.reactivemongo.api.dto.ProductDto;
import com.reactivemongo.api.entity.Product;



public class AppUtils {
	
	 public static ProductDto entityToDto(Product product) {
	        ProductDto productDto = new ProductDto();
	        BeanUtils.copyProperties(product, productDto);
	        return productDto;
	    }

	    public static Product dtoToEntity(ProductDto productDto) {
	        Product product = new Product();
	        BeanUtils.copyProperties(productDto, product);
	        return product;
	    }
}
