package com.groupwork.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "sub_category")
    private String subCategory;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Movies(String movieName, Category category) {
        this.movieName = movieName;
        this.category = category;
    }

    public Movies() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
