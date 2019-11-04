package com.sparta.hc.manager;

import com.sparta.hc.exceptions.ChildNotFoundException;

public class BinarySearchTree implements BinaryTree {

    private Node root;
    private int indexCount = 0;
    private int indexCount2 = 0;
    private int arrayIndex = 1;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public BinarySearchTree(final int[] value) {
        root = new Node(value[0]);
        for (int i = 1; i < value.length; i++) {
            addElement(value[i]);
        }
    }

    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return arrayIndex;
    }

    @Override
    public void addElement(int element) {
        boolean runs = true;
        Node node = root;

        while (runs) {
            if (element < node.getValue()) {
                if (node.getLeft() == null) {
                    node.setLeft(new Node(element));
                    runs = false;
                    arrayIndex++;
                } else {
                    node = node.getLeft();
                }
            }
            else {
                if (node.getRight() == null) {
                    node.setRight(new Node(element));
                    runs= false;
                    arrayIndex++;
                } else {
                    node = node.getRight();
                }
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i : elements) {
            addElement(i);
        }
    }

    @Override
    public boolean findElement(int value) {
        boolean found = false;
        Node node = root;
        while (node!=null) {
            if (value == node.getValue()) {
                found = true;
            }
            else if (value < node.getValue()) {
                node =node.getLeft();
            } else {
                node = node.getRight();
                found = true;
            }
        }
        return found;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node leftChildNode = root;
        int leftElement=0;
        if(findElement(element)){
            leftChildNode = leftChildNode.getLeft();
            leftElement = leftChildNode.getValue();
        }
        return leftElement;
    }
    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node rightChildNode = root;
        int rightElement=0;
        if(findElement(element)){
            rightChildNode = rightChildNode.getRight();
            rightElement = rightChildNode.getValue();
        }
        return rightElement;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedArray =  new int [getNumberOfElements()];
        return arrayHelperAsc(root, sortedArray);
    }
    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray =  new int [getNumberOfElements()];
        return arrayHelperDsc(root, sortedArray);
    }

    //helper class
    private int[] arrayHelperAsc(Node node , int[] array){

        if (node == null){
            return array;
        }
        else {
            arrayHelperAsc(node.getLeft(), array);
            array[indexCount] = node.getValue();
            indexCount++;
            arrayHelperAsc(node.getRight(), array);
        }
        return array;
    }
    private int[] arrayHelperDsc(Node node , int[]array){
        if (node == null){
            return array;
        }

        arrayHelperDsc(node.getRight(),array);
        array[indexCount2++] = node.getValue();
        arrayHelperDsc(node.getLeft(),array);
        return array;
    }
}

