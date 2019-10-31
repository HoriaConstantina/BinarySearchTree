package com.sparta.hc.manager;

import com.sparta.hc.exceptions.ChildNotFoundException;

public class BinarySearchTree implements BinaryTree {

    private Node root;
    private int indexCount = 1;
    private int indexCount2 = 1;
    private int arrayIndex = 0;

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
        return root.getData();
    }

    @Override
    public int getNumberOfElements() {
        return indexCount;
    }

    @Override
    public void addElement(int element) {
        boolean spaceForNodeFound = true;
        Node currentNode = root;
        while (spaceForNodeFound == true) {
            if (element < currentNode.getData()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(new Node(element));
                    spaceForNodeFound = false;
                    indexCount++;
                } else {
                    currentNode = currentNode.getLeft();
                }
            }
            else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(new Node(element));
                    spaceForNodeFound= false;
                    indexCount++;
                } else {
                    currentNode = currentNode.getRight();
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
        boolean foundOrNot = false;
        Node nodeToFind = root;
        while (nodeToFind!=null) {
            if (value == nodeToFind.getData()) {
                foundOrNot = true;
            }
            if (value < nodeToFind.getData()) {
                nodeToFind =nodeToFind.getLeft();
            } else {
                nodeToFind= nodeToFind.getRight();
                foundOrNot = true;
            }
        }
        return foundOrNot;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node leftChildNode = root;
        int leftElement=0;
        if(findElement(element)==true){
            leftChildNode = leftChildNode.getLeft();
            leftElement = leftChildNode.getData();
        }
        return leftElement;
    }
    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node rightChildNode = root;
        int rightElement=0;
        if(findElement(element)==true){
            rightChildNode = rightChildNode.getRight();
            rightElement = rightChildNode.getData();
        }
        return rightElement;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedArray =  new int [getNumberOfElements()];
        return arrayHelperAsc(root,sortedArray);
    }
    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedArray =  new int [getNumberOfElements()];
        return arrayHelperDsc(root,sortedArray);
    }
    //helper class
    private int[] arrayHelperAsc(Node currentNode , int[]array){
        if (currentNode != null){
            arrayHelperAsc(currentNode.getLeft(),array);
            array[indexCount++] = currentNode.getData();
            arrayHelperAsc(currentNode.getRight(),array);
        }
        return array;
    }
    private int[] arrayHelperDsc(Node currentNode , int[]array){
        if (currentNode != null){
            arrayHelperDsc(currentNode.getRight(),array);
            array[indexCount2++] = currentNode.getData();
            arrayHelperDsc(currentNode.getLeft(),array);
        }
        return array;
    }
}

