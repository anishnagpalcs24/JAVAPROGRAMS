import CIE.*;
import SEE.*;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter USN: ");
            String USN = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            int[] internal = new int[5];
            int[] external = new int[5];

            System.out.println("Enter CIE marks:");
            for (int j = 0; j < 5; j++) {
                internal[j] = sc.nextInt();
            }

            System.out.println("Enter SEE marks:");
            for (int j = 0; j < 5; j++) {
                external[j] = sc.nextInt();
            }
            sc.nextLine(); 

            Internals in = new Internals(internal);
            External ex = new External(USN, name, sem, external);

            System.out.println("Final Marks:");
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + " : "
                        + (in.internalMarks[j] + ex.externalMarks[j]));
            }
        }
    }
}
