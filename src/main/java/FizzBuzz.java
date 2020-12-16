public class FizzBuzz {

    public static void main(String[] args) {
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
            return "Buzz";
        }
        if (isDivisibleByFive(number)) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
