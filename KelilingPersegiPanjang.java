import java.util.Scanner;

public class KelilingPersegiPanjang {

    static int hitungKeliling(int p, int l) {
        return 2 * (p + l);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar  : ");
        int l = input.nextInt();

        System.out.println("Kelilingnya adalah: " + hitungKeliling(p, l));
    }
}