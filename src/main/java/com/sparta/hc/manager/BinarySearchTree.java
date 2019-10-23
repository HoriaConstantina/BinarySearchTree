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
        boolean runs = true;

        while (runs) {
            if (element < x.getData()){
                if (x.getLeft() == null){
                    x.setLeft(node);
                }
                else {
                    x = x.getLeft();
                }
//                runs = false;
            }

            else {
                if (x.getRight() == null){
                    x.setRight(node);
                }
                else {
                    x = x.getRight();
                }
                runs = false;
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i : elements){
            addElement(i);
        }
    }

    @Override
    public boolean findElement(int value) {
        boolean found = false;
        Node node = root;

        while (node != null){

        }

        return found;

    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return element;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return element;
    }

    @Override
    public int[] getSortedTreeAsc() {
        Node node = root;
        Node left;
        Node right;

        if (node != null){
            left = node.getLeft();
            root.getData();
            right = node.getRight();

            System.out.println(left + ", " + root.getData() + ", "+ right);
        }

        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
