public class Day07_Rekursif {

    static int hitungMundur(int angka) {
        if (angka == 0) {
            return 0;
        }

        System.out.println(angka);
        return hitungMundur(angka - 1);
    }

    public static void main(String[] args) {
        hitungMundur(5);
    }
}
