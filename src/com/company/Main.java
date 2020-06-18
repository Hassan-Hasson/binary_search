package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // reading inputs object
        Scanner readInput = new Scanner(System.in);

        // getting the ratio value
        System.out.println("Enter the redundancy ratio please.");
        double ratio = 0;
        do {
            try {
                ratio = Double.parseDouble(readInput.nextLine());
                if (ratio <= 1) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Enter valid number greater than 1 please.");
                ratio = 0; // reset value
            }
        } while (ratio == 0);

        // BinaryTree object
        BinaryTree binaryTree = new BinaryTree();

        // total number of the input
        int totalNumbers = 0;

        // boolean to tell the loop  to continue or not
        boolean shouldRun = true;
        do {
            try {
                System.out.println("Enter number No." + (totalNumbers + 1) + " please.");
                int newNumber = Integer.parseInt(readInput.nextLine());
                if (newNumber == -1) {
                    // stop looping if asked ( by saying -1).
                    shouldRun = false;
                    break;
                } else if (newNumber <= 0) {
                    // invalid number if not (-1) or positive number
                    throw new NumberFormatException();
                }

                // everything is okay. adding to the tree.
                totalNumbers++;
                binaryTree.insert(newNumber);
                if (binaryTree.getRatio(totalNumbers) == ratio) {
                    shouldRun = false;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("enter valid number greater than 1 please.");
            }
        } while (shouldRun);

        // program finished. should print all data the terminate
        System.out.println("ratio =" + totalNumbers + "/" + binaryTree.getNodesCount() + "=" + binaryTree.getRatio(totalNumbers));
        if (binaryTree.getRatio(totalNumbers) == ratio) {
            System.out.println("many reps");
        } else {
            System.out.println("few reps");
        }
    }
}