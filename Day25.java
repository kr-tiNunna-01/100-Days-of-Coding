import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BIODATA ===");

        System.out.print("Nama       : ");
        String nama = input.nextLine();

        System.out.print("Umur       : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Alamat     : ");
        String alamat = input.nextLine();

        System.out.print("Hobi       : ");
        String hobi = input.nextLine();

        System.out.println("\n=== BIODATA ANDA ===");
        System.out.println("Nama         : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Hobi         : " + hobi);

        input.close();
    }
}
