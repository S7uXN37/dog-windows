package com.example;

public class DogNameChooser extends ChooserWindow {

    public DogNameChooser() {
        super("Dog Name Selection", "What's the name of your dog:",
                new String[] { "Cooper", "Buddy", "Bear", "Luna", "Daisy", "Coco", "Maggie" });

        setConfirmAction((e) -> {
            System.out.println("Name: " + getOutput());
            dispose();
            MainWindow.getInstance().setDogName(getOutput());
        });
    }
}
