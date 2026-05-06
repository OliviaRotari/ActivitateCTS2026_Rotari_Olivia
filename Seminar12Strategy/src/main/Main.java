package main;

import clase.ProbaOrala;
import clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student =new Student("Monica");
        student.verificare();

        student.setModSustinere(new ProbaOrala());
        student.verificare();
    }
}