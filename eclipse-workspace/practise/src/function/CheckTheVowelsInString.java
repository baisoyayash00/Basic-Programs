package function;

public class CheckTheVowelsInString {
    int check(String str) 
    {
        
int count=0;
for(int i=0; i<str.length(); i++)
{
    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u')
    {
        count++;
    }
}
    return count ;
}
    

    public static void main(String[] args) {
        CheckTheVowelsInString obj=new CheckTheVowelsInString();
        String str="o";
        System.out.println(obj.check(str));
        
    }

}
