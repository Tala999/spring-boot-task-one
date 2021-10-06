package com.example.FirstTask.Models;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @ManyToOne
    @JoinColumn(name = "movie_Part_Id")
    MoviePart moviePart;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long commentId;

    @Column(name = "content")
    private String content;

    public Comment() {

    }

    public Comment(String content) {
        this.content = content;
    }

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MoviePart getMoviePart() {
        return moviePart;
    }

    public void setMoviePart(MoviePart moviePart) {
        this.moviePart = moviePart;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "moviePart=" + moviePart +
                ", commentId=" + commentId +
                ", content='" + content + '\'' +
                '}';
    }
}
