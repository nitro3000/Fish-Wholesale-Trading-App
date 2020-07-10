package com.go2it.fish_wholesale_trading_test.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.sql.Timestamp;
import java.time.LocalDate;

public class OrderDto {
//    @JsonDeserialize(using = LocalDateDeserializer.class)
//    @JsonSerialize(using = LocalDateSerializer.class)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Timestamp orderDate;
    private double orderPrice;
    private double OrderTotalWeight;

    public OrderDto() {
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

    public double getOrderTotalWeight() {
        return OrderTotalWeight;
    }

    public void setOrderTotalWeight(double orderTotalWeight) {
        OrderTotalWeight = orderTotalWeight;
    }

    public OrderDto(Timestamp orderDate, double orderPrice) {
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                ", OrderTotalWeight=" + OrderTotalWeight +
                '}';
    }
}
