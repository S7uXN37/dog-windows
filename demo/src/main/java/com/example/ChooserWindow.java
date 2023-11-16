package com.example;

import java.awt.*;
import javax.swing.*;

public class ChooserWindow extends Window {
    private ButtonGroup group;
    private JPanel panel;

    public ChooserWindow(String windowTitle, String introText, String[] choices) {
        super(windowTitle, introText);

        for (String choice : choices) {
            JRadioButton r = new JRadioButton(choice);
            r.setActionCommand(choice);
            panel.add(r);
            group.add(r);
        }

        pack();
    }

    @Override
    public String getOutput() {
        return group.getSelection().getActionCommand();
    }

    @Override
    void setup() {
        panel = new JPanel(new GridLayout(2, 0));
        group = new ButtonGroup();

        add(panel);
    }
}
