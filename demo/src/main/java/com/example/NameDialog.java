package com.example;

import java.awt.*;
import javax.swing.*;

public class NameDialog extends JFrame {
    private JTextField nameInput;

    public NameDialog() { // String windowTitle, String introText, ActionListener onConfirm) {
        // Logistics
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tell us your name");

        // Title
        JLabel titleLabel = new JLabel("Please input your name:");
        setLayout(new GridLayout(0, 1));
        add(titleLabel);

        // Input Fields
        nameInput = new JTextField("Your name");
        add(nameInput);

        // Set up Confirm button
        JButton done = new JButton("Done");
        done.addActionListener((e) -> {
            System.out.println("Welcome, " + getOutput());
            dispose();
            new MainWindow();
        });
        add(done);

        // Show the window
        setLocation(2000, 500);
        pack();
        setVisible(true);
    }

    public String getOutput() {
        return nameInput.getText();
    }
}
