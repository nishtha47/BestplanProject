package nishtha.tutorial.restfulspringboot.service;


import java.util.List;

import nishtha.tutorial.restfulspringboot.domain.Product;

public interface ProductService {

	List<Product> findAll();

	Iterable<ProductServiceImpl> getAllProducts();  
}