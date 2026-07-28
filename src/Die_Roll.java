import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int y= scanner.nextInt();
        int w= scanner.nextInt();

        int max= Math.max(y,w);
        int dot_points= 7 - max;

        int denominator= 6;

        if(dot_points % 2 == 0){
            dot_points /= 2;
            denominator /= 2;
        }

        if(dot_points % 3 == 0){
            dot_points /= 3;
            denominator /= 3;
        }
        System.out.println(dot_points + "/" + denominator);
    }
}