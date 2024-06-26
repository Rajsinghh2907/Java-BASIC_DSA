package STRING;

public class path_question {
    public static float getdirection(String path) {
        int x = 0 , y = 0;

        for(int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            // FOR South
            if(dir == 'S'){
                y--;
            }
            //FOR north
            else if(dir == 'N'){
                y++;
            }
            //for west
            else if(dir == 'W'){
                x--;
            }
            //for east
            else{
                x++;
            }
        }
        int X_Square = x*x; // X2 means X square
        int Y_Square = y*y;
        return (float)Math.sqrt(X_Square + Y_Square);  
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        getdirection(path);
        System.out.println(getdirection(path));
        }
    
}
