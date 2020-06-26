package com.go2it.fish_wholesale_trading_test.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity//(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    private String itemName;
    private double itemPrice;

    @OneToMany(mappedBy = "item")
    private Collection<ItemOrder> itemsList;

    public Item() {
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Collection<ItemOrder> getItemsList() {
        return itemsList;
    }

    public void setItemsList(Collection<ItemOrder> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
