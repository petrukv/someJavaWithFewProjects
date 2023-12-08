package Start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean isBoughtBread = true;
        boolean isBoughtMilk = true;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Bought Bread and milk");
        } else if (isBoughtBread) {
            System.out.println("at least bread");
        } else {
            System.out.println("Bread and milk weren't bought");
        }

        boolean isBoughtMilkOrBread = true || true;

        boolean isBoughtCandy = true;

        if (!isBoughtCandy) {
            System.out.println("Congrats");
        }
    }
}
