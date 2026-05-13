import java.util.Scanner;

public class Magnets {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int numberOfMagnets= scanner.nextInt();
        String previous= scanner.next();
        int numberOfGroups= 1;

        for(int i=1; i<numberOfMagnets; i++){
            String current= scanner.next();
            if(!current.equals(previous)){
                numberOfGroups++;
            }
            previous= current;
        }
        System.out.println(numberOfGroups);
    }
}