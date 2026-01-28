import java.util.Scanner;
public class Main{
    static Scanner scan = new Scanner(System.in);
    static boolean isContinue = true;
    public static void main(String[] args) {
        while(isContinue) {
            System.out.printf("Please select an operation:\n1) %s\n2) %s\n3) %s\n4) %s\n5) %s, ","", "", "", "", "");
            int selection = getNumber("Please Enter the number of the operation (0 for exit): ", 0, 5);
            if(selection == 1){
                System.out.print("Input the array size");
                int size = scan.nextInt();
                createRandomArray(size);
            }
            else if (selection == 2){
                secondMethod();
            }
            else if(selection == 3){
                thirdMethod();
            }
            else if (selection == 4){
                fourthMethod();
            }
            else if(selection == 5){
                fifthMethod();
            }
            else if(selection == 0){
                isContinue = false;
            }
        }  
    }

    public static int getNumber(String message, int start, int end){
        /* TODO */
    } 

    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        System.out.printf("Creating array at size %d\n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 101);
            System.out.println(arr[i] + ", ");
        }
        return arr;
    }
}