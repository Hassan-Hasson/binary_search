package com.company;


public class BinaryTree {
    Node root;


    public void insert(int input) {
        Node newNode = new Node(input);
        if (root == null) {
            root = newNode;
        } else {
            // TODO: where is my position
            // root is not null so it have a postion now
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (input < current.value) {
                    current = current.leftNode;
                    if (current == null) {
                        parent.leftNode = newNode;
                        return;
                    }
                } else {
                    current = current.rightNode;
                    if (current == null) {
                        parent.rightNode = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value + "");
        preorder(root.leftNode);
        preorder(root.rightNode);

    }

    static boolean ifNodeExists(Node node, int key) {
        if (node == null)
            return false;

        if (node.value == key)
            return true;

        boolean res1 = ifNodeExists(node.leftNode, key);
        if (res1) return true;

        boolean res2 = ifNodeExists(node.rightNode, key);

        return res2;
    }


}