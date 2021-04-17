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
public class coba {
     public static void bubleSort(int[] array) {

        int nilai = array.length;
        int i, j, swap;

        for (i = 0; i < nilai; i++) {
            for (j = 0; j < (nilai - 1); j++) {
                if (array[j] > array[j + 1]) {
                    //proses pertukaran
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
}
