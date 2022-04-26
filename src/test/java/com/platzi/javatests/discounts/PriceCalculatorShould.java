package com.platzi.javatests.discounts;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


class PriceCalculatorShould {

    @Nested
    private PriceCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new PriceCalculator();
    }

    @Test
    void total_zero_when_there_are_prices() {
        assertThat( calculator.getTotal(), is(0.0) );
    }

    @Test
    void total_is_the_sum_of_prices() {

        calculator.addPrice(10.2);
        calculator.addPrice(15.5);

        assertThat(calculator.getTotal(), is(25.7));
    }

    @Test
    void apply_discount_to_prices() {

        calculator.addPrice(100);
        calculator.addPrice(50);
        calculator.addPrice(50);

        calculator.setDiscount(25);

        assertThat(calculator.getTotal(), is(150.0) );
    }
}