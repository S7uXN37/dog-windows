package com.example;

import javax.swing.*;

public class NameDialog extends Window {
    private JTextField nameInput;

    public NameDialog() { // String windowTitle, String introText, ActionListener onConfirm) {
        super("Tell us your name", "Please input your name:");

        setConfirmAction((e) -> {
            System.out.println("Welcome, " + getOutput());
            dispose();
            MainWindow.getInstance();
        });
    }

    @Override
    public String getOutput() {
        return nameInput.getText();
    }

    @Override
    void setup() {
        nameInput = new JTextField("Your name");
        add(nameInput);
    }
}
