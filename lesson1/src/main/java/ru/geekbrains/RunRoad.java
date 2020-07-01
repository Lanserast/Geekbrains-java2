package ru.geekbrains;

public class RunRoad extends Obstacle {

    private double length;

    public RunRoad(String name, double length){
        super(name);
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Дорожка " + super.getName() + " длина " + this.length);
        actions.run();
        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Успешно пробежал");

            return true;
        } else {
            System.out.println("Не пробежал");

            return false;
        }
    }
}
