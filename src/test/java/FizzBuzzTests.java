import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTests {

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {3, 9, 27, 90, 63})
    public void testShouldBeDivisibleByThree(int number) {
        assertTrue(FizzBuzz.isDivisibleByThree(number), String.format("The number %s is not divisible by three", number));
    }

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {5, 10, 55, 90, 65})
    public void testShouldBeDivisibleByFive(int number) {
        assertTrue(FizzBuzz.isDivisibleByFive(number), String.format("The number %s is not divisible by five", number));
    }
}
