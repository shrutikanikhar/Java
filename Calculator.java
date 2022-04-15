package kkYoutube;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char operator;
        System.out.println("Please enter the first number: ");
        int num1= sc.nextInt();
        System.out.println("Please enter the second number: ");
        int num2= sc.nextInt();
        System.out.println("Please enter the operator among +,-,*,/ : ");
        operator = sc.next().charAt(0);
        if (operator =='+')
        {
            int sum= num1+num2;
            System.out.println("The sum is: "+sum);
        }
        else if (operator=='-')
        {
            int subtraction= num1-num2;
            System.out.println("The subtraction is: "+subtraction);
        }
        else if (operator=='*')
        {
            int multiplication= num1*num2;
            System.out.println("The multiplication is: "+multiplication);
        }
        else if (operator=='/')
        {
            int division= num1/num2;
            System.out.println("The division is: "+division);
        }
    }
}
