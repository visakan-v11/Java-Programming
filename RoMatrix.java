public class RoMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int len = arr.length;
        int[][] rotatedArr = new int[len][len]; // Create a new matrix for rotated elements
        System.err.println(len);

        // Rotate the matrix
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
              rotatedArr[j][i] = arr[i][j];
            }
        }

        // Print the rotated matrix
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                System.out.print(" " + rotatedArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
