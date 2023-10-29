package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Calculator supporting root, factorial , log and power");
        //some changes
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        double num, exp;
        int numm;

        do{
            System.out.println("         Calculator         ");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Input index of desired operation");
            System.out.println("");
            op = reader.nextInt();
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // Square Root
                        System.out.println("Square root Calcuator");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        squareRoot(num);
                        break;

                    case 2: //Factorial
                        System.out.println("Factorial calculator");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        numm = reader.nextInt();
                        factorial(numm);
                        break;

                    case 3: //Natural Log
                        System.out.println("Natural Log Caculator");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        naturalLog(num);
                        break;

                    case 4: //Power
                        System.out.println("Power Calculator");
                        System.out.println("");
                        System.out.print("Enter number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter exponent: ");
                        exp = reader.nextDouble();
                        power(num,exp);
                        break;

                    default:
                        System.out.println("Invalid Input...........EXIT");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static double squareRoot(double num){
        double c = Math.sqrt(num);
        System.out.println("");
        System.out.println("Sqaure Root = "+c);
        System.out.println("");
        logger.info("Executing squareRoot function");
        return c;
    }

    public static int factorial(int num){
        int c = num ;
        for(int i=num-1; i>=1; i--) c = c*i;
        System.out.println("");
        System.out.println("Factorial = "+c);
        System.out.println("");
        logger.info("Executing Factorial function");
        return c;
    }
    public static double naturalLog(double num){
        double c = Math.log(num);
        System.out.println("");
        System.out.println("Natural Log =  "+ c);
        System.out.println("");
        logger.info("Executing natural Log function");
        return c;
    }
    public static double power(double num, double exp){
        double c = Math.pow(num,exp);
        System.out.println("");
        System.out.println("Expontial = "+ c);
        System.out.println("");
        logger.info("Executing Power function");
        return c;
    }
}