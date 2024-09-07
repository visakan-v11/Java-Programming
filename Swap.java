public class Swap {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = new int[3][3];
        int len = arr.length;
        for(int i =0; i<len; i++){
            for(int j=0; j<len;j++){
                b[j][i] = arr[i][j];
            }
        }
        for(int i =0; i<len; i++){
            for(int j=0; j<len;j++){
                System.out.print(b[j][i]);
            }
            System.out.println();
        }

    }
}
