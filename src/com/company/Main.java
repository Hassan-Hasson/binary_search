package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        // reading inputs object
        Scanner readInput = new Scanner(System.in);

        // getting the ratio value
        System.out.println("please enter the redundancy ratio");
//        double ratio = readInput.nextDouble();

        // BinaryTree object
        BinaryTree binaryTree = new BinaryTree();
        // TODO: is 'N' mean the number of the inputs ??
        int n = 0;
        // variable for storing the input
        String input;

        // inputs should continue till the ind
        // Start getting the inputs
        System.out.println("please enter the first number");
        input = readInput.next();
        String test = input;
        if (input.equals("f")) {
            System.out.println(input);
            System.out.println("its equals f");
        } else {
            System.out.println("لbefore");
        }
        // appending the input to the
//        binaryTree.insert(input);
//
//        Node root = new Node(0);
//        int x = 0;
//
//
//        for (int i = 0; i < ratio; i++) {
//            System.out.println("please enter the number");
//            i = readInput.nextInt();
//            System.out.println("the number" + i);
//            if (BinaryTree.ifNodeExists(root, i)) {
//                System.out.println("yes");
//                n++;
//            } else {
//                x++;
//                n++;
//                binaryTree.insert(i);
//                System.out.println("No");
//
//            }
//
//
//        }
//        binaryTree.preorder(binaryTree.root);


    }
}