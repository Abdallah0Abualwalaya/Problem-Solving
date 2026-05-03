import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int row=0, column=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                int x= scanner.nextInt();
                if(x==1){
                    row=i;
                    column=j;
                }
            }
        }
        int moves= Math.abs(row-3) + Math.abs(column-3);
        System.out.println(moves);
    }
}