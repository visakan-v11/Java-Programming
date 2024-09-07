import java.util.Scanner;

public class farm {
    public static void main(String[] args) {
        int [][] arr = new int[5][5];
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int c= (n-1) / 5;
        int d = (n-1) % 5;
        if(c==0 || d==0 || d==4) {
            System.out.print("Tomato Field");
        }  
        else{
             System.out.print("Potato");
        }
    }
}