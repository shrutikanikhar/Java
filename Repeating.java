package kkYoutube;
import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int count=0;
        while(number>0)
        {
            int rem= number%10;
            if(rem==3)
            {
                count++;
            }
            number= number/10;
        }
        System.out.println(count);
    }
}