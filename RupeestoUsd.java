package kkYoutube;
import java.util.Scanner;

public class RupeestoUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount in Rupees: ");
        int rupees= sc.nextInt();
        double usd= rupees*0.013;
        System.out.println("The amount in USD is: "+ usd);
    }
}
