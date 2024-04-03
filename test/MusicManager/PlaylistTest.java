/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MusicManager;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author arthurkroth
 */
public class PlaylistTest {
    
    private Playlist playlist;
    private Song song;

    /**
     * Sets up a new playlist and adds a test song before each test case.
     */
    @Before
    public void setUp() {
        playlist = new Playlist("My Playlist");
        song = new Song("Imagine", "John Lennon", "Rock");
        playlist.addSong(song); // Add a song for testing
    }

    /**
     * Tests if getSongs() correctly retrieves a list of songs from the playlist.
     */
    @Test
    public void testGetSongs() {
        assertFalse("The playlist should contain songs", playlist.getSongs().isEmpty());
    }

    /**
     * Tests if addSong() correctly adds a new song to the playlist.
     */
    @Test
    public void testAddSong() {
        Song newSong = new Song("Let It Be", "The Beatles", "Rock");
        playlist.addSong(newSong);
        assertTrue("Playlist should contain the song 'Let It Be'", playlist.containsSong("Let It Be"));
    }
    
    /**
     * Tests if getDetails() correctly formats the song's details.
     */
    @Test
    public void testGetSongDetails() {
        assertEquals("Imagine by John Lennon [Rock]", song.getDetails());
    }

    /**
     * Tests if the liked song stack is not empty after adding songs.
     */    
    @Test
    public void testGetLikedSongStack() {
        assertFalse("Liked song stack should not be empty after adding a song", playlist.getLikedSongStack().isEmpty());
    }
    
    /**
     * Tests if listAllSongs() correctly lists all songs in the playlist.
     */
    @Test
    public void testListAllSongs() {
        playlist.addSong(new Song("Yesterday", "The Beatles", "Pop"));
        List<String> allSongs = playlist.listAllSongs();
        assertNotNull("The list of all songs should not be null", allSongs);
        assertTrue("The list of all songs should contain 'Imagine'", allSongs.contains(song.getDetails()));
    }
    
    /**
     * Tests if containsSong() accurately identifies existing songs.
     */
    @Test
    public void testContainsSong() {
        assertTrue("Playlist should contain the song", playlist.containsSong("Imagine"));
    }
    
    /**
     * Tests if deleteSong() successfully removes a song from the playlist.
     */
    @Test
    public void testDeleteSong() {
        assertTrue("Song should be deleted", playlist.deleteSong("Imagine"));
        assertFalse("Playlist should not contain the song after deletion", playlist.containsSong("Imagine"));
    }
    
    /**
     * Tests if setRepeat() correctly enables the repeat functionality.
     */
    @Test
    public void testSetRepeat() {
        playlist.setRepeat(true);
        assertTrue("Repeat should be enabled", playlist.isRepeatEnabled());
    }
    
    /**
     * Tests the behavior of toggleRepeat() in enabling and disabling repeat functionality.
     */
    @Test
    public void testToggleRepeat() {
        playlist.toggleRepeat();
        assertTrue("Repeat should be enabled after toggle", playlist.isRepeatEnabled());
        playlist.toggleRepeat();
        assertFalse("Repeat should be disabled after second toggle", playlist.isRepeatEnabled());
    }
    
    /**
     * Tests if getCircularSongs() correctly returns a list for repeating songs.
     */
    @Test
    public void testGetCircularSongs() {
        playlist.setRepeat(true);
        List<Song> circularSongs = playlist.getCircularSongs();
        assertFalse("Circular songs list should not be empty", circularSongs.isEmpty());
        assertEquals("Circular songs list should include 'Imagine'", song, circularSongs.get(0));
    }
    
    /**
     * Tests if isRepeatEnabled() correctly reports the repeat status.
     */
    @Test
    public void testIsRepeatEnabled() {
        assertFalse("Initially, repeat should not be enabled", playlist.isRepeatEnabled());
    }
    
    /**
     * Tests adding a null song to the playlist.
     */    
    @Test
    public void testAddNullSong() {
        try {
            playlist.addSong(null);
            fail("Adding a null song should throw an exception");
        } catch (NullPointerException e) {
            
        }
    }
    
    /**
     * Tests the containsSong method with a null title.
     */
    @Test
    public void testContainsSongWithNullTitle() {
        boolean result = playlist.containsSong(null);
        assertFalse("containsSong should return false for null title", result);
    }
    
    /**
     * Tests deleting a song that does not exist in the playlist.
     */
    @Test
    public void testDeleteNonExistentSong() {
        boolean result = playlist.deleteSong("Non Existent Song");
        assertFalse("deleteSong should return false for a non-existent song", result);
    }
    
    /**
     * Tests listing all songs when the playlist is empty.
     */
    @Test
    public void testListAllSongsWhenEmpty() {
        playlist.clear();
        assertTrue("listAllSongs should return an empty list when the playlist is empty", playlist.listAllSongs().isEmpty());
    }
    
    /**
     * Tests setting repeat mode on an empty playlist.
     */
    @Test
    public void testSetRepeatWhenEmpty() {
        playlist.clear();
        assertTrue("setRepeat should still work even if the playlist is empty", playlist.setRepeat(true));
    }
    
    /**
     * Tests getting circular songs from an empty playlist.
     */
    @Test
    public void testGetCircularSongsWhenEmpty() {
        playlist.clear();
        List<Song> circularSongs = playlist.getCircularSongs();
        assertTrue("getCircularSongs should return an empty list when the playlist is empty", circularSongs.isEmpty());
    }
}