import java.util.Scanner;

public class J22_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        String name="";
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name=sc.nextLine();
        }
        System.out.println("Hello "+ name);
//while loop checks the condition before executing the loop,
// do-while executes the loop once and then checks the condition
        //while loop
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        // do while loop
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }
        while(j <= 5);
    

        sc.close();
    }
    
}

