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
import java.util.Scanner;
public class PrintSearch {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiArray = {2, 4, 5, 6, 9, 8, 7, 5, 0, 1};
        int cariArray;

        System.out.print("masukkan nilai Array = ");
        cariArray = input.nextInt();

        Search searching = new Search();
        searching.Search(nilaiArray, cariArray);
    }
}
