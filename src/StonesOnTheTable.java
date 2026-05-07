import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int number_stones= scanner.nextInt();
        scanner.nextLine();
        String color_stones= scanner.nextLine();

        int min_stones=0;
        for(int i=0; i<number_stones -1; i++){
            if(color_stones.charAt(i) == color_stones.charAt(i+1)){
                min_stones ++;
            }
        }
        System.out.println(min_stones);
    }
}