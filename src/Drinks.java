import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int numberOfDrinks= scanner.nextInt();
        double toltalVolume= 0;

        for(int i=0; i<numberOfDrinks; i++){
            int JuiceVolume= scanner.nextInt();
            toltalVolume += JuiceVolume;
        }
        System.out.println(toltalVolume/numberOfDrinks);
    }
}