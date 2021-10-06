package com.example.FirstTask.Services;

import com.example.FirstTask.Repositories.MoviePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviePartService {

    @Autowired
    MoviePartRepository moviePartRepository;
}
