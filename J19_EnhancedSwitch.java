import java.util.Scanner;

public class J19_EnhancedSwitch {
    public static void main(String[] args) {
        //Enhanced switch = A replacement to many else if statements
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day=sc.nextLine();

        switch(day){
            case "Monday" -> System.out.println("Weekday");
            case "Tuesday" -> System.out.println("Weekday");
            case "Wednesday" -> System.out.println("Weekday");
            case "Thursday" -> System.out.println("Weekday");
            case "Friday" -> System.out.println("Weekday");

            case "Saturday" ,"Sunday" -> System.out.println("Weekend");

            default-> System.out.println(day + " is not a day");
        }
    }
}
