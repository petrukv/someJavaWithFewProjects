package Start.lesson5;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count < 10) {
            System.out.println(count);
            count++;
        }
        System.out.println("End");

        while (true) {
            count++;
            System.out.println(count);
            if (count == 15){
                break;
            }
        }
        System.out.println("End");
    }
}
