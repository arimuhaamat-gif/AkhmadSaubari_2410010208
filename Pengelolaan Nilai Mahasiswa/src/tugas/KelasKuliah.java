package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    /**
     *
     */
    public ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                lulus++;
            }
        }
        return lulus;
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Mahasiswa ===");
        System.out.printf("%-5s %-20s %-15s %-8s %-10s%n",
                "No", "Nama", "NPM", "Nilai", "Status");
        System.out.println("-".repeat(65));
        int no = 1;
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.printf("%-5d %-20s %-15s %-8.2f %-10s%n",
                    no++,
                    m.getNama(),
                    m.getNpm(),
                    m.getNilai(),
                    m.lulus() ? "Lulus" : "Tidak Lulus");
        }
        System.out.println("-".repeat(65));
        System.out.println("Total mahasiswa: " + daftarMahasiswa.size());
    }
}