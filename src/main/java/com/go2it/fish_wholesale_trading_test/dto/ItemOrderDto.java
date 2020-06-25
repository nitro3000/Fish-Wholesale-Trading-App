package com.go2it.fish_wholesale_trading_test.dto;

public class ItemOrderDto {
    private long itemOrderWeight;
    private long itemOrderPrice;

    public ItemOrderDto() {
    }

    public ItemOrderDto(long itemOrderWeight, long itemOrderPrice) {
        this.itemOrderWeight = itemOrderWeight;
        this.itemOrderPrice = itemOrderPrice;
    }

    public long getItemOrderWeight() {
        return itemOrderWeight;
    }

    public void setItemOrderWeight(long itemOrderWeight) {
        this.itemOrderWeight = itemOrderWeight;
    }

    public long getItemOrderPrice() {
        return itemOrderPrice;
    }

    public void setItemOrderPrice(long itemOrderPrice) {
        this.itemOrderPrice = itemOrderPrice;
    }

    @Override
    public String toString() {
        return "ItemOrderDto{" +
                "itemOrderWeight=" + itemOrderWeight +
                ", itemOrderPrice=" + itemOrderPrice +
                '}';
    }
}
