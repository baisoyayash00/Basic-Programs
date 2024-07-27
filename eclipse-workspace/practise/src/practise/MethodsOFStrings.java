package practise;

public class MethodsOFStrings {
    public static void main(String[] args) {
     String str =  "Yash baisoya" ;
     System.out.println("lengthofstring" + str.length());
     System.out.println("small leters " + str.toLowerCase());
     System.out.println("big leters" + str.toUpperCase());
     System.out.println("name" + str.trim());
     System.out.println(" substring " + str.substring(4));
     System.out.println(" substring " + str.substring(0,5));
     System.out.println(" startswith " + str.startsWith("Yash"));
     System.out.println(" endswith " + str.endsWith("ya"));
     System.out.println(" char At" + str.charAt(2));
     System.out.println(" indexof " + str.indexOf("sh"));
     System.out.println(" indexof " + str.indexOf("h" , 3));
     System.out.println(" lastindexof " + str.lastIndexOf("y"));
     System.out.println(" lastindexof " + str.lastIndexOf("y" , 9));
     System.out.println("equalsignorecase " + str.equalsIgnoreCase("Yash baisoya"));
    // System.out.println( str.substring));
     System.out.println(str);
    }

}
