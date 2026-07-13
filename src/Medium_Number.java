import java.util.Arrays;
import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int testCases= scanner.nextInt();

        for(int i=0; i<testCases; i++){
           int a= scanner.nextInt();
           int b= scanner.nextInt();
           int c= scanner.nextInt();

           if((a>b && a<c) || (a>c && a<b)) System.out.println(a);
           else if((b>a && b<c) || (b>c && b<a)) System.out.println(b);
           else if((c>a && c<b) || (c>b && c<a)) System.out.println(c);
        }

//        for(int i=0; i<testCases; i++){
//            int[] arr= new int[3];
//            arr[0]= scanner.nextInt();
//            arr[1]= scanner.nextInt();
//            arr[2]= scanner.nextInt();
//
//            Arrays.sort(arr);
//            System.out.println(arr[1]);
//        }
    }
}