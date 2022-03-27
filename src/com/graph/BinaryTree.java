package com.graph;


public class BinaryTree {
    NodeTree root;

    public BinaryTree(NodeTree root) {
        this.root = root;
    }

    public void addNode(NodeTree newNode, NodeTree rootExplore) {
        if (rootExplore == null)
            return;
        if (newNode.value > rootExplore.value) {
            if (rootExplore.right == null)
                rootExplore.right = newNode;
            else
                addNode(newNode, rootExplore.right);

            if (rootExplore.left == null)
                rootExplore.left = newNode;
            else
                addNode(newNode, rootExplore.left);

        }
    }

    public void searchNode(int value, NodeTree rootExplore) {
        if (rootExplore == null) {
            System.out.println("The value " + value + " is NOT found");
            return;
        }
        if (rootExplore.value == value) {
            System.out.println("The value " + value + " is found");
            return;
        }
        if (value > rootExplore.value) {
            searchNode(value, rootExplore.right);
        }
        if (value < rootExplore.value) {
            searchNode(value, rootExplore.left);
        }
    }


}
