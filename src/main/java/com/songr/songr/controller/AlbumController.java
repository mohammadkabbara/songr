package com.songr.songr.controller;

import com.songr.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
private int length;
private String imageUrl;
@GetMapping("/album")
public String getAlbum(Model model){
    Album album1 = new Album("Sahran","Amr Diab",12,2900,"https://i1.sndcdn.com/artworks-LZartXtIp9YJgxfm-bwIdOg-t500x500.jpg");
    Album album2 = new Album("Maolod sant 80","Hamza Namira",12,2700,"http://www.arabsong2.com/wp-content/uploads/2019/05/1558405962.jpg");
    Album album3 = new Album("Kol Yom Mn Da","Mohammad humaki",10,2500,"http://arabsong.net/images/albums/Kol%20Youm%20Men%20Dah.jpg");
    List<Album> albums=new ArrayList<>();
    albums.add(album1);
    albums.add(album2);
    albums.add(album3);
    model.addAttribute("Albums" , albums);
    return "albums.html";
}

}
