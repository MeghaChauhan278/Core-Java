import java.util.Scanner;

public class J10_printf {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = "Broc";
    char firstletter = 'B';
    int age = 30;
    double height = 60.555;
    boolean isEmployed = true;

    System.out.printf("Hlw %s\n", name);
    System.out.printf("Your name starts with a %c\n", firstletter);
    System.out.printf("%.1f\n", height ); // to print 1 digit after decimal
    System.out.printf("%s is %d years old", name, age);
    
    sc.close();

    }
}

/*
s → string
c → character
d → integer
f → floating number or double
b → boolean
*/