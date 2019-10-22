package com.sparta.hc.manager;


import com.sparta.hc.exceptions.ChildNotFoundException;

/**
 * Created by keith.dauris on 26/06/2017.
 */
public interface BinaryTreeInterface {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}