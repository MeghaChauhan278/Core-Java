import java.util.Random;
import java.util.Scanner;

public class J23_NoGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempt=0;
        int min=1;
        int max=100;
        int randomNum = random.nextInt(min,max+1);

        System.out.println(("Number Guessing Game"));
        System.out.printf("Guess a no b/w %d-%d\n",min,max);

        do{
            System.out.print("Enter a guess: ");
            guess=sc.nextInt();
            attempt++;

            if(guess < randomNum){
                System.out.println("Too low!");
            }else if(guess>randomNum){
                System.out.println("Too high!");
            }else{
                System.out.println("COrrect! the no was "+randomNum);
            }

        }while(guess != randomNum);
        sc.close();
    }
}
