package org.example;

public class Car {
    int power;
    String auto;

    public Car (int power, String auto) {
        this.power = power;
        this.auto = auto;
    }

    void toRace() {
        if (power > 600)
            System.out.println("Могу учавствовать в Топ32 ");
        else {
            System.out.println("Недостаточно мощности, сынок");
        }
    }
    void carName() {
        System.out.println("Марка машины:" + auto);
    }
}
