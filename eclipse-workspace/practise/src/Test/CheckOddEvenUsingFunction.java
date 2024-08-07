package Test;

public class CheckOddEvenUsingFunction {
    String check(int num)
    {
if(num%2==0)
{
    return "even";
}
return "odd";
    }
    public static void main(String[] args) {
        CheckOddEvenUsingFunction obj=new CheckOddEvenUsingFunction();
        int arr[]={1, 2, 3, 4, 5};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("element " + arr[i]+ " " + obj.check(arr[i]));
        }
        
    }

}
