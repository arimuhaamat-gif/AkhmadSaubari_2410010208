package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // =============================================
        // Poin 4: Array nama mata kuliah (minimal 3)
        // =============================================
        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Struktur Data",
            "Basis Data",
            "Algoritma dan Pemrograman",
            "Jaringan Komputer"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // =============================================
        // Poin 1-3: Membuat objek KelasKuliah dan
        // menambahkan minimal 5 objek Mahasiswa
        // =============================================
        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra",    "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Raharjo",    "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",      "2301003", 90.5));
        kelas.tambahMahasiswa(new Mahasiswa("Doni Firmansyah", "2301004", 47.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri",       "2301005", 72.0));

        kelas.tampilkanSemua();
        System.out.println();

        // =============================================
        // Poin 5: Menampilkan rata-rata dan jumlah lulus
        // =============================================
        System.out.printf("Rata-rata Nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus() + " mahasiswa");
        System.out.println();

        // =============================================
        // Poin 6: Menambahkan 1 mahasiswa baru,
        // lalu tampilkan jumlah data terbaru
        // =============================================
        System.out.println(">> Menambahkan mahasiswa baru: Fajar Nugroho (nilai: 68.0)");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Nugroho", "2301006", 68.0));

        System.out.println();
        kelas.tampilkanSemua();
        System.out.println();
        System.out.printf("Rata-rata Nilai (terbaru) : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    (terbaru) : " + kelas.jumlahLulus() + " mahasiswa");
    }
}