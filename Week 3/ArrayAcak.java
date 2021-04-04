/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
import java.util.Scanner;

public class ArrayAcak {

    public static void main (String[] args) {

        System.out.println("Tugas B");
        System.out.println();
        System.out.println("Inputkan berapa banyak random angka : ");

        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        int[] array = new int[jumlah];

        for (int i = 0; i < array.length; i++){
        
        array[i] = (int) (Math.random() * 45);
        System.out.println(array[i]);
        
        }
      
      
        }
    }


