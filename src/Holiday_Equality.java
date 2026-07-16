import java.util.Arrays;
import java.util.Scanner;

public class Holiday_Equality {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int num_citizens= scanner.nextInt();
        int[] welfare= new int[num_citizens];
        int min_burles= 0;

//        for(int i=0; i<num_citizens; i++){
//            welfare[i]= scanner.nextInt();
//        }
//
//        Arrays.sort(welfare);
//
//        for(int i=0; i<num_citizens; i++){
//            min_burles += welfare[num_citizens-1] - welfare[i];
//        }


        int max= 0;
        for(int i=0; i<num_citizens; i++){
            welfare[i]= scanner.nextInt();
            if(welfare[i]>max){
                max= welfare[i];
            }
        }

        for(int i=0; i<num_citizens; i++){
            min_burles += max - welfare[i];
        }

        System.out.println(min_burles);
    }
}