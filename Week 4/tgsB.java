/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Root
 */
public class tgsB {

    public static void main(String[] args) {

        System.out.println("Tugas B");
        System.out.println("Nama    : Sella Putri Sari");
        System.out.println("NIM     : E41200603");

        System.out.println("            Bilangan Kelipatan 2 (1-100)");
        System.out.println("====================================================");

        int i;
        i = 1;

        do {
            int x = i * 2;
            if (x < 100) {
                System.out.print(i + " ");
                i++;
            }
            i = x;
        } while (i < 100);

    }
}
