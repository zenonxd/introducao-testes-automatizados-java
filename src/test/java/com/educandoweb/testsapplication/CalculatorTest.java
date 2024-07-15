package com.educandoweb.testsapplication;


import static org.assertj.core.api.Assertions.assertThat ;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();

        assertThat(calculator.soma(1,1)).isEqualTo(2);
    }
}
