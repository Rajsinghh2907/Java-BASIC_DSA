package STRING;

public class length {
    public static void main(String[] args) {
        String name = "Raj Kumar Singh";
        String Firstname = "Raj";
        String Lastname = "Singh";
        System.out.println(Firstname + " " + Lastname); //Concatenation
        System.out.println(name.length());
        System.out.println(Firstname.charAt(2));

        for(char i = 'A'; i<='Z'; i++){
            name = name + i;
           
        }
         System.out.println(name);
    }
    
}
