package com.example;

public class DogGenderChooser extends ChooserWindow {

    public DogGenderChooser() {
        super("Dog Gender Selection", "What's the gender of your dog:",
                new String[] { "Boy", "Girl" });

        setConfirmAction((e) -> {
            System.out.println("Gender: " + getOutput());
            dispose();
            MainWindow.getInstance().setDogGender(getOutput());
        });

    }
}
