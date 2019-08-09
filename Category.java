package com.groupwork.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "genre1")
    private String genre1;
    @Column(name = "subgenre")
    private String subgenre;

    public Category(String genre1, String subgenre) {
        this.genre1 = genre1;
        this.subgenre = subgenre;
    }

    private Category() {
    }

    public String getGenre1() {
        return genre1;
    }

    public void setGenre1(String genre1) {
        this.genre1 = genre1;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }
}
