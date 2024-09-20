package function;
class CalculateGajAkadBegaInPlotSqFeetSize
{
    float calculateGaj(int sqfeet)
    {
  float gaj=sqfeet/9;
  return gaj;
    }
   float calculateakad(int sqfeet) 
   {
    float akad=calculateGaj(sqfeet)/4000;
    return akad;
   }
float calculatebega(int sqfeet)
{
    float bega=calculateGaj(sqfeet)/1000;
    return bega;
}
    
    

public static void main(String[] args) {
CalculateGajAkadBegaInPlotSqFeetSize obj=new CalculateGajAkadBegaInPlotSqFeetSize();
System.out.println(obj.calculateGaj(1800));
System.out.println(obj.calculatebega(1800));
System.out.println(obj.calculateakad(1800));
}    
}