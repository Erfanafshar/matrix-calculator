// Add Scanner class
import java.util.Scanner;

/**
 * The Matrix class have a matrix parts
 * And some method for sum and subtraction and multiplication matrix
 * *
 * @author Erfan
 * @version 1
 * @since 3/23/2018
 */
/*public class Matrix {

    // Fields //

    // The columns of the matrix
    private int columns;

    // The rows of the matrix
    private int rows;

    // The size of the diameter of the result matrix in multiplication
    private int sizeOfDiameter;

    // The input line for making matrix
    private String inputLine;

    // The matrix parts in character model
    private String[][] matrix = new String[10][10];

    // The matrix parts in integer model
    private int[][] numericMatrix;

    // Create an object from Scanner class for getting input
    private Scanner scanner = new Scanner(System.in);

    // Constructor //

    /**
     * Create matrix object with initialize the rows and columns to zero
     */
    public Matrix() {
        columns = 0;
        rows = 0;
        //matrix = new Stringt[10][10];
        numericMatrix = new int[10][10];
    }

    // Methods //

    /**
     * Set the diameter of the multiplication matrix
     * @param size The size of the diameter of the result matrix in multiplication
     */
    public void setSizeOfDiameter(int size) {
        sizeOfDiameter = size;
    }

    /**
     * Make a matrix with given parts
     */
    public void makeMatrix() {
        while (true) {
            inputLine = scanner.nextLine();
            /*if (!checkLine()) {
                System.out.println("Wrong input .");
                System.out.println("Enter the input in {1,2,3,4} model .");
                continue;
            }*/
            if (inputLine.isEmpty()) {
                break;
            } else {
                columns = inputLine.length() / 2;
                for (int i = 0; 2 * i < inputLine.length(); i++) {
                    if ( inputLine.charAt(2 * i -1 ) == '-'){
                    //matrix[rows][i] = inputLine.charAt(2 * i);
                }
                rows++;
            }
        }
    }


    /**
     * Make the matrix numeric
     */
    public void makeMatrixNumeric() {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= columns; k++) {
                numericMatrix[i][k] = Character.getNumericValue(matrix[i][k]);
            }
        }
    }

    /**
     * Print the matrix
     */
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= columns; k++) {
                System.out.print(numericMatrix[i][k] + "/");
            }
            System.out.println();
        }
    }

    /**
     * Get the rows of the matrix
     * @return The rows of the matrix
     */
    public int getRows() {
        return rows;
    }

    /**
     * Get the column of the matrix
     * @return The column of the matrix
     */
    public int getColumns() {
        return columns;
    }

    /**
     * This method multiplication the coefficients of each matrix
     * @param coefficients The coefficients of each matrix
     */
    public void multiplicationOfCoefficients(int coefficients) {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= columns; k++) {
                numericMatrix[i][k] = numericMatrix[i][k] * coefficients;
            }
        }
    }

    /**
     * This method divide (remove) the coefficients of each matrix
     * @param coefficients  The coefficients of each matrix
     */
    public void returnCoefficients(int coefficients) {
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k <= columns; k++) {
                numericMatrix[i][k] = numericMatrix[i][k] / coefficients;
            }
        }
    }

    /**
     * This method return the numeric matrix
     * @return The numeric matrix
     */
    public int[][] getNumericMatrix() {
        return numericMatrix;
    }

    /**
     * This method set the rows of the matrix
     * @param row The rows of the matrix
     */
    public void setRows(int row) {
        rows = row;
    }

    /**
     * This method set the columns of the matrix
     * @param column The columns of the matrix
     */
    public void setColumns(int column) {
        columns = column;
    }

    /**
     * This method sum two matrix
     * @param x The first matrix
     * @param y The twice matrix
     */
    public void sum(Matrix x, Matrix y) {
        for (int i = 0; i <= x.getRows(); i++) {
            for (int k = 0; k <= x.getColumns(); k++) {
                numericMatrix[i][k] = x.getNumericMatrix()[i][k] + y.getNumericMatrix()[i][k];
            }
        }
    }

    /**
     * This method subtraction two matrix
     * @param x The first matrix
     * @param y The twice matrix
     */
    public void subtraction(Matrix x, Matrix y) {
        for (int i = 0; i <= x.getRows(); i++) {
            for (int k = 0; k <= x.getColumns(); k++) {
                numericMatrix[i][k] = x.getNumericMatrix()[i][k] - y.getNumericMatrix()[i][k];
            }
        }
    }

    /**
     * This method multiplication two matrix
     * @param x The first matrix
     * @param y The twice matrix
     */
    public void multiplication(Matrix x, Matrix y) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                for (int k = 0; k <= sizeOfDiameter; k++) {
                    numericMatrix[i][j] = numericMatrix[i][j] + x.getNumericMatrix()[i][k] * y.getNumericMatrix()[k][j];
                }
            }
        }
    }

}
*/