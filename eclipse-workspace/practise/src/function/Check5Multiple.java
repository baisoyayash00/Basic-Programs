package function;

public class Check5Multiple {
    String check(int num)
    {
        if(num%5==0)
        return "multipleof5";
    {
      
    }

        
        return "not a multiple of 5";
    }
  
    public static void main(String[] args) {
      Check5Multiple obj= new Check5Multiple();
      int n=25;
      System.out.println(obj.check(n));
      int n2=39;
      System.out.println(obj.check(n2));
    }








}
