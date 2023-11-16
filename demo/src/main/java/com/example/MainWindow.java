package com.example;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends Window {
    private static MainWindow instance;

    private String gender;
    private String name;

    private JLabel lName;
    private JLabel lGender;

    public static MainWindow getInstance() {
        if (instance == null)
            return new MainWindow();
        return instance;
    }

    public MainWindow() {
        this("not set", "not set");

        if (instance != null) {
            throw new IllegalStateException("Only 1 MainWindow allowed");
        }
        instance = this;
    }

    public MainWindow(String gender, String name) {
        super("MainWindow", "Please add information about your dog:");

        this.gender = gender;
        this.name = name;

        setConfirmAction((e) -> {
            System.out.println("Your Message: " + getOutput());
        });

        lGender.setText("Gender: " + gender);
        lName.setText("Name: " + name);
    }

    @Override
    void setup() {
        JPanel panel = new JPanel(new GridLayout(2, 0));
        JButton bGender = new JButton("Set Gender");
        JButton bName = new JButton("Set Name");
        panel.add(bGender);
        panel.add(bName);
        lGender = new JLabel("Gender: " + gender);
        lName = new JLabel("Name: " + name);
        panel.add(lGender);
        panel.add(lName);

        bGender.addActionListener((e) -> {
            new DogGenderChooser();
        });
        bName.addActionListener((e) -> {
            new DogNameChooser();
        });

        add(panel);
    }

    public String getOutput() {
        return name + " is the best " + gender + "!";
    }

    public void setDogGender(String output) {
        this.gender = output;
        lGender.setText("Gender: " + gender);
        lName.setText("Name: " + name);
    }

    public void setDogName(String output) {
        this.name = output;
        lGender.setText("Gender: " + gender);
        lName.setText("Name: " + name);
    }
}
