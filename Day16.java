public class Day16 {
    public static void main(String[] args) {

        int jumlahBungkusKopi = 25;
        int jumlahCangkir = 4;

        int kopiPerCangkir = jumlahBungkusKopi / jumlahCangkir;
        int sisaBungkusKopi = jumlahBungkusKopi % jumlahCangkir;

        System.out.println("Bungkus kopi per cangkir = " + kopiPerCangkir);
        System.out.println("Sisa bungkus kopi = " + sisaBungkusKopi);
    }
}
