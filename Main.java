import java.util.Scanner;
public class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.printf("Please select an operation:\n1) %s\n2) %s\n3) %s\n4) %s\n5) %s, ","", "", "", "", "");
        int selection = getNumber("Please Enter the number of the operation (0 for exit): ", 0, 5);
        if(selection == 1){
            firstMethod();
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
            quit();
        }
    }

    public static int getNumber(String message, int start, int end){
        /* TODO */
    } 
    
    public static void quit(){
        /* TODO */
    }
}