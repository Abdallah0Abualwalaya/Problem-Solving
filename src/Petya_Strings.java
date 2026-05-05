import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String a= scanner.nextLine();
        String b= scanner.nextLine();

        a= a.toLowerCase();
        b= b.toLowerCase();

        int result= a.compareTo(b);

        if(result < 0){
            System.out.println("-1");
        }
        else if(result > 0) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}