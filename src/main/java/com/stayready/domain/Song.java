package com.stayready.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue
    @Column(name = "SONG_ID")
    private long id;

    @Column(name = "ARTIST")
    private String artist;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "URL")
    private String url;


    public long getId(){
        return this.id;
    }

    public String getUrl(){
        return this.url;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getTitle(){
        return this.title;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setId(long id){
        this.id=id;
    }

    public void setArtist(String artist){
        this.artist=artist;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    public void setUrl(String url){
        this.url=url;
    }

}
