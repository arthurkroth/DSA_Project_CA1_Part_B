/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MusicManager;

/**
 * Entry point class for the music management application. It initializes the
 * user interface.
 *
 * @author arthurkroth
 */
public class MusicManagerApp {

    /**
     * The main method starts the application by setting up the main GUI window.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize the main GUI window
        MusicManagerGUI musicManager = new MusicManagerGUI();
        // Display the GUI window to the user
        musicManager.setVisible(true);
        // Position the window in the center of the screen
        musicManager.setLocationRelativeTo(null);
    }
}
