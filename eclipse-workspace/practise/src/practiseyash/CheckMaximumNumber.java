package practiseyash;

public class CheckMaximumNumber{
    int check(int arr[])
    {
          int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
max=arr[i];
        
        }
    }
    return max;
}
    
    public static void main(String[] args) {
CheckMaximumNumber obj=new CheckMaximumNumber();
int arr[]={1,2,3,4,5};
System.out.println(obj.check(arr));
    }
    
    }
  

    

