package function;

public class CalculateTheAreaOfTriangle {
    double check(double side1, double side2)
    {
double area =(side1*side2)/2;
return area;

    }
    public static void main(String[] args) {
       CalculateTheAreaOfTriangle obj=new CalculateTheAreaOfTriangle();
       double side1=10;
       double side2=15;
       
       System.out.println(obj.check(side1, side2));

    }

}
