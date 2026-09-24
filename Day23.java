import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang sisi
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        // Menghitung luas persegi
        int luas = sisi * sisi;

        // Menampilkan hasil
        System.out.println("Luas persegi = " + luas);

        // Menutup Scanner
        input.close();
    }
}
