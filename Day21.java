public class Day21 {
    public static void main(String[] args) {

        // Nilai awal
        int a = 100;
        int b = 2000;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Menukar nilai menggunakan variabel sementara
        int oli = a;
        a = b;
        b = oli;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
