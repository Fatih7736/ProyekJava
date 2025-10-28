import java.util.Scanner;

public class BesarPembelian {
    public static void main(String[] args) {
        System.out.println("Penentuan Diskon (Diskon 20%, minimal pembelanjaan 200.000Rp)");
        System.out.println("----------------");

        long besarpembelian, besarpembayaran, diskon;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Nilai Pembelian = ");
        besarpembelian = kbd.nextLong();

        diskon = 0;
        if (besarpembelian >= 200000)
            diskon = (long) (0.2 * besarpembelian);
        
        besarpembayaran = besarpembelian - diskon;

        System.out.println();
        System.out.println("Pembelian  = " + besarpembelian);
        System.out.println("Diskon     = " + diskon);
        System.out.println("Pembayaran = " + besarpembayaran);


        
    }
}