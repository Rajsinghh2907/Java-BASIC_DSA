package STRING;

public class print_letter {
    public static void printchar(String name) {
        for(int i = 0; i< name.length(); i++){
            System.out.print(name.charAt(i) + " ");
            
        }
        
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "Raj Kumar Singh";
        printchar(name);
        
    }
    
}
