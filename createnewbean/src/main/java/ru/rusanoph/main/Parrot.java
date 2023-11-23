package ru.rusanoph.main;

public class Parrot {
    private String name = "Default parrot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    
}
