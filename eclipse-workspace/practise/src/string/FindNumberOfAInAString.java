package string;

public class FindNumberOfAInAString {
    public static void main(String[] args) {
        String str="yash baisoya";
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a')
{
    count++;
}
        }
        System.out.println(count);
    }

}
