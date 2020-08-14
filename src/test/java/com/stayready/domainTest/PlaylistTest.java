package com.stayready.domainTest;

import com.stayready.domain.Playlist;
import com.stayready.domain.Song;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PlaylistTest {
    Long id=1L;
    String desc="THE BEST";
    Playlist playlist;

    @Before
    public void setup(){
        playlist=new Playlist();
        playlist.setDescription(desc);
        playlist.setId(id);
    }

    @Test
    public void getIdTest(){
        // Given
        // When
        Long actual=playlist.getId();

        // Then
        Assert.assertEquals(id,actual);
    }

    @Test
    public void setIdTest(){
        // Given
        Long newid=494934L;

        // When
        playlist.setId(newid);
        Long actual=playlist.getId();

        // Then
        Assert.assertEquals(newid,actual);
    }

    @Test
    public void getDescTest(){
        // Given
        // When
        String actual=playlist.getDescription();

        // Then
        Assert.assertEquals(desc,actual);
    }

    @Test
    public void setDescTest(){
        // Given
        String newDesc="HYPE";

        // When
        playlist.setDescription(newDesc);
        String actual=playlist.getDescription();

        // Then
        Assert.assertEquals(newDesc,actual);
    }

    @Test
    public void getSongsTest(){
        // Given

        // When
        Set<Song> s=playlist.getSongs();

        // Then
        Assert.assertTrue(s.isEmpty());
    }

    @Test
    public void setSongsTest(){
        // Given
        Set<Song> expected=new HashSet<Song>();
        expected.add(new Song());

        // When
        playlist.setSongs(expected);
        Set<Song> s=playlist.getSongs();

        // Then
        Assert.assertEquals(expected,s);
    }
}
