import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n_testCases= scanner.nextInt();
        for(int i=0; i<n_testCases; i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            int c= scanner.nextInt();
            if((a+b)==c || (a+c)==b || (b+c)==a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}