class Mobil {
    String merk;
    int tahun;

    void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

public class MainMobil{
    public static void main(String[] args) {
        Mobil m1 = new Mobil();  // objek
        m1.merk = "Toyota";
        m1.tahun = 2020;

        m1.info();
    }
}
