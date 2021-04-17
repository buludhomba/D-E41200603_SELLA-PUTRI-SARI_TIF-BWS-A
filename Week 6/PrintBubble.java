/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progam;

/**
 *
 * @author Root
 */
public class PrintBubble {
    public static void main(String[] args) {
        int i;
        int Array[] = {100, 45, 74, 65, 14, 6, 4, 36, 47};

        System.out.println("array sebelum Bubble Sort");
        for (i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();

        coba perurutan = new coba();
        perurutan.bubleSort(Array);

        System.out.println("array sesuah bubble sort");
        for (i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
