import java.util.Scanner;

public class Creating_Word {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int test_cases= scanner.nextInt();

        for(int i=0; i<test_cases; i++){
            String a= scanner.next();
            String b= scanner.next();

            char temp= a.charAt(0);
            a= b.charAt(0) + a.substring(1);
            b= temp + b.substring(1);

            System.out.println(a + " " + b);
        }
    }
}