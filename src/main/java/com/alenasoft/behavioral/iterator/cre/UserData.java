package com.alenasoft.behavioral.iterator.cre;

public class UserData {
    private String name;
    private String address;
    private double payment;

    public UserData(String name, String address, double payment) {
        this.name = name;
        this.address = address;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return String.format("name: %s address: %s payment: %f", this.name, this.address, this.payment);
    }
}