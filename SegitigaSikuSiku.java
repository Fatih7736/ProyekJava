// Penentuan Segitiga Siku-Siku
import java.util.Scanner;

public class SegitigaSikuSiku {
    public static void main(String []args){
        double a, b, c;

        // Tampilan Awal
        System.out.println("Masukkan Tiga Nilai Sisi Segitiga");
        System.out.println("---------------------------------");

        Scanner kbd = new Scanner(System.in);

        // Input
        System.out.println("Sisi 1 = ");
        a = kbd.nextDouble();

        System.out.println("Sisi 2 = ");
        b = kbd.nextDouble();

        System.out.println("Sisi 3 = ");
        c = kbd.nextDouble();

        // Proses Logika
        boolean SegitigaSikuSiku = false;
        double toleransi = 0.00001;

        double JumlahKuadrat = a * a + b * b;
        double cKuadrat = c * c;
        if (JumlahKuadrat >= cKuadrat - toleransi && JumlahKuadrat <= cKuadrat + toleransi)
        SegitigaSikuSiku = true;

        else {
            JumlahKuadrat = a * a + b * b;
            double bKuadrat = b * b;
            if (JumlahKuadrat >= bKuadrat - toleransi && JumlahKuadrat <= bKuadrat + toleransi)
            SegitigaSikuSiku = true;
            else {
                JumlahKuadrat = b * b + c * c;
                double aKuadrat = a * a;
                if (JumlahKuadrat >= aKuadrat - toleransi && JumlahKuadrat <= aKuadrat + toleransi)
                SegitigaSikuSiku = true;
            }
        }

        // Tampilan Akhir
        if (SegitigaSikuSiku){
            System.out.println(" Segitiga Siku-Siku");
        }
        else {
            System.out.println("Bukan Segitiga Siku-Siku");
        }
    }
}