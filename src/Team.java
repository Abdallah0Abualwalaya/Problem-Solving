import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int num_questions= scanner.nextInt();
        scanner.nextLine();

        int result=0;
        for(int i=1; i<=num_questions; i++){
            String num_answers= scanner.nextLine().trim();
            int count=0;
            for(int j=0; j<num_answers.length(); j++){
                if(num_answers.charAt(j) == '1'){
                    count++;
                }
            }

            if(count>=2){
                result++;
            }
        }
        System.out.println(result);
    }
}