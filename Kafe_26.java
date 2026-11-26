public class Kafe_26{
    public static void Menu() {
        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. kopi Hitam - Rp 15,000");
        System.out.println("2. Capucinno - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }

    public static int jumlahMenu(){
        return 6;
    }

    public static void main(String[] args) {
        Menu();
        System.out.println("Jumlah menu yang tersedia: " + jumlahMenu());
    }
}