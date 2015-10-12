package com.company;

import java.rmi.Naming;

/**
 * Created by rui on 10/3/15.
 */
public class CalculatorClient {
    public static void main(String args[]) {
        try {
            double a = 45.4;
            double b = 60.55;

            Calculator calc = (Calculator) Naming.lookup("rmi://127.0.0.1/Calculator");

            System.out.println("Adição " + a + " + " + b + " is " + calc.addition(a, b));
            System.out.println("Subtraction " + a + " - " + b + " is " + calc.subtraction(a, b));
            System.out.println("Multiplication " + a + " * " + b + " is " + calc.multiplication(a, b));
            System.out.println("Division " + a + " / " + b + " is " + calc.division(a, b));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
