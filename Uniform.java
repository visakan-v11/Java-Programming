public class Uniform {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{3,5,7},{7,3,9}};
        int len = arr.length;
        int fum = 0;
        int bum = 0;
        for(int i =0; i<len; i++){
            for(int j = 0; j<len; j++){
                if(arr[i][j]%2 == 0){
                    fum+=1;
                }
                if(arr[i][j]%2!=0){
                    bum+=1;
                }
            }
        }
        if(fum==0 || bum == 0){
          System.out.print("Yes");
        }
        else{
          System.out.print("No");
        }
      }
}
