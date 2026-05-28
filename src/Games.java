import java.util.Scanner;

public class Games {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int games= scanner.nextInt();
        int[] home= new int[games];
        int[] guest= new int[games];

        for(int i=0; i<games; i++){
            home[i]= scanner.nextInt();
            guest[i]= scanner.nextInt();
        }

        int count= 0;
        for(int i=0; i<games; i++){
            for(int j=0; j<games; j++){
                if(home[i] == guest[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}