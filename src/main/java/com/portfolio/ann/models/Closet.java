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

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Dress> dressList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Purse> purseList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Jewellery> jewelleryList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Makeup> makeupList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "closet")
    private List<Shoes> shoesList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "closet-categories",
            joinColumns = {@JoinColumn(name = "closet_id")},
            inverseJoinColumns = {@JoinColumn(name = "categories_id")}
    )
    private List<Category> closetCategories;

    public Closet() {
    }

    public Closet(Closet copy) {
        id = copy.id; // This line is SUPER important! Many things won't work if it's absent
        email = copy.email;
        closetName = copy.closetName;
        password = copy.password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return closetName;
    }

    public void setUsername(String username) {
        this.closetName = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Dress> getPosts() {
        return dressList;
    }

    public void setPosts(List<Dress> dressList) {
        this.dressList = dressList;
    }
}