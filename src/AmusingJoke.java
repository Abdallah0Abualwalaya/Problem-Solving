import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String guest= scanner.nextLine();
        String host= scanner.nextLine();
        String pile= scanner.nextLine();

        int[] count= new int[26]; //all capital letters

        //tracing guest string
        for(int i=0; i<guest.length(); i++){
            char ch= guest.charAt(i);
            count[ch - 'A']++;
        }

        //tracing host string
        for(int i=0; i<host.length(); i++){
            char ch= host.charAt(i);
            count[ch - 'A']++;
        }

        //tracing pile string
        for(int i=0; i<pile.length(); i++){
            char ch= pile.charAt(i);
            count[ch - 'A']--;
        }

        for(int i=0; i<26; i++){
            if(count[i] != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}