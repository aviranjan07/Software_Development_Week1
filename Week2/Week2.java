// Comparison Operators
/* public class Week2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a >= b);

    }
} */

// AND Operator (&&)
/* public class Week2 {

    public static void main(String[] args) {
        int age = 17;
        if (age > 18 && age < 60) {
            System.out.println("Eligible for job");
        } else {
            System.out.println("Rejected");
        }
    }
}
 */

// OR Operator (||)/* 
/* public class Week2 {

    public static void main(String[] args) {
        int marks = 30;
        if (marks >= 30 || marks == 25) {
            System.out.println("pass");
        }
    }
} */

//    NOT Operator (!)
/* public class Week2 {

    public static void main(String[] args) {
        boolean isLog = false;
        if (!isLog) {
            System.out.println("Please Login First");
        }
    }
}     */

// Combining Multiple Conditions
/* public class Week2 {

    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18 && hasLicense) {
            System.out.println("You can drive");
        } else {
            System.out.println("Not allowed to drive");
        }
    }
}
 */

//   ATM Withdrawal

/* public class Week2 {

    public static void main(String[] args) {
        int balance = 5000;
        int Withdrawal = 6000;
        if (balance >= Withdrawal) {
            System.out.println("withdrawal Successful");
        }else {
            System.out.println("insufficient balance");
        }
    }
} */

// Login System
/* public class Week2 {

    public static void main(String[] args) {
        String userName = "Aviranjan";
        String passWord = "1235`";
        if (userName.equals("Aviranjan") && passWord.equals("1234")) {
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid Password");
        }
    }
}     */

// continue example
/* public class Week2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

    }
} */

// 1️⃣ Nested Loops (Very Important)
/* public class Week2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int f = 1; f <= 3; f++)
                    System.out.println(i + " " + j + " " + f);
            }
        }
    }
} */

// Square Pattern
/* *****
*****
*****
*****
***** */
/* public class Week2 {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

// Right Triangle
/* *
**
***
****
***** */

/*public class Week2 {
 
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */