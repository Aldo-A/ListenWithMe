package com.stayready.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Playlist {
    @Id
    @GeneratedValue
    @Column(name = "PLAYLIST_ID")
    private long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "SONGS")
    @OrderBy
    private Set<Song> songs;

    @Column(name = "DESCRIPTION")
    private String description;

    public Playlist(){
        this.songs=new HashSet<Song>();
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String desc){
        this.description=desc;
    }

    public Set<Song> getSongs(){
        return this.songs;
    }

    public void setSongs(Set<Song> songs){
        this.songs=songs;
    }

}
