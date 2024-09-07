public class Matrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        for(int i =0; i<len; i++){
            for(int j=0; j<len;j++){
              if(i == j || i>j){
                arr[i][j] = arr[i][j];
              }
              else{
                arr[i][j] = 0;
              }
            }
        }
        for(int i =0; i<len; i++){
            for(int j=0; j<len;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i =0; i<len; i++){
            for(int j=0; j<len;j++){
              if(arr[i][j]!=0 && i>j){
                System.out.println("Upper Triangular Matrix");
                return;
              }
            }
        }
        System.out.println("Not an Upper Triangular matrix");

    }
}
