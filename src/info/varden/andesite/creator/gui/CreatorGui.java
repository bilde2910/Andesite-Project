/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.varden.andesite.creator.gui;

import info.varden.andesite.core.AndesiteProject;
import info.varden.andesite.helper.ThreadAccessibleObjectStorage;
import info.varden.andesite.io.AndesiteIO;
import info.varden.andesite.io.SaveState;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Marius
 */
public class CreatorGui extends javax.swing.JFrame {
    
    private AndesiteProject project = null;
    private final ThreadAccessibleObjectStorage<SaveState> isSaved = new ThreadAccessibleObjectStorage<SaveState>(SaveState.SAVED);
    private String subtitle = "";
    private File saveFile = null;
    private boolean exitAfterSave = false;

    /**
     * Creates new form CreatorGui
     */
    public CreatorGui() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Andesite Mod Creator");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSplitPane1.setDividerLocation(200);
        jSplitPane1.setOneTouchExpandable(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setRootVisible(false);
        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/new.png"))); // NOI18N
        jMenuItem1.setText("New project...");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/open.png"))); // NOI18N
        jMenuItem2.setText("Open project...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/save.png"))); // NOI18N
        jMenuItem3.setText("Save project");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/saveas.png"))); // NOI18N
        jMenuItem4.setText("Save project as...");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator1);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/pack.png"))); // NOI18N
        jMenuItem6.setText("Pack mod...");
        jMenuItem6.setEnabled(false);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu2.setText("Project");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/properties.png"))); // NOI18N
        jMenuItem7.setText("Project properties...");
        jMenuItem7.setEnabled(false);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/screenshot.png"))); // NOI18N
        jMenuItem8.setText("Screenshots...");
        jMenuItem8.setEnabled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Security");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/key.png"))); // NOI18N
        jMenuItem9.setText("Manage keypairs...");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/help.png"))); // NOI18N
        jMenuItem10.setText("Help");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);
        jMenu5.add(jSeparator2);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/about.png"))); // NOI18N
        jMenuItem11.setText("About");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Save
        if (isSaved.get() == SaveState.SAVING) {
            return;
        }
        isSaved.set(SaveState.SAVING);
        if (saveFile == null) {
            jMenuItem4ActionPerformed(evt);
        } else {
            final boolean exit = exitAfterSave;
            exitAfterSave = false;
            ProgressWindow pw = new ProgressWindow<String>(this, null, "Saving", new String[] {"Saving project..."}) {

                @Override
                public void onComplete(final String results) {
                    if (results != null) {
                        SwingUtilities.invokeLater(new Runnable() {

                            @Override
                            public void run() {
                                JOptionPane.showMessageDialog(CreatorGui.this, results, "I/O error", JOptionPane.ERROR_MESSAGE);
                                isSaved.set(SaveState.UNSAVED);
                            }
                            
                        });
                    } else {
                        SwingUtilities.invokeLater(new Runnable() {

                            @Override
                            public void run() {
                                isSaved.set(SaveState.SAVED);
                                setSubtitle(subtitle);
                                if (exit) {
                                    System.exit(0);
                                }
                            }
                            
                        });
                    }
                }

                @Override
                public ProgressWindow.Task getTask() {
                    return new Task() {

                        @Override
                        public String run() {
                            try {
                                AndesiteIO.save(project, saveFile);
                            } catch (UnsupportedEncodingException ex) {
                                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                                return "Failed to save project (0x1108): \n\n" + ex.getClass().getName() + ":\n" + ex.getMessage();
                            } catch (IOException ex) {
                                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                                return "Failed to save project (0x1107): \n\n" + ex.getClass().getName() + ":\n" + ex.getMessage();
                            }
                            return null;
                        }
                        
                    };
                }
                
            };
            pw.performTaskThreaded();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // New
        if (project != null && isSaved.get() != SaveState.SAVED) {
            int n = JOptionPane.showConfirmDialog(this, "Creating a new project will discard unsaved changes in the opened project! Are you sure you want to continue?", "Unsaved changes", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (n != JOptionPane.YES_OPTION) {
                return;
            }
        }
        ProjectPropertiesDialog ppd = new ProjectPropertiesDialog(this, true);
        ppd.setVisible(true);
        if (ppd.result != null) {
            this.project = new AndesiteProject(ppd.result);
            this.saveFile = null;
            this.setSubtitle(ppd.result.name);
            enableTools();
            changesDone();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ProjectPropertiesDialog ppd = new ProjectPropertiesDialog(this, true, project.properties);
        ppd.setVisible(true);
        if (ppd.result != null) {
            this.project.properties = ppd.result;
            this.setSubtitle(ppd.result.name);
            changesDone();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // Save as
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()) {
                    String[] okExts = new String[] {".aue"};
                    for (String ext : okExts) {
                        if (pathname.getName().endsWith(ext)) {
                            return true;
                        }
                    }
                }
                return pathname.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Andesite project files (*.aue)";
            }
        });
        if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            int n = JOptionPane.showConfirmDialog(this, "The selected file already exists. Do you want to overwrite it?", "File already exists", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (n != JOptionPane.YES_OPTION) {
                return;
            }
            File f = jfc.getSelectedFile();
            if (!f.getName().toLowerCase().endsWith(".aue")) {
                f = new File(f.getAbsolutePath() + ".aue");
            }
            this.saveFile = f;
            jMenuItem3ActionPerformed(evt);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // Open
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()) {
                    String[] okExts = new String[] {".aue"};
                    for (String ext : okExts) {
                        if (pathname.getName().endsWith(ext)) {
                            return true;
                        }
                    }
                }
                return pathname.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Andesite project files (*.aue)";
            }
        });
        if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.saveFile = jfc.getSelectedFile();
            try {
                this.project = AndesiteIO.readProject(this.saveFile);
                this.isSaved.set(SaveState.SAVED);
                setSubtitle(this.project.properties.name);
                enableTools();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to open project: File not found (0x0101):\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to open project: (0x0102)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to open project: (0x0103)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (InstantiationException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0104)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0105)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (ClassCastException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0106)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0107)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (SecurityException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0108)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            } catch (NoSuchMethodException ex) {
                Logger.getLogger(CreatorGui.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Failed to parse project: (0x0109)\n\n" + ex.getClass().getName() + ":\n" + ex.getMessage(), "I/O error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Pack/publish
        PackGui pg = new PackGui(this, true, this.project);
        pg.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Manage keys
        KeyManagerGui kmg = new KeyManagerGui(this, null, true);
        kmg.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // Screenshots
        ScreenshotsGui sg = new ScreenshotsGui(this, true, this.project);
        sg.setVisible(true);
        changesDone();
        this.project = sg.project;
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // Help
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // About
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (isSaved.get() == SaveState.UNSAVED) {
            int n = JOptionPane.showConfirmDialog(this, "You have unsaved changes. Save before exit?", "Unsaved changes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            switch (n) {
                case JOptionPane.YES_OPTION:
                    jMenuItem3ActionPerformed(null);
                    if (isSaved.get() == SaveState.SAVED) {
                        System.exit(0);
                    }
                    return;
                case JOptionPane.NO_OPTION:
                    System.exit(0);
                    break;
                default:
                    return;
            }
        } else if (isSaved.get() == SaveState.SAVING) {
            JOptionPane.showMessageDialog(this, "Project is currently saving. Please wait until project has finished saving before closing to prevent project corruption.", "Saving changes", JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void enableTools() {
        jMenuItem3.setEnabled(true);
        jMenuItem4.setEnabled(true);
        jMenuItem6.setEnabled(true);
        jMenuItem7.setEnabled(true);
        jMenuItem8.setEnabled(true);
    }
    
    private void changesDone() {
        isSaved.set(SaveState.UNSAVED);
        setSubtitle(subtitle);
    }
    
    private void setSubtitle(String s) {
        subtitle = s;
        setTitle(s + (isSaved.get() == SaveState.SAVED ? "" : "*") + " - Andesite Mod Creator");
    }
    
    public File getSaveFile() {
        return this.saveFile;
    }
    
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
            java.util.logging.Logger.getLogger(CreatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatorGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
