package com.example.laba1.parametrs;

public class Impulse {

    java.util.Random random = new java.util.Random();
    int mass1;
    int mass2;
    int speed1;
    int speed2;
    public Impulse() {    }

    public void setMass1(int mass1) { this.mass1 = mass1; }
    public void setMass2(int mass2) { this.mass2 = mass2; }
    public void setSpeed1(int speed1) { this.speed1 = speed1; }
    public void setSpeed2(int speed2) { this.speed2 = speed2; }

    public int getSpeed1() { return speed1; }
    public int getSpeed2() { return speed2; }
    public int getMass1() { return mass1; }
    public int getMass2() { return mass2; }

    public String Calculate(){
        return "Скорость после столкновения: " + ((mass1*speed1 + mass2*speed2)/(mass1+mass2));
    }
}
