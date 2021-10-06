package com.example.FirstTask.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="movie_Id")
    private long id;

    @Column(name="movie_name")
    private String name;

    @Column(name="movie_type")
    private String type;

    @OneToMany(mappedBy="movie") // we say mappedBy"the name that must be in the other table" y3ni sho ykoon osmi 3nd hadak il table
    //@JoinColumn(name="moviePartId")  // do we add the join column annotation together with the mappedBy attribute?
    private List<MoviePart> items;

    public List<MoviePart> getItems() {
        return items;
    }

    public void setItems(List<MoviePart> items) {
        this.items = items;
    }

    public Movie(){

    }

    public Movie( String name, String type){
        this.name=name;
        this.type=type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
