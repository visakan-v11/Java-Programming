public class Equal {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        int fum = 0;
        int bum = 0;
        for(int i =0; i<len; i++){
            fum += arr[i][i];
            bum += arr[i][len-i-1];
        }
        if(fum==bum){
          System.out.print("Equal");
        }
        else{
          System.out.print("Not Equal");
        }
      }
}
