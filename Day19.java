import java.util.Scanner;

public class Day19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai double: ");
        double angka = input.nextDouble();

        float nilaiFloat = (float) angka;
        long nilaiLong = (long) angka;
        int nilaiInt = (int) angka;
        short nilaiShort = (short) angka;
        byte nilaiByte = (byte) angka;

        System.out.println("Double : " + angka);
        System.out.println("Float  : " + nilaiFloat);
        System.out.println("Long   : " + nilaiLong);
        System.out.println("Int    : " + nilaiInt);
        System.out.println("Short  : " + nilaiShort);
        System.out.println("Byte   : " + nilaiByte);
    }
}
