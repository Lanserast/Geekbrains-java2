package ru.geekbrains;

public class Human implements Actions {

    private String name;
    private double RunDistance;
    private double JumpDistance;

    public Human (String name, double RunDistance,double JumpDistance  ){
        this.name = name;
        this.RunDistance = RunDistance;
        this.JumpDistance = JumpDistance;
    }

    @Override
    public void run() {
        System.out.println("Человек " + this.name + " бежит " /* + this.getRunDistance())*/);
    }

    @Override
    public double getRunDistance() {
        return this.RunDistance;
    }



    @Override
    public void jump() {
        System.out.println("Человек " + this.name + " перепрыгнул " /* + this.getRunDistance()*/);
    }

    @Override
    public double getJumpDistance() {
        return this.JumpDistance;
    }
}
