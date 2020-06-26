package com.go2it.fish_wholesale_trading_test.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity(name = "user")
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_address")
    private String userAddress;
    @Column(name="e_mail")
    private String eMail;
    @Column(name="login")
    private String login;
    @Column(name="password")
    private String password;
    @Column(name="phone")
    private String phone;
    @Column(name="role")
    private String role;
    @Column(name="date_of_birth")
    private Timestamp dateOfBirth;

    @OneToMany(mappedBy = "user")
    private Collection<Order> UserOrderList;

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String address) {
        this.userAddress = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collection<Order> getUserOrderList() {
        return UserOrderList;
    }

    public void setUserOrderList(Collection<Order> userOrderList) {
        UserOrderList = userOrderList;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", address='" + userAddress + '\'' +
                ", eMail='" + eMail + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", Role='" + role + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", UserOrderList=" + UserOrderList +
                '}';
    }
}
