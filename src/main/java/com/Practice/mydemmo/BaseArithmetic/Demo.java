package com.Practice.mydemmo.BaseArithmetic;

import org.junit.jupiter.api.Test;

public class Demo {
    @Test
    public void testTraverseBinaryTree(){
        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.setValue(1);
        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.setValue(2);
        BinaryTree binaryTree3 = new BinaryTree();
        binaryTree3.setValue(3);
        binaryTree1.setLeftChild(binaryTree2);
        binaryTree1.setRightChild(binaryTree3);

        BinaryTree.traverseBinaryTree(binaryTree1);
    }
}
