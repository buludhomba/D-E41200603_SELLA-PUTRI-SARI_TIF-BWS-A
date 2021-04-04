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

public class tgsA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bilAwal, bilAkhir;

        System.out.println("Tugas A");
        System.out.println("Nama    : Sella Putri Sari");
        System.out.println("NIM     : E41200603");
        System.out.println("MENAMPILKAN DERET BILANGAN GENAP DARI KECIL KE BESAR");
        System.out.println("*--------------------------------------------------*");

        System.out.print("Masukan Bilangan Awal : ");
        bilAwal = input.nextInt();
        System.out.print("Masukan Bilangan Akhir : ");
        bilAkhir = input.nextInt();
        System.out.println("--------------------------- ");

        System.out.println("Deret Bilangan Genap");
        for (int i = bilAwal; i <= bilAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
