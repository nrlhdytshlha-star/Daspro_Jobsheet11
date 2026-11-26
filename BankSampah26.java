import java.util.Scanner;

public class BankSampah26 {

    static double[] inputSetoran(int n, Scanner sc) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n=== DATA SETORAN NASABAH ===");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;
        for (double s : setoran) {
            total += s;
        }
        return total;
    }

    static double hitungSaldo(double beratSetoran, double hargaPerKg) {
        return beratSetoran * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int idxMax = 0;
        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[idxMax]) {
                idxMax = i;
            }
        }
        return idxMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double HARGA_PER_KG = 3000.0;

        System.out.print("Masukkan jumlah nasabah (N): ");
        int n = sc.nextInt();

        double[] dataSetoran = inputSetoran(n, sc);
        tampilSetoran(dataSetoran);

        double totalBerat = totalSetoran(dataSetoran);
        System.out.println("\nTotal berat seluruh setoran: " + totalBerat + " kg");

        System.out.println("\n=== SALDO SETIAP NASABAH ===");
        for (int i = 0; i < dataSetoran.length; i++) {
            double saldo = hitungSaldo(dataSetoran[i], HARGA_PER_KG);
            System.out.println("Nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }

        int idxTerbanyak = nasabahTerbanyak(dataSetoran);
        System.out.println("\nSetoran terbanyak dimiliki oleh Nasabah ke-" + (idxTerbanyak + 1)
                + " (" + dataSetoran[idxTerbanyak] + " kg)");

        sc.close();
    }
}