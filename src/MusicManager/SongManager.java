/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MusicManager;

/**
 * The SongManager interface defines the operations that can be performed on
 * songs within the music management system. Implementing this interface allows
 * a class to manage song-related activities such as adding a song and
 * retrieving song details.
 *
 * @author arthurkroth
 */
public interface SongManager {

    /**
     * Adds a song to the manager's collection.
     *
     * @param song The song to be added.
     */
    void addSong(Song song);

    /**
     * Retrieves details about a specific song. The details include the
     * title, artist, and genre
     *
     * @param song The song for which details should be retrieved.
     * @return A string containing details about the song.
     */
    String getSongDetails(Song song);
}
