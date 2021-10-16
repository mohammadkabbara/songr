package com.songr.songr;

//import com.songr.songr.model.Album;
import com.songr.songr.model.Albums;
import com.songr.songr.model.Song;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {
Albums testAlbum;
	@Test
	public void constructorAlbum(){


		Albums testAlbum = new Albums("I am lost " , "unknown",10,2500,"https://blog.ambient-mixer.com/wp-content/uploads/2016/07/Expand-Your-Music-Library-With-Unknown-Music.jpg");
		assertTrue(true);


		testAlbum.setTitle("bra bra");
		assertEquals("bra bra" , testAlbum.getTitle());


		testAlbum.setArtist("mohammad");
		assertEquals("mohammad" , testAlbum.getArtist());


		testAlbum.setSongCount(15);
		assertEquals(15, testAlbum.getSongCount());



		testAlbum.setLength(10000);
		assertEquals(10000, testAlbum.getLength());

//		testAlbum.setImageUrl("unknown");
//		assertEquals("unknown", testAlbum.getImageUrl());
	}

	@Test public void songConstructor(){

		Song testSong = new Song("bra bra" ,  200 , 1 ,testAlbum );

		/* Test Constructor */
		assertTrue(testSong instanceof Song);


		testSong.setTitle("newSong");
		assertEquals("newSong", testSong.getTitle());

		testSong.setLength(150);
		assertEquals( 150 , testSong.getLength());


		testSong.setTrackNumber(2);
		assertEquals(2, testSong.getTrackNumber());

	}

}
