import java.util.Scanner;

public class RekapLaundry26 {

    static Scanner input = new Scanner(System.in);

    static String[] namaLayanan = {
        "Cuci Kering", "Cuci Setrika",
        "Setrika Saja", "Express"
    };

    static int[] harga = {6000, 8000, 5000, 12000};

    static String[] hari = {
        "Senin", "Selasa", "Rabu",
        "Kamis", "Jumat", "Sabtu"
    };

    static void inputData(int[][] data) {
        for (int i = 0; i < namaLayanan.length; i++) {
            System.out.println("\n" + namaLayanan[i]);

            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat hari " + hari[j] + " (kg): ");
                data[i][j] = input.nextInt();
            }
        }
    }

    static void tampilkanData(int[][] data) {
        System.out.println("\n========== REKAP DATA LAUNDRY ==========");
        System.out.printf("%-15s %-12s", "Layanan", "Harga/kg");

        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%-10s", hari[j]);
        }
        System.out.println();

        for (int i = 0; i < namaLayanan.length; i++) {
            System.out.printf("%-15s Rp%-10d",
                    namaLayanan[i], harga[i]);

            for (int j = 0; j < hari.length; j++) {
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;

        for (int j = 0; j < hari.length; j++) {
            total += data[idxLayanan][j];
        }

        return total;
    }

    static void layananTertinggi(int[][] data) {
        int max = 0;
        int indeks = 0;

        for (int i = 0; i < namaLayanan.length; i++) {
            int total = totalPerLayanan(data, i);

            if (total > max) {
                max = total;
                indeks = i;
            }
        }

        System.out.println("\nLayanan dengan berat tertinggi:");
        System.out.println(namaLayanan[indeks]);
        System.out.println("Total: " + max + " kg");
    }

    static int hariTersibuk(int[][] data) {
        int max = 0;
        int indeksHari = 0;

        for (int j = 0; j < hari.length; j++) {
            int total = 0;

            for (int i = 0; i < namaLayanan.length; i++) {
                total += data[i][j];
            }

            if (total > max) {
                max = total;
                indeksHari = j;
            }
        }

        return indeksHari;
    }

    static void hitungPendapatan(int[][] data) {
        int totalPendapatan = 0;

        System.out.println("\n========== PENDAPATAN LAUNDRY ==========");

        for (int i = 0; i < namaLayanan.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];

            System.out.println(namaLayanan[i] + " : Rp" + pendapatan);

            totalPendapatan += pendapatan;
        }

        System.out.println("----------------------------------------");
        System.out.println("Total pendapatan 6 hari: Rp" + totalPendapatan);
    }

    public static void main(String[] args) {

        int[][] data = new int[4][6];

        inputData(data);

        tampilkanData(data);

        layananTertinggi(data);

        int indeks = hariTersibuk(data);

        System.out.println("\nHari paling sibuk: " + hari[indeks]);

        hitungPendapatan(data);
    }
}