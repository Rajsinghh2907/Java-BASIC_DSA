package pattern.high_lvl_pattern_wth_fn;

public class Butterfly_print {
    public static void main(String[] args) {
        int n = 18;
     
        //1st Half
        for(int i =1; i<=n; i++){
            //Stars - i
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }

            // Space -2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd Half
        for(int i = n; i>=1; i--){
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }

            // Space -2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
