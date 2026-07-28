import java.util.Scanner;

public class Dislike_Threes {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int k= scanner.nextInt();
            int count= 0;
            int number= 1;

            while(true){
                if(number%3 != 0 && number%10 != 3){
                    count++;

                    if(count == k){
                        System.out.println(number);
                        break;
                    }
                }
                number++;
            }
        }
    }
}