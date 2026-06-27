package tugas;

import java.util.ArrayList;
import java.io.*;

public class Gudang {

    private final ArrayList<Barang> daftarBarang;

    public Gudang() {
        daftarBarang = new ArrayList<>();
    }

    // Menambah barang
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Menampilkan semua barang
    public void tampilkanSemua() {
        System.out.println("===== DAFTAR BARANG =====");

        for (Barang b : daftarBarang) {
            b.info();
        }
    }

    // Menyimpan ke file
    public void simpanKeBerkas(String namaFile) {
        try {
            PrintWriter tulis = new PrintWriter(new FileWriter(namaFile));

            for (Barang b : daftarBarang) {
                tulis.println(b.keBaris());
            }

            tulis.close();

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan.");
        }
    }

    // Memuat dari file
    public void muatDariBerkas(String namaFile) {

        daftarBarang.clear();

        try {
            BufferedReader baca = new BufferedReader(new FileReader(namaFile));

            String baris;

            while ((baris = baca.readLine()) != null) {

                String[] data = baris.split(",");

                String nama = data[0];
                double harga = Double.parseDouble(data[1]);
                int stok = Integer.parseInt(data[2]);

                tambahBarang(new Barang(nama, harga, stok));
            }

            baca.close();

        } catch (IOException e) {
            System.out.println("Gagal membaca file.");
        }
    }

    // Menghitung total nilai persediaan
    public double totalNilai() {

        double total = 0;

        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}