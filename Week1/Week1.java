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
/* import java.util.Scanner;

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
    
} */

// 2. Take a number from user and print it.
/* import java.util.Scanner;
public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n1 = sc.nextInt();
        System.out.println("you enter: " + n1);
    }
}     */

// 3.  Take two numbers and add them.
/* import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int result = n1 + n2;
        System.out.println("the Sum of " + n1 + " + " + n2 + " is: " + result);
    }
} */

// 4. Take two numbers and find subtraction.
/* import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int result = n1 - n2;

        System.out.println("The " + n1 + " - " + n2 + " is: " + result);
    }
} */

// 5. Take two numbers and find multiplication.
/* import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = n1 * n2;
        System.out.println("the " + n1 + " * " + n2 + " is: " + result);
    }
} */

// 6. Take two numbers and find division.
/* import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double result = n1 / n2;
        if (n1 < n2) {
            System.out.println("Divider can't be low");
        } else {
            System.out.println("Answer is: " + result);
        }
    }
} */

// 7.  Find square of a number.
/* public class Week1 {

    public static void main(String[] args) {
        int number = 100;
        int result = number * number;
        System.out.println("Square is: " + result);

    }
} */

// 8. Find cube of a number/* 
/*import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n1 = sc.nextInt();
        int result = n1 * n1 * n1;
        System.out.println("Cube is: " + result);
    }
} */

// Convert Celsius to Fahrenheit.
/* public class Week1 {
    public static void main(String[] args) {
        int number = 30;
        int result = (number * 9 / 5) + 32;
        System.out.println(result + " F");
    }

} */

    // 10. Calculate area of a circle.
/* import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area: PI * r^2
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is: " + area);

        input.close();
    }
} */