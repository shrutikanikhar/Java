package kkYoutube;
import java.util.*;
public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
        int gcd= 0;
        for( int i=1; i<=num1;i++)
        {
            if( num1%i==0 && num2%i==0)
                gcd = i;
        }
        System.out.println("GCD is: "+gcd);
        int lcm;
        lcm= num1*num2/gcd;
        System.out.println("LCM is: "+lcm);

    }
}