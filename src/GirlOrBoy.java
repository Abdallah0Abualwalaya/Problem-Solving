import java.util.HashSet;
import java.util.Scanner;

public class GirlOrBoy {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String name= scanner.nextLine();

        HashSet<Character> set= new HashSet<>();

        for(int i=0; i<name.length(); i++){
            set.add(name.charAt(i));
        }

        if(set.size() % 2 == 0){
            System.out.println("CHAT WITH HER");
        }
        else{
            System.out.println("IGNORE HIM");
        }
    }
}