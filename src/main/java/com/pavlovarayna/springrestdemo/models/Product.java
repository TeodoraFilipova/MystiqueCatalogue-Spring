package com.pavlovarayna.springrestdemo.models;

//POJO Class - reflection class

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductId")
    private int id;

    @Column(name = "ProductName")
    private String name;

    @Column(name = "ProductCategory")
    private String category;

    @Column(name = "BoughtCount")
    private int bought;

    @Column(name = "ProductType")
    private String type;

    @Column(name = "ProductUnits")
    private String units;

    @Column(name = "ProductSize")
    private int size;

    @Column(name = "ProductNumber")
    private int number;

    @Column(name = "ProductPrice")
    private double price;

    @Column(name = "ProductImage")
    public String imageUrl;

    //put field for favourites - boolean

    public Product(){
        //empty constructor needed
    }

    public Product(int id, String name, String category, int bought, String type, String units, int size, int number, double price, String imageUrl){
        this.id = id;
        this.name = name;
        this.category = category;
        this.bought = bought;
        this.type = type;
        this.units = units;
        this.size = size;
        this.number = number;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getBought() {
        return bought;
    }

    public void setBought(int bought) {
        this.bought = bought;
    }
}
