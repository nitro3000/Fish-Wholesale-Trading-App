package com.go2it.fish_wholesale_trading_test.dto;

import javax.swing.*;

public class ItemDto {
    private String itemName;
    private double itemPrice;
    private String itemDescriptions;

    public ItemDto() {
    }

    public ItemDto(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

//    public ItemDto(String itemName, double itemPrice, String itemDescriptions) {
//        this.itemName = itemName;
//        this.itemPrice = itemPrice;
//        this.itemDescriptions = itemDescriptions;
//    }

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

    public String getItemDescriptions() {
        return itemDescriptions;
    }

    public void setItemDescriptions(String itemDescriptions) {
        this.itemDescriptions = itemDescriptions;
    }

    @Override
    public String toString() {
        return "ItemDto{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
