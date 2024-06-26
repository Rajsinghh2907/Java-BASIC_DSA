package functions_or_method;

public class binomial_coeff_2 {
    public static int printarr(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
        
    }
    public static int binomialcoeff(int n ,int r) {
        int a =  printarr(n);
        int b =  printarr(r);
        int c = printarr(n-r);
        int binco = a/(b*c);
        return binco;
    }
    public static void main(String[] args) {
        int n = 8;
        int r = 6;

        binomialcoeff(n,r);
        System.out.println(binomialcoeff(n,r));
        
    }
}    
    

