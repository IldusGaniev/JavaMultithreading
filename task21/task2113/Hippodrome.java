package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move(){
        for (Horse hors :
                horses) {
            hors.move();
        }
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void print(){
        for (Horse hors :
                horses) {
            hors.print();
        }
        for (int i = 0; i < 10; i++)
            System.out.println();
    }

    public static Hippodrome game;

    public static void main(String[] args){
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("First", 3, 0));
        game.getHorses().add(new Horse("Second", 3, 0));
        game.getHorses().add(new Horse("Fird", 3, 0));
        game.run();
    }
}
