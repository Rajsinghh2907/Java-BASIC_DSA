package ARRAY.seconddimension_array;
import java.util.*;
public class create2Darray {
    public static void main(String[] args) {
        
        int matrix[] [] = new int[3][3];

        int n = 3;  //WE also use matrix.length
        int m = 3;   // WE also use matrix[0].length
        Scanner sc = new Scanner (System.in);

        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
                
            }
        }

        // for print
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m; j++){
                 System.out.print(matrix[i][j] + " ");
                }
     System.out.println();
        }

       sc.close();
    }
    
}
