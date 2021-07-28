package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Queue - a collection interface that allows us to implement FIFO and LIFO
        //FIFO - first in first out
        //LIFO last in first out

//        Queue<String> names = new LinkedList<>();
//        Queue<String> people = new LinkedList<>();
//        names.offer("Josh");
//        names.offer("Harry");
//        names.offer("David");
//        names.offer("George");
//        System.out.println(people.peek());//does the same as the element() method but doe not throw
//        //an error on an empty queue
//        System.out.println(people.element());//returns element form the front of the queue
//
//        names.remove();// removes an item form the front of the queue
//        names.poll(); //does the same thing as remove() method except it doe not throw an error
        //when faced with an empty queue

//        Deque<String> names = new ArrayDeque<>();
//        names.addFirst("Josh");//offer first()
//        names.add("Dave");//offer()
//        names.addLast("Paul");//offerLast() returns boolean
//
//        System.out.println(names.getFirst());
//        System.out.println(names.removeLast());
        //deque - collection interface that allows us to manipulate items to the top and
        //bottom of the deque


        //map - a collection interface that affords us the key-value pair relationship
        //in a data structure

//        Map<String, String> countries = new HashMap<>();//returns the keys in any random format, does not care
        // how they were entered, and does not organize them
//        countries.put("Nigeria", "Abuja");// put() method of the HashMap interface to add a new item to the map
//        countries.put("USA", "Washington");
//        countries.put("China", "Hong Kong");
//        countries.put("Japan", "Tokyo");
//
////        System.out.println(countries.keySet());// get only the countries
////        System.out.println(countries.values());// get only the capitals
//
//        for (String country : countries.keySet()) {
//            System.out.println("The capital of " + country + " is " + countries.get(country));
//        }

//        Map<String, String> countries = new TreeMap<>(); //organizes the keys in the natural order, irrespective
//        //in how they were added, String are returned in alphabetical order, numbers in ascending order
//        countries.put("Nigeria", "Abuja");// put() method of the HashMap interface to add a new item to the map
//        countries.put("USA", "Washington");
//        countries.put("China", "Hong Kong");
//        countries.put("Japan", "Tokyo");
//
//        for (String country : countries.keySet()) {
//            System.out.println("The capital of " + country + " is " + countries.get(country));
//        }

        //LinkedHashMap saves the manner in which the items were added and returns them in
        //particular order
//        Map<String, String> countries = new LinkedHashMap<>(); //organizes the keys in the natural order, irrespective
//        //in how they were added, String are returned in alphabetical order, numbers in ascending order
//        countries.put("Nigeria", "Abuja");// put() method of the HashMap interface to add a new item to the map
//        countries.put("USA", "Washington");
//        countries.put("China", "Hong Kong");
//        countries.put("Japan", "Tokyo");
//
//        for (String country : countries.keySet()) {
//            System.out.println("The capital of " + country + " is " + countries.get(country));
//        }

        Map<String, String> animals = new LinkedHashMap<>();
        animals.put("pig", "oink oink");
        animals.put("dog", "woof woof");
        animals.put("cow", "moo moo");
        animals.put("chicken", "cluck cluck");
        animals.put("cat", "meow meow");

        for (String animal : animals.keySet()) {
            System.out.println(animal + " says: " + animals.get(animal));
        }
        System.out.println();

        Map<String, String> animalsKids = new TreeMap<>();
        animalsKids.put("reindeer", "calf");
        animalsKids.put("deer", "fawn");
        animalsKids.put("cheetah", "cub");
        animalsKids.put("crow", "chick");
        animalsKids.put("koala", "joey");

        for (String animal : animalsKids.keySet()) {
            System.out.println("Baby animal of " + animal + " is called " + animalsKids.get(animal));
        }
    }
}
