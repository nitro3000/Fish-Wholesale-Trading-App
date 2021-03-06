package com.go2it.fish_wholesale_trading_test.entity;

import javax.persistence.*;
import javax.swing.*;
import java.util.Collection;

@Entity(name = "item")
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long itemId;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_price")
    private double itemPrice;
    @Column(name = "item_descriptions")
    private String itemDescriptions;

    @OneToMany(mappedBy = "item")
    private Collection<ItemOrder> itemsList;

    public Item() {
    }

    public Item(long itemId) {
        this.itemId = itemId;
    }

    public Item(Long id, String itemName) {
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

    public String getItemDescriptions() {
        return itemDescriptions;
    }

    public void setItemDescriptions(String itemDescriptions) {
        this.itemDescriptions = itemDescriptions;
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
