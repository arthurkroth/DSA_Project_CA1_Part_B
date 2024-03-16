/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 * The Playlist class represents a collection of songs, which can be managed via
 * a stack data structure. It implements the SongManager interface to handle the
 * addition and retrieval of song details.
 *
 * @author arthurkroth
 */
public class Playlist implements SongManager {

    private Stack<Song> likedSongStack; // Stack to hold the liked songs
    private String name; // Name of the playlist, useful for identifying it.
    private boolean repeat = false; // Field to indicate repeat state
    private boolean isRepeatEnabled = false; // Initially, repeat is off

    /**
     * Constructs a new Playlist with a specified name.
     *
     * @param name The name of the playlist, which could represent its genre or
     * another characteristic.
     */
    public Playlist(String name) {
        this.likedSongStack = new Stack<>(); // Initialize the stack
        this.name = name; // Set the name of the playlist
    }

    // This method returns a List<Song> containing all songs in the playlist
    public List<Song> getSongs() {
        return likedSongStack.stream().collect(Collectors.toList());
    }

    /**
     * Adds a song to the playlist by pushing it onto the stack. This method
     * overrides the addSong method from the SongManager interface.
     *
     * @param song The song to be added to the playlist.
     */
    @Override
    public void addSong(Song song) {
        likedSongStack.push(song); // Push the song onto the stack
        JOptionPane.showMessageDialog(null, "Song added: " + song.getDetails()); // Console output for user feedback
    }

    /**
     * Retrieves the details of a given song. This method overrides the
     * getSongDetails method from the SongManager interface.
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
     * Generates a list of song details from the stack in the order they were
     * added.
     *
     * @return A list of strings where each string contains details of a song.
     */
    public List<String> listAllSongs() {
        Stack<Song> tempStack = new Stack<>();
        tempStack.addAll(likedSongStack);

        // Since Stacks use LIFO, reverse it to display songs in the order they were added
        Collections.reverse(tempStack);

        // Convert each Song to its string representation and collect into a list
        return tempStack.stream()
                .map(Song::getDetails)
                .collect(Collectors.toList());
    }

    /**
     * Checks if a song with the given title exists in the playlist.
     *
     * @param title The title of the song to search for.
     * @return true if the song is found, false otherwise.
     */
    public boolean containsSong(String title) {
        return likedSongStack.stream().anyMatch(song -> song.getTitle().equalsIgnoreCase(title));
    }

    /**
     * Tries to delete a song by its title from this playlist.
     *
     * @param title The title of the song to be deleted.
     * @return true if the song was found and deleted, false otherwise.
     */
    public boolean deleteSong(String title) {
        for (Iterator<Song> iterator = likedSongStack.iterator(); iterator.hasNext();) {
            Song song = iterator.next();
            if (song.getTitle().equalsIgnoreCase(title)) {
                iterator.remove(); // Remove the song from the stack
                return true; // Indicate success
            }
        }
        return false; // Song not found
    }

    /**
     * Toggles the repeat state of this playlist.
     *
     * @param repeat The new repeat state.
     * @return true if the repeat state was successfully changed, false
     * otherwise.
     */
    public boolean setRepeat(boolean repeat) {
        // Perform necessary checks or state changes
        this.isRepeatEnabled = repeat;
        return true; // Return true indicating success
    }

    public boolean isRepeat() {
        return repeat;
    }
    

    // Method to toggle repeat functionality
    public void toggleRepeat() {
        isRepeatEnabled = !isRepeatEnabled;
    }

    // Method to get songs in a circular (repeating) fashion
    public List<Song> getCircularSongs() {
        LinkedList<Song> circularList = new LinkedList<>();
        if (!likedSongStack.isEmpty()) {
            // Transfer elements from Stack to LinkedList to maintain order
            likedSongStack.forEach(circularList::addLast);
        }
        return circularList; // This list can be iterated in a circular manner for repeat functionality
    }

    public boolean isRepeatEnabled() {
        return isRepeatEnabled;
    }

    public void playSongs(Playlist playlist) {
        List<Song> songs = playlist.isRepeatEnabled() ? playlist.getCircularSongs() : new ArrayList<>(playlist.likedSongStack);

        // Example of playing songs in a repeating manner
        // Assuming each playlist has a finite number of songs to be played in a session
        int playCount = 0;
        while (playCount < songs.size() || playlist.isRepeatEnabled()) {
            for (Song song : songs) {
                // Play the song
                System.out.println("Playing: " + song.getDetails());
                if (!playlist.isRepeatEnabled()) {
                    playCount++;
                    if (playCount >= songs.size()) {
                        break; // Break out of the loop if not repeating
                    }
                }
            }
            if (!playlist.isRepeatEnabled()) {
                break; // Break out of the outer loop if not repeating
            }
        }
    }

}
