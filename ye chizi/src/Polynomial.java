// Add Scanner class
import java.util.Scanner;

/**
 * The polynomial class process the polynomial expression
 * And get the x coefficients and the y coefficients
 * *
 * @author Erfan
 * @version 1
 * @since 3/23/2018
 */
public class Polynomial {

    // Fields //

    // The coefficients of the x matrix in polynomial expression
    private int xCoefficients;

    // The coefficients of the y matrix in polynomial expression
    private int yCoefficients;

    // This string is polynomial expression
    private String string;

    // Create an object from Scanner class for getting polynomial expression
    private Scanner scanner = new Scanner(System.in);

    // Methods //

    /**
     * Check the input line is correct or not if not correct return false
     * @return True if the input is correct
     */
    public boolean checkinput() {
        int i;
        for (i = 0; i < string.length(); i++) {
            if (!(string.charAt(i) == 'X' || string.charAt(i) == 'Y' || string.charAt(i) == '+' || string.charAt(i) == '-' || string.charAt(i) == '*'
                    || Character.isDigit(string.charAt(i)) || Character.isWhitespace(string.charAt(i)))) {
                break;
            }
        }
        if (i == string.length())
            return true;
        else
            return false;
    }

    /**
     * This method find the operator most be executed
     * @return The number of the operator
     */
    public int findOperator() {
        int a;
        int b;
        a = string.indexOf('X');
        b = string.indexOf('Y');
        if (a == -1 && b != -1) {
            return -1;
        }
        if (a != -1 && b == -1) {
            return 0;
        }
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '*') {
                return 1;
            } else {
                if (string.charAt(i) == '+') {
                    return 2;
                } else {
                    if (string.charAt(i) == '-') {
                        if ((!Character.isDigit(string.charAt(i + 1)))) {
                            return 3;
                        }
                        if (i == string.length() - 3) {
                            return 2;
                        }

                    }
                }
            }
        }
        return 4;
    }

    /**
     * Get the polynomial expression
     */
    public void getPolynomialExpression() {
        string = scanner.nextLine();
        if (string.equals("Q")){
            System.out.println(" BYE !!");
            System.exit(0);
        }
    }

    /**
     * This method calculate the x coefficients and y coefficients
     */
    public void calPolynomialExpression() {
        int a;
        int b;
        a = string.indexOf('X');
        b = string.indexOf('Y');
        if (a == -1) {
            xCoefficients = 0;
            if (b == -1) {
                System.out.println("Wrong input .");
                System.out.println("The polynomial expression must have X or Y .");
            } else {
                if (b == 0) {
                    yCoefficients = 1;
                } else {
                    if (b == 1) {
                        yCoefficients = Character.getNumericValue(string.charAt(0));
                    } else {
                        if (string.charAt(b - 2) == '-') {
                            yCoefficients = -Character.getNumericValue(string.charAt(b - 1));
                        } else {
                            yCoefficients = Character.getNumericValue(string.charAt(b - 1));
                        }
                    }
                }
            }
        } else {
            if (b == -1) {
                yCoefficients = 0;
                if (a == 0) {
                    xCoefficients = 1;
                } else {
                    if (a == 1) {
                        xCoefficients = Character.getNumericValue(string.charAt(0));
                    } else {
                        if (string.charAt(a - 2) == '-') {
                            xCoefficients = -Character.getNumericValue(string.charAt(a - 1));
                        } else {
                            xCoefficients = Character.getNumericValue(string.charAt(a - 1));
                        }
                    }
                }

            } else {
                if (a == 0 || a == 1 || b == 0 || b == 1) {
                    if (a == 0 || a == 1) {
                        if (a == 0) {
                            xCoefficients = 1;
                        }
                        if (a == 1) {
                            xCoefficients = Character.getNumericValue(string.charAt(0));
                        }
                        if (string.charAt(b - 2) == '-') {
                            yCoefficients = -Character.getNumericValue(string.charAt(b - 1));
                        } else {
                            yCoefficients = Character.getNumericValue(string.charAt(b - 1));
                        }
                    }
                    if (b == 0 || b == 1) {
                        if (b == 0) {
                            yCoefficients = 1;
                        }
                        if (b == 1) {
                            yCoefficients = Character.getNumericValue(string.charAt(0));
                        }
                        if (string.charAt(a - 2) == '-') {
                            xCoefficients = -Character.getNumericValue(string.charAt(a - 1));
                        }
                        xCoefficients = Character.getNumericValue(string.charAt(a - 1));
                    }
                } else {
                    if (string.charAt(a - 2) == '-' && string.charAt(b - 2) == '-') {
                        xCoefficients = -Character.getNumericValue(string.charAt(a - 1));
                        yCoefficients = -Character.getNumericValue(string.charAt(b - 1));
                    }
                    if (string.charAt(a - 2) == '-' && string.charAt(b - 2) != '-') {
                        xCoefficients = -Character.getNumericValue(string.charAt(a - 1));
                        yCoefficients = Character.getNumericValue(string.charAt(b - 1));
                    }
                    if (string.charAt(a - 2) != '-' && string.charAt(b - 2) == '-') {
                        xCoefficients = Character.getNumericValue(string.charAt(a - 1));
                        yCoefficients = -Character.getNumericValue(string.charAt(b - 1));
                    }
                    if (string.charAt(a - 2) != '-' && string.charAt(b - 2) != '-') {
                        xCoefficients = Character.getNumericValue(string.charAt(a - 1));
                        yCoefficients = Character.getNumericValue(string.charAt(b - 1));
                    }
                }
            }
        }
    }

    /**
     * Get x coefficients
     * @return The x coefficients
     */
    public int getxCoefficients() {
        return xCoefficients;
    }

    /**
     * Get y coefficients
     * @return The y coefficients
     */
    public int getyCoefficients() {
        return yCoefficients;
    }

}
