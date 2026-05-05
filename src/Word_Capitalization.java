import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String s= scanner.nextLine();

        String result= Character.toUpperCase(s.charAt(0)) + s.substring(1);

        System.out.println(result);
    }
}