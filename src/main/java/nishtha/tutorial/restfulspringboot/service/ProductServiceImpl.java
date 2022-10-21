package nishtha.tutorial.restfulspringboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import nishtha.tutorial.restfulspringboot.domain.Product;

@Service  
public class ProductServiceImpl implements ProductService    
{  
@Override  
public List<Product> findAll()  
{  
//creating an object of ArrayList  
//ArrayList<Product> products = new ArrayList<Product>();  
//adding products to the List  
//products.add(new Product((long) 1, "PLAN1","voiceandema",100.0,2));  
Product pr1=new Product((long) 1, "PLAN1","voiceandema",100.0,2);
Product pr2=new Product((long) 2,"PLAN2","emailanddatabaseandadm",150.0,3);
//Product pr2=products.add(new Product((long) 2,"PLAN2","emailanddatabaseandadm",150.0,3));
Product pr3=new Product((long) 3, "PLAN3", "voiceandadm", 125.0,2); 
//products.add(new Product((long) 3, "PLAN3", "voiceandadm", 125.0,2));  
Product pr4=new Product((long) 4, "PLAN4", "databaseandadm",135.0,2);  
//products.add(new Product((long) 4, "PLAN4", "databaseandadm",135.0,2)); 
List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);

String string = "pr1 10 pr2 25 pr3 30 pr4 45";

Integer sum = Arrays.stream(string.split(" "))
    .filter((s) -> s.matches("\\d+"))
    .mapToInt(Integer::valueOf)
    .sum();

//returns a list of product  
return products;  
}

public Iterable<ProductServiceImpl> getAllProducts() {
	// TODO Auto-generated method stub
	return null;
}  
}  