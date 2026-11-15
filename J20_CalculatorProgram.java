import java.util.Scanner;

public class J20_CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation=true;

        System.out.print("Enter the 1st no: ");
        num1=sc.nextDouble();

        System.out.print("Enter an operator(+,-,*,/,^): ");
        operator=sc.next().charAt(0);

        System.out.print("Enter the 2nd no: ");
        num2=sc.nextDouble();

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if(num2==0){
                    System.out.println("can't divide by 0");
                    validOperation=false;
                }else{
                    result = num1/num2;
                }
            }
            case '^' -> result = Math.pow(num1,num2);
            default -> {
                System.out.println("Invalid operator");
                validOperation=false;
            }
        }
        if(validOperation){
            System.out.println(result);
        }
        sc.close();
    }
}
