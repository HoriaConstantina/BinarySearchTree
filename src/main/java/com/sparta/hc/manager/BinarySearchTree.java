package com.sparta.hc.manager;

import com.sparta.hc.exceptions.ChildNotFoundException;

public class BinarySearchTree implements BinaryTree {

    private Node root;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }


    @Override
    public int getRootElement() {
        return root.getData();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        Node node = new Node(element);
        Node x = root;
        Node y = null;

        while (x != null) {
            y = x;
            if (element < x.getData()) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }


            if (y == null) {
                y = node;
            } else if (element < y.getData()) {
                y.setLeft(node);
            } else {
                y.setRight(node);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        boolean found = false;
        Node node = new Node(value);

        if (node.equals(value)){
            found = true;
        }
        else {
            found = false;
        }

        return found;
    }

    @Override
    public Node getLeftChild(int element) throws ChildNotFoundException {
        Node node = new Node(element);
        node = node.getLeft();
        return node;
    }

    @Override
    public Node getRightChild(int element) throws ChildNotFoundException {
        Node node = new Node(element);
        node = node.getRight();
        return node;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
