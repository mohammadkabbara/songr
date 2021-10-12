package com.songr.songr.model;

import javax.persistence.*;

@Entity
public class Song  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String title ;
    private int length ;
    private int trackNumber ;

    public Album getAlbums() {
        return albums;
    }

    public void setAlbums(Album albums) {
        this.albums = albums;
    }

    @ManyToOne
    private Album albums;

    public Song(){
    }

    public Song(String title , int length ,int trackNumber) {
        this.title =title ;
        this.length =length ;
        this.trackNumber=trackNumber;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getTrackNumber() {
        return trackNumber;
    }
    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

}