/*
 * This program calculates the length of a board foot, given the width and the
 * height.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-11-25
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class calculates the length of a board foot given the width and height.
 * */
final class BoardFoot {

    /**
     * This constant is the volume of board foot (144m³).
     * */
    public static final int BOARD_FOOT_SIZE = 144;

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private BoardFoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function calculates the length of a board foot.
     *
     * @param width is the user inputted width.
     * @param height is the user inputted height.
     * @return the length of the board foot.
     * */
    private static double lengthCalculation(
            final double width, final double height) {
        return BOARD_FOOT_SIZE / width / height;
    }

    /**
     * This function catches user input, validates and outputs the length of
     * the board foot.
     *
     * @param args Not used.
     *
     * @throws NumberFormatException if there are any problems while parsing
     *     the user input to a Double.
     * @throws IOException if there is any problem with the input.
     * */
    public static void main(final String[] args) {

        double width = 0;
        double height = 0;
        double length = 0;

        try {
            // User prompt
            System.out.print("Enter a width: ");

            final String widthString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            width = Double.parseDouble(widthString);

            // User prompt
            System.out.print("Enter a height: ");

            final String heightString = new BufferedReader(
                    new InputStreamReader(System.in)
            ).readLine();

            height = Double.parseDouble(heightString);

            length = lengthCalculation(width, height);

            System.out.println("The length is: " + length + " m.");
        } catch (IOException | NumberFormatException exception) {
            // Outputs error message
            System.out.println("Please enter a correct input.\n");
        }

        System.out.println("\nDone.");
    }

}

