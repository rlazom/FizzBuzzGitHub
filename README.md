[![Build Status](https://travis-ci.com/oclay1st/FizzBuzz.svg?branch=develop)](https://travis-ci.com/github/oclay1st/FizzBuzz)
[![codecov](https://codecov.io/gh/oclay1st/FizzBuzz/branch/develop/graph/badge.svg)](https://codecov.io/gh/oclay1st/FizzBuzz) 

# FizzBuzz

'Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."

This project contains the code to solve the previous programming assignment

## Dependencies 
Java SDK 1.8 or later and Maven 3.6

## Execution
On Linux
```bash 
mvn clean install
java -jar target/FizzBuzz-1.0-SNAPSHOT.jar
```
On Docker
```bash
docker build -t fizzbuzz:1.0 .
docker run --rm -it fizzbuzz:1.0
```
## Test
```bash
mvn test
```