package practiseyash;
class ReverseNumber{
    public static void main(String[] args) {
        int num=1239;
        int sum=0;
        while(num!=0)
        {
            int d=num%10;
            sum=sum*10+d;
            num=num/10;
        
        }
        System.out.println(sum);
    }
}