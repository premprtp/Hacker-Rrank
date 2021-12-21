//Problem:--  https://www.hackerrank.com/challenges/java-if-else/problem

import java.io.*;
import java.util.*;

public class Java_if_else {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 ==0) {
            if (n >=6 && n <= 20) {
                System.out.print("Weird");
            }
            else if (n >= 2 && n <= 5) {
                System.out.print("Not Weird");
            }
            else{
                System.out.print("Not Weird");
            }
        }
        else{
            System.out.print("Weird");
        }
    }
}
