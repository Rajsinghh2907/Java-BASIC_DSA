package pattern.high_lvl_pattern_wth_fn;

public class hollow_reactangle {

    public static void hollow_rectangle(int totrows, int totcolumn){
        for(int i = 1; i<=totrows; i++){
            for(int j = 1; j<=totcolumn; j++){
                if(i == 1 || i == totrows || j == 1 || j == totcolumn){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int totrows = 4;
        int totcolumn = 5;
        hollow_rectangle(totrows,totcolumn);

        
    }
    
}
