/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * The MusicManager class is responsible for managing all playlist interactions
 * within the music management system. It implements the PlaylistManager
 * interface, providing a concrete implementation for liking songs and moving
 * them between playlists.
 *
 * @author arthurkroth
 */
public class MusicManager implements PlaylistManager {

    private Playlist likedSongs; // A playlist for songs that have been liked
    private Playlist popPlaylist; // A playlist for songs that belong to the Pop genre
    private Playlist rockPlaylist; // A playlist for songs that belong to the Rock genre

    /**
     * Constructor for MusicManager. Initializes playlists for liked songs, pop
     * songs, and rock songs.
     */
    public MusicManager() {
        this.likedSongs = new Playlist("Liked Songs"); // Initialize the liked songs playlist
        this.popPlaylist = new Playlist("Pop"); // Initialize the pop genre playlist
        this.rockPlaylist = new Playlist("Rock"); // Initialize the rock genre playlist
    }

    /**
     * Marks a song as liked by adding it to the liked songs playlist.
     *
     * @param song The song to mark as liked.
     */
    @Override
    public void likeSong(Song song) {
        likedSongs.addSong(song); // Delegate to the liked songs playlist
    }

    /**
     * Moves the last song that was marked as liked to a genre-specific playlist
     * based on the provided genre. Only supports "pop" and "rock" genres.
     *
     * @param genre The genre to which the last liked song should be moved.
     * @return true if the song was successfully moved, false if there are no
     * liked songs or the genre is not recognized.
     */
    @Override
    public boolean moveLastLikedToGenre(String genre) {
        // Check if there are any liked songs to move
        if (likedSongs.getLikedSongStack().isEmpty()) {
            return false; // No songs to move
        }

        // Pop the last liked song from the stack
        Song lastLiked = likedSongs.getLikedSongStack().pop(); // Remove the last liked song

        // Determine the target playlist based on the genre of the lastLiked song
        if ("pop".equalsIgnoreCase(lastLiked.getGenre())) {
            popPlaylist.addSong(lastLiked); // Add to pop playlist
            return true;
        } else if ("rock".equalsIgnoreCase(lastLiked.getGenre())) {
            rockPlaylist.addSong(lastLiked); // Add to rock playlist
            return true;
        }

        // Push the song back onto the stack if the genre does not match
        likedSongs.getLikedSongStack().push(lastLiked);
        return false; // Genre did not match "pop" or "rock"
    }

    /**
     * Retrieves a list of all liked song details.
     *
     * @return A list of strings, each containing the details of a liked song.
     */
    public List<String> getAllLikedSongDetails() {
        return likedSongs.listAllSongs();
    }

    /**
     * Retrieves a list of all songs in the rock playlist.
     *
     * @return A list of strings, each string contains the details of a song in
     * the rock playlist.
     */
    public List<String> getAllRockSongDetails() {
        return rockPlaylist.listAllSongs();
    }

    /**
     * Retrieves a list of all songs in the pop playlist.
     *
     * @return A list of strings, each string contains the details of a song in
     * the pop playlist.
     */
    public List<String> getAllPopSongDetails() {
        return popPlaylist.listAllSongs();
    }

    /**
     * Searches for a song by title in all playlists.
     *
     * @param title The title of the song to search for.
     * @return A message indicating whether the song was found and in which
     * playlist(s).
     */
    public String searchSong(String title) {
        boolean foundInLiked = likedSongs.containsSong(title);
        boolean foundInPop = popPlaylist.containsSong(title);
        boolean foundInRock = rockPlaylist.containsSong(title);

        String message = "Song \"" + title + "\" was not found in any playlist.";

        if (foundInLiked || foundInPop || foundInRock) {
            message = "Song \"" + title + "\" was found in the following playlist(s): ";
            if (foundInLiked) {
                message += "\n- Liked Songs";
            }
            if (foundInPop) {
                message += "\n- Pop";
            }
            if (foundInRock) {
                message += "\n- Rock";
            }
        }

        return message;
    }

    /**
     * Searches for and proposes to delete a song by title from all playlists.
     *
     * @param title The title of the song to search and potentially delete.
     * @return A message indicating the outcome.
     */
    public String searchAndDeleteSong(String title) {
        String foundIn = "";
        if (likedSongs.containsSong(title)) {
            foundIn += "Liked Songs ";
        }
        if (popPlaylist.containsSong(title)) {
            foundIn += "Pop ";
        }
        if (rockPlaylist.containsSong(title)) {
            foundIn += "Rock ";
        }

        if (!foundIn.isEmpty()) {
            int confirmed = JOptionPane.showConfirmDialog(null,
                    "Song found in: " + foundIn.trim().replaceAll(" ", ", ")
                    + ".\nDo you want to delete it?",
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmed == JOptionPane.YES_OPTION) {
                boolean deleted = likedSongs.deleteSong(title) || popPlaylist.deleteSong(title) || rockPlaylist.deleteSong(title);
                if (deleted) {
                    return "Song deleted successfully.";
                }
            } else {
                return "Deletion cancelled.";
            }
        }
        return "Song not found in any playlist.";
    }

    public Playlist getLikedSongsPlaylist() {
        return likedSongs;
    }

    public Playlist getPopPlaylist() {
        return popPlaylist;
    }

    public Playlist getRockPlaylist() {
        return rockPlaylist;
    }
}
