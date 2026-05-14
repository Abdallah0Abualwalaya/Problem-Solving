import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        String word= scanner.next();
        HashSet<Character> chrs= new HashSet<>();
        word= word.toLowerCase();

        for(int i=0; i<word.length(); i++){
            chrs.add(word.charAt(i));
        }

        if(chrs.size() == 26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}