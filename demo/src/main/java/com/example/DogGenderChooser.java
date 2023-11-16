package com.example;

import java.awt.*;
import javax.swing.*;

public class DogGenderChooser extends JFrame {
    private ButtonGroup group;

    public DogGenderChooser() {
        // Logistics
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dog Gender Selection");

        // Title
        JLabel titleLabel = new JLabel("What's the gender of your dog:");
        setLayout(new GridLayout(0, 1));
        add(titleLabel);

        // Input Fields
        JPanel panel = new JPanel(new GridLayout(2, 0));
        JRadioButton rMale = new JRadioButton("male");
        JRadioButton rFemale = new JRadioButton("female");
        rMale.setActionCommand("male");
        rFemale.setActionCommand("female");

        group = new ButtonGroup(); // ensures only 1 selection at a time
        group.add(rMale);
        group.add(rFemale);

        panel.add(rMale);
        panel.add(rFemale);

        add(panel);

        // Confirm button
        JButton done = new JButton("Done");
        add(done);
        done.addActionListener((e) -> {
            System.out.println("Gender: " + getOutput());
            dispose();
            new MainWindow(getOutput(), "not set");
        });

        // Show the window
        setLocation(2000, 500);
        pack();
        setVisible(true);
    }

    public String getOutput() {
        return group.getSelection().getActionCommand();
    }
}
