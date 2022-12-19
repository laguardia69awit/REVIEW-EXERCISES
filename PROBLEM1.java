public class PROBLEM1 {

    public static void main(String args[]) {

        // PROBLEM 1

        for (int k = 1; k > 0; k--) { // to print Merry Christmas! Hailey, I used while loop as instructed
            System.out.println("Merry Christmas! Hailey");
        }
        System.out.println();

        int i = 0; // used while loop
        while (i < 7) { // looping 7 times its like the length of the tree would be 7 lines
            int j = 0;
            int k = 0;

            while (j < 7 - i) {
                System.out.print(" ");
                j++;
            }
            while (k < (2 * i) + 1) { // multiplying to make it better
                System.out.print("*");
                k++;
            }
            ++i;
            System.out.println("");
        }
        int a = 0;
        int b = 0;
        int c = 0;

        while (i < 2) {
            while (b < 3 - a) {
                System.out.print(" ");
                b++;
            }
            while (c < (1 * a) + 0) {
                System.out.print("*");
                c++;
            }
            ++a;
            System.out.println("");
        }
        int h = 7; // base part
        for (int y = 1; y <= h - 5; y++) { // to have space for sa base part 8 8
            System.out.print(" ");
            for (int j = h - 2; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
