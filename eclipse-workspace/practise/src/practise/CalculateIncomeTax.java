package practise;

public class CalculateIncomeTax {
    public static void main(String[] args) {
        int salary;
        double calculatetax=0, tax;
        salary =1100000;
        if(salary>250000&& salary<500000)
        {
            calculatetax=5/100*salary;
        
        }
        else if(salary>500000 && salary<1000000)
        {
         calculatetax=20/100*salary;
         
         
        }
        else 
        {
            calculatetax=(30/100)*salary;
            
        }
        //calculatetax=5;
        System.out.println(calculatetax);
    }

}
