import java.util.Scanner;

public class PemilihanPercobaan3 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukka Angka Pertama: ");
        angka1 = input04.nextInt();
        System.out.println("Masukkan Angka kedua");
        angka2 = input04.nextInt();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input04.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + "+" + angka2 + "=" + hasil);
                // break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + "-" + angka2 + "=" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + "*" + angka2 + "=" + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + ":" + angka2 + "=" + hasil);
                break;
            default:
                break;
        }
    }
}
