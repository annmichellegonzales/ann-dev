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

    @ManyToOne
    public Closet closet;

    public Dress() {
    }

    public Dress(long id, String title, String description, Closet closet) {
        this.id = id;
        this.title = title;
        this.description = description;
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

    public Closet getCloset() {
        return closet;
    }

    public void setCloset(Closet closet) {
        this.closet = closet;
    }
}
