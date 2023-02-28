package com.codecool.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List numbers = new ArrayList<>(){{
            add(0);
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};

        for (int i = 5; i < numbers.size(); i++) {
            numbers.remove(i);
        }

        System.out.println(numbers);
    }
}

