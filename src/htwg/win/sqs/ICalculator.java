package htwg.win.sqs;

public interface ICalculator {

    /**
     * @param a the first addend, an integer
     * @param b the second addend, an integer
     * @return the sum of both addends
     */
    int add(int a, int b);

    /**
     * @param a the minuend, an integer
     * @param b the subtrahend, an integer
     * @return the subtraction of both numbers
     */
    int subtract(int a, int b);

    /**
     * @param a the first factor, an integer
     * @param b the second factor, an integer
     * @return the multiplication of both factors
     */
    int multiply(int a, int b);

    /**
     * @param a the dividend, an integer
     * @param b the divisor, an integer
     * @return the division of both numbers
     */
    int divide(int a, int b);
}
