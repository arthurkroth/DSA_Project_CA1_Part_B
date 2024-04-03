package MusicManager;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author arthurkroth
 */
public class MusicManagerTest {

    private MusicManager musicManager;
    private Song popSong;
    private Song rockSong;

    /**
     * Initializes resources before each test.
     */
    @Before
    public void setUp() {
        musicManager = new MusicManager();
        popSong = new Song("Shake It Off", "Taylor Swift", "Pop");
        rockSong = new Song("Enter Sandman", "Metallica", "Rock");
    }

    /**
     * Verifies liking a song adds it to the liked songs playlist.
     */
    @Test
    public void testLikeSong() {
        musicManager.likeSong(popSong);
        assertTrue(musicManager.getLikedSongsPlaylist().containsSong(popSong.getTitle()));
    }

    /**
     * Tests moving the last liked song to its genre-specific playlist.
     */
    @Test
    public void testMoveLastLikedToGenre() {
        musicManager.likeSong(popSong);
        musicManager.likeSong(rockSong);
        assertTrue(musicManager.moveLastLikedToGenre("Rock"));
        assertFalse(musicManager.getPopPlaylist().containsSong(rockSong.getTitle()));
        assertTrue(musicManager.getRockPlaylist().containsSong(rockSong.getTitle()));
    }

    /**
     * Checks if all liked song details are correctly retrieved.
     */
    @Test
    public void testGetAllLikedSongDetails() {
        musicManager.likeSong(popSong);
        assertEquals(1, musicManager.getAllLikedSongDetails().size());
    }

    /**
     * Ensures all rock song details are properly listed.
     */
    @Test
    public void testGetAllRockSongDetails() {
        musicManager.likeSong(rockSong);
        musicManager.moveLastLikedToGenre("Rock");
        assertEquals(1, musicManager.getAllRockSongDetails().size());
    }

    /**
     * Confirms all pop song details are accurately collected.
     */
    @Test
    public void testGetAllPopSongDetails() {
        musicManager.likeSong(popSong);
        musicManager.moveLastLikedToGenre("Pop");
        assertEquals(1, musicManager.getAllPopSongDetails().size());
    }

    /**
     * Verifies searching for a song returns correct playlist information.
     */
    @Test
    public void testSearchSong() {
        musicManager.likeSong(popSong);
        musicManager.moveLastLikedToGenre("Pop");
        String searchResult = musicManager.searchSong("Shake It Off");
        assertTrue("Search result should confirm song is in Pop playlist", 
                   searchResult.contains("Pop"));
    }

    /**
     * Tests the deletion of a song and its confirmation message.
     */
    @Test
    public void testSearchAndDeleteSong() {
        musicManager.likeSong(rockSong);
        String deletionResult = musicManager.searchAndDeleteSong("Enter Sandman");
        assertTrue(deletionResult.contains("deleted successfully"));
        assertFalse(musicManager.getRockPlaylist().containsSong("Enter Sandman"));
    }

    /**
     * Checks behavior when trying to move a song from an empty liked playlist.
     */
    @Test
    public void testMoveLastLikedToGenreWithEmptyLikedPlaylist() {
        assertFalse(musicManager.moveLastLikedToGenre("Pop"));
    }

    /**
     * Validates the search functionality for a non-existent song.
     */
    @Test
    public void testSearchForNonExistentSong() {
        String searchResult = musicManager.searchSong("Non Existent Song");
        assertFalse(searchResult.contains("found in the following playlist(s)"));
    }

    /**
     * Confirms that trying to delete a non-existent song produces the expected message.
     */
    @Test
    public void testDeleteNonExistentSong() {
        String deletionResult = musicManager.searchAndDeleteSong("Non Existent Song");
        assertTrue(deletionResult.contains("Song not found in any playlist."));
    }

    /**
     * Ensures that the liked songs detail list is empty when no songs are liked.
     */
    @Test
    public void testGetAllLikedSongDetailsWhenEmpty() {
        assertTrue(musicManager.getAllLikedSongDetails().isEmpty());
    }

    /**
     * Verifies that the rock song detail list is empty when no rock songs are added.
     */
    @Test
    public void testGetAllRockSongDetailsWhenEmpty() {
        assertTrue(musicManager.getAllRockSongDetails().isEmpty());
    }

    /**
     * Confirms that the pop song detail list is empty when no pop songs are added.
     */
    @Test
    public void testGetAllPopSongDetailsWhenEmpty() {
        assertTrue(musicManager.getAllPopSongDetails().isEmpty());
    }
}