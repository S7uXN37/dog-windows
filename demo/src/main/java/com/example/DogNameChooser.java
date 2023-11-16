package com.example;

import java.awt.*;
import javax.swing.*;

public class DogNameChooser extends JFrame {
    private ButtonGroup group;

    public DogNameChooser() {
        // Logistics
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dog Name Selection");

        // Title
        JLabel titleLabel = new JLabel("What's the name of your dog:");
        setLayout(new GridLayout(0, 1));
        add(titleLabel);

        // Input Fields
        JPanel panel = new JPanel(new GridLayout(2, 0));
        group = new ButtonGroup();
        for (String choice : new String[] { "Cooper", "Buddy", "Bear", "Luna", "Daisy", "Coco", "Maggie" }) {
            JRadioButton r = new JRadioButton(choice);
            r.setActionCommand(choice);
            panel.add(r);
            group.add(r);
        }

        add(panel);

        // Confirm button
        JButton done = new JButton("Done");
        add(done);
        done.addActionListener((e) -> {
            System.out.println("Name: " + getOutput());
            dispose();
            new MainWindow("I forgot :(", getOutput());
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
