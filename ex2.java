import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int val = sc.nextInt();
        int f = n/2;
        int r= (val-1) / m;
        int c = (val-1) % n;
        if(n==m && n%2!=0){
            if(r==c && r==f){
                System.out.print("Rose Flower");
            }
        }
        else if(r%2!=0 || c%2!=0) {
            System.out.print("Mango Tree");
        }
        else{
             System.out.print("Banana Tree");
        }

    }
}