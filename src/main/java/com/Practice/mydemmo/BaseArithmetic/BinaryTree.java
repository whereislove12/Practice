package com.Practice.mydemmo.BaseArithmetic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTree {
    private Object value;
    private BinaryTree leftChild;
    private BinaryTree rightChild;

    public static void traverseBinaryTree(BinaryTree tree){
        System.out.print(tree.value+" ");
        if (null != tree.leftChild){
            traverseBinaryTree(tree.leftChild);
        }
        if (null != tree.rightChild){
            traverseBinaryTree(tree.rightChild);
        }
    }
}
