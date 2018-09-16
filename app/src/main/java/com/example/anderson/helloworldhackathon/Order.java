package com.example.anderson.helloworldhackathon;

public class Order {

    String email, product;
    String price;


    public Order(String email){
        this.email = email;
        this.product = product;
        this.price = price;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.product;
    }

    public String getPrice(){
        return this.price;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.product = name;
    }

    public void setPrice(String price){
        this.price = price;
    }
}
