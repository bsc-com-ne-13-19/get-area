import java.util.Scanner;
public class Areas{
    public static void main(String []args){
        // print out a string
        System.out.println("\'the area will be displayed here\'");
        // prompt user
        Scanner input = new Scanner(System.in); 
        System.out.println("enter the value of breadth ");
        double breadth= input.nextDouble();
     System.out.println(" enter the length value ");
        double length= input.nextDouble();
      
       
System.out.print("the area of the rectangle is " +returnarea(breadth,length));
    }
    public static double returnarea(double br,double ln){
        double area =br*ln;
        return area;
    }

    
}