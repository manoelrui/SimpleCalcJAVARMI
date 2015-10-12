SIMPLE CALCULATOR

This is a simple example of a simple calculator using RMI and java programming language. The architecture of distributed system is client-server. So, There is a server programm that implements the follows operations of a calculator: addition, subtraction, multiplication and division and a client that can run those operations. 



HOW TO COMPILE THE SOURCE CODE ?

Inside of folder CalculadoraRMI/ run the command:

user> javac src/com/company/*.java



HOW TO RUN SERVER APPLICATION ?

First is necessary run the rmiregistry command to get a registry object to give a name resolution service. Inside of folder CalculatorRMI/src/ execute the command:

user> rmiregistry

Now is possible run the serve inside of folder CalculatorRMI/src/ with the command:

user> java com/company/CalculatorServer



HOW TO RUN THE CLIENT APPLICATION ?

Inside of folder CalculatorRMI/src/ run the command:

user> java com/company/CalculatorClient

So, the expected output will be:

Adição 45.4 + 60.55 is 105.94999999999999
Subtraction 45.4 - 60.55 is -15.149999999999999
Multiplication 45.4 * 60.55 is 2748.97
Division 45.4 / 60.55 is 0.749793559042114


