public class Tictac {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int val = 14;
        for(int i =0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(arr[i][j] == val){
                    System.out.print((i+1)+" "+(j+1));
                    return;
                }
            }
        }
        System.out.print("Not found");
      }
}
