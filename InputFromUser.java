package kkYoutube;
import java.util.*;
public class InputFromUser {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("q")){
            System.out.println("Enter an integer or press q to quit");
            input = sc.next();
        if (!input.equals("q")) {
            int number = Integer.parseInt(input);
            sum = sum + number;
            count++;
        }

    }
        System.out.println("the sum is: "+sum);
}
}

