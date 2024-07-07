package PasswordWebsite;

public class Main {
    public static void main(String[] args) {
        // Schedule a job for the event dispatch thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create an instance of the GUI class
                new GUI().setVisible(true);
            }
        });
    }
}
