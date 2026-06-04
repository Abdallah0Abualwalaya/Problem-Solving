import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int first_score= scanner.nextInt();
        int min= first_score;
        int max= first_score;
        int count= 0;

        for(int i=1; i<n; i++){
            int score= scanner.nextInt();
            if(score > max){
                count++;
                max= score;
            }
            else if(score < min){
                count++;
                min= score;
            }
        }
        System.out.println(count);
    }
}