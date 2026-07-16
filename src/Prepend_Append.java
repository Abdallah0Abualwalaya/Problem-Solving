import java.util.Scanner;

public class Prepend_Append {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
            int strLen= scanner.nextInt();
            String strFinal= scanner.next();
            int left= 0;
            int right= strLen-1;

            while((left<right) && (strFinal.charAt(left) != strFinal.charAt(right))){
                left++;
                right--;
            }
            System.out.println(right - left + 1);
        }
    }
}