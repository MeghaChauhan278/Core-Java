import java.util.Scanner;
public class J09_Hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.print("Enter length: ");
        a=sc.nextDouble();
        System.out.print("Enter breadth: ");
        b=sc.nextDouble();

        c= Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypo is : " + c + "cm");

        sc.close();
    }
    
}
