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
}
