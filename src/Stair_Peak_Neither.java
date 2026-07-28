import java.util.Scanner;

public class Stair_Peak_Neither {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();
        for(int i=0; i<testCases; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();

            if(b>a && b<c){
                System.out.println("STAIR");
            }
            else if(b>a && b>c){
                System.out.println("PEAK");
            }
            else{
                System.out.println("NONE");
            }
        }
    }
}