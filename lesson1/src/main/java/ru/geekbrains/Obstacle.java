package ru.geekbrains;

public abstract class Obstacle {
    private String name;

    public Obstacle (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract boolean moving(Actions actions);
}
