package main;

import clase.DetaliiReteta;
import clase.Flyweight;
import clase.FlyweightFactory;
import clase.Medicament;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament m1 = new Medicament("Paracitamol", 16.0f);
        Medicament m2 = new Medicament("Aspirina", 2.5f);
        Medicament m3 = new Medicament("Glicina", 20.6f);

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight client1 = factory.getFlyweight("87532157645", "Olivia", 1);

        client1.descriereReteta(new DetaliiReteta(1, List.of(m1, m2, m3)));
        client1.descriereReteta(new DetaliiReteta(2, List.of(m1, m2)));

        System.out.println("\n" + factory.getNumarReteteClienti() + " elemente");

        factory.getFlyweight("78643454663", "Monica", 2).descriereReteta(
                new DetaliiReteta(2, List.of(m2, m3))
        );
        System.out.println("\n" + factory.getNumarReteteClienti() + " elemente");
    }
}