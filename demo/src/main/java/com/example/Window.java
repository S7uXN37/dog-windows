package com.example;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class Window extends JFrame {
    private JButton done;

    public Window(String windowTitle, String introText) {
        // Logistics
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(windowTitle);

        // Title
        JLabel titleLabel = new JLabel(introText);
        setLayout(new GridLayout(0, 1));
        add(titleLabel);

        // Input Fields
        setup();

        // Set up Confirm button
        done = new JButton("Done");

        add(done);

        // Show the window
        setLocation(2000, 500);
        pack();
        setVisible(true);
    }

    void setConfirmAction(ActionListener listener) {
        done.addActionListener(listener);
    }

    abstract void setup();

    public abstract String getOutput();
}
