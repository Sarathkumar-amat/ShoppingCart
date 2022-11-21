package com.minipro.Entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> items=new ArrayList<>();
    private double total;

    public Cart() {
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public double checkout()
    {
        return this.total;
    }
    public void viewProducts()
    {
        for(Item x:items)
        {
            System.out.println(x.getQuantity()+" x "+x.getProduct().getName()+": "+x.getPrice());
        }
        System.out.println("Total value: "+this.total);
    }
    public void addItem(Item it)
    {
        this.items.add(it);
        this.total=this.total+it.getPrice();
    }
}
