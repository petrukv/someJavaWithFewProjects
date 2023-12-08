package Start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        //логічні значення(булеві значення)
        boolean answerVadym = true;
        boolean answerAndrii = false;

        //цілі числа
        //byte
        byte maxByte = 127;
        byte minByte = -128;

        //short - коротке число, складається з двох байт обо 16 бітів
        short maxShort = 32_767;
        short minShort = - 32_768;

        //integer -  ціле число, яке складається з 4 байт обо 32 бітів
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //long - число, яке складається з 8 байт обо 64 бітів
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //double - число з плаваючою точкою, 64 bit;
        double myBottle = 1.5;
        //Float - число з плаваючою точкою, 32 bit;
        float cola = 0.33F;

        double doubleNumber = 1.12345678976543666;
        float floatNumber = 1.12345678976543666F;

        System.out.println(doubleNumber);
        System.out.println(floatNumber);

        //character - символ, 16 біт,
        char letter = 70;
        System.out.println(letter);

        char newLine = '\n';
        char tab = '\t';
        char escape = '\\';
    }
}
