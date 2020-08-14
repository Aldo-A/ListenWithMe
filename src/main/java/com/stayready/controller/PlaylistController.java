package com.stayready.controller;

import com.stayready.domain.Playlist;
import com.stayready.domain.User;
import com.stayready.exception.ResourceNotFoundException;
import com.stayready.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class PlaylistController {
    private PlaylistRepository playlistRepository;

    @Autowired
    public PlaylistController(PlaylistRepository playlistRepository){
        this.playlistRepository=playlistRepository;
    }

    @RequestMapping(value = "/users/{id}/playlists",method = RequestMethod.POST)
    public ResponseEntity<?> createPlaylist(@PathVariable Long id, @RequestBody Playlist list){
        list=playlistRepository.save(list);
        HttpHeaders header=new HttpHeaders();
        header.setLocation(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(list.getId()).toUri());
        return new ResponseEntity<>(null,header, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/playlists",method = RequestMethod.GET)
    public Iterable<Playlist> getAllPlaylists(){
        return playlistRepository.findAll();
    }

    @RequestMapping(value = "/users/{id}/playlists",method = RequestMethod.GET)
    public Iterable<Playlist> getUserPlaylist(@PathVariable Long id){
        return playlistRepository.findPlaylistByUser(id);
    }

}
