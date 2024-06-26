package pattern.high_lvl_pattern_wth_fn;

public class Floyds_triangle {
    public static void floyds_triangle(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count + " ");
                  count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyds_triangle(10);
    }
    
}
