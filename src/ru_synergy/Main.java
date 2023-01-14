package ru_synergy;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Array
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik");
        cats[1] = new Cat("Behemot");
        cats[2] = new Cat("Murzik");

        for (Cat cat : cats) System.out.println(cat);

//        ArrayList
        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.addAll(List.of(cats));
        catsList.add(new Cat("Sphinx"));
        catsList.remove(1);

        System.out.println(catsList);

        Cat cat = catsList.get(2);

        System.out.println(catsList.indexOf(cat));
        System.out.println(cat);

        catsList.add(1, cat);
//        catsList.set(3, new Cat("hobo cat"));

        System.out.println(catsList);

//        catsList.removeAll(Arrays.asList(cats,  catsList.get(2)));

//        System.out.println(catsList);

//        LinkedList
/*        String s1 = new String("Yo!");
        String s2 = new String("What's up?");
        String s3 = new String("I have something to say.");

        LinkedList<String> nwa_presong = new LinkedList<>();

        nwa_presong.add(s1);
        nwa_presong.add(s2);
        nwa_presong.add(s3);

        System.out.println(nwa_presong);
        nwa_presong.remove();
        System.out.println(nwa_presong);

        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("sputnik");
        Car mersedes = new Car("Niva");
        Car bmv = new Car("Lada");
        cars.addAll(Arrays.asList(ferrari, mersedes, bmv));
        System.out.println(cars);

        cars.addFirst(new Car("zaporizhets"));
        cars.addLast(new Car("kalina"));
        System.out.println(cars);

        System.out.println(cars.pollFirst());
        System.out.println(cars);*/

        // ArrayList vs LinkedList
/*        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000000; i++) list.add(new Integer(i));
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) list.add(2000000, Integer.MAX_VALUE);
        System.out.printf("LinkedList time: %d\n", System.currentTimeMillis() - start);

        List<Integer> listarr = new ArrayList<>();
        for (int i = 0; i < 5000000; i++) list.add(new Integer(i));
        start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) list.add(2000000, Integer.MAX_VALUE);
        System.out.printf("ArrayList time: %d\n", System.currentTimeMillis() - start);*/

//        Set
        Set<String> states = new HashSet<>();
        states.add("Ukraine");
        states.add("Belorussia");
        states.add("Kazakhstan");
        boolean isAdded = states.add("Belorussia");
        System.out.println(isAdded);
        System.out.println("Set size: " + states.size());
        System.out.println(states);

        states.remove("Ukraine");
        System.out.println(states);

        HashSet<Cat> catsHashSet = new HashSet(catsList);
        System.out.println(catsHashSet);

        TreeSet<Cat> catTreeSet = new TreeSet(catsList);
        System.out.println(catTreeSet);
    }
}
