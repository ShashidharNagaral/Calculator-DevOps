import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double squareRootF(double x) {
        double result;
        if (x < 0) {
            return -1;
        }
        result = Math.sqrt(x);
        logger.info(" - [SQUARE ROOT] of "+x+" - [RESULT] : "+ result);
        return result;
    }

    public int factorialF(int x) {
        if(x < 0) {
            return -1;
        }
        int result = 1;
        for(int i=1; i<=x;i++) {
            result *= i;
        }
        logger.info(" - [FACTORIAL] of "+x+" - [RESULT] : "+ result);
        return result;
    }

    public double naturalLogarithmF(double x) {
        double result;
        if(x == 0) {
            result = Double.NEGATIVE_INFINITY;
        } else if (x < 0) {
            result = -1;
        } else if (x == Double.POSITIVE_INFINITY) {
            result = Double.POSITIVE_INFINITY;
        } else {
            result = Math.log(x);
        }
        logger.info(" - [NATURAL LOGARITHM] of "+x+" - [RESULT] : "+ result);
        return result;

    }

    public double powerF(double base, double exponent) {
        if(base < 0 && ((int)exponent != exponent))  {
            // base is negative and exponent is decimal fraction
            // i.e. we cannot find nth root of a negative number
            return Double.NaN;
        }
        double result = Math.pow(base, exponent);
        logger.info(" - [POWER] of "+base+" with "+exponent+" - [RESULT] : "+ result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;
        double input1, input2, result;
        int int_input1;
        System.out.println("Press any key to start calculator!");
        scanner.nextLine(); // skip first input while running in container
        System.out.println("-----------------Calculator-DevOps-----------------");
        do {
            logger.info("Showing calculator menu");
            System.out.println(
                    "Enter 1 for Square root.\n" +
                    "Enter 2 for Factorial function.\n" +
                    "Enter 3 for Natural logarithm (base e).\n" +
                    "Enter 4 for Power function.\n"+
                    "Enter 5 for exit. ");
            try {
                choice = scanner.nextInt();
                logger.info("choice selected: "+choice);

                switch (choice) {
                    case 1:
                        logger.info("square root function");

                        input1 = scanner.nextDouble();
                        logger.info("input: "+input1);

                        result = calculator.squareRootF(input1);
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                            logger.error("entered negative number");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 2:
                        logger.info("factorial function");

                        int_input1 = scanner.nextInt();
                        logger.info("input: "+int_input1);

                        result = calculator.factorialF(int_input1);
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                            logger.error("entered negative number");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 3:
                        logger.info("natural logarithm function");

                        input1 = scanner.nextDouble();
                        logger.info("input: "+input1);

                        result = calculator.naturalLogarithmF(input1);
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                            logger.error("entered negative number");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 4:
                        logger.info("power function");

                        input1 = scanner.nextDouble();
                        logger.info("base: "+input1);

                        input2 = scanner.nextDouble();
                        logger.info("exponent: "+input2);

                        result = calculator.powerF(input1, input2);
                        System.out.println("result: " + result);
                        break;
                    case 5:
                        scanner.close();
                        logger.info("calculated exited");
                        return;
                    default:
                        System.out.println("Enter correct choice!");
                        logger.info("incorrect choice entered");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input type mismatch !");
                logger.error("input type mismatched");
                scanner.nextLine();
            }
        } while (true);
    }
}
