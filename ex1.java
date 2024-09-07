public class ex1 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i%2 == 0){
                  System.out.print(arr[j][i]+" ");
                }
                else{
                  System.out.print(arr[len-j-1][i]+" ");
                }
            }
        }
    }
}
