package com.example.FirstTask.Repositories;

import com.example.FirstTask.Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository <Comment,Long> {
}
