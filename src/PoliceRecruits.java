import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

       int n= scanner.nextInt();
       int police= 0;
       int untreated= 0;

       for(int i=0; i<n; i++){
           int event= scanner.nextInt();
           if(event == -1){
               if(police > 0){
                   police--;
               }
               else{
                   untreated++;
               }
           }
           else{
               police += event;
           }
       }
       System.out.println(untreated);
    }
}