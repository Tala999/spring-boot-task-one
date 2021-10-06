package com.example.FirstTask.Repositories;

import com.example.FirstTask.Models.MoviePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviePartRepository extends JpaRepository <MoviePart,Long> {
}
