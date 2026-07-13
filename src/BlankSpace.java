import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int numsLen= scanner.nextInt();
            int current= 0;
            int max= 0;

            for(int j=0; j<numsLen; j++){
                int x= scanner.nextInt();
                if(x == 0){
                    current++;
                    max= Math.max(max, current);
                }
                else{
                    current= 0;
                }
            }
            System.out.println(max);
        }
    }
}