package com.company;


class BinaryTree {
    Node root;

    int getNodesCount() {
        return getCount(root);
    }

    private int getCount(Node node) {
        if (node == null)
            return 0;
        if (node.leftNode == null && node.rightNode == null)
            return 1;
        else
            return 1 + getCount(node.leftNode) + getCount(node.rightNode);
    }

    double getRatio(int totalNumbers) {
        return (totalNumbers * 1.0) / (this.getCount(root));
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.leftNode = addRecursive(current.leftNode, value);
        } else if (value > current.value) {
            current.rightNode = addRecursive(current.rightNode, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    void insert(int input) {
        this.root = addRecursive(root, input);
    }
}