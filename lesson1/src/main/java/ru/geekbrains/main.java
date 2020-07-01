package ru.geekbrains;

import java.util.Random;

/*
1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.

4)* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
public class main {
    public static void main(String[] args){

        //Участники
        Actions[] actions = new Actions[3];
        actions[0] = new Human("Акакий", 1500, 40);
        actions[1] = new Cat("Cat the cat", 1000,120);
        actions[2] = new Robot("boston dynamics SPOT CLASSIC (2015)", 2000,150);

        Obstacle[] obstacles = new Obstacle[10];
        //рандомно сгенерируем препятствия
        boolean isWall;
        double distance;
        double height;
        Random rand = new Random();
        for (int i = 0; i< obstacles.length; i++){
            distance = 10 + rand.nextDouble() *(100-90);
            height  = 10 + rand.nextDouble() *(100-90);
            isWall =  rand.nextBoolean();
            if (isWall){
                obstacles[i] = new Wall("Стена номер " + i, height);
            }
            else{
                obstacles[i] = new RunRoad("Беговая дорожка номер " + i, distance);
            }
        }

        boolean results;
        for (int i = 0; i<actions.length;i++){
            results = true;
            for (int j = 0; j< obstacles.length; j++){
                results = obstacles[j].moving(actions[i]);
                if (results = false){
                    break;
                }
            }
            if (results){
                System.out.println("Успешно");
            }
            else System.out.println("Неудачно");
        }


    }
}
