## Synopsis

This is a simple example of a simple calculator using [RMI](https://en.wikipedia.org/wiki/Java_remote_method_invocation) and JAVA programming language. The architecture of distributed system is client-server. So, There is a server programm that implements the follows operations of a calculator: addition, subtraction, multiplication and division and a client that can run those operations. 

## How to compile the source code ?

Inside of root folder run the command:

    user> javac src/com/company/*.java

## How to run the server application ?

First is necessary run the [rmiregistry](http://docs.oracle.com/javase/7/docs/api/java/rmi/registry/Registry.html) command to get a registry object to give a name resolution service. Inside of folder src/ execute the command:

    user> rmiregistry

Now is possible run the serve inside of folder src/ with the command:

    user> java com/company/CalculatorServer

## How to run the client application ?

Inside of folder src/ run the command:

    user> java com/company/CalculatorClient

So, the expected output will be:

````
    Adição 45.4 + 60.55 is 105.94999999999999
    Subtraction 45.4 - 60.55 is -15.149999999999999
    Multiplication 45.4 * 60.55 is 2748.97
    Division 45.4 / 60.55 is 0.749793559042114
````

