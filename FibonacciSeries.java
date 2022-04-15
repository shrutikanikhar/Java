package kkYoutube;
import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to get fibonacci series: ");
        int number= sc.nextInt();
        int prev= 0;
        int next= 1;
        for(int i=1; i<=number; i++)
        {
            System.out.print(prev+" ");
            int sum= prev+ next;
            prev= next;
            next= sum;
        }

    }
}