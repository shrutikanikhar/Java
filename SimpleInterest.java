package kkYoutube;
import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args) {
        System.out.println("Please enter principal amount, time and rate in this order- p, t, r: ");
        Scanner sc= new Scanner(System.in);
        double p= sc.nextDouble();
        double r= sc.nextDouble();
        double t= sc.nextDouble();
        double simpleInterest= p*r*t/100;
        System.out.println("The simple interest is: "+simpleInterest);
    }
}
