package nishtha.tutorial.restfulspringboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    
  //  @NotBlank
    private String productname;
    private double price;
    private String image;
    private String type;
    private double totalprice;
    int noofproduct;
    @SuppressWarnings("unused")
	public Product(){}
    
    public Product(String productname) {
        this.productname = productname;
    }

    public Product(Long id, String productname, String type, double price,int noofproduct )   
    {  
    super();  
    this.id = id;  
    
    this.productname = productname;  
    this.price = price;  
    this.type = type;  
    this.noofproduct = noofproduct; 
    }  

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productname;
    }

    public void setProductName(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void settotalPrice(double totalprice) {
        this.totalprice = totalprice;
    }
    public double gettotalPrice() {
        return totalprice;
    }
    public void setNoofproduct(int noofproduct)   
    {  
    this.noofproduct = noofproduct;  
    }  

    @Override
    public String toString() {
        return "Product [productname=" + productname + ", price=" + price + "]";
    }
    
    
    
}
