import java.util.Scanner;

public class J18_TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=sc.nextDouble();
        sc.nextLine();   // clear buffer

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit=sc.nextLine().toUpperCase();

        //condition ? true : false
        newtemp = (unit.equals("C")) ? (temp-32)*5/9 : (temp*9/5)+32;
        
        System.out.printf("%.2f°%s",newtemp, unit);
        sc.close();
    }
}
