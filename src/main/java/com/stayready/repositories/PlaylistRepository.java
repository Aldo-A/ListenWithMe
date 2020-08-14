package com.stayready.repositories;

import com.stayready.domain.Playlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository extends CrudRepository<Playlist,Long> {
    @Query(value = "SELECT p.* " +
            "FROM User u, Playlist p " +
            "WHERE u.USER_ID = ?1 " +
            "AND p.PLAYLIST_ID = u.USER_ID", nativeQuery = true)
    public Iterable<Playlist> findPlaylistByUser(Long id);
}
