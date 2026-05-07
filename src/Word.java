import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String s= scanner.nextLine();

        int upper_chars= 0;
        int lower_chars= 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                upper_chars++;
            }
            if(Character.isLowerCase(s.charAt(i))){
                lower_chars++;
            }
        }

        if(upper_chars > lower_chars){
            s= s.toUpperCase();
        }
        else{
            s= s.toLowerCase();
        }
        System.out.println(s);
    }
}