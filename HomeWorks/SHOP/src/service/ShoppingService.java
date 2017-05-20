package service;

import models.Product;

import java.util.List;

/**
 * Created by Алина on 20.05.2017.
 */
public interface ShoppingService {
    void addToCart(Product product);
    void removefromCart(Product product);
    List<Product> getListOfProducts();
}
