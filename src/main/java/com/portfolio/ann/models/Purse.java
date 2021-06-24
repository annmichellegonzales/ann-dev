package com.portfolio.ann.models;

import javax.persistence.*;


@Entity
@Table(name = "purses")
public class Purse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String description;

    @Column(nullable = false)
    private String material;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String occasion;

    @ManyToOne
    public Closet closet;

    public Purse() {
    }

    public Purse(long id, String title, String description, String material, String brand, String occasion, Closet closet) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.material = material;
        this.brand = brand;
        this.occasion = occasion;
        this.closet = closet;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
