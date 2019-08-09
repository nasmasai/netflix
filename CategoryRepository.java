package com.groupwork.demo.Repositories;

import com.groupwork.demo.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category>findByGenre1StartingWith(String name);
    List<Category>findByGenre1StartingWithAndSubgenre (String name, String subgenre);
}
