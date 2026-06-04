import java.util.Scanner;

public class SoftDrinks {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int l= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        int p= scanner.nextInt();
        int nl= scanner.nextInt();
        int np= scanner.nextInt();

        int drink_toasts= (k*l)/nl;
        int lime_toasts= c*d;
        int salt_toasts= p/np;

        int total_toasts= Math.min(drink_toasts, Math.min(lime_toasts, salt_toasts));
        System.out.println(total_toasts/n);
    }
}