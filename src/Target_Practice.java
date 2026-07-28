import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int score= 0;

            for(int row=0; row<10; row++){
                String str= scanner.next();

                for(int col=0; col<10; col++){
                    if(str.charAt(col) == 'X'){
                        int distance= Math.min(Math.min(row, 9-row), Math.min(col, 9-col));
                        score += distance +1;
                    }
                }
            }
            System.out.println(score);
        }
    }
}