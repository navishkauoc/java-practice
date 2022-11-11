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

        List<String> colorsTwo = new ArrayList<>();
        colorsTwo.add("blue");
        colorsTwo.add("yellow");

        System.out.println(colorsTwo);
    }
}
