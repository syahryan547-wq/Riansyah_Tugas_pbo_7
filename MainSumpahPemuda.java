class SumpahPemuda {
    SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia");
    }

    void lanjut() {
        System.out.println("1. Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("2. Mengaku berbangsa yang satu, bangsa Indonesia.");
        System.out.println("3. Menjunjung bahasa persatuan, bahasa Indonesia.");
    }
}

public class MainSumpahPemuda {
    public static void main(String[] args) {
        SumpahPemuda sp = new SumpahPemuda();
        sp.lanjut();
    }
}