package com.bptn.course;

import java.util.Scanner;

public class CalculatorExample {

	public static void main(String[] args) {
        
        double num1, num2, result;
        int condition, choice;

        Scanner scanner = new Scanner(System.in);
        do {
        
            System.out.println("/*................Calculator Menu................*/");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for finding Square");
            System.out.println("Press 6 for finding Square root");
            System.out.println("Press 7 for finding Reciprocal");

            choice=scanner.nextInt();
            if(choice == 1) {
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            result = num1 + num2;
            System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if(choice == 2) {
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            result = num1 - num2;
            System.out.println("The difference of the numbers " +  num1 + " and " + num2 + " is = " + result);
            } else if(choice == 3) {
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            result = num1 * num2;
            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
            } else if(choice == 4) {
            System.out.println("Enter the first number");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            num2 = scanner.nextDouble();
            result = num1 / num2;
            System.out.println("The quotient of the numbers " + num1 + " and " + num2 + " is = " + result);
            System.out.println("The remainder is = " + (num1 % num2));
            }
            
            else if(choice == 5) {
            System.out.println("Enter a number to find square");
            num1 = scanner.nextDouble();
            result = (num1 * num1);
            System.out.println("The square of " + num1 + " is = " + result);
            }
            
            else if(choice == 6) {
            System.out.println("Enter the number to find square root");
            num1 = scanner.nextDouble();
            result = Math.sqrt(num1);
            System.out.println("The square of the number " + num1 + " is = " + result);
            } else if(choice == 7) {
            System.out.println("Enter the number to find Reciprocal");
            num1 = scanner.nextDouble();
            result = 1/num1;
            System.out.println("The reciprocal of the number " + num1 + " is = " + result);
            } else {
                System.out.println("invalid choice");
            }

            System.out.println("To continue calculation Press 1 or Press any other to exit");

            condition = scanner.nextInt();
        
        } while(condition ==1);

    }


}


