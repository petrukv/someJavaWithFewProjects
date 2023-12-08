package Start.lesson6;

public class StringPractise {
    public static void main(String[] args) {
        String text = "my name is Giovanni Giorgio";

        String[] s = text.substring(11).toLowerCase().split(" ");

        for (String word : s){
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}
