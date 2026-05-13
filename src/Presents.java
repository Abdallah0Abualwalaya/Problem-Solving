import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfFriends = scanner.nextInt();
        int[] answers= new int[numberOfFriends+1];

        for(int i=1; i<=numberOfFriends; i++){
            int p= scanner.nextInt();
            answers[p]= i;
        }
        for(int i=1; i<=numberOfFriends; i++){
            System.out.print(answers[i] + " ");
        }
    }
}