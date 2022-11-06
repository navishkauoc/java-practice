package com.navishka;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

    }
}
