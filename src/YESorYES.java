import java.util.Scanner;

public class YESorYES {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            String s= scanner.next();
            s= s.toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}