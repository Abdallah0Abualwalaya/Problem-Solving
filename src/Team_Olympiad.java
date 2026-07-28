import java.util.ArrayList;
import java.util.Scanner;

public class Team_Olympiad {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int num_children= scanner.nextInt();
        ArrayList<Integer> programmers= new ArrayList<>();
        ArrayList<Integer> mathematicians= new ArrayList<>();
        ArrayList<Integer> sportsmen= new ArrayList<>();

        for(int i=1; i<=num_children; i++){
            int type= scanner.nextInt();

            if(type == 1){
                programmers.add(i);
            }
            else if(type == 2){
                mathematicians.add(i);
            }
            else{
                sportsmen.add(i);
            }
        }

        int temas= Math.min(programmers.size(), Math.min(mathematicians.size(), sportsmen.size()));
        System.out.println(temas);

        for(int i=0; i<temas; i++){
            System.out.println(programmers.get(i) + " " + mathematicians.get(i) + " " + sportsmen.get(i));
        }
    }
}