package com.stayready.domainTest;

import com.stayready.domain.Playlist;
import com.stayready.domain.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UserTest {
    Long id=1L;
    String name="bob";
    User user;

    @Before
    public void setup(){
        user=new User();
        user.setId(id);
        user.setName(name);
    }

    @Test
    public void getNameTest(){
        // Given
        // When
        String actual=user.getName();

        // Then
        Assert.assertEquals(name,actual);
    }

    @Test
    public void setNameTest(){
        // Given
        String newName="JOE";

        // When
        user.setName(newName);
        String actual=user.getName();

        // Then
        Assert.assertEquals(newName,actual);
    }

    @Test
    public void getIdTest(){
        // Given
        // When
        Long actual=user.getId();

        // Then
        Assert.assertEquals(id,actual);
    }

    @Test
    public void setIdTest(){
        // Given
        Long newID=3431L;

        // When
        user.setId(newID);
        Long actual=user.getId();

        // Then
        Assert.assertEquals(newID,actual);
    }

    @Test
    public void getPlaylistTest(){
        // Given

        // When
        Set<Playlist> p=user.getPlayList();

        // Then
        Assert.assertTrue(p.isEmpty());
    }

    @Test
    public void setPlaylistTest(){
        // Given
        Set<Playlist> expected=new HashSet<Playlist>();
        expected.add(new Playlist());

        // When
        user.setPlayList(expected);
        Set<Playlist> actual=user.getPlayList();

        // Then
        Assert.assertEquals(expected,actual);
    }


}
