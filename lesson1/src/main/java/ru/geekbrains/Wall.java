package ru.geekbrains;

public class Wall extends Obstacle {
    private double height;

    public Wall(String name, double height) {
        super(name);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    protected boolean moving(Actions actions){
        System.out.println("Стена  " + super.getName() + " высотой: " + this.height);
        actions.jump();

        if (getHeight() <= actions.getJumpDistance()) {
            System.out.println("Прыжок успешный");

            return true;
        } else {
            System.out.println("Прыжок неудачный");

            return false;
        }
    }
}
