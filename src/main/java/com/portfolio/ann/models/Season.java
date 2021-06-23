package com.portfolio.ann.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "seasons")
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @ManyToMany(mappedBy = "closetSeasons")
    private List<Closet> closets;

    public Season() {
    }

    public Season(long id, String title, List<Closet> closets) {
        this.id = id;
        this.title = title;
        this.closets = closets;
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

    public List<Closet> getClosets() {
        return closets;
    }

    public void setClosets(List<Closet> closets) {
        this.closets = closets;
    }
}
