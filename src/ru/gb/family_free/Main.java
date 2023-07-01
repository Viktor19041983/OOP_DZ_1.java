package ru.gb.family_free;

public class Main {
    public static void main(String[] args) {
        Human per1 = new Human("N1", "S1", Human.Sex.MALE, null);
        Human per2 = new Human("N2", "S2", Human.Sex.MALE, per1);
        Human per3 = new Human("N3", "S3", Human.Sex.FEMALE, per2);
        Human per4 = new Human("N4", "S4", Human.Sex.MALE, per3);
        Human per5 = new Human("N5", "S5", Human.Sex.FEMALE, per3);
        Human per6 = new Human("N6", "S6", Human.Sex.FEMALE, per5);
        System.out.println("Parent('s): ");
        for (Human human : per2.getParents()) {
            System.out.println(human.getNameData());
        }
        System.out.println("Children are: ");
        for (Human human : per3.getChildren()) {
            System.out.println(human.getNameData());
        }
        System.out.println("Subparents are: ");
        for (Human human : per3.getSubParents()) {
            System.out.println(human.getNameData());
        }
        System.out.println("Subchildren are: ");
        for (Human human : per3.getSubChildren()) {
            System.out.println(human.getNameData());
        }
    }
}