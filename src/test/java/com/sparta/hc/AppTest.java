package com.sparta.hc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.sparta.hc.exceptions.ChildNotFoundException;
import com.sparta.hc.manager.BinarySearchTree;
import com.sparta.hc.manager.Node;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int x = 12;
        BinarySearchTree tree = new BinarySearchTree(12);
        Node node = new Node(12);
        tree.addElement(8);
        tree.addElement(12);
        tree.addElement(11);
        tree.addElement(10);
        tree.addElement(16);



    }
}
