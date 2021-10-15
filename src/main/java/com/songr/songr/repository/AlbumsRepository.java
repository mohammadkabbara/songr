package com.songr.songr.repository;
import com.songr.songr.model.Albums;
import org.springframework.data.repository.CrudRepository;

public interface AlbumsRepository extends CrudRepository<Albums,Integer> {
}