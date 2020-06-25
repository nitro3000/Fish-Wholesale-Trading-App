package com.go2it.fish_wholesale_trading_test.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

public class OrderDto {
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate orderDate;
    private double orderPrice;

    public OrderDto() {
    }

    public OrderDto(LocalDate orderDate, double orderPrice) {
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderDate=" + orderDate +
                ", orderPrice=" + orderPrice +
                '}';
    }
}
