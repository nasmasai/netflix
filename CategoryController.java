package com.groupwork.demo.Controller;

import com.groupwork.demo.Models.Category;
import com.groupwork.demo.Models.Movies;
import com.groupwork.demo.Repositories.CategoryRepository;
import com.groupwork.demo.Repositories.MovieRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "categories")
public class CategoryController {

   private final CategoryRepository categoryRepository;
   private final MovieRepository movieRepository;

    public CategoryController(CategoryRepository categoryRepository, MovieRepository movieRepository) {
        this.categoryRepository = categoryRepository;
        this.movieRepository = movieRepository;
    }


    @GetMapping
    public List<Category>getAllCategories(){
        return categoryRepository.findAll();
    }

    @GetMapping (value = "{Id}")
    public Category findOneById(@PathVariable Long Id){
        Optional<Category> category = categoryRepository.findById(Id);
        return category.get();

    }
    @GetMapping(value  = "{categoryId}/movies")
    public List<Movies> findByCategoryId(@PathVariable Long categoryId){
    return movieRepository.findByCategoryId(categoryId);
    }

    @PostMapping
    public Movies createMovies(@RequestBody Movies movies){
        return movieRepository.save(movies);
    }

    @DeleteMapping(value = "{categoryId}/movies")
    public void deleteMovies(@PathVariable Long categoryId){
        List<Movies> movies = findByCategoryId(categoryId);
        movieRepository.deleteById(categoryId);
    } }

