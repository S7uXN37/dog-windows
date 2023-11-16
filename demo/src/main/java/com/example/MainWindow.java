package com.example;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame {
    private String gender;
    private String name;

    public MainWindow() {
        this("not set", "not set");
    }

    public MainWindow(String gender, String name) {
        // Logistics
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MainWindow");

        // Title
        JLabel titleLabel = new JLabel("Please add information about your dog:");
        setLayout(new GridLayout(0, 1));
        add(titleLabel);

        // Input Fields
        this.gender = gender;
        this.name = name;

        JPanel panel = new JPanel(new GridLayout(2, 0));
        JButton bGender = new JButton("Set Gender");
        JButton bName = new JButton("Set Name");
        panel.add(bGender);
        panel.add(bName);
        panel.add(new JLabel("Gender: " + gender));
        panel.add(new JLabel("Name: " + name));

        bGender.addActionListener((e) -> {
            new DogGenderChooser();
        });
        bName.addActionListener((e) -> {
            new DogNameChooser();
        });

        add(panel);

        // Confirm button
        JButton done = new JButton("Done");
        add(done);
        done.addActionListener((e) -> {
            System.out.println("Your Message: " + getOutput());
        });

        // Show the window
        setLocation(2000, 500);
        pack();
        setVisible(true);
    }

    public String getOutput() {
        return name + " is the best " + gender + "!";
    }
}
