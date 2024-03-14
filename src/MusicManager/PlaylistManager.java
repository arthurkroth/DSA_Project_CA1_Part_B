/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MusicManager;


/**
 * The PlaylistManager interface defines the operations for managing playlists within the music management system.
 * Implementing this interface allows a class to handle the functionalities related to playlists such as liking a song
 * or moving a song to a specific genre-based playlist.
 * @author arthurkroth
 */
public interface PlaylistManager {
    /**
     * Marks a song as liked, which typically involves adding the song to a playlist of liked songs.
     * The specifics of how and where the song is added is determined by the implementing class.
     *
     * @param song The song to be marked as liked.
     */
    void likeSong(Song song);

    /**
     * Moves the last song that was marked as liked to a playlist corresponding to its genre. The genre-specific
     * playlist is determined based on the provided genre parameter.
     *
     * @param genre The genre of the playlist to which the last liked song should be moved.
     * @return true if the song was successfully moved, false otherwise.
     */
    boolean moveLastLikedToGenre(String genre);
}
