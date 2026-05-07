import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int num_games= scanner.nextInt();
        scanner.nextLine();
        String whos_win= scanner.nextLine();

        int count_A= 0;
        int count_D= 0;
        for(int i=0; i<whos_win.length(); i++){
            if(whos_win.charAt(i) == 'A'){
                count_A++;
            }
            if(whos_win.charAt(i) == 'D'){
                count_D++;
            }
        }

        if(count_A > count_D){
            System.out.println("Anton");
        }
        else if(count_D > count_A){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}