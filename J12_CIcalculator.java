import java.util.Scanner;

public class J12_CIcalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double A;
        double P;
        double CI;
        double r;
        int n;
        int t;
        System.out.print("Enter the principal amount: ");
        P=sc.nextDouble();
        System.out.print("Annual interest rate: ");
        r=sc.nextDouble() / 100;
        System.out.print("Number of times interest is compounded per year(n): ");
        n=sc.nextInt();
        System.out.print("Timeperiod: ");
        t=sc.nextInt();

        A=P*Math.pow((1+r/n),n*t);
        //CI=A-P;

        System.out.printf("The compound Interest is : $%.2f\n" , A);



        sc.close();
    }
    
}
