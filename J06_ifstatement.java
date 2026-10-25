
public class J06_ifstatement {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else if(age<0) {
            System.out.println("Not born!");
        } else {
            System.out.println("You are a child");
        }
    }
}