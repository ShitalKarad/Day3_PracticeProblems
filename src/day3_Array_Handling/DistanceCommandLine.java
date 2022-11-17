package day3_Array_Handling;

import java.util.Scanner;

public class DistanceCommandLine {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x,y values ");
        int x = sc.nextInt();
        int first = x*x;
        int y = sc.nextInt();
        int second = y*y;
        double sum = first + second;
        double distance = Math.sqrt(sum);
        System.out.println("Distance "+ distance);
    }

}
