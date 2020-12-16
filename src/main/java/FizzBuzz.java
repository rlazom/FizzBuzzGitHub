import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FizzBuzz {


    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new BufferedOutputStream(System.out);
        for (int i = 1; i <= 100; i++) {
            outputStream.write((fizzBuzz(i) + "\n").getBytes());
            outputStream.flush();
        }
        outputStream.close();
    }

    /**
     * Determine if the number is divisible by three
     *
     * @param number: number to check the divisibility
     * @return boolean: true or false if is divisible by three
     */
    public static boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    /**
     * Determine if the number is divisible by five
     *
     * @param number: number to check the divisibility
     * @return boolean: true or false if is divisible by five
     */
    public static boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }

    /**
     * Determine if the number is divisible by three and five
     *
     * @param number: number to check the divisibility
     * @return boolean: true or false if is divisible by three and five
     */
    public static boolean isDivisibleByThreeAndFive(int number) {
        return number % 15 == 0;
    }

    /**
     * Resolve the proper word for FizzBuzz
     *
     * @param number: number to check the divisibility
     * @return String: Fizz, Buzz, FizzBuzz or the number base on its divisibility
     */
    public static String fizzBuzz(int number) {
        if (isDivisibleByThreeAndFive(number)) {
            return "FizzBuzz";
        }
        if (isDivisibleByThree(number)) {
            return "Fizz";
        }
        if (isDivisibleByFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
