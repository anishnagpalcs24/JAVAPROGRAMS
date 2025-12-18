//Develop a Java program that prints all real solutions to the
// quadratic equation ax2+bx+c = 0. Read in a, b, c and use the
// quadratic formula. If the discriminate b2
// -4ac is negative,
// display a message stating that there are no real solutions
import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient a: ");
        double a = sc.nextDouble();
         if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            return;
        }
        System.out.println("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = sc.nextDouble();
        double discriminant = b*b-(4*a*c);

        if(discriminant >0){
               System.out.println("two real solutions exist: ");
               double root1 = (-b + Math.sqrt(discriminant))/(2*a);
               double root2 = (-b - Math.sqrt(discriminant))/(2*a);
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
        }
        else if(discriminant == 0){
            System.out.println("one real solution exists:");
            double root = -b/(2*a);
            System.out.println("Root: " + root);
        }
        else{
            System.out.println("No real solutions exist.");
        }
        sc.close();
    }
}