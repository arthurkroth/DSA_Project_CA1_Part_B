/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MusicManager;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author arthurkroth
 */
public class MusicManagerGUI extends javax.swing.JFrame {

    private MusicManager musicManager;

    /**
     * Creates new form MusicManager
     */
    public MusicManagerGUI() {
        initComponents();
        musicManager = new MusicManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMusicTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtArtistName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPlaylist = new javax.swing.JLabel();
        btnAddLikedSong = new javax.swing.JButton();
        btnDeleteSong = new javax.swing.JButton();
        btnSearchSong = new javax.swing.JButton();
        btnDisplayLikedSongs = new javax.swing.JButton();
        btnMoveToGenre = new javax.swing.JButton();
        lblRepeat = new javax.swing.JLabel();
        btnRockPlaylist = new javax.swing.JButton();
        btnPopPlaylist = new javax.swing.JButton();
        tglRepeat = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPlaylist = new javax.swing.JList<>();
        cmbGenre = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Music Manager");

        jLabel2.setText("Music Title");

        jLabel3.setText("Artist Name");

        jLabel4.setText("Genre");

        lblPlaylist.setText("Playlist:");

        btnAddLikedSong.setText("Add to Liked Playlist");
        btnAddLikedSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLikedSongActionPerformed(evt);
            }
        });

        btnDeleteSong.setText("Delete by Title");
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        btnSearchSong.setText("Search by Title");
        btnSearchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSongActionPerformed(evt);
            }
        });

        btnDisplayLikedSongs.setText("Show Liked Playlist");
        btnDisplayLikedSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayLikedSongsActionPerformed(evt);
            }
        });

        btnMoveToGenre.setText("Move last liked to Genre Playlist");
        btnMoveToGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveToGenreActionPerformed(evt);
            }
        });

        lblRepeat.setText("Repeat Off");

        btnRockPlaylist.setText("Show Rock Playlist");
        btnRockPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockPlaylistActionPerformed(evt);
            }
        });

        btnPopPlaylist.setText("Show Pop Playlist");
        btnPopPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopPlaylistActionPerformed(evt);
            }
        });

        tglRepeat.setText("Repeat Playlist");
        tglRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglRepeatActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listPlaylist);

        cmbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rock", "Pop" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMoveToGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddLikedSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tglRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDisplayLikedSongs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRockPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPopPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblPlaylist))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtMusicTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtArtistName, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMusicTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArtistName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblPlaylist)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAddLikedSong)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteSong)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchSong)
                        .addGap(18, 18, 18)
                        .addComponent(btnMoveToGenre)
                        .addGap(18, 18, 18)
                        .addComponent(tglRepeat)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplayLikedSongs)
                        .addGap(18, 18, 18)
                        .addComponent(btnRockPlaylist)
                        .addGap(18, 18, 18)
                        .addComponent(btnPopPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblRepeat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddLikedSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLikedSongActionPerformed
        // TODO add your handling code here:
        String songName = txtMusicTitle.getText().trim();
        String artistName = txtArtistName.getText().trim();
        String genre = cmbGenre.getSelectedItem().toString();

        // Check if the song name or artist name fields are empty
        if (songName.isEmpty() || artistName.isEmpty()) {
            // Display an error message dialog to the user
            JOptionPane.showMessageDialog(this, "Music Title and Artist Name must not be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Create a new Song object
            Song newSong = new Song(songName, artistName, genre);

            // Add the song to the liked songs playlist
            musicManager.likeSong(newSong);

            // Clear the text fields after adding the song
            txtArtistName.setText("");
            txtMusicTitle.setText("");
        }
    }//GEN-LAST:event_btnAddLikedSongActionPerformed

    private void tglRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglRepeatActionPerformed
        // TODO add your handling code here:
        JToggleButton tglButton = (JToggleButton) evt.getSource();
        if (tglButton.isSelected()) {
            Object[] options = {"Liked Songs", "Pop", "Rock"};
            String choice = (String) JOptionPane.showInputDialog(null, "Which playlist do you want to set to repeat?",
                    "Select Playlist", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice != null) {
                Playlist selectedPlaylist;
                switch (choice) {
                    case "Liked Songs":
                        selectedPlaylist = musicManager.getLikedSongsPlaylist();
                        break;
                    case "Pop":
                        selectedPlaylist = musicManager.getPopPlaylist();
                        break;
                    case "Rock":
                        selectedPlaylist = musicManager.getRockPlaylist();
                        break;
                    default:
                        selectedPlaylist = null; 
                }

                if (selectedPlaylist != null && !selectedPlaylist.getSongs().isEmpty()) {
                    selectedPlaylist.setRepeat(true);
                    JOptionPane.showMessageDialog(null, choice + " playlist is now set to repeat.");
                    lblRepeat.setText("Repeat ON");
                } else {
                    JOptionPane.showMessageDialog(null, "The " + choice + " playlist is empty and cannot be set to repeat.");
                    tglButton.setSelected(false); // Revert toggle button state
                }
            } else {
                // User cancelled or closed the dialog; revert toggle button state
                tglButton.setSelected(false);
            }
        } else {
            // Disable repeat for all playlists
            musicManager.getLikedSongsPlaylist().setRepeat(false);
            musicManager.getPopPlaylist().setRepeat(false);
            musicManager.getRockPlaylist().setRepeat(false);
            JOptionPane.showMessageDialog(null, "Repeat is turned off for all playlists.");
            lblRepeat.setText("Repeat OFF");
        }
    }//GEN-LAST:event_tglRepeatActionPerformed

    private void btnDisplayLikedSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayLikedSongsActionPerformed
        // TODO add your handling code here:
        List<String> songDetails = musicManager.getAllLikedSongDetails();

        if (songDetails.isEmpty()) {
            // Notify user that the Liked Playlist is empty
            JOptionPane.showMessageDialog(this, "The Liked Playlist is empty.", "Playlist Empty", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Populate the list if there are songs to display
            DefaultListModel<String> model = new DefaultListModel<>();
            lblPlaylist.setText("Liked Playlist:");

            songDetails.forEach(model::addElement);
            listPlaylist.setModel(model);
        }
    }//GEN-LAST:event_btnDisplayLikedSongsActionPerformed

    private void btnMoveToGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveToGenreActionPerformed
        // TODO add your handling code here:
        String selectedGenre = cmbGenre.getSelectedItem().toString();// obtain the genre from the dropdown menu.

        boolean success = musicManager.moveLastLikedToGenre(selectedGenre);

        if (success) {
            JOptionPane.showMessageDialog(null, "Song moved to genre playlist successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to move the song. Make sure there's a song to move and the genre is correct.");
        }
    }//GEN-LAST:event_btnMoveToGenreActionPerformed

    private void btnRockPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockPlaylistActionPerformed
        // TODO add your handling code here:
        List<String> songDetails = musicManager.getAllRockSongDetails();

        if (songDetails.isEmpty()) {
            // Notify the user that the Rock Playlist is empty
            JOptionPane.showMessageDialog(this, "The Rock Playlist is empty.", "Playlist Empty", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Populate the list if there are songs to display
            DefaultListModel<String> model = new DefaultListModel<>();
            lblPlaylist.setText("Rock Playlist:");

            songDetails.forEach(model::addElement);
            listPlaylist.setModel(model);
        }
    }//GEN-LAST:event_btnRockPlaylistActionPerformed

    private void btnPopPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopPlaylistActionPerformed
        // TODO add your handling code here:
        List<String> songDetails = musicManager.getAllPopSongDetails();

        if (songDetails.isEmpty()) {
            // Notify the user that the Pop Playlist is empty
            JOptionPane.showMessageDialog(this, "The Pop Playlist is empty.", "Playlist Empty", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Populate the list if there are songs to display
            DefaultListModel<String> model = new DefaultListModel<>();
            lblPlaylist.setText("Pop Playlist:");

            songDetails.forEach(model::addElement);
            listPlaylist.setModel(model);
        }
    }//GEN-LAST:event_btnPopPlaylistActionPerformed

    private void btnSearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSongActionPerformed
        // TODO add your handling code here:
        String title = txtMusicTitle.getText();// Get the song title from a text field.
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Music Title.");
            return;
        }
        String message = musicManager.searchSong(title);
        JOptionPane.showMessageDialog(null, message);
    }//GEN-LAST:event_btnSearchSongActionPerformed

    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
        // TODO add your handling code here:
        String title = txtMusicTitle.getText(); // Get the song title from a text field.
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a Music Title.");
            return;
        }

        String message = musicManager.searchAndDeleteSong(title);
        JOptionPane.showMessageDialog(null, message);

        listPlaylist.setModel(new DefaultListModel<>());
    }//GEN-LAST:event_btnDeleteSongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLikedSong;
    private javax.swing.JButton btnDeleteSong;
    private javax.swing.JButton btnDisplayLikedSongs;
    private javax.swing.JButton btnMoveToGenre;
    private javax.swing.JButton btnPopPlaylist;
    private javax.swing.JButton btnRockPlaylist;
    private javax.swing.JButton btnSearchSong;
    private javax.swing.JComboBox<String> cmbGenre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblPlaylist;
    private javax.swing.JLabel lblRepeat;
    private javax.swing.JList<String> listPlaylist;
    private javax.swing.JToggleButton tglRepeat;
    private javax.swing.JTextField txtArtistName;
    private javax.swing.JTextField txtMusicTitle;
    // End of variables declaration//GEN-END:variables
}
