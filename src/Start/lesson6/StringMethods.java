package Start.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello World!";
        String textUpper = text.toUpperCase();

        String lowerCase = text.toLowerCase();
        int length = text.length();

        boolean hello = text.contains("Hello");

        String s = text.replaceAll("l", "a");

        String repeat = text.repeat(10);

        String names = "Yuri;Olga;Petr;Vasya";
        String[] split = names.split(";");

        String word1 = "hi";
        String word2 = "friend";
        String result = word1 + word2;

        boolean hel = text.startsWith("Hel");

        boolean b = text.endsWith("World!");

        String substring = text.substring(0, 5);

        "hello".replaceAll("l", "a").toUpperCase().length();
    }
}
