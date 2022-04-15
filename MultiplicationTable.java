package kkYoutube;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number= sc.nextInt();
        int number1=0;
        for(int i= 1; i<=25; i++)
        {
            number1= number*i;
            System.out.println(number+"*"+i+"  "+number1);
        }
    }
}
