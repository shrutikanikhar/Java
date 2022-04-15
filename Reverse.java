package kkYoutube;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int sum=0;
        while(number>0)
        {
            int rem= number%10;
            number= number/10;
            sum= sum*10+rem;

        }
        System.out.println(sum);
    }
}
