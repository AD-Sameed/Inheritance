import java .util.Scanner;
public class Alter{
    public static String hello(String message){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i += 2){
            result.append(message.charAt(i));
        }

        return result.toString(); 
            
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Alternate Characters:"+ hello(input));       
    }
    
}
