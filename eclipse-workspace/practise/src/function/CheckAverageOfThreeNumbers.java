package function;

public class CheckAverageOfThreeNumbers {
    int check(int num1,int num2, int num3)
    {
        int sum=num1+num2+num3;
int  percentage=sum*100/300;

    return percentage;
}
    
    
    
    public static void main(String[] args) {
        CheckAverageOfThreeNumbers obj=new CheckAverageOfThreeNumbers();
        int num1=25;
        int num2=45;
        int num3=65;
        System.out.println(obj.check(num1, num2, num3));
        
    }

}
