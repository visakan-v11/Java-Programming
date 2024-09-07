public class Z {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        int sum1 = 0;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i==0 || i == len-1 || j==len-i-1 ){
                    sum1 += arr[i][j];
            }
        }
        
    }System.out.print(sum1);
}
}