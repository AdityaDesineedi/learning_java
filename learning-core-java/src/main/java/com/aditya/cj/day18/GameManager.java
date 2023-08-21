package com.aditya.cj.day18;

//An interface can extend another interface interface1 implements interface2
interface Game{

    void start(); //by default it will take the public abstract, we don't need to mention that again
    void play();
    void stop();
}

abstract class AbstrcatGame implements Game {
    @Override
    public void start() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is going to start");
    }
    @Override
    public void stop() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is going to stop");
    }
}

class Bike extends AbstrcatGame implements Game{

    @Override
    public void play() {
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, please weat helmet!..");
    }
}

class Car extends AbstrcatGame implements Game{

    @Override
    public void play() {
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, please wear the seat belt!..");
    }

}

public class GameManager {
    public static void main(String[] args) {
        Game game = new Car();
        game.start();
        game.play();
        game.stop();
    }
}
