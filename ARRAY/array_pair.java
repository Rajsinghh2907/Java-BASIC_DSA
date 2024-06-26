package ARRAY;

public class array_pair {
    public static void printpairs(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int current = num[i];

            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + current + "," + num[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 9 };
        printpairs(num);
    }

}
