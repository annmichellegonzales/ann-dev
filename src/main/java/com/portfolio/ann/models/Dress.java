package com.portfolio.ann.models;

import javax.persistence.*;

@Entity
@Table(name = "dresses")
public class Dress {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT NOT NULL")
    private String description;

    @Column(nullable = false)
    private String season;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private String occasion;



    @ManyToOne
    public Closet closet;

    public Dress() {
    }

    public Dress(long id, String title, String description, Closet closet, String season, String brand, String occasion) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.closet = closet;
        this.season = season;
        this.brand = brand;
        this.occasion = occasion;
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

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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
}
