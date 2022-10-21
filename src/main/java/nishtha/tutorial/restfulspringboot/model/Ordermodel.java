package nishtha.tutorial.restfulspringboot.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import nishtha.tutorial.restfulspringboot.domain.Product;

public class Ordermodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreated;

    private String status;

    @JsonManagedReference
    @OneToMany(mappedBy = "pk.order")
    @Valid
    private List<Product> orderProducts = new ArrayList<>();

    @Transient
    public Double getTotalOrderPrice() {
        double sum = 0D;
        List<Product> orderProducts = getNumberOfProducts();
        for (Product op : orderProducts) {
            sum += op.gettotalPrice();
        }
        return sum;
    }

    @Transient
    public List<Product> getNumberOfProducts() {
        return this.orderProducts;

    // standard getters and setters
}}