import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int number_persons= scanner.nextInt();
        int height_fence= scanner.nextInt();

        int fence_width= 0;
        for(int i=1; i<=number_persons; i++){
            int height_persons= scanner.nextInt();
            if(height_persons > height_fence){
                fence_width += 2;
            }
            else{
                fence_width += 1;
            }
        }
        System.out.println(fence_width);
    }
}