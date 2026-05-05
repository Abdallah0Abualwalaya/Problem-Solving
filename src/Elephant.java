import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int coordinate_friend= scanner.nextInt();
        int steps= (coordinate_friend+4) / 5;

        System.out.println(steps);
    }
}