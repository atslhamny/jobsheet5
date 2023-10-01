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

        float total = (uas *0.4F) + (uts*0.3F) +  (kuis*0.1F) + (tugas * 0.2F);

        String msg = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("NILAI AKHIR = " + total + " sehingga " + msg);
    }
}