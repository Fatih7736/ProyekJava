import java.util.Scanner;

public class JenisKarakter {
    public static void main(String[] args) {

        // Tampilan Awal
        System.out.println("Penentuan Suatu Karakter");
        System.out.println("------------------------");

        char Karakter;

        System.out.println("Karakter = ");
        Scanner kbd = new Scanner(System.in);
        Karakter = kbd.findInLine(".").charAt(0);

        // Proses Logika + Tampilan Akhir
        if(Character.isUpperCase(Karakter)) {
            System.out.println(Karakter + " Adalah Huruf Kapital");
        }
        else if(Character.isLowerCase(Karakter)) {
            System.out.println(Karakter + " Adalah Huruf Kecil");
        }
        else if (Character.isDigit(Karakter)) {
            System.out.println(Karakter + " Adalah Angka");
        }
        else {
            System.out.println(Karakter + " Bukan Angka Maupun Huruf");
        }
    }
}