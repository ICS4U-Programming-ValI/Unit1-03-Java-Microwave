import java.util.Scanner;

/**
 * The Microwave program calculating how long it takes
 * to microwave 1,2,or 3 items of soup, pizza or subs.
 *
 * <p>This class demonstrates proper JavaDoc formatting and usage of
 * various math operations.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-26
 */
public final class Microwave {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Microwave() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        final int SUB_TIME_SECS = 60;
        final int PIZZA_TIME_SECS = 45;
        final int SOUP_TIME_SECS = 105;
        final double TWO_ITEMS_MULTIPLE = 1.5;
        final int THREE_ITEMS_MULTIPLE = 2;
        final int MINUTE_IN_SECS = 60;

        // Greeting user
        System.out.print("Hi! We will be calculating how long it takes ");
        System.out.print("to microwave 1,2,or 3 items of ");
        System.out.println("soup, pizza or subs");
        System.out.println("what food will you like to calculate?");

        // Getting input from user
        final Scanner scanner = new Scanner(System.in);
        final String item = scanner.nextLine().toLowerCase();

        // uses if to check item
        if (item.equals("pizza") || item.equals("soup") || item.equals("sub")) {
            System.out.println("How many? 2,1, or 3");

            // Getting amount from user
            final String itemAmountStr = scanner.nextLine();
            // Try catch to make sure it a number
            try{
                final int itemAmount = Integer.parseInt(itemAmountStr);

                // If to make calculate each scenario
                // If to make sure item amount is 1,2, or 3
                if (item.equals("pizza") && itemAmount == 1) {
                    final int minutes = PIZZA_TIME_SECS / MINUTE_IN_SECS;
                    final int seconds = PIZZA_TIME_SECS % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("pizza") && itemAmount == 2) {
                    final int newTime = (int) (PIZZA_TIME_SECS * TWO_ITEMS_MULTIPLE);
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("pizza") && itemAmount == 3) {
                    final int newTime = PIZZA_TIME_SECS * THREE_ITEMS_MULTIPLE;
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");

                } else if (item.equals("soup") && itemAmount == 1) {
                    final int minutes = SOUP_TIME_SECS / MINUTE_IN_SECS;
                    final int seconds = SOUP_TIME_SECS % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("soup") && itemAmount == 2) {
                    final int newTime = (int) (SOUP_TIME_SECS * TWO_ITEMS_MULTIPLE);
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("soup") && itemAmount == 3) {
                    final int newTime = SOUP_TIME_SECS * THREE_ITEMS_MULTIPLE;
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");

                } else if (item.equals("sub") && itemAmount == 1) {
                    final int minutes = SUB_TIME_SECS / MINUTE_IN_SECS;
                    final int seconds = SUB_TIME_SECS % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("sub") && itemAmount == 2) {
                    final int newTime = (int) (SUB_TIME_SECS * TWO_ITEMS_MULTIPLE);
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else if (item.equals("sub") && itemAmount == 3) {
                    final int newTime = SUB_TIME_SECS * THREE_ITEMS_MULTIPLE;
                    final int minutes = newTime / MINUTE_IN_SECS;
                    final int seconds = newTime % MINUTE_IN_SECS;
                    System.out.print("it will take " + minutes + " minutes");
                    System.out.println(" and " + seconds + " seconds");
                } else {
                    // prints wrong amount output
                    System.out.println("That's not one of the amount options");
                }
            } catch (NumberFormatException ex) {
                // prints catch handling output
                System.out.println("That's not a number");
            }
        } else {
            // prints wrong item output
            System.out.println("That's not one of the item options");
        }
    }

}
