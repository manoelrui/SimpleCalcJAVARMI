package com.company;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by rui on 10/3/15.
 */
public class CalculatorImp extends UnicastRemoteObject implements Calculator {

    CalculatorImp() throws RemoteException {
        System.out.println("Server Started !!!");
    }

    @Override
    public double addition(double a, double b) throws RemoteException {
        System.out.println("Sum executed !!!");
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) throws RemoteException {
        System.out.println("Subtraction executed !!!");
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) throws RemoteException{
        System.out.println("Multiplication executed !!!");
        return a * b;
    }

    @Override
    public double division(double a, double b) throws RemoteException {
        System.out.println("Division executed !!!");
        return a/b;
    }
}
