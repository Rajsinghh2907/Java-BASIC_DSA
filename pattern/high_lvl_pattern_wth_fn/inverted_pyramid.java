package pattern.high_lvl_pattern_wth_fn;

public class inverted_pyramid {

    public static void inverted_pyrami_d(int n){
      for(int i = 1; i<=n; i++){
        //For Spaces
        for(int j = 1 ; j<=n-i; j++){
            System.out.print(" ");
        }

        //Stars
        for(int j=1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      int n = 6;
        inverted_pyrami_d(n);
        
    }
    
}
