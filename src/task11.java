//TASK 11
import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //a
        System.out.println("enter row:");
        int row = sc.nextInt();
        for (int r = 0; r < row ; r++) {
            for (int c = 0; c < row; c++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //b
        System.out.println("enter row");
        int row2 = sc.nextInt();
        for (int r = 1; r <=row2; r++) {
            for (int c = 0; c <r ; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
