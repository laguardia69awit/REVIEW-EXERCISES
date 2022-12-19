import java.util.ArrayList;
import java.util.Scanner;

public class PROBLEM2 {
    public static void main(String[] args) {

        // PROBLEM 2
        Scanner SCAN = new Scanner(System.in); // scanner obJ
        ArrayList<String> prob2 = new ArrayList<>(); // arraylist
        prob2.add("Richard");
        prob2.add("Ashton");
        prob2.add("Hailey");
        prob2.add("Yurina");
        prob2.add("Judith");

        while (prob2.size() > 0) { // USED a while loop that will repeat until the array list as instructed
            System.out.print("Updated Elements: ");
            for (int t = 0; t <= prob2.size() - 1; t++) { // for loop that will display the current array elements
                System.out.print(prob2.get(t) + ", ");
            }
            System.out.print("\n\nInput: ");
            int ip = SCAN.nextInt();

            System.out.println("Output:");
            System.out.println(prob2.get(ip - 1) + " deleted"); // Displays what was removed

            prob2.remove(ip - 1); // ".remove" to remove elements in the array list
        }
        SCAN.close();
    }
}
