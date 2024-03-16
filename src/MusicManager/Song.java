/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

/**
 * The Song class represents a music track with a title, artist, and genre. It
 * provides methods to retrieve detailed information about the song. This class
 * is a fundamental part of the MusicManager package, serving as the data model.
 *
 * @author arthurkroth
 */
public class Song {

    // Attributes to hold the details of a song
    private String title;  // Title of the song
    private String artist; // Artist who performs the song
    private String genre;  // Genre of the song

    /**
     * Constructor for creating a new Song object with specified details.
     *
     * @param title The title of the song.
     * @param artist The artist of the song.
     * @param genre The genre of the song.
     */
    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    /**
     * Retrieves a string with detailed information about the song, formatted
     * with the title, artist, and genre.
     *
     * @return A formatted string with song details.
     */
    public String getDetails() {
        return title + " by " + artist + " [" + genre + "]";
    }

    // Getters for the Song's properties
    /**
     * Gets the title of the song.
     *
     * @return The title of the song.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the artist of the song.
     *
     * @return The artist of the song.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the genre of the song.
     *
     * @return The genre of the song.
     */
    public String getGenre() {
        return genre;
    }
}
