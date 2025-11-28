import java.util.Scanner;

class Mahasiswa {
    String nama;
    String npm;
    String kelas;

    Mahasiswa(String nama, String npm, String kelas) {
        this.nama  = nama;
        this.npm   = npm;
        this.kelas = kelas;
    }

    void tampil() {
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama  : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = sc.nextLine();

        System.out.print("Masukkan kelas : ");
        String kelas = sc.nextLine();

        Mahasiswa m = new Mahasiswa(nama, npm, kelas);
        m.tampil();
    }
}