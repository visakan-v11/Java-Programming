import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = scanner.nextLine();
        int len = x.length();
        String rev = "";
        for(int i = len - 1; i >= 0; i--){
            rev = rev + x.charAt(i);
        }
        if(x.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        scanner.close();
    }
}
