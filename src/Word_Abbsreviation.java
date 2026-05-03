import java.util.Scanner;

public class Word_Abbsreviation {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int num_words= scanner.nextInt();
        scanner.nextLine();

        for(int i=1; i<=num_words; i++){
            String word= scanner.nextLine();
            if(word.length() > 10){
                int middle_chars= word.length() -2;
                System.out.println("" + word.charAt(0) + middle_chars + word.charAt(word.length()-1));
            }
            else{
                System.out.println(word);
            }
        }
    }
}