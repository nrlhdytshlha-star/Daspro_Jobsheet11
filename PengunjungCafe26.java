public class PengunjungCafe26 {

    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Nomor Meja: " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama: namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung(5, "Ali", "Budi", "Citra");
    }
}
