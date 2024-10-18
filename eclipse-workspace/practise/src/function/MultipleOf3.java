package function;

class MultipleOf3{
    boolean check(int num)
    {
 if(num%3==0)
 {
return true;
 }
 return false;
    

    

    }
    public static void main(String[] args) {
       MultipleOf3 obj=new MultipleOf3();
       int arr[]={1,2,3,4,5,6};
        for(int i=0; i<arr.length; i++)
        System.out.println(obj.check(arr[i]));
    }
}