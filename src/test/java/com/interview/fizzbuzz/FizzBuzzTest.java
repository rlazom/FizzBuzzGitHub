package com.interview.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

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

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {15, 30, 60, 90})
    public void testShouldBeDivisibleByThreeAndFive(int number) {
        assertTrue(FizzBuzz.isDivisibleByThreeAndFive(number), String.format("The number %s is not divisible by three and five", number));
    }


    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {15, 30, 60, 90})
    public void testShouldReturnFizzBuzz(int number) {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(number), "Doesn't return FizzBuzz for number: " + number);
    }

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {3, 39, 33, 93})
    public void testShouldReturnFizz(int number) {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(number), "Doesn't return Fizz for number: " + number);
    }

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {5, 25, 50, 100})
    public void testShouldReturnBuzz(int number) {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(number), "Doesn't return Buzz for number: " + number);
    }

    @ParameterizedTest(name = "#{index} - Run test with number args={0}")
    @ValueSource(ints = {1, 2, 4, 88, 22, 43, 7})
    public void testShouldReturnTheNumber(int number) {
        assertEquals(String.valueOf(number), FizzBuzz.fizzBuzz(number), "Doesn't return " + number);
    }

    @Test
    public void testShouldPrintFizzOrBuzzOrFizzBuzzOrTheNumber() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        String output = Stream.iterate(1, n -> n + 1)
                .limit(100)
                .map(FizzBuzz::fizzBuzz)
                .collect(Collectors.joining("\n"));
        FizzBuzz.main(null);
        assertEquals(output + "\n", outContent.toString(), "Error matching output");

        System.setOut(System.out);
        System.setErr(System.err);

    }
}
