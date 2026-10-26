import java.util.Random;
public class J07_RandomNO {
    public static void main(String args[]){
        Random random = new Random();
        
        int number;
        double number1;
        boolean isHeads;

        number = random.nextInt(1,10);
        number1 = random.nextDouble(1,10);
        isHeads = random.nextBoolean();

        System.out.println(number);
        System.out.println(number1);
        System.out.println(isHeads);


    }
}
