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