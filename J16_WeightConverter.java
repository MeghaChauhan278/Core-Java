import java.util.Scanner;

public class J16_WeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        double lbs;
        double kgs;
        int option;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        option=sc.nextInt();

        if(option==1){
            System.out.print("Enter the weight in kgs: ");
            kgs=sc.nextDouble();
            lbs=kgs*0.453592;
            System.out.printf("The new weight in lbs is: %.2f",lbs);
        }else if(option==2){
            System.out.print("Enter the weight in lbs: ");
            lbs=sc.nextDouble();
            kgs=lbs*2.20462;
            System.out.printf("The new weight in kgs is: %.2f",kgs);

        }
        else{
            System.out.println("Not valid option");
        }
        
        sc.close();
        
    }
}
