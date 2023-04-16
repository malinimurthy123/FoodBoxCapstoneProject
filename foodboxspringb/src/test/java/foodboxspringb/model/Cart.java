package foodboxspringb.model;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Entity;

import jakarta.servlet.http.HttpSession;
import org.springframework.data.annotation.Id;

@Entity
@Table
@Setter
@Getter
@ToString
public class Cart {
    @Id
    private long id;
    private int quantity;
    private float price;
    @OneToOne
    private Product product;


    public Cart(long id, int quantity, float price, Product product) {
        super();
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Cart() {
        super();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}