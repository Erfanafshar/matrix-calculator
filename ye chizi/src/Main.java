public class Main {

    // Method //

    public static void main(String[] args) {

        Polynomial polynomial = new Polynomial();

        System.out.println("Define the first matrix (X):");
        Matrix x = new Matrix();
        x.makeMatrix();
        x.makeMatrixNumeric();

        System.out.println("Define the second matrix (Y):");
        Matrix y = new Matrix();
        y.makeMatrix();
        y.makeMatrixNumeric();

        while (true) {
            System.out.println("Enter your polynomial expression:");

            polynomial.getPolynomialExpression();
            if (!polynomial.checkinput()) {
                System.out.println("Wrong input .");
                continue;
            }
            polynomial.calPolynomialExpression();

            Matrix result = new Matrix();

            if (polynomial.findOperator() == -1) {
                System.out.println("The result is : ");
                y.multiplicationOfCoefficients(polynomial.getyCoefficients());
                y.print();
                y.returnCoefficients(polynomial.getyCoefficients());
            }
            if (polynomial.findOperator() == 0) {
                System.out.println("The result is : ");
                x.multiplicationOfCoefficients(polynomial.getxCoefficients());
                x.print();
                x.returnCoefficients(polynomial.getxCoefficients());
            }
            if (polynomial.findOperator() == 1) {
                if (x.getColumns() == y.getRows()) {
                    System.out.println("Wrong input .");
                    System.out.println("The first matrix columns and the twice matrix rows must be equals in multiplication .");
                    continue;
                }
                x.multiplicationOfCoefficients(polynomial.getxCoefficients());
                y.multiplicationOfCoefficients(polynomial.getyCoefficients());
                System.out.println("The result is : ");
                result.setRows(x.getRows());
                result.setColumns(y.getColumns());
                result.setSizeOfDiameter(x.getColumns());
                result.multiplication(x, y);
                result.print();
                x.returnCoefficients(polynomial.getxCoefficients());
                y.returnCoefficients(polynomial.getyCoefficients());

            }
            if (polynomial.findOperator() == 2 || polynomial.findOperator() == 3) {
                if (!(x.getRows() == y.getRows() && x.getColumns() == y.getColumns())) {
                    System.out.println("Wrong input . ");
                    System.out.println("The number of columns and rows of the both of the matrix must be equals .");
                    continue;
                }
                x.multiplicationOfCoefficients(polynomial.getxCoefficients());
                y.multiplicationOfCoefficients(polynomial.getyCoefficients());
                System.out.println("The result is : ");
                result.setColumns(x.getColumns());
                result.setRows(x.getRows());
                if (polynomial.findOperator() == 2) {
                    result.sum(x, y);
                }
                if (polynomial.findOperator() == 3) {
                    result.subtraction(x, y);
                }
                result.print();
                x.returnCoefficients(polynomial.getxCoefficients());
                y.returnCoefficients(polynomial.getyCoefficients());
            }
            if (polynomial.findOperator() == 4) {
                System.out.println("Wrong input .");
                System.out.println("Invalid operator .");
            }
        }
    }

}
