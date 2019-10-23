package com.sparta.hc.manager;

public class Node {

    private final int data;
    private Node left;
    private Node right;


    public Node(int number){
        data = number;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
