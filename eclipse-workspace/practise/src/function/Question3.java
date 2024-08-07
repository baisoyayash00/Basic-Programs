package function;

public class Question3 {
    String check(int num)
    {
      if(num%2==0) 
      {
        return "even";
      } 
      return "odd";
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
for(int i=0; i<=25; i++)
        System.out.println("element" +i+" "+ obj.check(i));
        

    }
}
