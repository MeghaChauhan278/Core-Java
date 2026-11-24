public class J27_Method {
    public static void main(String[] args) {
      
        String name = "Spongebob";
        int age=25;

        happyBirthday(name,age);
                    //{args}


        double result = square(3);
        System.out.println(result);            
    }                             //{parameters}
    static void happyBirthday(String name,int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d year old!\n",age);
    }
    static double square(double number){
        return number*number;
    }
}
//names of parameters can be different from args
//when no return type use void