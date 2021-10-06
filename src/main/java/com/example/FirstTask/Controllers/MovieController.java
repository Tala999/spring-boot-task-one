package com.example.FirstTask.Controllers;

import com.example.FirstTask.Models.Movie;
import com.example.FirstTask.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    //@RequestMapping("/movie")

    @GetMapping("/movies")
    public List<Movie> getAll(){
        return movieService.findAll();
    }






}
