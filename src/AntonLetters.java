import java.util.HashSet;
import java.util.Scanner;

public class AntonLetters {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String s= scanner.nextLine();
        HashSet<Character> letters= new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch>='a' && ch<='z'){
                letters.add(ch);
            }
        }
        System.out.println(letters.size());
    }
}