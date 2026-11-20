import java.util.Scanner;

public class J24_ForLoop {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
// for loop=execute some code  a certain amount of times
        System.out.println("How mant times you want to loop: ");
        int max = sc.nextInt();
        for(int i=1; i<= max; i++){
            System.out.println(i);
        }


        int start=10;
        for(int i = start;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Hppy bday");


        sc.close();
    }
    
}
//for each loop in array
