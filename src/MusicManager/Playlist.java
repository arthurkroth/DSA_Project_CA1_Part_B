/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 * The Playlist class represents a collection of songs, which can be managed via a stack data structure.
 * It implements the SongManager interface to handle the addition and retrieval of song details.
 * @author arthurkroth
 */
    public class Playlist implements SongManager {
        private Stack<Song> likedSongStack; // Stack to hold the liked songs
        private String name; // Name of the playlist, useful for identifying it (e.g., "Liked Songs", "Pop", "Rock")

    /**
     * Constructs a new Playlist with a specified name.
     * 
     * @param name The name of the playlist, which could represent its genre or another characteristic.
     */
    public Playlist(String name) {
        this.likedSongStack = new Stack<>(); // Initialize the stack
        this.name = name; // Set the name of the playlist
    }

    /**
     * Adds a song to the playlist by pushing it onto the stack.
     * This method overrides the addSong method from the SongManager interface.
     *
     * @param song The song to be added to the playlist.
     */
    @Override
    public void addSong(Song song) {
        likedSongStack.push(song); // Push the song onto the stack
        JOptionPane.showMessageDialog(null, "Song added: " + song.getDetails()); // Console output for user feedback
    }

    /**
     * Retrieves the details of a given song.
     * This method overrides the getSongDetails method from the SongManager interface.
     *
     * @param song The song whose details are to be retrieved.
     * @return A string containing the details of the song.
     */
    @Override
    public String getSongDetails(Song song) {
        return song.getDetails(); // Utilize the Song's getDetails method
    }

    /**
     * Provides access to the stack of liked songs.
     * 
     * @return The stack of liked songs in this playlist.
     */
    public Stack<Song> getLikedSongStack() {
        return likedSongStack; // Return the stack
    }
    
    /**
     * Generates a list of song details from the stack in the order they were added.
     * @return A list of strings where each string contains details of a song.
     */
    public List<String> listAllSongs() {
        Stack<Song> tempStack = new Stack<>();
        tempStack.addAll(likedSongStack);
        
        // Since Stacks use LIFO, we need to reverse it to display songs in the order they were added
        Collections.reverse(tempStack);

        // Convert each Song to its string representation and collect into a list
        return tempStack.stream()
                        .map(Song::getDetails)
                        .collect(Collectors.toList());
    }
    
}
