import java.util.Scanner;

public class TebakTanggal {

    static int hitungKode(int bulan, int tanggal) {
        return Integer.parseInt(bulan + "" + tanggal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan lahir (1–12): ");
        int b = sc.nextInt();

        System.out.print("Masukkan tanggal lahir (1–31): ");
        int t = sc.nextInt();

        System.out.println("Hasil akhir = " + hitungKode(b, t));
    }
}