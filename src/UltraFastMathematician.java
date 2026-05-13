import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String first= scanner.next();
        String sceond= scanner.next();
        String result= "";

        for(int i=0; i<first.length(); i++){
            if(first.charAt(i) == sceond.charAt(i)){
                result += 0;
            }
            else{
                result += 1;
            }
        }
        System.out.print(result);
    }
}