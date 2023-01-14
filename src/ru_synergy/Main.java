package ru_synergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Behemot");
        cats[2] = new Cat("Murzik");

        for (Cat cat : cats) System.out.println(cat);

        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.addAll(List.of(cats));
        catsList.add(new Cat("Sphinx"));
        catsList.remove(1);
        System.out.println(catsList);
        Cat cat = catsList.get(2);
        System.out.println(catsList.indexOf(cat));
        System.out.println(cat);
        catsList.add(1, cat);
        catsList.set(3, new Cat("hobo cat"));
        System.out.println(catsList);
        catsList.removeAll(Arrays.asList(cats,  catsList.get(2)));
        System.out.println(catsList);


    }
}
