package com.example;

public class Main {
    public static void main(String[] args) {
        Tree bst = new Tree();


        // Menambahkan 10 angka acak ke dalam tree
        System.out.println("Angka-angka yang dimasukkan ke dalam Tree:");
        bst.add('5'); 
        bst.add('3');
        bst.add('7');
        // bst.add('2');
        bst.add('4');
        bst.add('6');
        bst.add('8');
        bst.add('9');
        bst.add('1');
        bst.add('0');
        System.out.println("\n");
        bst.printTreePretty();

        bst.remove('2');
       

        bst.printTreePretty();
        // Inorder traversal dan waktu eksekusinya
        long startInorder = System.nanoTime();
        bst.inorder();
        long endInorder = System.nanoTime();
        double timeInorder = (endInorder - startInorder) / 1_000_000_000.0;
        System.out.println("Waktu eksekusi inorder traversal: " + timeInorder + " detik\n");

        // Preorder traversal dan waktu eksekusinya
        long startPreorder = System.nanoTime();
        bst.preorder();
        long endPreorder = System.nanoTime();
        double timePreorder = (endPreorder - startPreorder) / 1_000_000_000.0;
        System.out.println("Waktu eksekusi preorder traversal: " + timePreorder + " detik\n");

        // Postorder traversal dan waktu eksekusinya
        long startPostorder = System.nanoTime();
        bst.postorder();
        long endPostorder = System.nanoTime();
        double timePostorder = (endPostorder - startPostorder) / 1_000_000_000.0;
        System.out.println("Waktu eksekusi postorder traversal: " + timePostorder + " detik");
    }
}
