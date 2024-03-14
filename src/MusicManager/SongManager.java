/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MusicManager;

/**
 * The SongManager interface defines the operations that can be performed on songs within the music management system.
 * Implementing this interface allows a class to manage song-related activities such as adding a song and retrieving song details.
 * @author arthurkroth
 */
public interface SongManager {
    /**
     * Adds a song to the manager's collection. The implementation should define the exact behaviour,
     * such as adding to a database, a playlist, or a set of songs in memory.
     *
     * @param song The song to be added.
     */
    void addSong(Song song);

    /**
     * Retrieves details about a specific song. The details could include the title, artist, and genre, 
     * or any other information that the implementation considers relevant.
     *
     * @param song The song for which details should be retrieved.
     * @return A string containing details about the song.
     */
    String getSongDetails(Song song);
}
