package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @BeforeEach
    void setup(){
        calc = new Calculator();
    }

    @DisplayName("Testing add() method")
    @Test
    void testAdd(){
        assertEquals(5, calc.add(2,3));
    }

    @DisplayName("Testing minus() method")
    @Test
    void testMinus(){
        assertEquals(3, calc.minus(5,2));
    }

    @DisplayName("Testing divide() method")
    @Test
    void testDivide(){
        assertEquals(5, calc.divide(10,2));
    }

    @DisplayName("Testing multiply() method")
    @Test
    void testMultiply(){
        assertEquals(10, calc.multiply(2,5));
    }

    @DisplayName("Testing 1 fakultaet() method")
    @Test
    void testFakultaet1(){
        assertEquals(6, calc.fakultaet(3));

    }

    @DisplayName("Testing 2 fakultaet() method")
    @Test
    void testFakultaet2(){
        assertEquals(0, calc.fakultaet(-3));

    }

    @DisplayName("Testing 3 fakultaet() method")
    @Test
    void testFakultaet3(){
        assertEquals(1, calc.fakultaet(1));

    }


}
