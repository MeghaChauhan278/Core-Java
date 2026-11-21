public class J25_BreakAndContinue {
    public static void main(String[] args) {
        //break : break out of a loop(stop)
        //continue : skip current iteration of a loop(SKIP)

        for(int i=0;i<10;i++){
            if(i==5){
                break;
            }
        System.out.println(i + " ");
        }
        System.out.println();
        for(int j=0;j<10;j++){
            if(j==5){
                continue;
            }
        System.out.print(j + " ");
        }

    }
}

