package com.stayready.repositories;

import com.stayready.domain.Playlist;
import org.springframework.data.repository.CrudRepository;

public interface PlaylistRepository extends CrudRepository<Playlist,Long> {
}
