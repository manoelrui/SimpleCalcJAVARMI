package com.company;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by rui on 10/3/15.
 */
public interface Calculator extends Remote {
    public double addition(double a, double b) throws RemoteException;

    public double subtraction(double a, double b) throws RemoteException;

    public double multiplication(double a, double b) throws RemoteException;

    public double division(double a, double b) throws RemoteException;
}
