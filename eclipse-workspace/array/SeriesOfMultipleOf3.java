package array;

import java.util.Scanner;

class SeriesOfMultipleOf3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();

        for(int i=1; i<=length; i++)
        {
            System.out.println("3x" +i+ "=" +(3*i) );
        }
    }
}