/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package MusicManager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arthurkroth
 */
public class SongTest {

    private Song song;

    /**
     * Setup method to initialize common objects before each test.
     */
    @Before
    public void setUp() {
        // Initialize a Song instance for testing
        song = new Song("Yesterday", "The Beatles", "Pop");
    }

    /**
     * Tests if getTitle() returns the correct title.
     */
    @Test
    public void testGetTitle() {
        assertEquals("Checking title", "Yesterday", song.getTitle());
    }

    /**
     * Tests if getArtist() returns the correct artist name.
     */
    @Test
    public void testGetArtist() {
        assertEquals("Checking artist", "The Beatles", song.getArtist());
    }

    /**
     * Tests if getGenre() returns the correct genre.
     */
    @Test
    public void testGetGenre() {
        assertEquals("Checking genre", "Pop", song.getGenre());
    }

    /**
     * Tests if getDetails() returns the correct formatted detail string.
     */
    @Test
    public void testGetDetails() {
        String expectedDetails = "Yesterday by The Beatles [Pop]";
        assertEquals("Checking formatted details", expectedDetails, song.getDetails());
    }
    
    /**
     * Tests creating a Song with empty fields.
     */
    @Test
    public void testCreateSongWithEmptyDetails() {
        Song emptyDetailsSong = new Song("", "", "");
        assertEquals("Title should be empty", "", emptyDetailsSong.getTitle());
        assertEquals("Artist should be empty", "", emptyDetailsSong.getArtist());
        assertEquals("Genre should be empty", "", emptyDetailsSong.getGenre());
    }

    /**
     * Tests the detail formatting of a Song with empty fields.
     */
    @Test
    public void testSongDetailsFormattingWithEmptyDetails() {
        Song emptyDetailsSong = new Song("", "", "");
        assertEquals("Checking details formatting for empty song", " by  []", emptyDetailsSong.getDetails());
    }
}
