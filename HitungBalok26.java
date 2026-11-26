public class HitungBalok26 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int luasPermukaan = 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int[][] balok = {
            {4, 3, 5},
            {6, 2, 4},
            {5, 5, 5}
        };

        for (int i = 0; i < balok.length; i++) {
            int p = balok[i][0];
            int l = balok[i][1];
            int t = balok[i][2];

            int lp = hitungLuasPermukaanBalok(p, l, t);
            int vol = hitungVolume(t, p, l);

            System.out.println("Balok ke-" + (i + 1) + " (p=" + p + ", l=" + l + ", t=" + t + ")");
            System.out.println("Luas Permukaan Balok adalah " + lp);
            System.out.println("Volume Balok adalah " + vol);
            System.out.println();
        }
    }
}