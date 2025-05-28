import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Computadora computer = new Computadora();

        computer.setModel("Inspiron 15");

        System.out.println("Marca: "computer.getBrand());
        System.out.println("Modelo:" + computer.getModel());

        computer.turnOn();
        computer.turnOn();

        computer.turnOff();
    }
}