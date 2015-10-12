package com.company;

import java.rmi.Naming;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Calculator calc = new CalculatorImp();
            Naming.rebind("rmi://127.0.0.1:1099/Calculator", calc);
        } catch (Exception e) {
            System.out.println("Server thew a exception.");
            e.printStackTrace();
            return;
        }

        System.out.println("Server was started with success !!!");
    }
}
