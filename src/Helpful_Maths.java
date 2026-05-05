import java.util.Arrays;
import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String expresion= scanner.nextLine();

        String[] arr= expresion.split("\\+");

        Arrays.sort(arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print("+");
            }
        }
    }
}