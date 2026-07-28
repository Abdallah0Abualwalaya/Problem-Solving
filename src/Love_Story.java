import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();
        String given= "codeforces";

        for(int i=0; i<testCases; i++){
            String str= scanner.next();
            int count= 0;

            for(int k=0; k<str.length(); k++){
                if(str.charAt(k) != given.charAt(k)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}