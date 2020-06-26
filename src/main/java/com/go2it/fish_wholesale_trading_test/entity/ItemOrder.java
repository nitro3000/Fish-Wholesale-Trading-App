package com.go2it.fish_wholesale_trading_test.entity;

import javax.persistence.*;

@Entity(name="itemOrder")
@Table(name="item_order")
public class ItemOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_order_id")
    private long itemOrderId;
    @Column(name="item_order_weight")
    private long itemOrderWeight;
    @Column(name="item_order_price")
    private double itemOrderPrice;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orders;

    public ItemOrder() {
    }

    public long getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(long itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public long getItemOrderWeight() {
        return itemOrderWeight;
    }

    public void setItemOrderWeight(long itemOrderWeight) {
        this.itemOrderWeight = itemOrderWeight;
    }

    public double getItemOrderPrice() {
        return itemOrderPrice;
    }

    public void setItemOrderPrice(long itemOrderPrice) {
        this.itemOrderPrice = itemOrderPrice;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return orders;
    }

    public void setOrder(Order order) {
        this.orders = order;
    }


    @Override
    public String toString() {
        return "ItemOrder{" +
                "itemOrderId=" + itemOrderId +
                ", itemOrderWeight=" + itemOrderWeight +
                ", itemOrderPrice=" + itemOrderPrice +
                ", item=" + item +
                ", order=" + orders +
                '}';
    }
}
