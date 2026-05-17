import java.util.HashSet;
import java.util.Scanner;

public class BeGuy {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int numberOfLevels= scanner.nextInt();
        HashSet<Integer> levels= new HashSet<>();

        int p= scanner.nextInt();
        for(int i=0; i<p; i++){
            levels.add(scanner.nextInt());
        }

        int q= scanner.nextInt();
        for(int i=0; i<q; i++){
            levels.add(scanner.nextInt());
        }

        if(levels.size() == numberOfLevels){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}