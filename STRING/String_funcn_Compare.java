package STRING;

public class String_funcn_Compare {
    public static void main(String[] args) {
        String s1 ="Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){
           System.out.println("String are equal"); 
        }
        else{
            System.out.println("String are NOT equal");
        }

        if(s1 == s3){
           System.out.println("String are equal"); 
        }
        else {
            System.out.println("String are NOT equal");
               //s1==s3 show not equal because new keyword are taken and it point to old string
        }

         // we have to use Function s1.equals(s3 )
        if(s1.equals(s3)){
           System.out.println("String are equal"); 
        }
        else{
            System.out.println("String are NOT equal");
    }
    
   }
}
