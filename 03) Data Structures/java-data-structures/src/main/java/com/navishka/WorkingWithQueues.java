package com.navishka;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 18));
        queue.add(new Person("Ali", 24));

        System.out.println(queue);
        System.out.println(queue.peek());

    }

    static record Person(String name, int age) {}
}
