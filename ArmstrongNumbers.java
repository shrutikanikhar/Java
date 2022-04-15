package kkYoutube;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1= sc.nextInt();
        System.out.println("enter second number: ");
        int num2= sc.nextInt();
        for(int i = num1; i<=num2;i++)
        {
            int sum=0;
            int rem;
            int check= i;
            while(check!=0)
            {
                rem = check%10;
                sum= sum+(rem*rem*rem);
                check= check/10;
            }
            if( sum== i)
            {
                System.out.println(i+" is an armstrong number");
            }
        }
    }

}
