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

public class tgsC {

    public static void main(String[] args) {

        int jumlah, min = 0, max = 0, rata = 0, data[];

        int hasilRataRata;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya data nilai : ");
        jumlah = input.nextInt();

        data = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan data nilai ke " + (i + 1) + " : ");
            data[i] = input.nextInt();
        }

        hitungMax(jumlah, data, max);
        hitungMin(jumlah, data, min);
        hitungRataRata(jumlah, data, rata);

    }

    static void hitungMax(int jumlah, int[] data, int max) {
        max = data[0];

        for (int i = 0; i < jumlah; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Nilai maximal adalah : " + max);
    }

    static void hitungMin(int jumlah, int[] data, int min) {
        min = data[0];

        for (int i = 0; i < jumlah; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println("Nilai minimal adalah : " + min);
    }

    static void hitungRataRata(int jumlah, int[] data, int rata) {
        for (int i = 0; i < jumlah; i++) {
            rata = rata + data[i];
        }
        int rataRata = rata / jumlah;
        System.out.println("Nilai rata-rata adalah : " + rataRata);
    }

}
       
  

