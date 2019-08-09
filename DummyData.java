package com.groupwork.demo;

import com.groupwork.demo.Models.Category;
import com.groupwork.demo.Models.Movies;
import com.groupwork.demo.Repositories.CategoryRepository;
import com.groupwork.demo.Repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DummyData implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final MovieRepository movieRepository;

    public DummyData(CategoryRepository categoryRepository, MovieRepository movieRepository) {
        this.categoryRepository = categoryRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       Category drama = new Category("Drama", "Comedy");
       Category adventure = new Category("Adventure", "series");

       categoryRepository.saveAll(Arrays.asList(drama, adventure));

        Movies movies1 = new Movies("GOT", drama);
        movieRepository.save(movies1);
        Movies movies2 = new Movies("POWER", drama);
        movieRepository.save(movies2);

     }
}
