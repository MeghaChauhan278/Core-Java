import java.util.Scanner;

public class J21_LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // && = AND
        // || = OR
        // ! = NOT

        double temp=20;
        boolean isSUnny = false;
        String username;

        if(temp<=30 && temp>=0 && isSUnny){
            System.out.println("The weather is good");

        }else if(temp<=30 && temp>=0 && !isSUnny){
            System.out.println("Cloudy");

        }else if(temp>30 || temp<0){
            System.out.println("Bad");
        }

        System.out.print("Enter ur username: ");
        username=sc.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println(("Username mst be b/w 4-12 char"));
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("username must not contain spaces or underscore");

        }
        else{
            System.out.println("Welcome "+ username);
        }
        sc.close();
    }
}
