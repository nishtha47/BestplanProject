package nishtha.tutorial.restfulspringboot;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import nishtha.tutorial.restfulspringboot.domain.Product;
import nishtha.tutorial.restfulspringboot.property.ApiUrlProperties;
import nishtha.tutorial.restfulspringboot.property.FileStorageProperties;
import nishtha.tutorial.restfulspringboot.repository.ProductRepository;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class,
    ApiUrlProperties.class
})
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);
    }
    
    @Bean
    CommandLineRunner runner(ProductRepository productRepository) {
        return args -> {
            
           
            
            Product plan1 = new Product("voice,ema");
            plan1.setPrice(100.00);
            plan1.setType("plan1");
       
            productRepository.save(plan1);
            
           
            
            Product plan2 = new Product("email,database,adm");
            plan2.setPrice(150.00);
            plan2.setType("plan2");
           // plan2.setImage("/images/wii.jpg");
            productRepository.save(plan2);
            
            Product plan3 = new Product("voice,admn");
            plan3.setPrice(125.00);
            plan3.setType("plan3");
           // plan2.setImage("/images/wii.jpg");
            productRepository.save(plan3);
            
            Product plan4 = new Product("database,admn");
            plan4.setPrice(135.00);
            plan4.setType("plan4");
            
            
            
        };
    }
}
