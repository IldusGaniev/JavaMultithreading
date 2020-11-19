package com.javarush.task.task21.task2113;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move(){
        distance += speed * Math.random();
    }
    public void print(){
        int points = (int)distance;
        String way = ".";
        String sRepeated = IntStream.range(0, points).mapToObj(i -> way).collect(Collectors.joining(""));
        System.out.println(sRepeated + name);
    }
}
