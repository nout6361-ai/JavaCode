import java.util.Scanner;

public class T0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;  // remove the last digit
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}