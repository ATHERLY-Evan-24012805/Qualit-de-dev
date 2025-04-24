package test;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testFizzBuzz {
    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.getResult(1));
        assertEquals("Fizz", fizzBuzz.getResult(3));
        assertEquals("Buzz", fizzBuzz.getResult(5));
        assertEquals("Fizz", fizzBuzz.getResult(9));
        assertEquals("Buzz", fizzBuzz.getResult(10));
        assertEquals("FizzBuzz", fizzBuzz.getResult(15));
        assertEquals("FizzBuzz", fizzBuzz.getResult(0));
    }
}
