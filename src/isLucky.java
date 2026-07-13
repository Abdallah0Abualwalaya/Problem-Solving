import java.util.Scanner;

public class isLucky {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            String lucky= scanner.next();
            int first3= 0;
            int last3= 0;

            for(int j=0; j<6; j++){
                if(j<3){
                    first3 += lucky.charAt(j) - '0';
                }
                else{
                    last3 += lucky.charAt(j) - '0';
                }
            }

            if(first3 == last3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}