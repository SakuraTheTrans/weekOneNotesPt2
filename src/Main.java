import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 18;
        double gpa = 4.1;
        boolean isSnowing = true;
        float pi = 3.141592f;
        String name = "Sakura";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        int[] prime = {5,7,11,17,19,23,29,31,37};
        System.out.println(prime[0]);
        for (int j : prime) {
            System.out.println(j);
        }
        System.out.println("Prime numbers: " + Arrays.toString(prime));

        String[][] phones = {{"Apple","Iphone"},{"Samsung","Galaxy"},{"Sony","Experia"}};
        System.out.println(phones[1][0]);
        System.out.println(Arrays.deepToString(phones));
        System.out.println("TV SHOW.");
        String fine = input.nextLine();
        System.out.println(fine + " is 5/10");

        // WEEK ONE CHALLENGE :
        // int[] array = {1,2,3,4,5,6,7,8,9};
        // for (int i = 0; i <= array.length; i++) {
        //     System.out.println("Current number is : " + i);
        //     if (array[i] == 6){
        //         System.out.println("Number 6 Found, Exiting Loop");
        //         break;
        //     } else if (i == array.length) {
        //         System.out.println("Number 6 Does Not Exist");
        //     }
        // }
    }
}