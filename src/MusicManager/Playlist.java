/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

import java.util.*;

/**
 *
 * @author arthurkroth
 */
public class Playlist {
    private Stack<Song> likedSongStack;
    
    
    public Playlist(){
        likedSongStack = new Stack<>();
    }
    
    
    //Like a song
    public void likeSong(Song song){
        likedSongStack.push(song);
        System.out.println("Liked song: " + song.getDetails());
    }
    
    public Stack<Song> getLikedSongStack(){
        return likedSongStack;
    }
}
