import java.util.Scanner;
public class Vovels {
    public static String hello(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char c = Character.toLowerCase(str.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                result.append(c);
            }
        }
        return result.toString();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Vovels are:"+hello(input));
        
    }

    
}
