package nishtha.tutorial.restfulspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import nishtha.tutorial.restfulspringboot.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
