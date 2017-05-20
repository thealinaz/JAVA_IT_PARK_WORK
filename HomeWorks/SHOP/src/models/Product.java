package models;

/**
 * Created by Алина on 20.05.2017.
 */
public class Product {
    private int id;
    private String name;
    private String type;
    private int cost;
    private int quantity;
    private int rating;

    public Product() {
        this.id = 0;
        this.name = null;
        this.type = null;
        this.cost = -1;
        this.quantity = 0;
        this.rating = 0;
    }

    public Product(int id, String name, String type, int cost, int quantity, int rating) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.quantity = quantity;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", rating=" + rating +
                '}';
    }
}
