import java.util.Scanner;

public class QueueSchool {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int t= scanner.nextInt();
        scanner.nextLine();
        String s= scanner.nextLine();

        char[] queue= s.toCharArray();
        for(int time=0; time<t; time++){
            for(int i=0; i<n-1; i++){
                if(queue[i]=='B' && queue[i+1] == 'G'){
                    char temp= queue[i];
                    queue[i]= queue[i+1];
                    queue[i+1]= temp;
                    i++;
                }
            }
        }
        System.out.println(queue);
    }
}