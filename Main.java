import java.util.Scanner;
public class Main{
    static Scanner scan = new Scanner(System.in);
    static boolean isContinue = true;
    public static void main(String[] args) {

        int size = getNumber("Input an array size: ");
        createRandomArray(size);

        while(isContinue) {
            System.out.printf("Please select an operation:\n1) %s\n2) %s\n3) %s\n4) %s\n5) %s, ","Create a new array", "", "", "", "");
            int selection = getNumber("Please Enter the number of the operation (0 for exit): ", 0, 3);
            if(selection == 1){
                size = getNumber("Input an array size: ");
                createRandomArray(size);
            }
            else if (selection == 2){
                //secondMethod();
            }
            else if(selection == 3){
                //thirdMethod();
            }
            else if(selection == 0){
                isContinue = false;
                System.out.println("Terminated.");
            }
        }  
    }

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
            System.out.println("Please enter an integer.");
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
}