import java.util.Scanner;

public class TabungKerucut26 {

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }

    static double luasPermukaanTabung(double r, double t) {
        return 2 * luasLingkaran(r) + 2 * Math.PI * r * t;
    }

    static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU BANGUN RUANG (TABUNG & KERUCUT) =====");
            System.out.println("1. Hitung Luas Lingkaran");
            System.out.println("2. Hitung Volume Tabung");
            System.out.println("3. Hitung Luas Permukaan Tabung");
            System.out.println("4. Hitung Volume Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                System.out.println("Luas Lingkaran = " + luasLingkaran(r));
            } else if (pilihan == 2) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double t = sc.nextDouble();
                System.out.println("Volume Tabung = " + volumeTabung(r, t));
            } else if (pilihan == 3) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double t = sc.nextDouble();
                System.out.println("Luas Permukaan Tabung = " + luasPermukaanTabung(r, t));
            } else if (pilihan == 4) {
                System.out.print("Masukkan jari-jari (r): ");
                double r = sc.nextDouble();
                System.out.print("Masukkan tinggi (t): ");
                double t = sc.nextDouble();
                System.out.println("Volume Kerucut = " + volumeKerucut(r, t));
            } else if (pilihan == 0) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}