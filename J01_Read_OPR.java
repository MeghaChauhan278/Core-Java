import java.util.Scanner;

public class J01_Read_OPR {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = sc.nextLine();  //for string

    
    System.out.print("Enter age: ");
    int age = sc.nextInt();      //for int

    System.out.print("what is your gpa? : ");
    double gpa = sc.nextDouble();  // for double

    System.out.print("are u a student? (true/false): ");
    boolean isStudent = sc.nextBoolean(); //for boolean

    
    System.out.println("Hi " + name);
    System.out.println("your age is " + age);
    System.out.println("your gpa is " + gpa);
    if(isStudent){
        System.out.println("You are enrolled as a student");
    }
    else{
        System.out.println("You are not enrolled as a student");
    }
    sc.close();
    }
}
    /*
    System.out.print("Enter age: ");
    int age = sc.nextInt();

    ->  sc.nextLine();  <-


    System.out.print("Enter name: ");
    String name = sc.nextLine();
    
    System.out.println("your age is " + age);
    System.out.println("Hi " + name);
     */
