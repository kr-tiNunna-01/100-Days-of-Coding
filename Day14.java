public class Day14 {
    public static void main(String[] args) {

        int bibitBunga = 12;
        int bibitBaru = 5;
        int bibitRusak = 2;

        int totalBibit = bibitBunga + bibitBaru;
        int sisaBibit = totalBibit - bibitRusak;

        System.out.println("Bibit awal: " + bibitBunga);
        System.out.println("Bibit baru: " + bibitBaru);
        System.out.println("Total bibit: " + totalBibit);
        System.out.println("Bibit rusak: " + bibitRusak);
        System.out.println("Sisa bibit: " + sisaBibit);

    }
}
