package ARRAY;
public class Trapping_water_HARD {

    public static int trapwater(int height[]){
    int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        
        for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int j = n-2; j>=0; j--){
            rightmax[j] = Math.max(height[j], rightmax[j+1]);
        }

        int trapWater = 0;
        for (int k = 0; k<n; k++){
            int waterlvl = Math.min(leftmax[k], rightmax[k]);
            trapWater = trapWater + waterlvl - height[k];
        }
        return trapWater;
        
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapwater(height));
    }
}  



