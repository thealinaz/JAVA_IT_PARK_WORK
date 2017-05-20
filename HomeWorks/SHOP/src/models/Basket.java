package models;

import java.util.List;

/**
 * Created by Алина on 20.05.2017.
 */
public class Basket {
    private User user;
    private List<Product> products;

    public Basket() {
        this.user = null;
        this.products = null;
    }

    public Basket(User user, List<Product> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "user=" + user +
                ", products=" + products +
                '}';
    }
}
