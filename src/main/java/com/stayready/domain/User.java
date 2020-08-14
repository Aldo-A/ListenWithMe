package com.stayready.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(name="USER_ID")
    private Long id;

    @Column(name="USER_NAME")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PLAYLISTS")
    @OrderBy
    private Set<Playlist> playlists;

    public User(){
        this.playlists=new HashSet<Playlist>();
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public Set<Playlist> getPlayList(){
        return this.playlists;
    }

    public void setPlayList(Set<Playlist> playList){
        this.playlists=playList;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}
