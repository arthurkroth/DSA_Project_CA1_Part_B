/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

import java.util.*;

/**
 * The MusicManager class is responsible for managing all playlist interactions 
 * within the music management system. It implements the PlaylistManager interface,
 * providing a concrete implementation for liking songs and moving them between playlists.
 * @author arthurkroth
 */
public class MusicManager implements PlaylistManager {
    private Playlist likedSongs; // A playlist for songs that have been liked
    private Playlist popPlaylist; // A playlist for songs that belong to the Pop genre
    private Playlist rockPlaylist; // A playlist for songs that belong to the Rock genre

    /**
     * Constructor for MusicManager. Initializes playlists for liked songs, pop songs, and rock songs.
     */
    public MusicManager() {
        this.likedSongs = new Playlist("Liked Songs"); // Initialize the liked songs playlist
        this.popPlaylist = new Playlist("Pop"); // Initialize the pop genre playlist
        this.rockPlaylist = new Playlist("Rock"); // Initialize the rock genre playlist
    }

    /**
     * Marks a song as liked by adding it to the liked songs playlist.
     * @param song The song to mark as liked.
     */
    @Override
    public void likeSong(Song song) {
        likedSongs.addSong(song); // Delegate to the liked songs playlist
    }

    /**
     * Moves the last song that was marked as liked to a genre-specific playlist based on the provided genre.
     * Only supports "pop" and "rock" genres.
     *
     * @param genre The genre to which the last liked song should be moved.
     * @return true if the song was successfully moved, false if there are no liked songs 
     *         or the genre is not recognized.
     */
    @Override
    public boolean moveLastLikedToGenre(String genre) {
        // Check if there are any liked songs to move
        if (likedSongs.getLikedSongStack().isEmpty()) {
            return false; // No songs to move
        }

        // Pop the last liked song from the stack
        Song lastLiked = likedSongs.getLikedSongStack().pop(); // Remove the last liked song

        // Determine the target playlist based on the genre parameter
        if ("pop".equalsIgnoreCase(genre)) {
            popPlaylist.addSong(lastLiked); // Add to pop playlist
            return true;
        } else if ("rock".equalsIgnoreCase(genre)) {
            rockPlaylist.addSong(lastLiked); // Add to rock playlist
            return true;
        }

        // If the genre does not match "pop" or "rock", return false
        return false;
    }

     /**
     * Retrieves a list of all liked song details.
     * @return A list of strings, each containing the details of a liked song.
     */
    public List<String> getAllLikedSongDetails() {
        return likedSongs.listAllSongs();
    }
}
