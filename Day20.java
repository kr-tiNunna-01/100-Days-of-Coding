public class Day20 {
    public static void main(String[] args) {

        byte dataByte = 10;
        short dataShort = 100;
        int dataInt = 1000;
        long dataLong = 10000L;

        float dataFloat = 10.5f;
        double dataDouble = 20.5;

        char dataChar = 'A';
        boolean dataBoolean = true;

        String stringByte = String.valueOf(dataByte);
        String stringShort = String.valueOf(dataShort);
        String stringInt = String.valueOf(dataInt);
        String stringLong = String.valueOf(dataLong);

        String stringFloat = String.valueOf(dataFloat);
        String stringDouble = String.valueOf(dataDouble);

        String stringChar = String.valueOf(dataChar);
        String stringBoolean = String.valueOf(dataBoolean);

        System.out.println("Byte    : " + stringByte);
        System.out.println("Short   : " + stringShort);
        System.out.println("Int     : " + stringInt);
        System.out.println("Long    : " + stringLong);

        System.out.println("Float   : " + stringFloat);
        System.out.println("Double  : " + stringDouble);

        System.out.println("Char    : " + stringChar);
        System.out.println("Boolean : " + stringBoolean);
    }
}
