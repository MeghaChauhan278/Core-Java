public class J17_TernaryOperator {
    public static void main(String[] args) {
        
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 55;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        int num=3;
        String evenOrOdd = (num%2==0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
  }
}

