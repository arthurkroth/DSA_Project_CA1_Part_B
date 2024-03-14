/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

/**
 *
 * @author arthurkroth
 */
public class Song {
    private String title;
    private String artist;
    private String genre;
    
    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
    
    
    public String getDetails() {
        return title + " by " + artist + " [" + genre + "]";
    }


    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }
}
