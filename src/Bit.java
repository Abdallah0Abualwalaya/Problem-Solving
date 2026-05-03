import java.util.Scanner;

public class Bit {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int number_statments= scanner.nextInt();
        scanner.nextLine();

        int x=0;
        for(int i=1; i<=number_statments; i++){
            String statment= scanner.nextLine();
            if(statment.contains("++")){
                x++;
            }
            else if(statment.contains("--")){
                x--;
            }
            else{
                System.out.println("This statment: " + statment + " contains invalid character!");
            }
        }
        System.out.println(x);
    }
}