import java.util.Scanner;

public class InSearchEasyProblem {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n_peopleNumber= scanner.nextInt();
        String result= "EASY";

        for(int i=0; i<n_peopleNumber; i++){
            int answers= scanner.nextInt();
            if(answers == 1) {
                result = "HARD";
            }
        }
        System.out.println(result);
    }
}