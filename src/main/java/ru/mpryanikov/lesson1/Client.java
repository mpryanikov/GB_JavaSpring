package ru.mpryanikov.lesson1;

public class Client {
    private String rifle;

    public void getShot() {
        System.out.println("Произведён выстрел: " + shot);
    }

    public void setShot(String shot) {
        this.shot = shot;
    }

    private String shot;

    public void setRifle(String rifle) {
        this.rifle = rifle;
    }

    public void getRifle() {
        System.out.println("Клиент получил ружьё: " + rifle);
    }
}
