package ru.geekbrains.example.junit.hamcrest.object;

public class Animal {
    protected String sound;

    public Animal(String sound) {
        this.sound = sound;
    }


    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


}