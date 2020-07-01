package ru.geekbrains;

public class Cat implements Actions {

    private String name;
    private double RunDistance;
    private double JumpDistance;

    public Cat (String name, double RunDistance,double JumpDistance  ){
        this.name = name;
        this.RunDistance = RunDistance;
        this.JumpDistance = JumpDistance;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + " лимит бега " + this.getRunDistance());
    }

    @Override
    public double getRunDistance() {
        return this.RunDistance;
    }



    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " лимит прыжка  " + this.getRunDistance());
    }

    @Override
    public double getJumpDistance() {
        return this.JumpDistance;
    }
}
