public class Day13 {
    public static void main(String[] args) {
//soal1
        byte nilaibyte = 3; //jadi 4
        int nilaiInt = 10; //jadi 20
        float nilaifloat = 5.5f; // jadi 6.5
        double nilaidouble = 10.5; // jadi 20.5

        System.out.println("===== SEBELUM UPDATE =====");
        System.out.println("Byte    : " + nilaibyte);
        System.out.println("Int     : " + nilaiInt);
        System.out.println("Float   : " + nilaifloat);
        System.out.println("Double  : " + nilaidouble);

        nilaibyte = 4;
        nilaiInt = 20;
        nilaifloat = 6.5f;
        nilaidouble = 20.5;

        System.out.println("\n===== SETELAH UPDATE =====");
        System.out.println("Byte    : " + nilaibyte);
        System.out.println("Int     : " + nilaiInt);
        System.out.println("Float   : " + nilaifloat);
        System.out.println("Double  : " + nilaidouble);
  }
}
//soal2
public class soal2 {
    public static void main(String[] args) {
        String nama = "Kristin";
        int umur = 20;
        int tahunMasuk = 2020;
        int jumlahSks = 24;
        String nim = "D0220001";
        double tinggiBadan = 165.5;
        double ipk = 5.0;
        boolean statusAktif = false;

        System.out.print("BIODATA MAHASISWA\n");
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur);
        System.out.println("Tahun Masuk     : " + tahunMasuk);
        System.out.println("Jumlah SKS      : " + jumlahSks);
        System.out.println("NIM             : " + nim);
        System.out.println("Tinggi badan    : " + tinggiBadan);
        System.out.println("IPK             : " + ipk);
        System.out.printf("Status Aktif    : %b" ,statusAktif);
    }
}
//soal3
import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        System.out.print("Masukkan tanggal lahir: ");
        int tgllahir = scanner.nextInt();
        System.out.print("Masukkan bulan lahir: ");
        int bulanlahir = scanner.nextInt();
        System.out.print("Masukkan tahun lahir: ");
        int tahunlahir = scanner.nextInt();
        System.out.print("Masukkan berat badan: ");
        double beratbadan = scanner.nextDouble();
        System.out.print("Masukkan tinggi badan: ");
        double tinggiBadan = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan status mahasiswa (true/false): ");
        boolean statusMahasiswa = scanner.nextBoolean();

        System.out.println("\n================================");
        System.out.println("          DATA MAHASISWA");
        System.out.println("================================");
        System.out.println("Nama              : " + nama);
        System.out.println("Umur              : " + umur + " tahun");
        System.out.println("Tanggal Lahir     : " +  tgllahir + "/" + bulanlahir + "/" + tahunlahir);
        System.out.println("Berat Badan       : " + beratbadan + " kg");
        System.out.println("Tinggi Badan      : " + tinggiBadan + " cm");
        System.out.println("Kelas             : " + kelas);
        System.out.println("Status Mahasiswa  : " + statusMahasiswa);
        System.out.println("================================");

        scanner.close();
    }
}

