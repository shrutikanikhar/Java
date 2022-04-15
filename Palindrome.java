package kkYoutube;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println("Please enter a number: ");
//        Scanner sc= new Scanner(System.in);
//        int number= sc.nextInt();
//        int temp= number;
//        int reminder;
//        int palindrome = 0;
//        while(temp !=0)
//        {
//            reminder= temp%10;
//            palindrome = (palindrome * 10) + reminder;
//            temp= temp/10;
//        }
//        if( number == palindrome)
//        {
//            System.out.println(number+" is a palindrome");
//        }
//        else
//        {
//            System.out.println(number+" is not a palindrome");
//        }
//    }
        String original="";
        String reverse="";
        Scanner sc= new Scanner(System.in);
        original= sc.nextLine();
        int length= original.length();
        for(int i = length-1; i>=0; i-- )
        {
            reverse= reverse+ original.charAt(i);
        }
        if(original.equals(reverse))
        {
            System.out.println(original+" is a palindrome");
        }
        else
        {
            System.out.println(original+" is not a palindrome");
        }
}}
