package com.example.FirstTask.Controllers;

import com.example.FirstTask.Models.Comment;
import com.example.FirstTask.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/movie/{id}")
    public List<Comment> findAll(){ // do I need to add @PathVariable?
        return commentService.findAll();
    }
}
