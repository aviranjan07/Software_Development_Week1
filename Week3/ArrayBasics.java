/* public class ArrayBasics {
    public static void main(String[] args) {
      int[] number = {10, 20, 30, 40, 50};
      int value = number[0];
      System.out.println(value);
    }
}
 */
//Store String 
/* public class ArrayBasics {

   public static void main(String[] args) {
       String[] name = {"Aviranjan", "Rahul", "Ashim"};
       System.out.println(name[2]);
   }
} */

// Change an Array Element 
/*  public class ArrayBasics {

    public static void main(String[] args) {
        String[] name = {"Aviranjan", "Rahul", "Ashim"};
            name[0] = "Ayan";
        System.out.println(name[0]);
    }
} */

/* public class ArrayBasics {
public static void main(String[] args) {
    int[] Number = {10, 20, 30, 40};
    Number[1] = 100;
    System.out.println(Number[1]);
}
    
} */
//    Array length
/* public class ArrayBasics {

    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40, 50};
        System.out.println(number.length);

    }
} */

// Array Loops
/* public class ArrayBasics {

    public static void main(String[] args) {
        String[] name = {"apple", "banana", "orange",};
        for(int i = 1; i <= name.length;i++) {
            System.out.println(i);
        }
    }
}     */

// Create an array of 5 numbers and print them.
/* public class ArrayBasics {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        for(int i = 0; i < arr.length; i++){
          System.out.println(arr[i]);

        }
        
    }
}   */

// Find the largest number in an array.

/* public class ArrayBasics {

    public static void main(String[] args) {
        int[] arr = { 50, 80, 120, 180 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        System.out.println("the largest number of an Array is " + largest);
    }
} */

// Count even and odd numbers.

/* public class ArrayBasics {

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14};
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if (num % 2 == 0) {
                evenCount++;
            }else{
                oddCount++;
            }
        }
            System.out.println("EvenCount " + evenCount);
            System.out.println("oddCount " + oddCount);
    }
}  */

//Reverse an array.

/* public class ArrayBasics {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for (int num : arr) {
            System.out.println(num + "");
        }
    }
}
 */

/* import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[100]; // max 100 students
        int size = 0; // current number of students

        while (true) {
            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Insert Marks");
            System.out.println("2. Update Marks");
            System.out.println("3. Delete Marks");
            System.out.println("4. Display All Marks");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // 1️⃣ Insert
                case 1:
                    System.out.print("Enter marks: ");
                    marks[size] = sc.nextInt();
                    size++;
                    System.out.println("Marks inserted!");
                    break;

                // 2️⃣ Update
                case 2:
                    System.out.print("Enter index to update: ");
                    int uIndex = sc.nextInt();

                    if (uIndex >= 0 && uIndex < size) {
                        System.out.print("Enter new marks: ");
                        marks[uIndex] = sc.nextInt();
                        System.out.println("Marks updated!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                // 3️⃣ Delete
                case 3:
                    System.out.print("Enter index to delete: ");
                    int dIndex = sc.nextInt();

                    if (dIndex >= 0 && dIndex < size) {
                        for (int i = dIndex; i < size - 1; i++) {
                            marks[i] = marks[i + 1]; // shift left
                        }
                        size--;
                        System.out.println("Marks deleted!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                // 4️⃣ Display
                case 4:
                    System.out.println("All Marks:");
                    for (int i = 0; i < size; i++) {
                        System.out.println("Student " + i + ": " + marks[i]);
                    }
                    break;

                // 5️⃣ Exit
                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
} */
