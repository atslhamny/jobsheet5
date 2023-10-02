/**
 * jobsheet5exp
 */
import java.util.Scanner;
public class PemilihanPercobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nilai Uas   : ");
        float uas = sc.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = sc.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = sc.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = sc.nextFloat();

        float nilai = (uas *0.4F) + (uts*0.3F) +  (kuis*0.1F) + (tugas * 0.2F);

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else if (nilai < 50) {
            System.out.println("Anda mendapatkan nilai: D (Kurang)");
        } else if (nilai < 60) {
            System.out.println("Anda mendapatkan nilai: C (Cukup)");
        } else if (nilai < 65) {
            System.out.println("Anda mendapatkan nilai: C+ (Lebih dari Cukup)");
        } else if (nilai < 73) {
            System.out.println("Anda mendapatkan nilai: B (Baik)");
        } else if (nilai < 80) {
            System.out.println("Anda mendapatkan nilai: B+ (Lebih dari Baik)");
        } else if (nilai < 100) {
            System.out.println("Anda mendapatkan nilai: A (Sangat Baik)");
        } else {
            System.out.println("Anda mendapatkan nilai: E (Gagal)");
        }
        String msg = nilai < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("NILAI AKHIR = " + nilai + " sehingga " + msg);
    }

    static void pcb2nomod(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nilai Uas   : ");
        float uas = sc.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = sc.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = sc.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = sc.nextFloat();

        float total = (uas *0.4F) + (uts*0.3F) +  (kuis*0.1F) + (tugas * 0.2F);

        String msg = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("NILAI AKHIR = " + total + " sehingga " + msg);
    }
}