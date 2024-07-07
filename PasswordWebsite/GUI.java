package PasswordWebsite;

import javax.swing.*; // Importing the Swing library
import java.awt.*; // Importing the AWT library for layout managers
import java.awt.event.*; // Importing the AWT library for event handling

public class GUI extends JFrame {
    // Constructor to set up the GUI
    public GUI() {

        String arrRequire[] = { "Passwort muss mindestens 8 Charaktere lang sein!", ".", "b", "c" };

        // Set the title of the window
        setTitle("Passwort Herstellung");

        // Set the size of the window
        setSize(500, 900);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Set the default close operation (exit the application when the window is
        // closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a label and add it to the panel
        JLabel label = new JLabel("Erstelle ein Passwort!");
        panel.add(label);

        // Create a text field and add it to the panel
        JTextField require1 = new JTextField(20);
        panel.add(require1);

        // Create a button and add it to the panel
        JButton button = new JButton("Probieren");
        panel.add(button);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String reply1 = require1.getText().trim();

                JTextField requField2 = new JTextField(20);

                if (!reply1.isEmpty() && reply1.length() >= 8) {
                    // Create a new panel based on user input
                    JPanel panel2 = createNewPanel(reply1);

                    // Add the new panel to the mainPanel
                    panel.add(panel2);

                    // Revalidate and repaint the mainPanel to reflect the changes
                    panel.revalidate();
                    panel.repaint();

                    // Insert the new text field at index 2 (after the first text field)
                    panel.add(requField2, 2); // Index 2 because 0 is label, 1 is first text field
                } else {

                    JOptionPane.showMessageDialog(panel, arrRequire[0], "Error",
                            JOptionPane.ERROR_MESSAGE);

                }

            }
        });

        // Add the panel to the frame
        add(panel);
    }

    // Method to create a new panel based on user input
    private static JPanel createNewPanel(String inputText) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("New Panel for: " + inputText);
        panel.add(label);

        // Add additional components as needed for the new panel

        return panel;
    }

}

/*
 * Length: Aim for a minimum of 8 characters. //fertig
 * 
 * Mix of characters: Include both uppercase and lowercase letters.
 * 
 * Numbers: Include at least one numerical digit (0-9).
 * 
 * Special characters: Include at least one special character (e.g., !, @, #,
 * $).
 * 
 * Avoid dictionary words: Do not use common words that can be easily guessed.
 * 
 * Avoid personal information: Do not include names, birthdates, or easily
 * obtainable details.
 * 
 * Unique to each account: Use different passwords for different accounts.
 * 
 * Avoid common passwords: Avoid using easily guessable passwords like
 * "password" or "123456".
 * 
 * Avoid sequences: Do not use consecutive characters or common sequences.
 * 
 * Readable but not obvious: Make sure your password is something you can
 * remember but not something obvious to others.
 * 
 * Change periodically: Consider changing your password every few months.
 * 
 * Consider a passphrase: If possible, use a passphrase made of multiple words
 * or a memorable sentence.
 */