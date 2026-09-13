import java.util.Scanner;

public class Day12Biodata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        input.nextLine(); // membersihkan Enter

        System.out.print("Masukkan jurusan: ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.println("\n===== BIODATA =====");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Jurusan        : " + jurusan);
        System.out.println("Tinggi Badan   : " + tinggi + " cm");
    }
}
