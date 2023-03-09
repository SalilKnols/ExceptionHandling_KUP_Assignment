    package ExceptionHandlingProgram1;
    import java.util.Scanner;
    class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String exceptionMessage) {

            super(exceptionMessage);
        }
    }

    class Calculator {
        public static int add(int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }

        public static int subtract(int firstNumber, int secondNumber) {
            return firstNumber - secondNumber;
        }

        public static int multiply(int firstNumber, int secondNumber) {
            return firstNumber * secondNumber;
        }

        public static int divide(int firstNumber, int secondNumber) throws DivisionByZeroException {
            if (secondNumber == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed.");
            }
            return firstNumber / secondNumber;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            String number1String = scanner.nextLine();
            System.out.print("Enter second number: ");
            String number2String = scanner.nextLine();

            try {
                int firstNumber = Integer.parseInt(number1String);
                int secondNumber = Integer.parseInt(number2String);

                int sum = Calculator.add(firstNumber, secondNumber);
                int difference = Calculator.subtract(firstNumber, secondNumber);
                int product = Calculator.multiply(firstNumber, secondNumber);
                int quotient = Calculator.divide(firstNumber, secondNumber);

                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
                System.out.println("Product: " + product);
                System.out.println("Quotient: " + quotient);
            }
            catch (NumberFormatException formatTypeException) {
                System.out.println("Invalid input: not a valid number.");
            }
            catch (DivisionByZeroException divisionTypeException) {
                System.out.println(divisionTypeException.getMessage());
            }
        }
    }
