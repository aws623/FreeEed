package org.freeeed.ui;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.freeeed.main.FreeEedException;
import org.freeeed.main.FreeEedLogging;
import org.freeeed.main.FreeEedMain;
import org.freeeed.main.LinuxUtil;
import org.freeeed.main.ParameterProcessing;
import org.freeeed.util.History;

/**
 *
 * @author mark
 */
public class FreeEedUI extends javax.swing.JFrame {

	/** Creates new form Main */
	public FreeEedUI() {
		FreeEedLogging.init();		
		initComponents();
		showHistory();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuItemNewProject = new javax.swing.JMenuItem();
        menuItemOpenProject = new javax.swing.JMenuItem();
        menuItemSaveProject = new javax.swing.JMenuItem();
        menuItemSaveProjectAs = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuItemProjectSettings = new javax.swing.JMenuItem();
        processMenu = new javax.swing.JMenu();
        stageMenuItem = new javax.swing.JMenuItem();
        processMenuItem = new javax.swing.JMenuItem();
        allStepsMenuItem = new javax.swing.JMenuItem();
        processSeparator = new javax.swing.JPopupMenu.Separator();
        historyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FreeEed - Graphical User Interface");

        fileMenu.setText("File");

        menuItemNewProject.setText("New project");
        menuItemNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNewProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemNewProject);

        menuItemOpenProject.setText("Open project");
        menuItemOpenProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemOpenProject);

        menuItemSaveProject.setText("Save project");
        menuItemSaveProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveProjectActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemSaveProject);

        menuItemSaveProjectAs.setText("Save project as");
        menuItemSaveProjectAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSaveProjectAsActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemSaveProjectAs);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        fileMenu.add(menuItemExit);

        mainMenu.add(fileMenu);

        editMenu.setText("Edit");

        menuItemProjectSettings.setText("Project settings");
        menuItemProjectSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProjectSettingsActionPerformed(evt);
            }
        });
        editMenu.add(menuItemProjectSettings);

        mainMenu.add(editMenu);

        processMenu.setText("Process");

        stageMenuItem.setText("Stage");
        stageMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stageMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(stageMenuItem);

        processMenuItem.setText("Process");
        processMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(processMenuItem);

        allStepsMenuItem.setText("All steps");
        allStepsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStepsMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(allStepsMenuItem);
        processMenu.add(processSeparator);

        historyMenuItem.setText("History");
        historyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyMenuItemActionPerformed(evt);
            }
        });
        processMenu.add(historyMenuItem);

        mainMenu.add(processMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenu.add(helpMenu);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
		new AboutDialog(this, true).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
		exitApp();
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemOpenProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenProjectActionPerformed
		openProject();
    }//GEN-LAST:event_menuItemOpenProjectActionPerformed

    private void menuItemProjectSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProjectSettingsActionPerformed
		showProjectSettings();
    }//GEN-LAST:event_menuItemProjectSettingsActionPerformed

	private void menuItemSaveProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveProjectActionPerformed
		saveProjectSettings();
	}//GEN-LAST:event_menuItemSaveProjectActionPerformed

	private void menuItemNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNewProjectActionPerformed
		openNewProject();
	}//GEN-LAST:event_menuItemNewProjectActionPerformed

	private void menuItemSaveProjectAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSaveProjectAsActionPerformed
		saveProjectSettingsAs();
	}//GEN-LAST:event_menuItemSaveProjectAsActionPerformed

	private void stageMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stageMenuItemActionPerformed
		stageProject();
	}//GEN-LAST:event_stageMenuItemActionPerformed

	private void processMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processMenuItemActionPerformed
		try {
			runProcessing();
		} catch (FreeEedException e) {
			JOptionPane.showMessageDialog(this, "There were some problems with processing, \""
					+ e.getMessage() + "\n"
					+ "please check console output");
		}
	}//GEN-LAST:event_processMenuItemActionPerformed

	private void allStepsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStepsMenuItemActionPerformed
		try {
			processProject();
		} catch (FreeEedException e) {
			JOptionPane.showMessageDialog(this, "There were some problems with processing, \""
					+ e.getMessage() + "\n"
					+ "please check console output");
		}		
	}//GEN-LAST:event_allStepsMenuItemActionPerformed

	private void historyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyMenuItemActionPerformed
		showHistory();
	}//GEN-LAST:event_historyMenuItemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new FreeEedUI().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem allStepsMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem historyMenuItem;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemNewProject;
    private javax.swing.JMenuItem menuItemOpenProject;
    private javax.swing.JMenuItem menuItemProjectSettings;
    private javax.swing.JMenuItem menuItemSaveProject;
    private javax.swing.JMenuItem menuItemSaveProjectAs;
    private javax.swing.JMenu processMenu;
    private javax.swing.JMenuItem processMenuItem;
    private javax.swing.JPopupMenu.Separator processSeparator;
    private javax.swing.JMenuItem stageMenuItem;
    // End of variables declaration//GEN-END:variables

	@Override
	public void setVisible(boolean b) {
		myInitComponents();
		super.setVisible(b);
	}

	private void myInitComponents() {
		setBounds(64, 40, 640, 400);
		setTitle("FreeEed - Open source eDiscovery - Operator Console");
	}

	private void exitApp() {
		if (!isExitAllowed()) {
			return;
		}
		// TODO verify - is that a standard way to exit?
		setVisible(false);
		System.exit(0);
	}

	private boolean isExitAllowed() {
		return true;
	}

	private void openProject() {
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fileChooser.addChoosableFileFilter(new ProjectFilter());
			File f = null;
			try {
				f = new File(new File(".").getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
			// Set the current directory
			fileChooser.setCurrentDirectory(f);
			fileChooser.setDialogTitle("Select project file");
			fileChooser.showOpenDialog(this);
			File selectedFile = fileChooser.getSelectedFile();
			if (selectedFile == null) {
				return;
			}
			History.appendToHistory("Opened project file: " + selectedFile.getPath());
			Configuration processingParameters =
					ParameterProcessing.collectProcessingParameters(selectedFile.getPath());
			FreeEedMain.getInstance().setProcessingParameters(processingParameters);
			updateTitle(processingParameters);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private class ProjectFilter extends javax.swing.filechooser.FileFilter {

		@Override
		public boolean accept(File file) {
			String filename = file.getName();
			return filename.endsWith(".properties");
		}

		@Override
		public String getDescription() {
			return "Project files";
		}
	}

	private void updateTitle(Configuration processingParameters) {
		String title = processingParameters.getString(ParameterProcessing.PROJECT_NAME);
		if (title != null) {
			setTitle("FreeEed - " + title);
		} else {
			setTitle("FreeEed");
		}
	}

	private void showProjectSettings() {
		ProjectSettingsUI dialog = new ProjectSettingsUI(this, true);
		dialog.setLocationRelativeTo(this);
		dialog.setVisible(true);
	}

	private void saveProjectSettings() {
		Configuration processingParameters = FreeEedMain.getInstance().getProcessingParameters();
		if (processingParameters == null) {
			JOptionPane.showMessageDialog(rootPane, "You have no project open"); 
			return;
		}
		String projectFile = null;
		if (processingParameters.containsKey(ParameterProcessing.PROJECT_FILE_NAME)) {
			projectFile = processingParameters.getString(ParameterProcessing.PROJECT_FILE_NAME);
		}
		if (projectFile == null) {
			saveProjectSettingsAs();
			return;
		}
		PropertiesConfiguration configToSave = new PropertiesConfiguration();
		configToSave.append(processingParameters);
		try {
			configToSave.save(projectFile);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private void saveProjectSettingsAs() {
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			fileChooser.addChoosableFileFilter(new ProjectFilter());
			File f = null;
			try {
				f = new File(new File(".").getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace(System.out);
			}
			// Set the current directory
			fileChooser.setCurrentDirectory(f);
			fileChooser.setDialogTitle("Save project");
			fileChooser.showSaveDialog(this);
			File selectedFile = fileChooser.getSelectedFile();
			if (selectedFile == null) {
				return;
			}
			String projectFile = selectedFile.getPath();
			if (!projectFile.endsWith(".properties")) {
				projectFile += ".properties";
			}
			History.appendToHistory("Saved project " + projectFile);
			PropertiesConfiguration configToSave = new PropertiesConfiguration();
			Configuration processingParameters =
					FreeEedMain.getInstance().getProcessingParameters();
			configToSave.append(processingParameters);
			configToSave.save(projectFile);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private void openNewProject() {
		Configuration processingParameters =
				ParameterProcessing.setDefaultParameters();
		processingParameters.setProperty(ParameterProcessing.PROJECT_NAME, "New project");
		FreeEedMain.getInstance().setProcessingParameters(processingParameters);
		updateTitle(processingParameters);
		showProjectSettings();
	}

	private void stageProject() {
		FreeEedMain instance = FreeEedMain.getInstance();
		if (instance.getProcessingParameters() == null) {
			JOptionPane.showMessageDialog(this, "Please open a project first");
			return;
		}
		try {
			instance.runStagePackageInput();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

	private void runProcessing() throws FreeEedException {
		FreeEedMain instance = FreeEedMain.getInstance();
		if (instance.getProcessingParameters() == null) {
			JOptionPane.showMessageDialog(this, "Please open a project first");	
			return;
		}		
		// TODO - handle directories in more generic way
		if (new File("test-output/output").exists()) {
			int reply = JOptionPane.showConfirmDialog(this, "Output directory not empty. Sould I remove for you?");
			if (reply != JOptionPane.OK_OPTION) {
			}
			LinuxUtil.runLinuxCommand("rm -fr test-output/output");
		}
		String runWhere = instance.getProcessingParameters().getString("process");
		if (runWhere != null) {
			instance.runProcessing(runWhere);
		} else {
			throw new FreeEedException("No processing option selected.");
		}
	}
	private void processProject() throws FreeEedException {
		stageProject();
		runProcessing();
	}
	private void showHistory() {
		HistoryUI ui = new HistoryUI();
		ui.setVisible(true);
	}
}
