package tugas;

public class Barang {
    private final String nama;
    private final double harga;
    private final int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Untuk disimpan ke file
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    // Menampilkan informasi
    public void info() {
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp " + harga);
        System.out.println("Stok  : " + stok);
        System.out.println("----------------------");
    }
}