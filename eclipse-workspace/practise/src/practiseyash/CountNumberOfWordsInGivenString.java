package practiseyash;
class CountNumberOfWordsinGivenString{
    public static void main(String[] args) {
        String str="welcome yash gurjar";
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='y')
            {
                count++;

            }
        }
        System.out.println( count);
        
    }
}