package com.sparta.hc.manager;

import java.util.Random;

public class BinaryTreeManager {

    private int[] createArray(int size) {
        Random random = new Random();
        int[] unsortedArray = new int[size];
        for (int i = 0; i < size; i++){
            unsortedArray[i] = random.nextInt(size*10)+1;
        }
        return unsortedArray;
    }
}
