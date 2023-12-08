package Start.lesson5;

public class MultiArray {
    public static void main(String[] args) {
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 194, 193};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println(178);
                    break upperFor;
                } else {
                    System.out.println("not 178");
                }
            }
        }
    }
}
