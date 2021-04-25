/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televisiprog;

/**
 *
 * @author Root
 */
public class TelevisiModern extends Televisi { // class turunan dari class televisi
     public static final int TV = 0;
     // fisilitas teletext
     public static final int TELETEXT = 1;
     int modusTampilan = TV;
     int halamanTeletext = 100;
     String disTray = null;
    private String discTray;
     public TelevisiModern(String deskripsi, int jumlahChannel) {
     super(deskripsi, jumlahChannel);
     }
     public void setHalamanTeletext(int halamanTeletext) {
     this.halamanTeletext = halamanTeletext;
     System.out.println("Berpindah ke halaman teletext " +
                                           halamanTeletext);
     }
     public void setModusTampilan(int modusTampilan){
     switch (modusTampilan) {
         case TV:
             System.out.println("Modus tampilan : Televisi");
             break;
         case TELETEXT:
             System.out.println("Modus tampilan : teletext");
             break;    
     }
     } // fisilitas teletext
     
     //cd player built in yang dapat digunakan untuk memutar VCD
     public void setDiscTray(String discTray) {
     this.discTray = discTray;
     }
     public void playCD() {
     if (discTray == null) {
         System.out.println("Tidak ada CD di dalam disc tray!");
         return;
     }
         System.out.println("Memutar file " + discTray);
     }
     // cd player built in yang dapat digunakan untuk memutar VCD
}
