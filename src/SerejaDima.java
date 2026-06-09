import java.util.Scanner;

public class SerejaDima{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int[] cards= new int[n];

        for(int i=0; i<n; i++){
            cards[i]= scanner.nextInt();
        }

        int left= 0;
        int right= n-1;
        int sereja= 0;
        int dima= 0;
        boolean isSereja= true;

        while(left <= right){
            int choosen= 0;

            if(cards[left] > cards[right]){
                choosen= cards[left];
                left++;
            }
            else{
                choosen= cards[right];
                right--;
            }

            if(isSereja){
                sereja += choosen;
            }
            else{
                dima += choosen;
            }

            isSereja = !isSereja; //swapping the order
        }
        System.out.println(sereja + " " + dima);
    }
}