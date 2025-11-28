class Civitas {
    String nama;
    String status;

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void info() {
        System.out.println(nama + " - " + status);
    }
}

public class FakultasTeknik {
    public static void main(String[] args) {

        Civitas dosen = new Civitas("Dr. Budi", "Dosen");
        Civitas mhs   = new Civitas("Adit", "Mahasiswa");
        Civitas staff = new Civitas("Sari", "Staff");

        dosen.info();
        mhs.info();
        staff.info();

        System.out.println("\nSemua adalah bagian dari civitas akademika Fakultas Teknik.");
    }
}