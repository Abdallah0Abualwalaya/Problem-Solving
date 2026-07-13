import java.util.Scanner;

public class Broze {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        String in= scanner.nextLine();
        String out= "";

        for(int i=0; i<in.length(); i++){
            if(in.charAt(i) == '.'){
                out += "0";
            }
            else if(in.charAt(i) == '-' && in.charAt(i+1) == '.'){
                out += "1";
                i++;
            }
            else{
                out += "2";
                i++;
            }
        }
        System.out.println(out);
    }
}