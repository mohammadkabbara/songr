package com.songr.songr.repository;

import com.songr.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public interface AlbumsRepository extends CrudRepository<Album, Integer> {

}