package com.example.FirstTask.Controllers;

import com.example.FirstTask.Services.MoviePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviePartController {

    @Autowired
    MoviePartService moviePartService;
}
