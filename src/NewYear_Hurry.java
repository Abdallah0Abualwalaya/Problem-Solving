import java.util.Scanner;

public class NewYear_Hurry {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int contests_time= 240 - k;
        int solving_time= 0;
        int number_problems= 0;

        for(int i=1; i<=n; i++){
            solving_time= 5 * i;
            contests_time -= solving_time;

            if(contests_time >= 0){
                number_problems++;
            }
        }
        System.out.println(number_problems);
    }
}