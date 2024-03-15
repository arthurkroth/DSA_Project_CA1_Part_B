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

        btnAddLikedSong.setText("Add to Liked Songs");
        btnAddLikedSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLikedSongActionPerformed(evt);
            }
        });

        btnDeleteSong.setText("Delete Song");
        btnDeleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSongActionPerformed(evt);
            }
        });

        btnSearchSong.setText("Search Song Title");
        btnSearchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchSongActionPerformed(evt);
            }
        });

        btnDisplayLikedSongs.setText("List Liked Songs");
        btnDisplayLikedSongs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayLikedSongsActionPerformed(evt);
            }
        });

        btnMoveToGenre.setText("Move Last Liked to Genre Playlist");
        btnMoveToGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveToGenreActionPerformed(evt);
            }
        });

        lblRepeat.setText("Repeat Off");

        btnRockPlaylist.setText("List Rock Playlist");
        btnRockPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockPlaylistActionPerformed(evt);
            }
        });

        btnPopPlaylist.setText("List Pop Paylist");
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
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddLikedSong)
                    .addComponent(btnDeleteSong)
                    .addComponent(btnSearchSong)
                    .addComponent(btnDisplayLikedSongs)
                    .addComponent(btnMoveToGenre)
                    .addComponent(btnRockPlaylist)
                    .addComponent(btnPopPlaylist)
                    .addComponent(tglRepeat))
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
                            .addComponent(cmbGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMusicTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtArtistName, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(24, 24, 24)
                        .addComponent(lblRepeat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
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
                        .addContainerGap(71, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddLikedSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLikedSongActionPerformed
        // TODO add your handling code here:
        String songName = txtMusicTitle.getText();
        String artistName = txtArtistName.getText();
        String genre = cmbGenre.getSelectedItem().toString();
        
        //Creating a new song bject
        Song newSong = new Song(songName, artistName, genre);
        
        //Add to song to the playlist
        musicManager.likeSong(newSong);
        
        //wipping info from the text fields after adding song
        txtArtistName.setText("");
        txtMusicTitle.setText("");
    }//GEN-LAST:event_btnAddLikedSongActionPerformed

    private void tglRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglRepeatActionPerformed
        // TODO add your handling code here:
        JToggleButton tglButton = (JToggleButton) evt.getSource();
        if (tglButton.isSelected()) {
            Object[] options = {"Liked Songs", "Pop", "Rock"};
            String choice = (String) JOptionPane.showInputDialog(null, "Which playlist do you want to set to repeat?",
                    "Select Playlist", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice != null) {
                switch (choice) {
                    case "Liked Songs":
                        musicManager.getLikedSongsPlaylist().setRepeat(true);
                        break;
                    case "Pop":
                        musicManager.getPopPlaylist().setRepeat(true);
                        break;
                    case "Rock":
                        musicManager.getRockPlaylist().setRepeat(true);
                        break;
                }
                JOptionPane.showMessageDialog(null, choice + " playlist is now set to repeat.");
                lblRepeat.setText("Repeat ON");
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



//        if (tglRepeat.isSelected()) {
//            lblRepeat.setText("Repeat ON");
//        } else {
//            lblRepeat.setText("Repeat OFF");
//        }
    }//GEN-LAST:event_tglRepeatActionPerformed

    private void btnDisplayLikedSongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayLikedSongsActionPerformed
        // TODO add your handling code here:
        List<String> songDetails = musicManager.getAllLikedSongDetails();
        
        DefaultListModel<String> model = new DefaultListModel<>();
        lblPlaylist.setText("Liked Playlist:");
        
        songDetails.forEach(model::addElement);
        
        listPlaylist.setModel(model);
        
//        txtDisplayPlaylist.setText(musicManager.listAllLikedSongs());
    }//GEN-LAST:event_btnDisplayLikedSongsActionPerformed

    private void btnMoveToGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveToGenreActionPerformed
        // TODO add your handling code here:
        String selectedGenre = cmbGenre.getSelectedItem().toString();// obtain the genre from your UI component, e.g., dropdown or radio buttons.
        
        boolean success = musicManager.moveLastLikedToGenre(selectedGenre);
        
        if (success) {
            JOptionPane.showMessageDialog(null, "Song moved to " + selectedGenre + " playlist successfully!");
            // Optionally, update the UI to reflect the change.
        } else {
            JOptionPane.showMessageDialog(null, "Failed to move the song. Make sure there's a song to move and the genre is correct.");
        }
    }//GEN-LAST:event_btnMoveToGenreActionPerformed

    private void btnRockPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockPlaylistActionPerformed
        // TODO add your handling code here:
        List<String> rockSongs = musicManager.getAllRockSongDetails();
        
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String songDetail : rockSongs) {
            model.addElement(songDetail);
        }
        
        lblPlaylist.setText("Rock Playlist:");
        listPlaylist.setModel(model);        
    }//GEN-LAST:event_btnRockPlaylistActionPerformed

    private void btnPopPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopPlaylistActionPerformed
        // TODO add your handling code here:
        List<String> popSongs = musicManager.getAllPopSongDetails();
        
        DefaultListModel<String> model = new DefaultListModel<>();
        popSongs.forEach(model::addElement);
        
        lblPlaylist.setText("Pop Playlist:");
        listPlaylist.setModel(model);
    }//GEN-LAST:event_btnPopPlaylistActionPerformed

    private void btnSearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchSongActionPerformed
        // TODO add your handling code here:
        String title = txtMusicTitle.getText();// Get the song title from a text field or input dialog.
        String message = musicManager.searchSong(title);
        JOptionPane.showMessageDialog(null, message);        
    }//GEN-LAST:event_btnSearchSongActionPerformed

    private void btnDeleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSongActionPerformed
        // TODO add your handling code here:
        String title = txtMusicTitle.getText(); // Assuming txtMusicTitle is your JTextField for the song title.
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a song title.");
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
