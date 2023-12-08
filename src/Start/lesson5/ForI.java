package Start.lesson5;

public class ForI {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < numbers.length - 1; i++){
            System.out.println(numbers[i]);
        }

        int[] numbers2 = {3, 2, 10, 5, 8};
        for (int number : numbers2) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
