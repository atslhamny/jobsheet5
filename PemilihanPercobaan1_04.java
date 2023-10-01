import java.util.Scanner;

public class PemilihanPercobaan1_04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan Angka");
        int angka = input04.nextInt();

        String hasil = (angka % 2 == 0) ? "ANGKA GENAP" : "ANGKA GANJIL";
        System.out.println(hasil);
    }

    public void exp1nomod(){

        // System.out.println("Masukkan Angka ");
        // int angka = input04.nextInt();

        // if (angka % 2 == 0) {
        //     System.out.println("Angka Genap");
        // } else {
        //     System.out.println("Angka Ganjil");
        // }
    }
}
