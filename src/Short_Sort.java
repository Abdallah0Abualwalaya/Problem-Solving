import java.util.Scanner;

public class Short_Sort {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int test_cases= scanner.nextInt();

        for(int i=0; i<test_cases; i++){
            String str= scanner.next();

            if(str.equals("abc") || str.equals("acb") || str.equals("bac") || str.equals("cba")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}