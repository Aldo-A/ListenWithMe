package com.stayready.domainTest;

import com.stayready.domain.Song;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SongTest {
    Long id=1L;
    String artist="bob";
    String title="MUSIC YEAH";
    String genre="rap";
    String url="youtube.com/blahblah";
    Song song;

    @Before
    public void setup(){
        song=new Song();
        song.setArtist(artist);
        song.setGenre(genre);
        song.setId(id);
        song.setTitle(title);
        song.setUrl(url);
    }

    @Test
    public void getArtistTest(){
        // Given
        // When
        String actual=song.getArtist();

        // Then
        Assert.assertEquals(artist,actual);
    }

    @Test
    public void setArtistTest(){
        // Given
        String newArtist="NUN";

        // When
        song.setArtist(newArtist);
        String actual=song.getArtist();

        // Then
        Assert.assertEquals(newArtist,actual);
    }

    @Test
    public void getGenreTest(){
        // Given
        // When
        String actual=song.getGenre();

        // Then
        Assert.assertEquals(genre,actual);
    }

    @Test
    public void setGenreTest(){
        // Given
        String newGenre="Rock";

        // When
        song.setGenre(newGenre);
        String actual=song.getGenre();

        // Then
        Assert.assertEquals(newGenre,actual);
    }

    @Test
    public void getTitleTest(){
        // Given
        // When
        String actual=song.getTitle();

        // Then
        Assert.assertEquals(title,actual);
    }

    @Test
    public void setTitleTest(){
        // Given
        String newTitle="BEST OF THE BEST";

        // When
        song.setTitle(newTitle);
        String actual=song.getTitle();

        // Then
        Assert.assertEquals(newTitle,actual);
    }

    @Test
    public void getIdTest(){
        // Given
        // When
        Long actual=song.getId();

        // Then
        Assert.assertEquals(id,actual);
    }

    @Test
    public void setIdTest(){
        // Given
        Long newid=324321l;

        // When
        song.setId(newid);
        Long actual=song.getId();

        // Then
        Assert.assertEquals(newid,actual);
    }

    @Test
    public void getUrlTest(){
        // Given
        // When
        String actual=song.getUrl();

        // Then
        Assert.assertEquals(url,actual);
    }

    @Test
    public void setUrlTest(){
        // Given
        String newUrl="FACEBOOK.COM";

        // When
        song.setUrl(newUrl);
        String actual=song.getUrl();

        // Then
        Assert.assertEquals(newUrl,actual);
    }
}
