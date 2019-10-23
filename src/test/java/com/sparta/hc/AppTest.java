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
        int x = 10;
        int y = 16;
        BinarySearchTree tree = new BinarySearchTree(12);

        tree.addElement(8);
        tree.addElement(12);
        tree.addElement(11);
        tree.addElement(x);
        tree.addElement(y);

        assertEquals(true, tree.getRootElement() == 12);
    }

    @Test
    public void find()
    {
        int x = 10;
        int y = 16;
        BinarySearchTree tree = new BinarySearchTree(12);

        tree.addElement(8);
        tree.addElement(12);
        tree.addElement(11);
        tree.addElement(x);
        tree.addElement(y);

        assertEquals(true, tree.findElement(1564865));
    }


}
