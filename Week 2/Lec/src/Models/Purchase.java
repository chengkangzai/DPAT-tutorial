package Models;

import Abstract.BaseModel;

public class Purchase extends BaseModel {
    private int id;
    private int userId;
    private int propertyId;
    private int quantity;
    private double price;
    private String date;

    public Purchase(int id, int userId, int productId, int quantity, double price, String date) {
        this.id = id;
        this.userId = userId;
        this.propertyId = productId;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
