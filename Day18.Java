import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai byte: ");
        byte angkaByte = input.nextByte();

        short angkaShort = angkaByte;
        int angkaInt = angkaShort;
        long angkaLong = angkaInt;
        float angkaFloat = angkaLong;
        double angkaDouble = angkaFloat;

        System.out.println("byte   = " + angkaByte);
        System.out.println("short  = " + angkaShort);
        System.out.println("int    = " + angkaInt);
        System.out.println("long   = " + angkaLong);
        System.out.println("float  = " + angkaFloat);
        System.out.println("double = " + angkaDouble);

    }
}
