import java.util.Scanner;

public class ChoosingTeam {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n= scanner.nextInt();
        int k= scanner.nextInt();
        int teamMembers= 0;

        for(int i=0; i<n; i++){
            int member= scanner.nextInt();
            if(member <= 5-k){
                teamMembers++;
            }
        }
        System.out.println(teamMembers/3);
    }
}