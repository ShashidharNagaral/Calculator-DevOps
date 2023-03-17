import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public double squareRootF(double x) {
        if (x < 0) {
            return -1;
        }
        return Math.sqrt(x);
    }

    public int factorialF(int x) {
        if(x < 0) {
            return -1;
        }
        int result = 1;
        for(int i=1; i<=x;i++) {
            result *= i;
        }
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
        return result;
    }

    public double powerF(double base, double exponent) {
        if(base < 0 && ((int)exponent != exponent))  {
            // base is negative and exponent is decimal fraction
            // i.e. we cannot find nth root of a negative number
            return Double.NaN;
        }
            return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;
        double result;
        do {
            System.out.println("-----------------Calculator-DevOps-----------------");
            System.out.println(
                    "Enter 1 for Square root.\n" +
                    "Enter 2 for Factorial function.\n" +
                    "Enter 3 for Natural logarithm (base e).\n" +
                    "Enter 4 for Power function.\n"+
                    "Enter 5 for exit. ");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        result = calculator.squareRootF(scanner.nextDouble());
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 2:
                        result = calculator.factorialF(scanner.nextInt());
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 3:
                        result = calculator.naturalLogarithmF(scanner.nextDouble());
                        if (result == -1) {
                            System.out.println("Please enter positive number!");
                        } else {
                            System.out.println("result: " + result);
                        }
                        break;
                    case 4:
                        result = calculator.powerF(scanner.nextDouble(), scanner.nextDouble());
                        System.out.println("result: " + result);
                        break;
                    case 5:
                        scanner.close();
                        return;
                    default:
                        System.out.println("Enter correct choice!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input type mismatch !");
                scanner.nextLine();
            }
        } while (true);
    }
}
