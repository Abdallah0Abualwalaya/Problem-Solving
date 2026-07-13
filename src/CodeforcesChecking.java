import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();
        String str= "codeforces";

        for(int i=0; i<testCases; i++){
            char ch= scanner.next().charAt(0);
            if(str.contains(String.valueOf(ch))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}