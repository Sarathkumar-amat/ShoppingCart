package com.minipro.Entities;

public class Item {

    private Product product;
    private Integer quantity;
    private double price;

    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price=this.product.getPrice()*this.getQuantity();
    }

    public Item(Product product, Integer quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
