import java.util.Scanner;
public class Main{
    static Scanner scan = new Scanner(System.in);
    static boolean isContinue = true;
    public static void main(String[] args) {

        int size = getNumber("Input an array size: ");
        int[] arr = createRandomArray(size);
        

        while(isContinue) {
            System.out.printf("Please select an operation:\n1) %s\n2) %s\n3) %s\n4) %s\n5) %s\n6) %s\n0) %s\n","Create a new array", "Find Minimum of array", "Find maximum of array", "Find differances form average", "Sum of odd indexes", "Sum of even indexes", "Exit");
            int selection = getNumber("Please Enter the number of the operation (0 for exit): ", 0, 6);
            if(selection == 1){
                size = getNumber("Input an array size: ");
                arr = createRandomArray(size);
            }
            else if (selection == 2){
                System.out.println(findMin(arr));
            }
            else if(selection == 3){
                System.out.println(findMax(arr));
            }
            else if(selection == 4){
                //Find diff. from average. Write a method.
            }
            else if(selection == 5){
                System.out.println("Sum of the odd indexes of the array is: " + getOddSum(arr));
            }
            else if(selection == 6){
                System.out.println("Sum of the even indexes of the array is: " + getEvenSum(arr));
            }
            else if(selection == 0){
                isContinue = false;
                System.out.println("Terminated.");
            }
        }  
    }
    // gets an integer from user in the designated range
    public static int getNumber(String message, int start, int end){
        int input;
        input = getNumber(message);
        if(input < start || input > end){
            System.out.printf("Please enter between %d and %d!\n", start, end);
            input = getNumber(message, start, end);
        }
        return input;
    }

    public static int getNumber(String message){
        int input;
        System.out.print(message);
        while(!scan.hasNextInt()){
            scan.nextLine();
            System.out.print("Please enter an integer: ");
        }
        input = scan.nextInt();
        return input;
    }  

    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        System.out.printf("Creating array at size %d\n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 101);
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        return arr;
    }

    public static int getOddSum(int[] arr) {
        int sum = 0;
        for(int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getEvenSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}