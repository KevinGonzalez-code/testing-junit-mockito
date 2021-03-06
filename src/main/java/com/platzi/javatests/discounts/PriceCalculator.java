package com.platzi.javatests.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discount = 0;


    public Double getTotal() {

        double result = 0;

        for ( Double precio : prices) {
            result += precio;
        }

        return result * ( (100 - discount )  / 100 ) ;
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {

        this.discount = discount;
    }
}
