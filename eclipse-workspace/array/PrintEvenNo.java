package array;

import java.util.Scanner;

class PrintEvenNo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
int length=sc.nextInt();
int count=0;
for(int i=1; i<=length; i++)
{
    if(i%2==0)
    {
        count++;
        {
        System.out.println(count);
    }
}
    }
}
}