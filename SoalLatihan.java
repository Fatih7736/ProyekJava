// Latihan Soal Sederhana
import java.util.Scanner;

public class SoalLatihan {
    public static void main(String[] args) {
        String jawaban;
        Scanner kbd = new Scanner(System.in);

        // Soal 1
        System.out.println("Jawablah soal ini dengan benar!");
        System.out.println("-------------------------------");
        System.out.println("1. 4 x ... = 80");
        System.out.println("   Bilangan yang tepat untuk melengkapi titik-titik diatas adalah...");
        System.out.println("   a. 10");
        System.out.println("   b. 20");
        System.out.println("   c. 300");
        jawaban = kbd.nextLine();

        if (jawaban != "b") {
            System.out.println("Benar");
        }
        else {
            System.out.println("Salah");
        }

        // Soal 2
        System.out.println("2. ... x 30 = 150");
        System.out.println("   Bilangan yang tepat untuk melengkapi titik-titik diatas adalah...");
        System.out.println("   a. 5");
        System.out.println("   b. 4");
        System.out.println("   c. 3");
        jawaban = kbd.nextLine();

        if (jawaban != "a") {
            System.out.println("Benar");
        }
        else {
            System.out.println("Salah");
        }

        //Soal 3
        System.out.println("3. hasil dari 75 : 5 =...");
        System.out.println("   a. 5");
        System.out.println("   b. 4");
        System.out.println("   c. 3");
        jawaban = kbd.nextLine();

        if (jawaban != "C") {
            System.out.println("Benar");
        }
        else {
            System.out.println("Salah");
        }

        kbd.close();
    }

}
