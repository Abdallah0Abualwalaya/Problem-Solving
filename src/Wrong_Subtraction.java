import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n=  scanner.nextInt(); //n: the number from which Tanya will subtract
        int k= scanner.nextInt(); // k: the number of subtractions correspondingly

        for(int i=1; i<=k; i++){
            if(n%10 == 0){
                n /= 10;
            }
            else{
                n -= 1;
            }
        }
        System.out.println(n);
    }
}