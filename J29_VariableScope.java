public class J29_VariableScope {

    static int x=3;  //CLASS
    public static void main(String[] args) {
        //variable scope =where a variable can be accessed

        int x=1;  //LOCAL
        System.out.println(x);

        doSomething();
    }
    static void doSomething(){
        int x=2; //LOCAL
        System.out.println(x);
    }
}

/*
Local variable > class variable (priority)
Each method has its own scope
Same variable name = shadowing happens
*/
