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
public class Search {
    public void Search(int[] nilai, int cari) {
        int index = -1;
        int nilaiArray = nilai.length;
        int i;

        for (i = 0; i < nilaiArray; i++) {
            if (nilai[i] == cari){
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("array yg anda cari tidak ada");
        }else{
            System.out.println("nilai array yg anda cari adalah index ke = " + index + " dari nilai array");
        }
    }

}
