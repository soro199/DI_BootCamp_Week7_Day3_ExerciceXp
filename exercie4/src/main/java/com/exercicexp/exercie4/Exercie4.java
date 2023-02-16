/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercie4;

/**
 *
 * @author SORO
 */

import java.util.function.DoubleUnaryOperator;

public class Exercie4 {

    public static void main(String[] args) {
        final int NUMBER_OF_ITERATIONS = 1000000000;

        // expression lambda pour trouver la valeur de π
        DoubleUnaryOperator piCalculator = (double n) -> {
            double result = 0.0;
            for (int i = 0; i < NUMBER_OF_ITERATIONS; i++) {
                result += Math.pow(-1, i) / (2 * i + 1);
            }
            return 4 * result;
        };

        // appel de la fonction pour trouver la valeur de π
        double pi = piCalculator.applyAsDouble(0);
        System.out.println("La valeur de π est : " + pi);
    }
}
