package ru_synergy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Behemot");
        cats[2] = new Cat("Murzik");

        for (Cat cat : cats) System.out.println(cat);
    }
}
