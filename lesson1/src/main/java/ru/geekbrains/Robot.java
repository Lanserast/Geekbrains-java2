package ru.geekbrains;

public class Robot implements Actions {
    private String name;
    private double RunDistance;
    private double JumpDistance;

    public Robot (String name, double RunDistance,double JumpDistance  ){
        this.name = name;
        this.RunDistance = RunDistance;
        this.JumpDistance = JumpDistance;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + "с  лимитом бега " + this.getRunDistance());
    }

    @Override
    public double getRunDistance() {
        return this.RunDistance;
    }



    @Override
    public void jump() {
        System.out.println("Robot " + this.name + "с лимитом бега  " + this.getRunDistance());
    }

    @Override
    public double getJumpDistance() {
        return this.JumpDistance;
    }
}
