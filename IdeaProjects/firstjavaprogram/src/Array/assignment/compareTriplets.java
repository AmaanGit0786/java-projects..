package Array.assignment;
import java.util.Scanner;
public class compareTriplets {

    public static int[] compareTriplet(int a[], int b[]) {
        int bob = 0;
        int alice = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Comparing a[" + i + "] = " + a[i] + " with b[" + i + "] = " + b[i]);
            if (a[i] > b[i]) {
                alice++;
            } else if (a[i] < b[i]) {
                bob++;
            }
            // If a[i] == b[i], no points are awarded, so we just continue
        }

        // Return the result as an array with Alice's and Bob's scores
        return new int[]{alice, bob};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];

        System.out.println("Enter 3 ratings for Alice and Bob:");

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        // Get the result from compareTriplet
        int[] result = compareTriplet(a, b);

        // Print Alice's and Bob's scores
        System.out.println("Alice's score: " + result[0] + ", Bob's score: " + result[1]);
    }
}
