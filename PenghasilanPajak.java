// Perhitungan Pajak
import java.util.Scanner;

public class PenghasilanPajak {
    public static void main(String[] args) {

        // Tampilan Awal
        System.out.println("Perhitungan Pajak");
        System.out.println("-----------------");

        long penghasilan, pajak;

        Scanner kbd = new Scanner(System.in);
        System.out.println("Penghasilan = ");
        penghasilan = kbd.nextLong();

        // Proses Logika
        if (penghasilan > 500000000) {
            pajak = 2500000 + 15000000 + 87500000 + (penghasilan - 500000000) * 30 / 100;
        }
        else if (penghasilan > 150000000) {
            pajak = 2500000 + 15000000 + (penghasilan - 150000000) * 20 / 100;
        }
        else if (penghasilan > 50000000) {
            pajak = 2500000 + (penghasilan - 50000000) * 10 / 100;
        }
        else {
            pajak = penghasilan * 5 / 100;
        }

        // Tampilan Akhir 
        System.out.println("Pajak = " + pajak);
    }
}