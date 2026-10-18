import java.util.Scanner;

public class J02_AreaRECT {
    public static void main(String args []){
        double a=0;
        double b=0;
        double Area=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length :");
         a = sc.nextDouble();
        System.out.print("Enter breadth :");
         b = sc.nextDouble();
         Area = a*b;
        
        System.out.println("Area of rectangle is " + Area );

        sc.close();
    }
    
}
//when you have already initialised value with 0 , no need to reenter datatype again