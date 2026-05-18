import java.util.Scanner;

public class AntonPolyhedrons {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int n_numberOfPolyhedrons= scanner.nextInt();
        int totalFaces= 0;

        for(int i=0; i<n_numberOfPolyhedrons; i++){
            String s= scanner.next();
            if(s.equals("Tetrahedron")){
                totalFaces += 4;
            }
            else if(s.equals("Cube")){
                totalFaces += 6;
            }
            else if(s.equals("Octahedron")){
                totalFaces += 8;
            }
            else if(s.equals("Dodecahedron")){
                totalFaces += 12;
            }
            else if(s.equals("Icosahedron")){
                totalFaces += 20;
            }
        }
        System.out.println(totalFaces);
    }
}