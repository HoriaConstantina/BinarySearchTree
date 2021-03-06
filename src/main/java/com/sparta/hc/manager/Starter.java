package com.sparta.hc.manager;

import java.util.Arrays;

public class Starter
{
    public static void main( String[] args )
    {
        int[] array = {8, 10, 11, 12, 16};
        BinarySearchTree tree = new BinarySearchTree(12);
        tree.addElement(8);
        tree.addElement(10);
        tree.addElement(11);
        tree.addElement(14);
        tree.addElement(16);
        System.out.println("Ascending: " + Arrays.toString(tree.getSortedTreeAsc()));
        System.out.println("Descending: " + Arrays.toString(tree.getSortedTreeDesc()));
    }
}
