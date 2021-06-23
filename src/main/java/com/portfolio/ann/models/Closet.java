package com.portfolio.ann.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "closets")
public class Closet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String closetName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Dress> dressList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Purse> purseList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Shoes> shoesList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "closet_categories",
            joinColumns = {@JoinColumn(name = "closet_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<Category> closetCategories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "closet_seasons",
            joinColumns = {@JoinColumn(name = "closet_id")},
            inverseJoinColumns = {@JoinColumn(name = "season_id")}
    )
    private List<Season> closetSeasons;

    @ManyToOne
    public User user;

    public Closet() {
    }

    public Closet(Closet copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        closetName = copy.closetName;
    }


    public Closet(long id, String closetName, List<Dress> dressList, List<Purse> purseList, List<Shoes> shoesList, List<Category> closetCategories, List<Season> closetSeasons, User user) {
        this.id = id;
        this.closetName = closetName;
        this.dressList = dressList;
        this.purseList = purseList;
        this.shoesList = shoesList;
        this.closetCategories = closetCategories;
        this.closetSeasons = closetSeasons;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getClosetName() {
        return closetName;
    }

    public void setClosetName(String closetName) {
        this.closetName = closetName;
    }

    public List<Dress> getDressList() {
        return dressList;
    }

    public void setDressList(List<Dress> dressList) {
        this.dressList = dressList;
    }

    public List<Purse> getPurseList() {
        return purseList;
    }

    public void setPurseList(List<Purse> purseList) {
        this.purseList = purseList;
    }

    public List<Shoes> getShoesList() {
        return shoesList;
    }

    public void setShoesList(List<Shoes> shoesList) {
        this.shoesList = shoesList;
    }

    public List<Category> getClosetCategories() {
        return closetCategories;
    }

    public void setClosetCategories(List<Category> closetCategories) {
        this.closetCategories = closetCategories;
    }

    public List<Season> getClosetSeasons() {
        return closetSeasons;
    }

    public void setClosetSeasons(List<Season> closetSeasons) {
        this.closetSeasons = closetSeasons;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}