import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String s_Berlandish= scanner.nextLine();
        String t_Birlandish= scanner.nextLine();

        String reversed= "";
        for(int i= t_Birlandish.length()-1; i>=0; i--){
            reversed += t_Birlandish.charAt(i);
        }

        if(reversed.equals(s_Berlandish)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}