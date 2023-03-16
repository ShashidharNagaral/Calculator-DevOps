import java.util.Scanner;

public class Calculator {
    public Calculator() {
    }

    public double powerF(double x, double y) {
        return Math.pow(x, y);
    }

    public double squareRootF(double x) {
        return Math.sqrt(x);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;
        double result = 0;
        double input1, input2;
        do {
            System.out.println("----------------Calculator-DevOps----------------");
            System.out.println(
                    """ 
                            Enter 1 for Square root.\s
                            Enter 2 for Factorial function.\s
                            Enter 3 for Natural logarithm (base e).\s
                            Enter 4 for Power function.\s
                            Enter 5 for exit.
                            """);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    input1 = scanner.nextDouble();
                    result = calculator.squareRootF(input1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    input1 = scanner.nextDouble();
                    input2 = scanner.nextDouble();
                    result = calculator.powerF(input1, input2);
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Enter correct choice!");
                    continue;
            }
            System.out.println("result: " + result);
        } while (true);
    }
}
