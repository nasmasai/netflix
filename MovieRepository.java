package com.groupwork.demo.Repositories;

import com.groupwork.demo.Models.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movies, Long> {
List<Movies> findByCategoryId(Long id);
}
