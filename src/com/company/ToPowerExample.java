package com.company;

import java.util.Arrays;

public class ToPowerExample {
    public static void toPower(int size, int power) {

        //creating a new array of ints, the size will be = size
        //[0,1,2,3]
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {

            newArray[i] = 1;

            for (int j = 0; j < power; j++) {

                newArray[i] *= i;

                System.out.println(newArray[i]);
            }
        }

        System.out.println(Arrays.toString(newArray));

    }
}
