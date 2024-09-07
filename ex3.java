public class ex3 {
    public static void main(String[] args) {
        String source = "Good afternoon to all";
        String [] var = source.split(" ");
        int c = var.length;
        for(int i=0; i<c;i++)
        {
            for(int j=var[i].length()-1; j>=0; j++){
                System.out.print(var[i]);
            }
        }

    }
    
}
