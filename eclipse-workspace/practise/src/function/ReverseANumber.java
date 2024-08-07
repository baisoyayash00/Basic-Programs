package function;

public class ReverseANumber {
    public static void main(String[] args) {
        int num=1259;
        //9521
        int sum=0;
        while (num!=0)
        {
            int d=num%10;
           // System.out.println(d);
            sum=sum*10+d;
            System.out.println(sum);
            
            num=num/10;
           // System.out.println(num);
        }

       // System.out.println(sum);
    }

}
