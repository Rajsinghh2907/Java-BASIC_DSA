package STRING;

public class print_largest_string {
    public static void main(String[] args) {
        String fruit[] = {"apple", "mango", "banana"};

        String Largest = fruit[0];
        for(int i = 1; i<fruit.length; i++){
            if(Largest.compareTo(fruit[i]) < 0 ){
            Largest = fruit[i];
            }

        }
        System.out.println(Largest);
    }
    
}
