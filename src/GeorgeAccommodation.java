import java.util.Scanner;

public class GeorgeAccommodation {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n_numberOfRooms= scanner.nextInt();
        int roomsHasFreePlaceForBoth= 0;

        for(int i=0; i<n_numberOfRooms; i++){
            int pi= scanner.nextInt();
            int qi= scanner.nextInt();

            if((qi-pi) >= 2){
                roomsHasFreePlaceForBoth++;
            }
        }
        System.out.println(roomsHasFreePlaceForBoth);
    }
}