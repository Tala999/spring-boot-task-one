package com.example.FirstTask.Services;

import com.example.FirstTask.Models.Movie;
import com.example.FirstTask.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public List<Movie> findAll() {
        return movieRepository.findAll();


    }
}
