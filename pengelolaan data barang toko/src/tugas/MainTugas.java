package tugas;

// Nama : Ary
// NPM  : 23xxxxxxx

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Elektronik",
            "Makanan",
            "Minuman"
        };

        System.out.println("===== KATEGORI =====");

        for (String k : kategori) {
            System.out.println(k);
        }

        System.out.println();

        // Membuat gudang
        Gudang gudang = new Gudang();

        // Minimal 5 barang
        gudang.tambahBarang(new Barang("Laptop", 8500000, 5));
        gudang.tambahBarang(new Barang("Mouse", 150000, 20));
        gudang.tambahBarang(new Barang("Keyboard", 250000, 10));
        gudang.tambahBarang(new Barang("Monitor", 2200000, 8));
        gudang.tambahBarang(new Barang("Flashdisk", 80000, 30));

        // Menampilkan barang
        gudang.tampilkanSemua();

        // Menyimpan ke file
        gudang.simpanKeBerkas("barang.txt");

        System.out.println("\n===== MEMUAT DATA =====");

        // Gudang baru
        Gudang gudangBaru = new Gudang();

        // Membaca file
        gudangBaru.muatDariBerkas("barang.txt");

        // Menampilkan isi file
        gudangBaru.tampilkanSemua();

        // Total nilai
        System.out.println("Total Nilai Persediaan : Rp " + gudangBaru.totalNilai());

    }

}