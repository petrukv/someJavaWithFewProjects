package Start.lesson4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 7;

        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default-> System.out.println("Sunday");
        }
    }
}
