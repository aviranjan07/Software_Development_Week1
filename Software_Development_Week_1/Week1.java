/* public class Week1 {
    public static void main(String[] args) {
        System.out.println("Week 1 - Software Development Journey");
    }
}
 */

    // Print Hello World
 /* public class Week1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}  */

      // Add Two Numbers
/* import java.util.Scanner;      
public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        
        System.out.println("Sum is: " + sum);
    }
}   */

//  Compare Two Strings
import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
    
}
