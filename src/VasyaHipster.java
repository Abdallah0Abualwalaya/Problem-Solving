import java.util.Scanner;

public class VasyaHipster {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int redSocks= scanner.nextInt();
        int blueSocks= scanner.nextInt();

        int numberOfDaysCanWearsDifferentSocks= Math.min(redSocks, blueSocks);
        int numberOfDaysCanWearsSameSocks= (Math.max(redSocks, blueSocks) - Math.min(redSocks,blueSocks)) / 2;

        System.out.print(numberOfDaysCanWearsDifferentSocks + " " + numberOfDaysCanWearsSameSocks);
    }
}