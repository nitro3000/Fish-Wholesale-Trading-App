package com.go2it.fish_wholesale_trading_test.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Collection;

@Entity(name = "order")
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long orderId;
    @Column(name = "order_date")
    private Timestamp orderDate;
    @Column(name = "order_price")
    private double orderPrice;
    @Column(name = "order_total_weight")
    private double orderTotalWeight;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;


    @OneToMany(mappedBy = "orders")
    private Collection<ItemOrder> ordersList;

    public Order() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<ItemOrder> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Collection<ItemOrder> ordersList) {
        this.ordersList = ordersList;
    }

    public double getOrderTotalWeight() {
        return orderTotalWeight;
    }

    public void setOrderTotalWeight(double orderTotalWeight) {
        this.orderTotalWeight = orderTotalWeight;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", orderTotalWeight=" + orderTotalWeight +
                ", user=" + user +
                ", ordersList=" + ordersList +
                '}';
    }
}
