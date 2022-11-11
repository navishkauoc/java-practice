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
    }
}
