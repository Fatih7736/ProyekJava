import java.util.Scanner;

public class BilanganGanjil {
    public static void main (String []args) {
        int hitungan, n;

        System.out.println("Deret N Hitungan Ganjil");
        System.out.println("=======================");

        Scanner kbd = new Scanner(System.in);
        System.out.println("N = ");
        n = kbd.nextInt();

        hitungan = 1;
        do { 
            System.out.print((2 * hitungan - 1) + " ");
            hitungan = hitungan + 1;
        } while (hitungan <= n);

        System.out.println();
    }
}