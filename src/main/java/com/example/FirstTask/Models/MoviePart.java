package com.example.FirstTask.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="moviePart")
public class MoviePart {

    @ManyToOne
    @JoinColumn(name = "movie_Id") //name="the name in the Movie table" y3ni osom il foreign key illi sar 3ndo mn il table illi ma3o relationship
    Movie movie;

    @OneToMany(mappedBy = "moviePart")
    private List<Comment> comments;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long moviePartId;

    @Column(name="moviePartName")
    private String moviePartName;

    @Column(name="moviePartRate")
    private double moviePartRate;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Column(name="moviePartNumber")
    private int moviePartNumber ;

    public MoviePart(){
    }

    public MoviePart(String moviePartName, double moviePartRate, int moviePartNumber){
        this.moviePartName=moviePartName;
        this.moviePartRate=moviePartRate;
        this.moviePartNumber=moviePartNumber;
    }

    public long getMoviePartId() {
        return moviePartId;
    }

    public void setMoviePartId(long moviePartId) {
        this.moviePartId = moviePartId;
    }

    public String getMoviePartName() {
        return moviePartName;
    }

    public void setMoviePartName(String moviePartName) {
        this.moviePartName = moviePartName;
    }

    public double getMoviePartRate() {
        return moviePartRate;
    }

    public void setMoviePartRate(double moviePartRate) {
        this.moviePartRate = moviePartRate;
    }

    public int getMoviePartNumber() {
        return moviePartNumber;
    }

    public void setMoviePartNumber(int moviePartNumber) {
        this.moviePartNumber = moviePartNumber;
    }
}
