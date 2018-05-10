package com.me;

import java.util.ArrayList;
import java.util.Arrays;

//https://kodejava.org/how-do-i-convert-an-array-into-a-collection-object//
public class Main {

    public static void main(String[] args) {

        ArrayList<String> sample = new ArrayList<String>();
        String[] arrayList = new String[]{"Banana", "Prunes", "Grapes"};
        sample.add("Apple");
        sample.add(0, "Peaches");
        sample.addAll(1, Arrays.asList(arrayList));
        System.out.println("Number of elements = " + sample.size());
        System.out.println("-----------------------------------------");

        for (int index = 0; index < sample.size(); index++) {

            System.out.println(sample.get(index));

            /*
            Number of elements = 6
            Peaches
            Banana
            Prunes
            Grapes
            Apple
             */

        }

    }

}
