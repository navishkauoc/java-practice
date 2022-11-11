package com.navishka;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("blue");
        colors.add("yellow");
        colors.add(1);
        colors.add(new Object());

        System.out.println(colors);

        //Specifying the data type
        List<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("blue");
        colorsTwo.add("yellow");

        System.out.println(colorsTwo);
        System.out.println(colorsTwo.size());
        System.out.println(colorsTwo.contains("blue"));
        System.out.println(colorsTwo.contains("pink"));

        //Printing a List
        //Using an enhanced for loop
        for (String color: colorsTwo) {
            System.out.println(color);
        }

        //Using a for each
        colorsTwo.forEach(System.out::println);

        //Using a for loop
        for (int i = 0; i < colorsTwo.size(); i++) {
            System.out.println(colorsTwo.get(i));
        }
    }
}
